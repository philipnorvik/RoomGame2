package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("start");

        ControllerRoom cr = new ControllerRoom();

        cr.setRoomsIF(1);

        System.out.println(cr.getQuery(1));


    }
}
