package teppeistudio.batch;

import teppeistudio.jobflow.MainJobFlow;

import com.asakusafw.vocabulary.batch.Batch;
import com.asakusafw.vocabulary.batch.BatchDescription;

@Batch(name="MjsBatch")
public class MainBatch extends BatchDescription {

	@Override
	protected void describe() {
		run(MainJobFlow.class).soon();
	}

}
