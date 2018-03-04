/**
 * 
 */
package monsterboken.db.domain;

import monsterboken.core.domain.Mappable;
import monsterboken.core.domain.Monster;
import monsterboken.core.domain.Rarity;

/**
 * @author anders.skoglund
 *
 */
public class MonsterEO implements Mappable<Monster> {

	private String name;

	private HabitatEO habitat;

	private Rarity rarity;

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