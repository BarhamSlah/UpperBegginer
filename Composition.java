Composition means a big thing owns a smaller thing, and the smaller thing cannot live without the big thing.

It is a "HAS-A" relationship. A House HAS-A Room.

Simple Rules
The Owner (Big): The House creates and holds the Room.

The Part (Small): The Room stays inside the House.

Life Rule: If you destroy the House, the Room disappears too.

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

void main(){

House house1 = new House("Erbil" , 200 , new Room(5 , 4,4,2,1,1));
house1.location();
house1.displayDetails();

System.out.println();

House house2 = new House("Koya" , 100 , new Room(2 , 2,1,1,1,1));
house2.location();
house2.displayDetails();

}

///////////////

class House {

    int area;
    String place;
    Room room ;

House (String place, int area ,  Room room ) {
    this.area = area;
    this.place = place;
    this.room = room;
}

void location(){
    System.out.println("This house located in " + this.place + " and " + this.area + "m² ");
}

void displayDetails(){
    room.displayRooms();
}

}

//////////////////

class Room {

    int toilet;
    int bedroom;
    int bathroom;
    int kitchen;
    int hall;
    int livingroom;

    Room(int toilet , int bedroom , int bathroom , int kitchen, int hall , int livingroom) {
        this.livingroom = livingroom;
        this.hall = hall;
        this.bedroom = bedroom;
        this.kitchen = kitchen;
        this.bathroom = bathroom;
        this.toilet = toilet;
    }

void displayRooms(){
    System.out.println("This house has " + this.bathroom + " Bathroom & " + this.kitchen + " Kitchen & " + this.hall + " Hall & " +  this.livingroom +
            " Livingroom & " + this.bedroom + " Bedroom and " + this.toilet + " Toilet" );
}

} 
