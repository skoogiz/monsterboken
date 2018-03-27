package monsterboken.core.domain;

import static org.junit.Assert.*;

import java.util.Optional;

import static org.hamcrest.CoreMatchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import monsterboken.core.model.Habitat;
import monsterboken.db.dao.HabitatDao;
import monsterboken.db.dao.HabitatDaoImpl;
import monsterboken.db.model.HabitatEO;

public class HabitatDaoTest {

    private HabitatDao dao;

    @Before
    public void init() {
        this.dao = new HabitatDaoImpl();
    }

    @After
    public void clean() {
        this.dao = null;
    }

    @Test
    public void testCreate() {
        Habitat habitat = HabitatHelper.createDefaultWithoutId();

        HabitatEO eo = HabitatEO.create(habitat);
        assertNull(eo.getId());

        dao.create(eo);
        assertNotNull(eo.getId());
        assertThat(eo.getCode(), equalTo(habitat.getCode()));
        assertThat(eo.getName(), equalTo(habitat.getName()));
        assertThat(eo.getIncludes(), equalTo(habitat.getIncludes()));
    }

    @Test
    public void testFind() {
        HabitatEO eo = HabitatEO.create(HabitatHelper.createDefaultWithoutId());
        dao.create(eo);

        long habitatId = eo.getId();
        Optional<Habitat> optional = dao.find(habitatId);
        assertTrue(optional.isPresent());
        Habitat fetchedHabitat = optional.get();
        assertTrue(fetchedHabitat.getId().isPresent());
        assertThat(fetchedHabitat.getId().get(), equalTo(eo.getId()));
        assertThat(fetchedHabitat.getCode(), equalTo(eo.getCode()));
        assertThat(fetchedHabitat.getName(), equalTo(eo.getName()));
        assertThat(fetchedHabitat.getIncludes(), equalTo(eo.getIncludes()));
    }

    @Test
    public void testUpdate() {
        HabitatEO eo = HabitatEO.create(HabitatHelper.createDefaultWithoutId());
        dao.create(eo);

        long habitatId = eo.getId();

        Habitat fetchedHabitat = dao.find(habitatId).get();
        eo.setCode(HabitatHelper.DEFAULT_HABITAT_CODE + 1);
        eo.setName(eo.getName() + "test");
        assertThat(fetchedHabitat.getId().get(), equalTo(eo.getId()));
        assertThat(fetchedHabitat.getCode(), not(eo.getCode()));
        assertThat(fetchedHabitat.getName(), not(eo.getName()));
        assertThat(fetchedHabitat.getIncludes(), equalTo(eo.getIncludes()));

        dao.update(eo);
        fetchedHabitat = dao.find(habitatId).get();
        assertThat(fetchedHabitat.getId().get(), equalTo(eo.getId()));
        assertThat(fetchedHabitat.getCode(), equalTo(eo.getCode()));
        assertThat(fetchedHabitat.getName(), equalTo(eo.getName()));
        assertThat(fetchedHabitat.getIncludes(), equalTo(eo.getIncludes()));
    }

    @Test
    public void testDelete() {
        HabitatEO eo = HabitatEO.create(HabitatHelper.createDefaultWithoutId());
        dao.create(eo);

        long habitatId = eo.getId();

        dao.delete(eo);
        Optional<Habitat> optional = dao.find(habitatId);
        assertFalse(optional.isPresent());
    }

}
