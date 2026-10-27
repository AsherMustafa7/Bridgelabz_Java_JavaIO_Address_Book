package addressbook;

public class Main {
    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();

        Contact contact1 = new Contact(
            1, "Asher", "9876543210",
            "asher@example.com", "Chennai"
        );

        addressBook.addContact(contact1);
        addressBook.displayContacts();
    }
}