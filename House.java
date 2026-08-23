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