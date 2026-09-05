Encapsulation : is hiding an object's internal data behind private variables and controlling access to it through public methods
(getters and setters). ENCAPSULATION = PRIVATE FIELD + METHODS(GETTER & SETTER)

********************************************************************************************************************************************
public class Person {

    private String name;
    private int age;

    public String setName(String name) {
     return this.name = name;
    }

    public void getName() {
        System.out.println(this.name);
    }

    public void getAge() {
        System.out.println(this.age);
    }

    public int setAge(int age) {
        return this.age = age;
    }


}

void main()  {

Person person = new Person();

person.setAge(18);
person.setName("Barham");
person.getName();
person.getAge();

}
