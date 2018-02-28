package model;

public final class Habitat {
	
	private final Integer code;
	private final String name;
	private final String includes;
	
	public Habitat(Integer code, String name, String includes) {
		super();
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
