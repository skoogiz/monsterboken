package monsterboken.core.domain;

import monsterboken.core.model.Habitat;

public final class HabitatHelper {

    public static long DEFAULT_HABITAT_ID = 1l;
    public static int DEFAULT_HABITAT_CODE = 2;
    public static String DEFAULT_HABITAT_NAME = "Skog";
    public static String DEFAULT_HABITAT_INCLUDES = "Gläntor, stigar och ihåliga träd.";

    public static Habitat createDefaultWithoutId() {
        return Habitat.create(DEFAULT_HABITAT_CODE, DEFAULT_HABITAT_NAME, DEFAULT_HABITAT_INCLUDES);
    }

    public static Habitat createDefaultWithId() {
        return Habitat.create(DEFAULT_HABITAT_CODE, DEFAULT_HABITAT_NAME, DEFAULT_HABITAT_INCLUDES);
    }

    private HabitatHelper() {
    }

}
