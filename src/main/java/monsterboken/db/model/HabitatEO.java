package monsterboken.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import monsterboken.core.model.Habitat;
import monsterboken.core.model.Mappable;

@Entity
public class HabitatEO implements EntityObject, Mappable<Habitat> {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "HABITAT_ID")
    private Long id;

    @Column(name = "CODE")
    private Integer code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "INCLUDES")
    private String includes;

    public static HabitatEO create(Habitat habitat) {
        HabitatEO eo = new HabitatEO();
        habitat.getId().ifPresent(eo::setId);
        eo.setCode(habitat.getCode());
        eo.setName(habitat.getName());
        eo.setIncludes(habitat.getIncludes());
        return eo;
    }

    @Override
    public Habitat map() {
        return Habitat.create(id, code, name, includes);
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIncludes() {
        return includes;
    }

    public void setIncludes(String includes) {
        this.includes = includes;
    }

}
