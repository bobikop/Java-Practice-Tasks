package GetterAndSetter;

public class Test {

    public static void main(String[] args) {


        Person driver = new Person();

        driver.setName("Viktor");


        System.out.println(driver.getName());


        Home myhome = new Home();
        myhome.setAddress("Dumfries");

        System.out.println(myhome.getAddress());

        Office myoffice = new Office();
        myoffice.setAddress("Springfield");

        System.out.println(myoffice.getAddress());
    }
}
