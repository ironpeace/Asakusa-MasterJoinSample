package teppeistudio.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileOutputDescription;
import teppeistudio.modelgen.dmdl.model.ItemCategory;
/**
 * An abstract implementation of {@link ItemCategory} exporter description using Direct I/O CSV.
 */
public abstract class AbstractItemCategoryCsvOutputDescription extends DirectFileOutputDescription {
    @Override public Class<? extends ItemCategory> getModelType() {
        return ItemCategory.class;
    }
    @Override public Class<ItemCategoryCsvFormat> getFormat() {
        return ItemCategoryCsvFormat.class;
    }
}