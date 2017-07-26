import java.util.ArrayList;
import java.util.List;

/**
 * Created by Korey on 6/1/17.
 */
public class Boat {

    private List<Pirate> pirates = new ArrayList<>();
    private String name;
    private int battlesWon;
    private boolean isSunk = false;
    private int rumCount;
    private boolean hasRum;

    public Boat(String name) {
        rumCount = 10;
        this.name = name;
        this.pirates = new ArrayList<Pirate>();
    }

    public int getBattlesWon() {
        return battlesWon;
    }

    public boolean isSunk() {
        return isSunk;
    }

    public int getRumCount() {
        return rumCount;
    }

    public String getName() {
        return name;
    }

    public void addMember(String name, int age) {
        this.pirates.add(new Pirate(name, age));
        System.out.println(name + " added to the crew for the " + this.name);
    }

    public void printCrew() {
        System.out.println("=============================================");
        System.out.println("Crew for " + this.name + ":");
        for (Pirate p : pirates) {
            System.out.println(p.getName());
        }
        System.out.println("=============================================");
    }

    public boolean isGameOver(Boat boat) {
        if (this.rumCount <= 0) {
            hasRum = false;
            isSunk = true;
            System.out.println(this.name + " IS ALL OUT OF RUM! MATEY WALK THE PLANK!");
            return hasRum;
        } else {
            return hasRum;
        }
    }

    public void battle (Boat myBoat, Boat opponent){
        double firstNumber = Math.random();
        double secondNumber = Math.random();
        if ((myBoat.rumCount > 0) && (opponent.rumCount > 0)) {
            if (firstNumber > secondNumber) {
                myBoat.battlesWon++;
                myBoat.rumCount++;
                opponent.rumCount--;
                System.out.println(myBoat.name + " has won the battle... ARGGGG!!\n" + opponent.name + " has lost. WALK THE PLANK!");
                System.out.println(myBoat.name + " Rum Left : " + myBoat.getRumCount());
                System.out.println(opponent.name + " Rum Left : " + opponent.rumCount);
            } else if (secondNumber > firstNumber) {
                opponent.battlesWon++;
                opponent.rumCount++;
                myBoat.rumCount--;
                System.out.println(opponent.name + " has won! You SUCK matey! " + myBoat.name + " walk the plank!");
                System.out.println(myBoat.name + " Rum Left : " + myBoat.getRumCount());
                System.out.println(opponent.name + " Rum Left : " + opponent.rumCount);
            } else {
                System.out.println("It was a draw matey!!! ARGG!! Ye both lose RUM!");
                opponent.rumCount--;
                myBoat.rumCount--;
                System.out.println(myBoat.name + " Rum Left : " + myBoat.getRumCount());
                System.out.println(opponent.name + " Rum Left : " + opponent.rumCount);
            }
        } else if (myBoat.getRumCount() <= 0) {
            System.out.println(myBoat.name + " has no rum!! Ye can't battle when your men are dry as a whistle you scoundrel!! WALK THE PLANK!");
        } else if (opponent.getRumCount() <= 0) {
            System.out.println(opponent.name + " has no rum... Poor souls. ARRGGG!");
        } else {
            System.out.println("Neither of you can battle! NO RUM! WHAT'S THE POINT MATEY!");
        }
        isGameOver(opponent);
        isGameOver(this);
    }

}

