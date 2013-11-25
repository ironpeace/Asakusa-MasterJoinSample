package teppeistudio.batchapp.mjsBatch.mainJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import com.asakusafw.runtime.flow.Rendezvous;
import com.asakusafw.runtime.flow.SegmentedReducer;
import com.asakusafw.runtime.stage.output.StageOutputDriver;
import com.asakusafw.runtime.trace.TraceLocation;
import java.io.IOException;
import org.apache.hadoop.io.NullWritable;
import teppeistudio.modelgen.dmdl.model.ErrorRecord;
import teppeistudio.modelgen.dmdl.model.SalesDetail2;
/**
 * ステージ1の処理を担当するレデュースプログラム。
 */
@TraceLocation(batchId = "MjsBatch", flowId = "MainJobFlow", stageId = "stage0001", stageUnitId = "r")@SuppressWarnings(
        "deprecation") public final class StageReducer extends SegmentedReducer<ShuffleKey, ShuffleValue, NullWritable, 
        NullWritable> {
    private StageOutputDriver outputs;
    private ReduceFragment3 rendezvous;
    @Override public void setup(Context context) throws IOException, InterruptedException {
        this.outputs = new StageOutputDriver(context);
        final Result<ErrorRecord> output = outputs.getResultSink("result0");
        final Result<SalesDetail2> output0 = outputs.getResultSink("result10");
        final MapFragment5 line = new MapFragment5(output);
        final MapFragment4 line0 = new MapFragment4(output0);
        this.rendezvous = new ReduceFragment3(line0, line);
    }
    @Override public void cleanup(Context context) throws IOException, InterruptedException {
        this.outputs.close();
        this.outputs = null;
        this.rendezvous = null;
    }
    @Override protected Rendezvous<ShuffleValue> getRendezvous(ShuffleKey nextKey) {
        switch(nextKey.getSegmentId()) {
            case 1:
            case 2:
                return this.rendezvous;
            default:
                throw new AssertionError();
        }
    }
}