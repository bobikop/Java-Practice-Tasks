package PracticeWithFatih.session3.phonrbook2;

public class PhoneBook {
    Node head;
    Node tail;
    int size;

    public PhoneBook(Node head, Node tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }
    public PhoneBook() {

    }


 // 1 - write the method for the PhoneBook entries
    void insert(String name, String lastName, String email, String phoneNUmber){

        Node node = new Node(name, lastName, email, phoneNUmber);
        if(head == null){
            head = tail= node;
        }else{
            tail.next = node;
            tail = node;
        }
        size++;
    }

    // 2 - Write a method that returns the size of the PhoneBook entries.
    //• int size(){ return size;}

    int size(){
        return size;
    }


//     3 - Write a method that returns indexOf the phonebook element. Such as:
//            • int indexOf(String email) {return index;}
//            • return -1 if no such element exists.*/
    int indexOf(String email){

        Node current  = head;
        int index =0;

        while(current != null){

            if (current.email.equals(email)){
                return index;
            }

            index++;
            current = current.next;
        }
        return  -1;
    }

//    Write a findByName() method for the PhoneBook entries

    int findByName(String name){
        Node current = head;
        int index = 0;

        while (current!= null){
            if(current.name.equals(name)){
                return index;
            }
            index++;
            current = current.next;

        }
        return -1;

    }

    boolean isEmpty(){
        return head == null;
    }

//    Write a deleteByEmail () method for the PhoneBook entries.

    void deleteByEmail(String email){

        if(isEmpty()){
            System.out.println("This list is empty");
        }

        Node current = head;
        Node prev = head;

        while (current != null) {
            // if found checked the follow add cases

            if (current.email.equals(email)) {
                // 1st node is the head
                if (current == head) {
                    head = current.next;
                    current.next = null;
                    //2nd node is the tail
                } else if (current == tail) {
                    tail = prev;
                    prev.next = null;
                    // else is the middle node
                } else {
                    prev.next = current.next;
                    current.next = null;
                }
                size--;
            }
            prev = current;
            current = current.next;
        }
    }


//    Write a method that sorts entries by their name. Such as:
//    sortByName() {}


        void swapData(Node node1, Node node2) {
            Node temp = new Node(node2.name, node2.lastName, node2.email, node2.phoneNumber);

            node2.name = node1.name;
            node2.lastName = node1.lastName;
            node2.email = node1.email;
            node2.phoneNumber = node1.phoneNumber;

            node1.name = temp.name;
            node1.lastName = temp.lastName;
            node1.email = temp.email;
            node1.phoneNumber = temp.phoneNumber;
        }


    void sortByName() {
        if (head.next == null) return;

        Node current = head, current2 = head.next;
        boolean swap = true;

        while (swap) {
            swap = false;
            current = head;
            current2 = current.next;
            while (current != null && current2 != null) {
                if (current.name.compareToIgnoreCase(current2.name) > 0) {
                    swapData(current, current2);
                    swap = true;
                }
                current = current.next;
                current2 = current2.next;
            }
        }
    }


//    Write a method that returns deletes duplicated entries

    public void deleteDuplicates() {
        Node current = head;
        while (current != null) {
            Node theNext = current.next;
            while (theNext != null && theNext.email.equals(current.email)) {
                theNext = theNext.next;
            }
            current.next = theNext;
            current = theNext;
        }
    }




    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.insert("a", "a", "a@g", "1");
        phoneBook.insert("b", "b", "b@g", "2");
        phoneBook.insert("c", "c", "c@g", "3");
        phoneBook.insert("d", "d", "d@g", "4");


        System.out.println(phoneBook.indexOf("c@g"));
        System.out.println(phoneBook.findByName("d"));
    }

}
