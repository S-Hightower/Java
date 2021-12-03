package com.shawna.zookeeperII;

public class GorillaTest {

	public static void main(String[] args) {
		
		Gorilla harambe = new Gorilla();
		
		harambe.throwSomething();
		harambe.throwSomething();
		harambe.throwSomething();
		
		harambe.eatBananas();
		harambe.eatBananas();
		
		harambe.climb();
		
		System.out.println("The Gorilla's energy level is:" + harambe.showEnergy());

	}

}
