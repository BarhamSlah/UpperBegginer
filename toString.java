I am talking about toString 

1- toString is method.
2- if you don't make toString and System.out.println(nameOfObject) the compiler will give you the of class and hashcode.
3- if you make toString in the class and then System.out.println(nameOfObject) the compiler give you the data in the class.
4- it is not necessarily to return all variable that you wrote in the constructor. 
5- it is also use in the debugging process.

 public class Info {
 public static void main() {

Person person1 = new Person ("Barham " , "Kurdistan" , "Student " , 18);
Person person2 = new Person ("Ahmad" , "Kurdistan" , "Jobless" , 21);
Person person3 = new Person ("Akam " , "Kurdistan" , "Teacher" , 26);

System.out.println(person1);  
System.out.println(person2);
System.out.println(person3);

    }
}

////////////////////////

public class Person {

    String name;
    String fromWhere;
    String job;
    int age;

    Person(String name, String fromWhere, String job, int age){
        this.name = name;
        this.fromWhere = fromWhere;
        this.job = job;
        this.age = age;
    }

    @Override
    public String toString(){
    return "The name is " + this.name + "\n" + "The person is " + this.age + " years old \n" +   "The person is from " + this.fromWhere + "\n" +                "The person is a " + this.job + "\n";

    }
}
