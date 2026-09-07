WE HAVE 2 TYPES OF OBJECT : 

1- Referenced Object: An object assigned to a reference variable (e.g., Person p = new Person();).
2- It is stored in heap memory with its memory address kept in the stack variable p,
3- allowing you to reuse it multiple times throughout its scope.

1- Anonymous Object: An object created without assigning it to a reference variable (e.g., new Person();).
2- It exists in heap memory only for the duration of the statement in which it is instantiated,
3- after which it becomes immediately eligible for Garbage Collection.

You don't have to use anonymous objects. They are useful only when you need an object once. 
It's clearer and easier to understand. when you become pro in java you can use it
