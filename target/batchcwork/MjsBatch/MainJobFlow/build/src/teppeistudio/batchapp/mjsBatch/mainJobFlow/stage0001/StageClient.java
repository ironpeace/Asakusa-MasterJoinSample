package teppeistudio.batchapp.mjsBatch.mainJobFlow.stage0001;
import com.asakusafw.runtime.stage.AbstractStageClient;
import com.asakusafw.runtime.stage.StageInput;
import com.asakusafw.runtime.stage.StageOutput;
import com.asakusafw.runtime.stage.StageResource;
import com.asakusafw.runtime.stage.input.BridgeInputFormat;
import com.asakusafw.runtime.stage.output.TemporaryOutputFormat;
import com.asakusafw.runtime.trace.TraceLocation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.hadoop.io.NullWritable;
import teppeistudio.modelgen.dmdl.model.ErrorRecord;
import teppeistudio.modelgen.dmdl.model.SalesDetail2;
/**
 * ステージ1のジョブを実行するクライアント。
 */
@TraceLocation(batchId = "MjsBatch", flowId = "MainJobFlow", stageId = "stage0001") public final class StageClient 
        extends AbstractStageClient {
    @Override protected String getBatchId() {
        return "MjsBatch";
    }
    @Override protected String getFlowId() {
        return "MainJobFlow";
    }
    @Override protected String getStageId() {
        return "stage0001";
    }
    @Override protected String getStageOutputPath() {
        return "target/hadoopwork/${execution_id}/MjsBatch/MainJobFlow/stage0001";
    }
    @Override protected List<StageInput> getStageInputs() {
        List<StageInput> results = new ArrayList<StageInput>();
        Map<String, String> attributes = null;
        attributes = new HashMap<String, String>();
        attributes.put("basePath", "mjs");
        attributes.put("resourcePath", "sales-detail.csv");
        attributes.put("dataClass", "teppeistudio.modelgen.dmdl.model.SalesDetail");
        attributes.put("formatClass", "teppeistudio.modelgen.dmdl.csv.SalesDetailCsvFormat");
        results.add(new StageInput("__DIRECTIO__/SalesDetail/mjs", BridgeInputFormat.class, StageMapper1.class, 
                attributes));
        attributes = new HashMap<String, String>();
        attributes.put("basePath", "mjs");
        attributes.put("resourcePath", "item-master.csv");
        attributes.put("dataClass", "teppeistudio.modelgen.dmdl.model.ItemMaster");
        attributes.put("formatClass", "teppeistudio.modelgen.dmdl.csv.ItemMasterCsvFormat");
        results.add(new StageInput("__DIRECTIO__/ItemMaster/mjs", BridgeInputFormat.class, StageMapper2.class, 
                attributes));
        return results;
    }
    @Override protected List<StageOutput> getStageOutputs() {
        List<StageOutput> results = new ArrayList<StageOutput>();
        results.add(new StageOutput("result0", NullWritable.class, ErrorRecord.class, TemporaryOutputFormat.class));
        results.add(new StageOutput("result10", NullWritable.class, SalesDetail2.class, TemporaryOutputFormat.class));
        return results;
    }
    @Override protected List<StageResource> getStageResources() {
        List<StageResource> results = new ArrayList<StageResource>();
        return results;
    }
    @Override protected Class<ShuffleKey> getShuffleKeyClassOrNull() {
        return ShuffleKey.class;
    }
    @Override protected Class<ShuffleValue> getShuffleValueClassOrNull() {
        return ShuffleValue.class;
    }
    @Override protected Class<ShufflePartitioner> getPartitionerClassOrNull() {
        return ShufflePartitioner.class;
    }
    @Override protected Class<ShuffleSortComparator> getSortComparatorClassOrNull() {
        return ShuffleSortComparator.class;
    }
    @Override protected Class<ShuffleGroupingComparator> getGroupingComparatorClassOrNull() {
        return ShuffleGroupingComparator.class;
    }
    @Override protected Class<StageReducer> getReducerClassOrNull() {
        return StageReducer.class;
    }
}