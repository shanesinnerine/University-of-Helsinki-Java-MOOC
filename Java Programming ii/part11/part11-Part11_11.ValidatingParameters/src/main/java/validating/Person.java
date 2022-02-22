package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if(name == null){
            throw new IllegalArgumentException("Name is not properly formatted");
        }
        if(name.isEmpty()||name.length() > 40){
            throw new IllegalArgumentException("Name is not properly formatted");
        }
        if(age > 120 || age < 0){
            throw new IllegalArgumentException("Invalid age");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
