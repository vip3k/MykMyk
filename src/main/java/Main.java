import java.util.Scanner;

public class Main {


    public static void main(String args[]) {


        Boolean shouldCouninue = true;

        Scanner scanner = new Scanner(System.in);

        Party party = new Party();


        while (shouldCouninue) {
            System.out.println("Wybierz opcje");
            System.out.println("1. Wyswietl gosci");
            System.out.println("2. Dodaj goscia");
            System.out.println("3. Wyswietl potrawy");
            System.out.println("4. Znajdz po nr telefonu");
            System.out.println("5. Exit");

            int userChoise = scanner.nextInt();

            switch (userChoise) {
                case 1:
                    party.displayGuest();
                    break;
                case 2:
                    party.addGuest();
                    break;
                case 3:
                    party.displayMeals();
                    break;
                case 4:
                    party.displayGuestByPhoneNumber();
                    break;
                case 5:
                    shouldCouninue = false;
                    break;
            }


        }


    }
}

