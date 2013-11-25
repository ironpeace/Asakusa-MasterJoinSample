package teppeistudio.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileInputDescription;
import teppeistudio.modelgen.dmdl.model.ErrorRecord;
/**
 * An abstract implementation of {@link ErrorRecord} importer description using Direct I/O CSV.
 */
public abstract class AbstractErrorRecordCsvInputDescription extends DirectFileInputDescription {
    @Override public Class<? extends ErrorRecord> getModelType() {
        return ErrorRecord.class;
    }
    @Override public Class<ErrorRecordCsvFormat> getFormat() {
        return ErrorRecordCsvFormat.class;
    }
}