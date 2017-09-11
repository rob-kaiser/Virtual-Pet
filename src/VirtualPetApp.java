import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		System.out.println("                         `//                      \r\n"
				+ "                       ./mNh:`                    \r\n"
				+ "                      sMMMMMMMm.             .    \r\n"
				+ "                     +MMMMd-``.            .yMhs. \r\n"
				+ "                     mMMMMM.               sMMMMN:\r\n"
				+ "       `            -MMMMMM.               sMMMM: \r\n"
				+ " .+ydNMMMNMMMNNmmmhhmMMMMMM:               +MMMM- \r\n"
				+ "sMMMMMMMMMMMMMMMMMMMMMMMMMM:               :MMMM+ \r\n"
				+ "mMMMMMMMMMMMMMMMMMMMMMMMMMm`   /ydNMMMMNNdymMMMMh \r\n"
				+ "+MMMMMMMMMMMMMMMMMMMMMMMMh`  .mMMMMMMMMMMMMMMMMMy \r\n"
				+ " yMMMMMMMMMMMMMMMMMMMNy/`    sMMMMMMMMMMMMMMMMMM- \r\n"
				+ " hMMMMNooshhdNNMMMMMM:       .dMMMMMMMMMMMMMMMM:  \r\n"
				+ " oMMMM.       .NMMdMs          oMMMM--/++/NMMh.   \r\n"
				+ " .Nd+M.        .mh-M           .MMN:      oMM:    \r\n"
				+ "  -M/ho         hs.N           :MN-        MN.    \r\n"
				+ "   :Msmy`       yh`yd.          yh         sN`    \r\n"
				+ "    ./.-        ./. .`          `/:        `-`    \r\n" + "");

		Scanner input = new Scanner(System.in);
		System.out.println("Congrats on your new Robagatchi!");
		System.out.println("What's your llama's name?");
		String petName = input.nextLine();

		VirtualPet petLevels = new VirtualPet();

		petLevels.hunger = 5;
		petLevels.sleep = 5;
		petLevels.sick = 0;

		do {
			System.out.println("What would you like to do with " + petName + "?");
			System.out.println("Select a number to continue");
			System.out.println(" ______________________");
			System.out.println("|                      |");
			System.out.println("| 1. Feed              |");
			System.out.println("| 2. Play a game       |");
			System.out.println("| 3. Go for a walk     |");
			System.out.println("| 4. View Your Levels  |");
			System.out.println("|______________________|");
			String userResponse = input.nextLine();
			System.out.println("\n");
			petLevels.dead();

			switch (userResponse) {
			case "1":
				petLevels.moreFood();
				petLevels.moreTired();
				System.out.println("mmmmm that was good. Nothing quite like a grandslam breakfast. \n");
				break;

			case "2":
				petLevels.lessFood();
				petLevels.lessTired();
				System.out.println(petName + " beat you in a game of scrabble.\n");
				break;

			case "3":
				petLevels.lessFood();
				petLevels.moreTired();
				System.out.println("That was a nice walk but " + petName + " is getting hungry.\n");
				break;

			case "4":
				System.out.println(petName + "s" + " hunger level is " + petLevels.hunger);
				System.out.println(petName + "s" + " tired level is " + petLevels.sleep + "\n");
				break;

			default:
				System.out.println("That's invalid...try another selection...\n");
			}
			if (petLevels.hunger >= 20) {
				System.out.println("Gluttony kills...You over fed " + petName);
				System.exit(0);

			} else if (petLevels.hunger <= 0) {
				System.out.println("It looks like you missed feeding time. RIP " + petName);
				System.exit(0);

			} else if (petLevels.sleep >= 20) {
				System.out.println("sleep deprivation is never a good thing.");
				System.exit(0);

			} else if (petLevels.sleep <= 0) {
				System.out.println(" But you forgot to wake up " + petName + ". Goodnight forever!");
				System.exit(0);

			} else if (petLevels.sick == 4) {
				System.out.println("There isn't anything you can do... " + petName
						+ "'s ashes are now in a foldgers can. My condolences...");
				System.exit(0);
			}

			petLevels.tick();
		} while (petLevels.stillAlive == true);

	}
}