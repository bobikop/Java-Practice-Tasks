package JavaCorePractice.builder;

public class Test {
    public static void main(String[] args) {

      User u1 =   User.builder().name("Tom").age(25).build();
        User u2 = User.builder().name("Sarah").build();


        System.out.println(u1.getAge() + " " + u1.getName());
        System.out.println(u2.getName());
    }
}
