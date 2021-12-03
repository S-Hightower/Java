package com.shawna.zookeeperII;

public class Bat extends Mammal{
	
	public Bat() {
		this.energyLevel = 300;
	}

	public void fly() {
		System.out.println("Whoosh!");
		this.setEnergyLevel(this.getEnergyLevel() - 50);
	}

	public void eatHumans() {
		System.out.println("Look away! The bat is eating >_<");
		this.setEnergyLevel(this.getEnergyLevel() + 25);
	}
	
	public void attackTown() {
		System.out.println("The bat is imitating Trogdor the Burninator. He's doing great.");
		this.setEnergyLevel(this.getEnergyLevel() - 100);
	}
}
