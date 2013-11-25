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
import teppeistudio.modelgen.dmdl.io.ItemCategoryInput;
import teppeistudio.modelgen.dmdl.io.ItemCategoryOutput;
/**
 * 商品カテゴリを表すデータモデルクラス。
 */
@DataModelKind("DMDL")@ModelInputLocation(ItemCategoryInput.class)@ModelOutputLocation(ItemCategoryOutput.class)@
        PropertyOrder({"item_id", "category_name"}) public class ItemCategory implements DataModel<ItemCategory>, 
        Writable {
    private final IntOption itemId = new IntOption();
    private final StringOption categoryName = new StringOption();
    @Override@SuppressWarnings("deprecation") public void reset() {
        this.itemId.setNull();
        this.categoryName.setNull();
    }
    @Override@SuppressWarnings("deprecation") public void copyFrom(ItemCategory other) {
        this.itemId.copyFrom(other.itemId);
        this.categoryName.copyFrom(other.categoryName);
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
    /**
     * 商品カテゴリを返す。
     * @return 商品カテゴリ
     * @throws NullPointerException 商品カテゴリの値が<code>null</code>である場合
     */
    public Text getCategoryName() {
        return this.categoryName.get();
    }
    /**
     * 商品カテゴリを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setCategoryName(Text value) {
        this.categoryName.modify(value);
    }
    /**
     * <code>null</code>を許す商品カテゴリを返す。
     * @return 商品カテゴリ
     */
    public StringOption getCategoryNameOption() {
        return this.categoryName;
    }
    /**
     * 商品カテゴリを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setCategoryNameOption(StringOption option) {
        this.categoryName.copyFrom(option);
    }
    @Override public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{");
        result.append("class=item_category");
        result.append(", itemId=");
        result.append(this.itemId);
        result.append(", categoryName=");
        result.append(this.categoryName);
        result.append("}");
        return result.toString();
    }
    @Override public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + itemId.hashCode();
        result = prime * result + categoryName.hashCode();
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
        ItemCategory other = (ItemCategory) obj;
        if(this.itemId.equals(other.itemId) == false) {
            return false;
        }
        if(this.categoryName.equals(other.categoryName) == false) {
            return false;
        }
        return true;
    }
    /**
     * 商品カテゴリを返す。
     * @return 商品カテゴリ
     * @throws NullPointerException 商品カテゴリの値が<code>null</code>である場合
     */
    public String getCategoryNameAsString() {
        return this.categoryName.getAsString();
    }
    /**
     * 商品カテゴリを設定する。
     * @param categoryName0 設定する値
     */
    @SuppressWarnings("deprecation") public void setCategoryNameAsString(String categoryName0) {
        this.categoryName.modify(categoryName0);
    }
    @Override public void write(DataOutput out) throws IOException {
        itemId.write(out);
        categoryName.write(out);
    }
    @Override public void readFields(DataInput in) throws IOException {
        itemId.readFields(in);
        categoryName.readFields(in);
    }
}