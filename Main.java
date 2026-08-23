void main(){

House house1 = new House("Erbil" , 200 , new Room(5 , 4,4,2,1,1));
house1.location();
house1.displayDetails();

System.out.println();

House house2 = new House("Koya" , 100 , new Room(2 , 2,1,1,1,1));
house2.location();
house2.displayDetails();

}