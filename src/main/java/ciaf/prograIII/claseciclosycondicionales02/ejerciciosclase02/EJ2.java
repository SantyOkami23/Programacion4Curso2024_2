package ciaf.prograIII.claseciclosycondicionales02.ejerciciosclase02;
import java.util.Scanner;
import java.util.Random;
public class EJ2 {
    public static void main(String[] args) {
        Random random = new Random();
        int Points = 0;
        int Attemps = 5;
        int ComputerElections = random.nextInt(3) + 1;
        String SelectionToStr = "";
        Scanner Keyboard = new Scanner(System.in);


        for(int ActualAttemp = 0; ActualAttemp < Attemps; ActualAttemp++) {
            System.out.println("=== PLAYING MENU ===");
            System.out.println(";-; - 1 - Rock");
            System.out.println(";-; - 2 - Paper");
            System.out.println(";-; - 3 - Scissors");
            System.out.println("Now that you already seen the options please select one: ");
            int userSelection = Keyboard.nextInt();

            switch (userSelection){
                case 1:
                    SelectionToStr = "You Choice Rock";
                    break;
                case 2:
                    SelectionToStr = "You Choice Paper";
                    break;
                case 3:
                    SelectionToStr = "You Choice Scissors";
                    break;
            }

            if(userSelection == 1 && ComputerElections == 2) {
                System.out.println("¡You WIN!");
                Keyboard.close();
            } else if(userSelection == 2 && ComputerElections == 3) {
                System.out.println(":( i dont wanna tell you this... but you lose. try again...");
            } else if (userSelection == 3 && ComputerElections == 2) {
                System.out.println("¡You WIN!");
            }


        }
    }
}