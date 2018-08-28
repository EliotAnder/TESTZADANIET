package sample;
//ничего из этого не используется
public class Product {
    private String name;
    private int age;
    private String birthday;


    public Product() {
        this.name = "";
        this.age = 0;
        this.birthday = "";
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(int age) {
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
