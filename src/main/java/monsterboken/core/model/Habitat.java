package monsterboken.core.model;

import java.util.Optional;

public final class Habitat {
	
	private final Optional<Long> id;
	private final Integer code;
	private final String name;
	private final String includes;
	
	private Habitat(Optional<Long> id, Integer code, String name, String includes) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.includes = includes;
	}
	
	public static Habitat create(Long id, Integer code, String name, String includes) {
		return new Habitat(Optional.of(id), code, name, includes);
	}
	
	public Optional<Long> getId(){
		return id;
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
