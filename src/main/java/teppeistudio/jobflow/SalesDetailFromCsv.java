package teppeistudio.jobflow;

import teppeistudio.modelgen.dmdl.csv.AbstractSalesDetailCsvInputDescription;

public class SalesDetailFromCsv extends AbstractSalesDetailCsvInputDescription {

	@Override
	public String getBasePath() {
		return "mjs";
	}

	@Override
	public String getResourcePattern() {
		return "sales-detail.csv";
	}

}
