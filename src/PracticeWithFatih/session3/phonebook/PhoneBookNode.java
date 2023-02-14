package PracticeWithFatih.session3.phonebook;

public class PhoneBookNode {

    public PhoneBookNode next;

    public Contact contact;

    public PhoneBookNode(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "PhoneBookNode{" +
                "contact=" + contact +
                '}';
    }
}