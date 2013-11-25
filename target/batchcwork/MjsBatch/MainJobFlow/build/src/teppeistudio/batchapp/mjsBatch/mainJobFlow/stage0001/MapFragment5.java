package teppeistudio.batchapp.mjsBatch.mainJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import com.asakusafw.runtime.trace.TraceLocation;
import teppeistudio.modelgen.dmdl.model.ErrorRecord;
import teppeistudio.modelgen.dmdl.model.SalesDetail;
/**
 * {@code [in->restructure(operator#1240775927)]}の処理を担当するマッププログラムの断片。
 */
@TraceLocation(batchId = "MjsBatch", flowId = "MainJobFlow", stageId = "stage0001", fragmentId = "5")@SuppressWarnings(
        "deprecation") public final class MapFragment5 implements Result<SalesDetail> {
    private final Result<ErrorRecord> out;
    private ErrorRecord cache = new ErrorRecord();
    /**
     * インスタンスを生成する。
     * @param out {@code restructure#out}への出力
     */
    public MapFragment5(Result<ErrorRecord> out) {
        this.out = out;
    }
    @Override public void add(SalesDetail result) {
        this.cache.reset();
        this.cache.setSalesIdOption(result.getSalesIdOption());
        this.cache.setItemIdOption(result.getItemIdOption());
        this.out.add(this.cache);
    }
}