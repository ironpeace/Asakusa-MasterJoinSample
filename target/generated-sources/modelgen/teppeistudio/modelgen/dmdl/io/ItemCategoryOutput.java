package teppeistudio.modelgen.dmdl.io;
import com.asakusafw.runtime.io.ModelOutput;
import com.asakusafw.runtime.io.RecordEmitter;
import java.io.IOException;
import teppeistudio.modelgen.dmdl.model.ItemCategory;
/**
 * <code>item_category</code>をTSVなどのレコード形式で出力する。
 */
public final class ItemCategoryOutput implements ModelOutput<ItemCategory> {
    private final RecordEmitter emitter;
    /**
     * インスタンスを生成する。
     * @param emitter 利用するエミッター
     * @throws IllegalArgumentException 引数にnullが指定された場合
     */
    public ItemCategoryOutput(RecordEmitter emitter) {
        if(emitter == null) {
            throw new IllegalArgumentException();
        }
        this.emitter = emitter;
    }
    @Override public void write(ItemCategory model) throws IOException {
        emitter.emit(model.getItemIdOption());
        emitter.emit(model.getCategoryNameOption());
        emitter.endRecord();
    }
    @Override public void close() throws IOException {
        emitter.close();
    }
}