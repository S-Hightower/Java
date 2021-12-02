package com.shawna.zookeeper;

public class Mammal {

	public int energyLevel = 100;
	
	public int showEnergy() {
		System.out.println(this.energyLevel);
		return energyLevel;
	}
	
	public int getEnergyLevel() {
		return this.energyLevel;
	}
	public void setEnergyLevel(int energy) {
		this.energyLevel = energy;
	}
}
