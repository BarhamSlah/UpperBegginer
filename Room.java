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