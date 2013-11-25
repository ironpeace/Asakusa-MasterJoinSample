package teppeistudio.operator;

import teppeistudio.modelgen.dmdl.model.ItemMaster;
import teppeistudio.modelgen.dmdl.model.JoinedSalesDetail;
import teppeistudio.modelgen.dmdl.model.SalesDetail;

import com.asakusafw.vocabulary.operator.MasterJoin;

public abstract class JoinOperator {

	@MasterJoin
	public abstract JoinedSalesDetail joinedData(ItemMaster master, SalesDetail detail);
	
	//引数指定した順序の間違い
	//public abstract JoinedSalesDetail joinedData(SalesDetail detail, ItemMaster master);
}
