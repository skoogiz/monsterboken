package model;

public class Monster {
	
	private String name;
	private Habitat habitat;
	private Rarity rarity;
	
	public Monster(String name, Habitat habitat, Rarity rarity) {
		super();
		this.name = name;
		this.habitat = habitat;
		this.rarity = rarity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Habitat getHabitat() {
		return habitat;
	}

	public void setHabitat(Habitat habitat) {
		this.habitat = habitat;
	}

	public Rarity getRarity() {
		return rarity;
	}

	public void setRarity(Rarity rarity) {
		this.rarity = rarity;
	}
	
	

}
