package teppeistudio.batchapp.mjsBatch.mainJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.DirectOutputOrder;
import teppeistudio.modelgen.dmdl.model.ErrorRecord;
/**
 * An ordering output "ErrorRecord" class for "directio".
 */
public final class Ordering0002 extends DirectOutputOrder {
    /**
     * Creates a new instance.
     */
    public Ordering0002() {
        super();
    }
    @Override public void set(Object rawObject) {
        ErrorRecord object = (ErrorRecord) rawObject;
    }
}