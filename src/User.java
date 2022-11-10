public class User {
    private String name;
    private String surname;
    private int age;

    public String getName(String petr) {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
