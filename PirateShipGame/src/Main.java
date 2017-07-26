import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        Pirate redBeard = new Pirate("Two Toes Jackson", 37);
//        redBeard.drinkRum();
        Boat cursedShip = new Boat("The Tuna Breath");
        cursedShip.addMember(redBeard.getName(), redBeard.getAge());
        cursedShip.addMember("Benny Black Beard", 78);
//        cursedShip.printCrew(cursedShip);
        Boat fuckBoat = new Boat("The Sea Wolf");
        fuckBoat.addMember("Rusty O'Scurvey", 25);
        fuckBoat.addMember("Squidlips O'Malley", 33);
//        fuckBoat.printCrew(fuckBoat);
//        System.out.println(Math.random());
//        System.out.println(cursedShip.getRumCount());
//        System.out.println(fuckBoat.getRumCount());
//        cursedShip.printCrew();

        System.out.print("Enter your Boats Name: ");
        Boat userBoat = new Boat(scan.nextLine());
        System.out.print("Enter your Captains name: ");
        String capName = scan.nextLine();
        System.out.print("Enter your Captains Age: ");
        int capAge = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter your First Mates name: ");
        String memberName = scan.nextLine();
        System.out.print("Enter your First Mates Age: ");
        int memberAge = scan.nextInt();
        scan.nextLine();
        userBoat.addMember(capName, capAge);
        userBoat.addMember(memberName, memberAge);
        userBoat.printCrew();

        printOptions();

        boolean quit = false;
        while (quit != true) {
            int options = scan.nextInt();
            scan.nextLine();
            switch (options) {
                case 1:
                    System.out.println("Enter new members name: ");
                    String newName = scan.nextLine();
                    System.out.println("Enter new members age: ");
                    int newAge = scan.nextInt();
                    scan.nextLine();
                    userBoat.addMember(newName,newAge);
                    break;
                case 2:
                    System.out.println(userBoat.getRumCount());
                    break;
                case 3:
                    userBoat.printCrew();
                    break;
                case 4:
                    System.out.println("Choose Oppenent:\n1 - FuckBoat\n2 - Cursed Ship");
                    int chooseOpponent = scan.nextInt();
                    scan.nextLine();
                    if (chooseOpponent == 1) {
                        userBoat.battle(userBoat, fuckBoat);
                    } else if (chooseOpponent == 2) {
                        userBoat.battle(userBoat, cursedShip);
                    } else {
                        System.out.println("Not a Valid Opponent Entry.");
                    }
                    break;
                case 5:
                    System.out.println(userBoat.getBattlesWon());
                    break;
                case 6:
                    printOptions();
                    break;
                case 7:
                    System.out.println("Thank for playing!");
                    quit = true;
            }
        }

    }

    public static void printOptions() {
        System.out.println("1: Add Member\n2: Rum Left\n3: Show Crew\n4: Battle\n5: Battles Won\n6: Print Options\n7: Quit");
    }

}
