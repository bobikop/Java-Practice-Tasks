package threading;

public class Multithreading {

    public static void main(String[] args) {


        for (int i = 0; i < 5 ; i++) {
            MyMultithread myThing = new MyMultithread(i);

            myThing.start(); // use start method instead run
        }




//        myThing.run();
//        myThing2.run();
    }
}
