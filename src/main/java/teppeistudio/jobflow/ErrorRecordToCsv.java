package teppeistudio.jobflow;

import teppeistudio.modelgen.dmdl.csv.AbstractErrorRecordCsvOutputDescription;

public class ErrorRecordToCsv extends AbstractErrorRecordCsvOutputDescription {

	@Override
	public String getBasePath() {
		return "mjs-error";
	}

	@Override
	public String getResourcePattern() {
		return "error-record.csv";
	}

}
