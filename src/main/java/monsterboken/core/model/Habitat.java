package monsterboken.core.model;

import java.util.Optional;

public final class Habitat {
	
	private final Optional<Long> id;
	private final Integer code;
	private final String name;
	private final String includes;
	
	public Habitat(Optional id, Integer code, String name, String includes) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.includes = includes;
	}

	public Integer getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getIncludes() {
		return includes;
	}
}
