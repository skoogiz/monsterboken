package model;

public class Habitat {
	
	private Integer code;
	private String name;
	private String includes;
	
	public Habitat(Integer code, String name, String includes) {
		super();
		this.code = code;
		this.name = name;
		this.includes = includes;
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
