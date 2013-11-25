package teppeistudio.modelgen.dmdl.model;
import com.asakusafw.runtime.model.DataModel;
import com.asakusafw.runtime.model.DataModelKind;
import com.asakusafw.runtime.model.ModelInputLocation;
import com.asakusafw.runtime.model.ModelOutputLocation;
import com.asakusafw.runtime.model.PropertyOrder;
import com.asakusafw.runtime.value.IntOption;
import com.asakusafw.runtime.value.StringOption;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import teppeistudio.modelgen.dmdl.io.ErrorRecordInput;
import teppeistudio.modelgen.dmdl.io.ErrorRecordOutput;
/**
 * エラーレコードを表すデータモデルクラス。
 */
@DataModelKind("DMDL")@ModelInputLocation(ErrorRecordInput.class)@ModelOutputLocation(ErrorRecordOutput.class)@
        PropertyOrder({"file_name", "line_number", "sales_id", "item_id"}) public class ErrorRecord implements DataModel
        <ErrorRecord>, Writable {
    private final StringOption fileName = new StringOption();
    private final IntOption lineNumber = new IntOption();
    private final IntOption salesId = new IntOption();
    private final IntOption itemId = new IntOption();
    @Override@SuppressWarnings("deprecation") public void reset() {
        this.fileName.setNull();
        this.lineNumber.setNull();
        this.salesId.setNull();
        this.itemId.setNull();
    }
    @Override@SuppressWarnings("deprecation") public void copyFrom(ErrorRecord other) {
        this.fileName.copyFrom(other.fileName);
        this.lineNumber.copyFrom(other.lineNumber);
        this.salesId.copyFrom(other.salesId);
        this.itemId.copyFrom(other.itemId);
    }
    /**
     * ファイル名を返す。
     * @return ファイル名
     * @throws NullPointerException ファイル名の値が<code>null</code>である場合
     */
    public Text getFileName() {
        return this.fileName.get();
    }
    /**
     * ファイル名を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setFileName(Text value) {
        this.fileName.modify(value);
    }
    /**
     * <code>null</code>を許すファイル名を返す。
     * @return ファイル名
     */
    public StringOption getFileNameOption() {
        return this.fileName;
    }
    /**
     * ファイル名を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setFileNameOption(StringOption option) {
        this.fileName.copyFrom(option);
    }
    /**
     * 行番号を返す。
     * @return 行番号
     * @throws NullPointerException 行番号の値が<code>null</code>である場合
     */
    public int getLineNumber() {
        return this.lineNumber.get();
    }
    /**
     * 行番号を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setLineNumber(int value) {
        this.lineNumber.modify(value);
    }
    /**
     * <code>null</code>を許す行番号を返す。
     * @return 行番号
     */
    public IntOption getLineNumberOption() {
        return this.lineNumber;
    }
    /**
     * 行番号を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setLineNumberOption(IntOption option) {
        this.lineNumber.copyFrom(option);
    }
    /**
     * 明細IDを返す。
     * @return 明細ID
     * @throws NullPointerException 明細IDの値が<code>null</code>である場合
     */
    public int getSalesId() {
        return this.salesId.get();
    }
    /**
     * 明細IDを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setSalesId(int value) {
        this.salesId.modify(value);
    }
    /**
     * <code>null</code>を許す明細IDを返す。
     * @return 明細ID
     */
    public IntOption getSalesIdOption() {
        return this.salesId;
    }
    /**
     * 明細IDを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setSalesIdOption(IntOption option) {
        this.salesId.copyFrom(option);
    }
    /**
     * 商品IDを返す。
     * @return 商品ID
     * @throws NullPointerException 商品IDの値が<code>null</code>である場合
     */
    public int getItemId() {
        return this.itemId.get();
    }
    /**
     * 商品IDを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setItemId(int value) {
        this.itemId.modify(value);
    }
    /**
     * <code>null</code>を許す商品IDを返す。
     * @return 商品ID
     */
    public IntOption getItemIdOption() {
        return this.itemId;
    }
    /**
     * 商品IDを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setItemIdOption(IntOption option) {
        this.itemId.copyFrom(option);
    }
    @Override public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{");
        result.append("class=error_record");
        result.append(", fileName=");
        result.append(this.fileName);
        result.append(", lineNumber=");
        result.append(this.lineNumber);
        result.append(", salesId=");
        result.append(this.salesId);
        result.append(", itemId=");
        result.append(this.itemId);
        result.append("}");
        return result.toString();
    }
    @Override public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + fileName.hashCode();
        result = prime * result + lineNumber.hashCode();
        result = prime * result + salesId.hashCode();
        result = prime * result + itemId.hashCode();
        return result;
    }
    @Override public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(this.getClass() != obj.getClass()) {
            return false;
        }
        ErrorRecord other = (ErrorRecord) obj;
        if(this.fileName.equals(other.fileName) == false) {
            return false;
        }
        if(this.lineNumber.equals(other.lineNumber) == false) {
            return false;
        }
        if(this.salesId.equals(other.salesId) == false) {
            return false;
        }
        if(this.itemId.equals(other.itemId) == false) {
            return false;
        }
        return true;
    }
    /**
     * ファイル名を返す。
     * @return ファイル名
     * @throws NullPointerException ファイル名の値が<code>null</code>である場合
     */
    public String getFileNameAsString() {
        return this.fileName.getAsString();
    }
    /**
     * ファイル名を設定する。
     * @param fileName0 設定する値
     */
    @SuppressWarnings("deprecation") public void setFileNameAsString(String fileName0) {
        this.fileName.modify(fileName0);
    }
    @Override public void write(DataOutput out) throws IOException {
        fileName.write(out);
        lineNumber.write(out);
        salesId.write(out);
        itemId.write(out);
    }
    @Override public void readFields(DataInput in) throws IOException {
        fileName.readFields(in);
        lineNumber.readFields(in);
        salesId.readFields(in);
        itemId.readFields(in);
    }
}