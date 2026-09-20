Enum (Enumeration) is a special Java type used to represent a fixed set of constants.
Instead of using strings or numbers for values that have limited choices, you can use an enum.

✅ Use enum when:
You have a fixed set of related values.

An enum is similar to a class because it can have fields, methods, and constructors. However, an enum cannot extend another class or be extended by another class.
It can implement one or more interfaces.

Method and Purpose : 
name()
Returns the constant's name
ordinal()
Returns its position, starting from 0
values()
Returns all enum constants
valueOf()
Finds a constant by its exact name
  
***********************************************************************************************************************************************************
  
 enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}


 void main() {

    Day today = Day.MONDAY;

    IO.println(today);
 }


/*
Day → Enum type
today → Variable
Day.MONDAY → Enum constant
*/


  void main (){

    Day today = Day.MONDAY;

    IO.println(today);
    IO.println(today.ordinal());
    IO.println(today.name());
    IO.println(Day.valueOf("MONDAY"));
    
    for (Day day : Day.values()) {
        IO.println(day);
    }

} 

 ***********************************************************************************************************************************************************

  
