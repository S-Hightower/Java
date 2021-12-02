package com.shawna.zookeeper;

public class GorillaTest {

	public static void main(String[] args) {
		
		Gorilla Harambe = new Gorilla();
		
		Harambe.throwSomething();
		Harambe.throwSomething();
		Harambe.throwSomething();
		
		Harambe.eatBananas();
		Harambe.eatBananas();
		
		Harambe.climb();
		
		System.out.println("The Gorilla's energy level is:" + Harambe.showEnergy());

	}

}
