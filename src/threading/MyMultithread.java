package threading;

public class MyMultithread extends Thread {



    private int threatNumber;
    public MyMultithread (int threadNumber){
        this.threatNumber =threadNumber;
    }


    @Override
    public void run() {
        for (int i = 0; i <=5 ; i++) {
            System.out.println(i + "from thread " + threatNumber);
            if (threatNumber == 3){
                throw new RuntimeException();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
