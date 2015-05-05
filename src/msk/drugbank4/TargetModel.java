package msk.drugbank4;


/**
 * class containing information about targets
 * @author msk
 *
 */
public class TargetModel {

	private String uniprotId = "";
	private String name = "";
	private String geneName = "";
	private String drugbankId = "";
	private String organism = "";

	public String getUniprotId() {
		return uniprotId;
	}

	public void setUniprotId(String uniprotId) {
		this.uniprotId = uniprotId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGeneName() {
		return geneName;
	}

	public void setGeneName(String geneName) {
		this.geneName = geneName;
	}

	public String getDrugbankId() {
		return drugbankId;
	}

	public void setDrugbankId(String drugbankId) {
		this.drugbankId = drugbankId;
	}

	public String getOrganism() {
		return organism;
	}

	public void setOrganism(String organism) {
		this.organism = organism;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("[target:").append(" id=")
				.append(uniprotId).append(", name=").append(name)
				.append(", organism=").append(organism)
				.append(", geneName=").append(geneName).append("]");
		return sb.toString();
	}
}
