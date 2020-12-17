import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class NumbersOperationsBefore {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Ile liczb wczytać?");
        int x = s.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.println("Podaj kolejną liczbę:");
            list.add(s.nextInt());
        }
        List<Integer> pos = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= 0)
                pos.add(list.get(i));
        }
        List<Integer> neg = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0)
                neg.add(list.get(i));
        }
        int spos = 0;
        for (int i = 0; i < pos.size(); i++) {
            spos += pos.get(i);
        }
        int sneg = 0;
        for (int i = 0; i < neg.size(); i++) {
            sneg += neg.get(i);
        }
        System.out.println("Suma wprowadzonych liczb dodatnich: " + spos);
        System.out.println("Suma wprowadzonych liczb ujemnych: " + neg);
    }
}