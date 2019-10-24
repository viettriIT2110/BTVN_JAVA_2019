package runmain;

public class person {
    private String name;
    private int age;
    private String hobby;
    private String sex;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void xuat(){
        System.out.println("name  :" + name);
        System.out.println("age :" + age);
        System.out.println("hobby  :" + hobby);
        System.out.println("sex  :" + sex);
    }

}
