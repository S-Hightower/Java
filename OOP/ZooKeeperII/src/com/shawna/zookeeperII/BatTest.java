package com.shawna.zookeeperII;

public class BatTest {

	public static void main(String[] args) {
		
		Bat bartok = new Bat();
		
		bartok.attackTown();
		bartok.attackTown();
		bartok.attackTown();
		
		bartok.eatHumans();
		bartok.eatHumans();
		
		bartok.fly();
		bartok.fly();

		System.out.println("The Bat's energy level is:" + bartok.showEnergy());
	}

}
