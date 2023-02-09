package animalPkg;

public class Animal {
	private String classification;
	private String type;
	private String name;
	
	public Animal (String type, String name, String classification) {
		this.type = type;
		this.name = name;
		this.classification = classification;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
