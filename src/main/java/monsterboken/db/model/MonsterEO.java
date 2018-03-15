package monsterboken.db.model;

import monsterboken.core.model.Habitat;
import monsterboken.core.model.Mappable;
import monsterboken.core.model.Monster;
import monsterboken.core.model.Rarity;



public class MonsterEO implements Mappable<Monster> {
	
	private Long id;
	private String name;
	private Habitat habitat;
	private Rarity rarity;
	
	public MonsterEO () {
		
	}
	
	public MonsterEO (Monster monster) {
		if(monster.getId().isPresent()) {
		this.id = getId();}
		this.name = getName();
		this.habitat = getHabitat();
		this.rarity = getRarity();
	}

	public Long getId() {
		return id;
	}
	

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public Monster map() {
		return Monster.create(id, name, habitat, rarity);
	}
}
