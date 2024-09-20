import java.util.ArrayList;


public class AddressBook {
    // List to hold BuddyInfo objects
    private ArrayList<BuddyInfo> buddies;

    // Constructor to initialize the list
    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    // Method to add a BuddyInfo object to the list
    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
        System.out.println("Buddy added: " + buddy.getName());
    }

    // Method to remove a BuddyInfo object from the list
    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
        System.out.println("Buddy removed: " + buddy.getName());

    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        System.out.println("Address book");

    }
}
