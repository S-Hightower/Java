package com.shawna.zookeeperII;

public class Gorilla extends Mammal{

		public void throwSomething() {
			System.out.println("The gorilla threw something!");
			this.setEnergyLevel(this.getEnergyLevel() - 5);
		}

		public void eatBananas() {
			System.out.println("The gorilla ate a banana!");
			this.setEnergyLevel(this.getEnergyLevel() + 10);
		}
		
		public void climb() {
			System.out.println("The gorilla is pulling a King Kong.");
			this.setEnergyLevel(this.getEnergyLevel() - 10);
		}
}
