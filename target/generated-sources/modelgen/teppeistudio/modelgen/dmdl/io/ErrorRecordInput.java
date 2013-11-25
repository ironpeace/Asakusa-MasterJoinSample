package teppeistudio.modelgen.dmdl.io;
import com.asakusafw.runtime.io.ModelInput;
import com.asakusafw.runtime.io.RecordParser;
import java.io.IOException;
import teppeistudio.modelgen.dmdl.model.ErrorRecord;
/**
 * TSVファイルなどのレコードを表すファイルを入力として<code>error_record</code>を読み出す
 */
public final class ErrorRecordInput implements ModelInput<ErrorRecord> {
    private final RecordParser parser;
    /**
     * インスタンスを生成する。
     * @param parser 利用するパーサー
     * @throws IllegalArgumentException 引数に<code>null</code>が指定された場合
     */
    public ErrorRecordInput(RecordParser parser) {
        if(parser == null) {
            throw new IllegalArgumentException("parser");
        }
        this.parser = parser;
    }
    @Override public boolean readTo(ErrorRecord model) throws IOException {
        if(parser.next() == false) {
            return false;
        }
        parser.fill(model.getFileNameOption());
        parser.fill(model.getLineNumberOption());
        parser.fill(model.getSalesIdOption());
        parser.fill(model.getItemIdOption());
        parser.endRecord();
        return true;
    }
    @Override public void close() throws IOException {
        parser.close();
    }
}