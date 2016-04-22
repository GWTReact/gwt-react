package gwt.react.client.utils;

/**
 * A class for combining css classnames based on specific conditions
 */
public class Classnames {
    public static String get(String className, boolean condition) {

        return condition ? className : "";
    }

    public static String get(String className1, boolean condition1,
                             String className2, boolean condition2) {
        String cls = condition1 ? className1 : "";

        if (condition2) {
            if (!cls.isEmpty()) {
                cls += " ";
            }
            cls += className2;
        }
        return cls;
    }

    public static String get(String className1, boolean condition1,
                             String className2, boolean condition2,
                             String className3, boolean condition3) {
        String cls = condition1 ? className1 : "";

        if (condition2) {
            if (!cls.isEmpty()) {
                cls += " ";
            }
            cls += className2;
        }

        if (condition3) {
            if (!cls.isEmpty()) {
                cls += " ";
            }
            cls += className3;
        }
        return cls;
    }
}
