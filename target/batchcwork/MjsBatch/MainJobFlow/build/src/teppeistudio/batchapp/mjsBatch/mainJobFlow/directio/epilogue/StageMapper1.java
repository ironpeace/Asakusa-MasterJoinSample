package teppeistudio.batchapp.mjsBatch.mainJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.AbstractDirectOutputMapper;
import com.asakusafw.runtime.trace.TraceLocation;
import teppeistudio.modelgen.dmdl.model.ErrorRecord;
/**
 */
@TraceLocation(batchId = "MjsBatch", flowId = "MainJobFlow", stageId = "epilogue.directio") public final class 
        StageMapper1 extends AbstractDirectOutputMapper<ErrorRecord> {
    /**
     * Creates a new instance.
     */
    public StageMapper1() {
        super(1, ShuffleKey.class, ShuffleValue.class);
    }
}