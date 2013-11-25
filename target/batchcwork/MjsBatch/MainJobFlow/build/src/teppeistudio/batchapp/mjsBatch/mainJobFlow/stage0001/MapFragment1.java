package teppeistudio.batchapp.mjsBatch.mainJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import com.asakusafw.runtime.trace.TraceLocation;
import teppeistudio.modelgen.dmdl.model.SalesDetail;
/**
 * {@code [in->padding(pseud#1090032292)]}の処理を担当するマッププログラムの断片。
 */
@TraceLocation(batchId = "MjsBatch", flowId = "MainJobFlow", stageId = "stage0001", fragmentId = "1")@SuppressWarnings(
        "deprecation") public final class MapFragment1 implements Result<SalesDetail> {
    private final Result<SalesDetail> out;
    /**
     * インスタンスを生成する。
     * @param out {@code padding#out}への出力
     */
    public MapFragment1(Result<SalesDetail> out) {
        this.out = out;
    }
    @Override public void add(SalesDetail result) {
        this.out.add(result);
    }
}