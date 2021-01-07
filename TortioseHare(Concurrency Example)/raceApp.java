package TortioseHare;

public class raceApp {
    public static void main(String[] args) {
        RunnerThread turtle = new RunnerThread("Turtle", 10, 0);
        RunnerThread hare = new RunnerThread("Hare", 100, 40);
        Thread secondThread = new Thread(hare);
        
        System.out.println("Get set.. go");
        secondThread.start();
        turtle.run();
        
    }
}
