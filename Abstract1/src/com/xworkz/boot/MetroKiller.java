package com.xworkz.boot;

import com.xworkz.app.BluelineMetro;
import com.xworkz.app.Metro;

public class MetroKiller {

	public static void main(String[] args) {

		System.out.println("Running MetroRunner...");

		Metro metro = new BluelineMetro();
		metro.accelerate();
		metro.announcement();
		metro.completeJourney();
		metro.decelerate();
		metro.emergencyBrake();
		metro.move();
		metro.openDoors();
		metro.start();
		metro.stop();
		metro.playAnnouncement("HII");

	}

}