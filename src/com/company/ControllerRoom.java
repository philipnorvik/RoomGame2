package com.company;

public class ControllerRoom {

    private RoomsIF roomsIF;

    public RoomsIF getRoomsIF() {
        return roomsIF;
    }

    public void setRoomsIF(int nr) {
        if (nr ==1)
        this.roomsIF = new StevieQ();
    }

    public String getQuery(int nr){
      if(nr == 1){
        return roomsIF.queryOne();
      }
      else return null;
    };
}
