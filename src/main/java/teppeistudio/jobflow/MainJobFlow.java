package teppeistudio.jobflow;

import teppeistudio.modelgen.dmdl.model.ErrorRecord;
import teppeistudio.modelgen.dmdl.model.ItemMaster;
import teppeistudio.modelgen.dmdl.model.SalesDetail;
import teppeistudio.modelgen.dmdl.model.SalesDetail2;
import teppeistudio.operator.JoinOperatorFactory;
import teppeistudio.operator.JoinOperatorFactory.JoinedData;

import com.asakusafw.vocabulary.flow.Export;
import com.asakusafw.vocabulary.flow.FlowDescription;
import com.asakusafw.vocabulary.flow.Import;
import com.asakusafw.vocabulary.flow.In;
import com.asakusafw.vocabulary.flow.JobFlow;
import com.asakusafw.vocabulary.flow.Out;
import com.asakusafw.vocabulary.flow.util.CoreOperatorFactory;
import com.asakusafw.vocabulary.flow.util.CoreOperatorFactory.Project;
import com.asakusafw.vocabulary.flow.util.CoreOperatorFactory.Restructure;

@JobFlow(name="MainJobFlow")
public class MainJobFlow extends FlowDescription {

	final In<ItemMaster> itemMaster;
	final In<SalesDetail> salesDetail;
	final Out<SalesDetail2> salesDetail2;
	final Out<ErrorRecord> errorRecord;

	public MainJobFlow(
			@Import(name="ItemMaster", description=ItemMasterFromCsv.class)
			In<ItemMaster> itemMaster,
			@Import(name="SalesDetail", description=SalesDetailFromCsv.class)
			In<SalesDetail> salesDetail,
			@Export(name="SalesDetail2", description=SalesDetail2ToCsv.class)
			Out<SalesDetail2> salesDetail2,
			@Export(name="ErrorRecord", description=ErrorRecordToCsv.class)
			Out<ErrorRecord> errorRecord
			){

		this.itemMaster = itemMaster;
		this.salesDetail = salesDetail;
		this.salesDetail2 = salesDetail2;
		this.errorRecord = errorRecord;
	}
	
	@Override
	protected void describe() {
		JoinOperatorFactory op = new JoinOperatorFactory();
		CoreOperatorFactory cp = new CoreOperatorFactory();
		
		JoinedData joinedData = op.joinedData(this.itemMaster, this.salesDetail);
		
		//引数指定した順序の間違い
		//JoinedData joinedData = op.joinedData(this.salesDetail, this.itemMaster);

		//出力missedを無視する場合
		//cp.stop(joinedData.missed);
		
		//出力missedをエラー出力
		Restructure<ErrorRecord> error = cp.restructure(joinedData.missed, ErrorRecord.class);
		
		Project<SalesDetail2> project = cp.project(joinedData.joined, SalesDetail2.class);
		
		salesDetail2.add(project.out);
		errorRecord.add(error.out);
	}

}
