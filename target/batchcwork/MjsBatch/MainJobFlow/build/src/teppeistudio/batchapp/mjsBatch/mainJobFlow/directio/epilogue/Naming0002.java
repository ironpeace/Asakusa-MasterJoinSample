package teppeistudio.batchapp.mjsBatch.mainJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.StringTemplate;
import teppeistudio.modelgen.dmdl.model.ErrorRecord;
/**
 * A naming output "ErrorRecord" class for "directio".
 */
@SuppressWarnings("deprecation") public final class Naming0002 extends StringTemplate {
    /**
     * Creates a new instance.
     */
    public Naming0002() {
        super(new StringTemplate.FormatSpec(StringTemplate.Format.PLAIN, "error-record.csv"));
    }
    @Override public void set(Object rawObject) {
        ErrorRecord object = (ErrorRecord) rawObject;
    }
}