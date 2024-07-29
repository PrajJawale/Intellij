package CoreJava;

public class makeMyTread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        makeMyTread newTread = new makeMyTread();

        Thread th = new Thread(newTread);

        th.start(); // making new threads

    }
}
