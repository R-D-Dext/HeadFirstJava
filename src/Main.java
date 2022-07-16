import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer("Вася");
        Thread thread1 = new Thread(printer1);
        thread1.start();

        Printer printer2 = new Printer("Петя");
        Thread thread2 = new Thread(printer2);
        thread2.start();

        Printer printer3 = new Printer("Вика");
        Thread thread3 = new Thread(printer3);
        thread3.start();

        Thread thread4 = new Thread(printer3);
        thread4.start();

        Thread thread5 = new Thread(printer3);
        thread5.start();
    }
}

class Printer implements Runnable {
    private String name;
    public Printer(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("I'm " + this.name);
    }
}