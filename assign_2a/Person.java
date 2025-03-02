//assign 2a progammed by Jackie Wang email:junkaiwang0716@gmail.com
public class Person {
    private String name;
    private String address;
    private int age;
    private String phone;

    public Person(){
        this.name = "";
        this.address = "";
        this.age = 0;
        this.phone = "";
    }

    public Person(String name, String address, int age, String phone) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void print(){
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phone);
        System.out.println();
    }
}