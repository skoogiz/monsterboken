package monsterboken.domain;

public class Habitat {

    private Integer code;

    private String name;

    private String includes;

    public Habitat(Integer code, String name, String includes) {
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
