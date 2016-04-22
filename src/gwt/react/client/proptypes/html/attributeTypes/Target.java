package gwt.react.client.proptypes.html.attributeTypes;

/**
 * Created by paul on 2016-03-23.
 */
public enum Target {
    blank("_blank"),
    self("_self"),
    parent("_parent"),
    top("_top");

    private String val;

    Target(String val) {
        this.val = val;
    }

    String getVal() {
        return val;
    }
}
