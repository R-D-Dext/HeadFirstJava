import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String[] a1 = {"far", "arf", "fra"};
        String[] a2 = {"qaz", "qza", "aqz"};
        String[] a3 = {"wer", "rew", "ewr"};

        int oneLenght = a1.length;
        int twoLenght = a2.length;
        int threeLenght = a3.length;

        int ran1 = (int) (Math.random() * oneLenght);
        int ran2 = (int) (Math.random() * twoLenght);
        int ran3 = (int) (Math.random() * threeLenght);

        System.out.println(a1[ran1] + " " + a2[ran2] + " " + a3[ran3]);
    }
}
