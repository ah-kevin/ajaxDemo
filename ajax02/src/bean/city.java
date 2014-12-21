package bean;

/**
 * Created by Administrator on 2014/12/21.
 */
public class city {
    private  String name;
    private  String value;

    public city() {
    }

    public city(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
