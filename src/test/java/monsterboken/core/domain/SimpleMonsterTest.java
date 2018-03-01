package monsterboken.core.domain;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import monsterboken.core.domain.Habitat;
import monsterboken.core.domain.Monster;
import monsterboken.core.domain.Rarity;

public class SimpleMonsterTest {

    private static int HABITAT_CODE = 2;
    private static String HABITAT_NAME = "Skog";
    private static String HABITAT_INCLUDES = "Gläntor, stigar och ihåliga träd.";

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testRarities() {
        assertThat("Correct number of rarities", Rarity.values().length, is(5));
    }

    @Test
    public void testHabitat() {
        Habitat habitat = Habitat.create(HABITAT_CODE, HABITAT_NAME, HABITAT_INCLUDES);
        assertNotNull(habitat);
        assertThat(habitat.getCode(), is(HABITAT_CODE));
        assertThat(habitat.getName(), is(HABITAT_NAME));
        assertThat(habitat.getIncludes(), is(HABITAT_INCLUDES));
    }

    @Test
    public void teatMonster() {
        String name = "Drake";
        Habitat habitat = Habitat.create(HABITAT_CODE, HABITAT_NAME, HABITAT_INCLUDES);
        Rarity rarity = Rarity.VERY_RARE;
        Monster monster = Monster.create(name, habitat, rarity);
        assertNotNull(monster);
        assertThat(monster.getName(), is(name));
        assertThat(monster.getHabitat(), is(habitat));
        assertThat(monster.getRarity(), is(rarity));
    }
}