package monsterboken.core.domain;

import static monsterboken.core.domain.HabitatHelper.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import monsterboken.core.model.Habitat;
import monsterboken.core.model.Monster;
import monsterboken.core.model.Rarity;

public class SimpleMonsterTest {


    @Test
    public void testRarities() {
        assertThat("Correct number of rarities", Rarity.values().length, equalTo(5));
    }

    @Test
    public void testHabitat() {
        Habitat habitat = HabitatHelper.createDefaultWithoutId();
        assertNotNull(habitat);
        assertFalse(habitat.getId().isPresent());
        assertThat(habitat.getCode(), equalTo(DEFAULT_HABITAT_CODE));
        assertThat(habitat.getName(), equalTo(DEFAULT_HABITAT_NAME));
        assertThat(habitat.getIncludes(), equalTo(DEFAULT_HABITAT_INCLUDES));
        
        habitat = HabitatHelper.createDefaultWithId();
        assertNotNull(habitat);
        assertTrue(habitat.getId().isPresent());
        assertThat(habitat.getId().get(), equalTo(DEFAULT_HABITAT_ID));
        assertThat(habitat.getCode(), equalTo(DEFAULT_HABITAT_CODE));
        assertThat(habitat.getName(), equalTo(DEFAULT_HABITAT_NAME));
        assertThat(habitat.getIncludes(), equalTo(DEFAULT_HABITAT_INCLUDES));
    }

    @Test
    public void teatMonster() {
        String name = "Drake";
        Habitat habitat = HabitatHelper.createDefaultWithoutId();
        Rarity rarity = Rarity.VERY_RARE;
        Monster monster = Monster.create(name, habitat, rarity);
        assertNotNull(monster);
        assertFalse(monster.getId().isPresent());
        assertThat(monster.getName(), equalTo(name));
        assertThat(monster.getHabitat(), equalTo(habitat));
        assertThat(monster.getRarity(), equalTo(rarity));
        
        monster = Monster.create(1l, name, habitat, rarity);
        assertNotNull(monster);
        assertTrue(monster.getId().isPresent());
        assertThat(monster.getName(), equalTo(name));
        assertThat(monster.getHabitat(), equalTo(habitat));
        assertThat(monster.getRarity(), equalTo(rarity));
    }
}