package teppeistudio.batchapp.mjsBatch.mainJobFlow.stage0001;
import com.asakusafw.runtime.flow.MapperWithRuntimeResource;
import com.asakusafw.runtime.trace.TraceLocation;
import java.io.IOException;
import org.apache.hadoop.io.NullWritable;
import teppeistudio.modelgen.dmdl.model.SalesDetail;
/**
 * {@code [in->padding(pseud#1090032292){owner=FlowBlock&#64;2077652091}]}の処理を担当するマッププログラム。
 */
@TraceLocation(batchId = "MjsBatch", flowId = "MainJobFlow", stageId = "stage0001", stageUnitId = "m1")@SuppressWarnings
        ("deprecation") public final class StageMapper1 extends MapperWithRuntimeResource<NullWritable, SalesDetail, 
        ShuffleKey, ShuffleValue> {
    private SalesDetail cache = new SalesDetail();
    private MapFragment1 line;
    @Override public void setup(Context context) throws IOException, InterruptedException {
        final MapOutputFragment2 shuffle0 = new MapOutputFragment2(context);
        this.line = new MapFragment1(shuffle0);
    }
    @Override public void cleanup(Context context) throws IOException, InterruptedException {
        this.line = null;
    }
    @Override public void runInternal(Context context) throws IOException, InterruptedException {
        this.setup(context);
        while(context.nextKeyValue()) {
            cache.copyFrom(context.getCurrentValue());
            this.line.add(cache);
        }
        this.cleanup(context);
    }
}