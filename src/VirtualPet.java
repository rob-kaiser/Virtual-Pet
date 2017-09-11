
public class VirtualPet {
	int hunger;
	int sleep;
	int sick;
	boolean stillAlive = true;
	

	public int moreFood() {
		return hunger = hunger + 4;
	}

	public int lessFood() {
		return hunger = hunger - 4;
	}

	public int moreTired() {
		return sleep = sleep + 4;
	}

	public int lessTired() {
		return sleep = sleep - 4;
	}

	public int notVaccinated() {
		return sick = sick - 1;
	}

	public boolean dead() {
		if (hunger <= 0 || hunger >= 20)
			stillAlive = false;
		return stillAlive;

	}

	public void tick() {
		hunger = hunger + 2;
		sleep = sleep - 2;
		sick = sick + 1;

	}
}
