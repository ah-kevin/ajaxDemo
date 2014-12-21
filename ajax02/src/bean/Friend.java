package bean;

/**
 * Created by Administrator on 2014/12/21.
 * 实体bean ,表示朋友类型
 *
 */
public class Friend {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Friend() {
        super();
    }

    public Friend(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
