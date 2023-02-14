package PracticeWithFatih.session3.phonebook;

import java.util.List;

public interface PhoneBook_LinkedList {

    boolean isEmpty();

    int size();

    void printPhoneBook();

    void add(Contact contact);

    PhoneBookNode findByFirstName(String firstName) throws Exception;

    List<PhoneBookNode> findAllByLastName(String lastName) throws Exception;

    void deleteByFirstName(String firstName) throws Exception;

    void deleteAllMatchingLastName(String lastName);

    List<PhoneBookNode> findAll();
}

