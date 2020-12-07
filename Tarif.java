import java.util.Arrays;
import java.util.Scanner;

public class Tarif {
    public static void main(String[] args) {
        int i = 1;

        while(i<10)
        {
            System.out.println("Hello World");
            Scanner scan = new Scanner(System.in);
            System.out.println("Whats your name: ");
            String name = scan.nextLine();
            System.out.println("Whats your lastname: ");
            String lastname = scan.nextLine();

            System.out.println("Hello "+ name + " "+ lastname);
            System.out.println("how many hours of work?");
            int nbrHours = Integer.parseInt(scan.nextLine());
            // si le nbr hour entre 60h et 40h par semain
            float tarif = 0;
            if(nbrHours < 40)
            {
                System.out.println("We want to ask you for your hourly rate: ");
                float rate = Float.parseFloat(scan.nextLine());
                tarif = rate * nbrHours;

                System.out.println("your compensation is "+ tarif +" MAD");
            }
            else if(nbrHours<= 60 && nbrHours >= 40)
            {
                System.out.println("We want to ask you for your hourly rate: ");
                float rate = Float.parseFloat(scan.nextLine());
                tarif = rate * nbrHours;
                double tarifExtra = (((nbrHours-40)*(rate))*0.5) + tarif ;
                System.out.println("your compensation is "+ tarifExtra +" MAD");
            }
            else //Over 60h
                System.out.println("wrong information!");
            System.out.println("wanna play again" );
            i = Integer.parseInt(scan.nextLine());
        }

    }
}
