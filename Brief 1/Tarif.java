import java.util.Scanner;

public class Tarif {
    public static void main(String[] args) {
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
        if(nbrHours<= 60 && nbrHours >= 40)
        {
            System.out.println("We want to ask you for your hourly rate: ");
            float rate = Float.parseFloat(scan.nextLine());
            float tarif = rate * nbrHours;
            double tarifExtra = tarif + (0.5*tarif);
            System.out.println("your compensation is "+ tarifExtra +" MAD");
        }
        else if (nbrHours>70)
            System.out.println("wrong information!");
    }
}
