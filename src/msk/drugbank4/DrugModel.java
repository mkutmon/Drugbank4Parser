package msk.drugbank4;


import java.util.HashSet;
import java.util.Set;

/**
 * class containing information about drugs
 * @author msk
 *
 */
public class DrugModel {
	private String drugbankID = "";
	private String name = "";
	private String InChiKey = "";
	private String casNumber = "";
	private Set<String> groups;
	private Set<String> categories;
	private Set<TargetModel> targets;
	
	public DrugModel() {
		categories = new HashSet<String>();
		targets = new HashSet<TargetModel>();
		groups = new HashSet<String>();
	}
	
	

	public String getDrugbankID() {
		return drugbankID;
	}

	public void setDrugbankID(String drugbankID) {
		this.drugbankID = drugbankID;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getInChiKey() {
		return InChiKey;
	}

	public void setInChiKey(String inChiKey) {
		InChiKey = inChiKey;
	}

	public String getCasNumber() {
		return casNumber;
	}

	public void setCasNumber(String casNumber) {
		this.casNumber = casNumber;
	}

	public Set<String> getGroups() {
		return groups;
	}

	public Set<String> getCategories() {
		return categories;
	}

	public Set<TargetModel> getTargets() {
		return targets;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(drugbankID.length()
				+ name.length() + InChiKey.length());

		sb.append("[drug:").append(" id=")
				.append(drugbankID).append(", name=").append(name)
				.append(", inchikey=").append(InChiKey)
				.append(", categories=").append(categories)
				.append(", targets=").append(targets)
				.append("]");
		return sb.toString();
	}
}
