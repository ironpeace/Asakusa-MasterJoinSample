package teppeistudio.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileInputDescription;
import teppeistudio.modelgen.dmdl.model.ItemCategory;
/**
 * An abstract implementation of {@link ItemCategory} importer description using Direct I/O CSV.
 */
public abstract class AbstractItemCategoryCsvInputDescription extends DirectFileInputDescription {
    @Override public Class<? extends ItemCategory> getModelType() {
        return ItemCategory.class;
    }
    @Override public Class<ItemCategoryCsvFormat> getFormat() {
        return ItemCategoryCsvFormat.class;
    }
}