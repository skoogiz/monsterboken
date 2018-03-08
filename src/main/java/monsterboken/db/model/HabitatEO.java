package monsterboken.db.model;

import java.util.Optional;

public class HabitatEO {

	private Optional<Long> id;
	private Integer code;
	private String name;
	private String includes;

	private HabitatEO() {

	}

	public HabitatEO(Long id, Integer code, String name, String includes) {
		this.id = Optional.of(id);
		this.code = code;
		this.name = name;
		this.includes = includes;
	}

	public Optional<Long> getId() {
		return id;
	}

	public void setId(Optional<Long> id) {
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
