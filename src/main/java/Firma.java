
public class Firma {




    public static void main(String args[]) {



        Pracownik pracownik = new Pracownik("Wlodek", "Zięba", 3000);
        System.out.println("Imię: " + pracownik.imie);
        System.out.println("Nazwisko: " + pracownik.nazwisko);
        System.out.println("Wypłata: " + pracownik.wyplata + "\n");


        Lekarz lekarz = new Lekarz("Janusz", "Wariat", 9000);
        System.out.println("Imie " + lekarz.imie);
        System.out.println("Nazwisko: " + lekarz.nazwisko);
        System.out.println("Wypłata: " + lekarz.wyplata + "\n");


        Sprzataczka sprzataczka = new Sprzataczka("Grazyna", "Maryna", 2000);
        System.out.println("Imie " + sprzataczka.imie);
        System.out.println("Nazwisko: " + sprzataczka.nazwisko);
        System.out.println("Wypłata: " + sprzataczka.wyplata + "\n");




    }
}

