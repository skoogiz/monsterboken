package monsterboken.core.model;

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

    private static int HABITAT_CODE = 2;
    private static String HABITAT_NAME = "Skog";
    private static String HABITAT_INCLUDES = "Gläntor, stigar och ihåliga träd.";

    @Test
    public void testRarities() {
        assertThat("Correct number of rarities", Rarity.values().length, equalTo(5));
    }

    @Test
    public void testHabitat() {
        Habitat habitat = Habitat.create(HABITAT_CODE, HABITAT_NAME, HABITAT_INCLUDES);
        assertNotNull(habitat);
        assertFalse(habitat.getId().isPresent());
        assertThat(habitat.getCode(), equalTo(HABITAT_CODE));
        assertThat(habitat.getName(), equalTo(HABITAT_NAME));
        assertThat(habitat.getIncludes(), equalTo(HABITAT_INCLUDES));
        
        habitat = Habitat.create(1l, HABITAT_CODE, HABITAT_NAME, HABITAT_INCLUDES);
        assertNotNull(habitat);
        assertTrue(habitat.getId().isPresent());
        assertThat(habitat.getCode(), equalTo(HABITAT_CODE));
        assertThat(habitat.getName(), equalTo(HABITAT_NAME));
        assertThat(habitat.getIncludes(), equalTo(HABITAT_INCLUDES));
    }

    @Test
    public void testMonster() {
        String name = "Drake";
        Habitat habitat = Habitat.create(HABITAT_CODE, HABITAT_NAME, HABITAT_INCLUDES);
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