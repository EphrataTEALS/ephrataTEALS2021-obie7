import java.util.Scanner;

public class guessinggame {
    int rannumber;
    int guess;
    boolean correct = false;

    Scanner userchoice = new Scanner (System.in);
    System.out.print("choose a random number: ");
    rannumber = userchoice.nextInt();

    while (!correct){
        System.out.print( "Guess: ");
        guess = userchoice.nextInt();
        
        if (guess == rannumber) {
            correct= true ;
            Systm.out.println("you are right ");
        }
        else if (guess < rannumber){
            System.out.println("Higher");
        }
        else if (guess > rannumber){
            System.out.println("lower");
        }









    }


    





}
