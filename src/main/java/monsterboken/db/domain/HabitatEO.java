package monsterboken.db.domain;

import monsterboken.core.model.Habitat;
import monsterboken.core.model.Mappable;

public class HabitatEO implements Mappable<Habitat>{

    private Integer code;

    private String name;

    private String includes;

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
    
    @Override
    public Habitat map() {
    	return Habitat.create(code, name, includes);
    }
}
