/**
 * Created by tomas on 11/3/2020.
 */
public class Guest {

    private String name;
    private String meal;
    private int phoneNumber;
    private boolean isVegan;


    public Guest(String name, String meal, int phoneNumber, boolean isVegan) {
        this.name = name;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
    }

    public String getName() {
        return name;
    }

    public String getMeal() {
        return meal;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void displayGuestInformation() {
        System.out.println("Imie " + name);
        System.out.println("Preferowany posilek " + meal);
        System.out.println("Number telefonu " + phoneNumber);
        String isVeganString = isVegan ? "tak" : "nie";
        System.out.println("Weganin ?" + isVeganString);
    }
}
