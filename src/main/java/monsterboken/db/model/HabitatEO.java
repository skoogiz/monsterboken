package monsterboken.db.model;

import monsterboken.core.model.Habitat;
import monsterboken.core.model.Mappable;

public class HabitatEO implements Mappable<Habitat> {

	private Long id;
	private Integer code;
	private String name;
	private String includes;

	public HabitatEO() {
		
	}

	public HabitatEO(Habitat habitat) {
		if(habitat.getId().isPresent()) {
		this.id = getId();}
		this.code = getCode();
		this.name = getName();
		this.includes = getIncludes();
	}

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

	public Habitat map() {
		return Habitat.create(id, code, name, includes);
	}
}
