import java.util.Scanner;
public class UserInterface {

    public static void main(String[] args) {
        new UserInterface().run();
    }

    public void run(){
        GameController myController = new GameController();
        Scanner in = new Scanner(System.in);
        int userInput;
        System.out.println("Welcome to rock, paper, scissors.");
        while (myController.checkPlayerTurn()){
            System.out.println("Please choose rock, paper or scissors.\n" +
            "Press 1 for rock, 2 for paper or 3 for scissors.");
            if (in.hasNextInt()) {
                userInput = in.nextInt();
                if (userInput == 1 || userInput == 2 || userInput == 3){

                } else {
                    System.out.println("Error, wrong int. Input 1, 2 or 3.");
                }
            }
            else if (in.hasNextLine()){
                System.out.println("Error wrong input, try again");
            }
            System.out.println("You have chosen " + myController);

        }

    }



}
