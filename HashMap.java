HashMap : is a Class in Java

import java.util.HashMap;

static void main(String[] args)  {

    HashMap<String , Double> hashMap = new HashMap<>();

    hashMap.put("apple" , 0.5);   // add to the list
    hashMap.put("banana" , 1.3);
    hashMap.put("orange" , 0.7);
    hashMap.replace("apple" , 0.5 , 1.5);  // replace with another value
    hashMap.remove("apple");  // to delete
    // hashMap.clear(); // to delete all the name & value
    System.out.println(hashMap.containsValue(1.3));
    System.out.println(hashMap.containsKey("melon"));
    System.out.println(hashMap.get("apple"));  // give me the value of apple
    System.out.println(hashMap.size());  // to know number of element
    System.out.println(hashMap.values());  // just to print value

    // this is use instead of this System.out.println(hashMap); to display hashmap as you like
    for (String element : hashMap.keySet()){
        System.out.println(element + " : " + hashMap.get(element));

}

