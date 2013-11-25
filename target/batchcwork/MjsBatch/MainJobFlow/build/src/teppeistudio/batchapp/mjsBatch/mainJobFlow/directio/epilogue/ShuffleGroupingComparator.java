package teppeistudio.batchapp.mjsBatch.mainJobFlow.directio.epilogue;
import com.asakusafw.runtime.trace.TraceLocation;
/**
 */
@TraceLocation(batchId = "MjsBatch", flowId = "MainJobFlow", stageId = "epilogue.directio") public final class 
        ShuffleGroupingComparator extends com.asakusafw.runtime.io.util.ShuffleKey.AbstractGroupComparator {
    /**
     * Creates a new instance.
     */
    public ShuffleGroupingComparator() {
        super(ShuffleKey.class);
    }
}