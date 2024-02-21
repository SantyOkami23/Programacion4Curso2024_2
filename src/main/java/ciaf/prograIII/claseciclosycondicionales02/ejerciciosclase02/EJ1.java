package ciaf.prograIII.claseciclosycondicionales02.ejerciciosclase02;
import java.util.Scanner;
public  class EJ1 {
    public static void main(String[] args) {
        /*=== DEVELOPMENT OF LEAP YEAR ===*/

        /*
        * @StimatedYear: Integer -- Variable to know what's the user Year Selected.
        * @Leap: Boolean --- Variable to know if the Year is or not an Leap Year.
        * */

        Scanner Input = new Scanner(System.in);
        System.out.println("Please insert The stimated year --> ");
        int StimatedYear = Input.nextInt();
        boolean Leap;

        if ( StimatedYear % 4 == 0 && StimatedYear % 100 == 0 && StimatedYear % 400 == 0) {
            System.out.println("This is an Leap Year");
            Leap = true;
        } else  {
            System.out.println("This isnt an Leap-Year");
            Leap = false;
        }
    }
}