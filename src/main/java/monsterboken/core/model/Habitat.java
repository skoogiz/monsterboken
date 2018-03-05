ackage monsterboken.core.model;

public class Habitat {

	private final Integer code;
	private final String name;
	private final String includes;

	private Habitat(Integer code, String name, String includes) {
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

	public static Habitat create(Integer code, String name, String includes) {
		return new Habitat(code, name, includes);
	}
}
