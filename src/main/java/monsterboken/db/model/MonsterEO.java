package monsterboken.db.model;

import java.util.Optional;

import monsterboken.core.model.Mappable;
import monsterboken.core.model.Monster;
import monsterboken.core.model.Rarity;


public class MonsterEO implements Mappable<Monster> {
	
	private Long id;
	private String name;
	private HabitatEO habitat;
	private Rarity rarity;
	
	public MonsterEO() {
		
	}
	
	public MonsterEO(Long id, String name, HabitatEO habitat, Rarity rarity) {
		this.id = id;
		this.name = name;
		this.habitat = habitat;
		this.rarity = rarity;
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

	public HabitatEO getHabitat() {
		return habitat;
	}

	public void setHabitat(HabitatEO habitat) {
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
		return Monster.create(name, habitat.map(), rarity);
	}
	
	
}
