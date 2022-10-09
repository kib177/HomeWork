package myprogram.WorkForNumber;

import java.util.ArrayList;
import java.util.List;

public class WorkForNumber {

    private List<Integer> MultipleAtThree;
    private List<Integer> MultipleAtFive;
    private List<Integer> MultipleAtThreeAndFive;
    private final int limit = 1000;

    public void Number() {
        MultipleAtThree = new ArrayList<>();
        MultipleAtFive = new ArrayList<>();
        MultipleAtThreeAndFive = new ArrayList<>();

        for (int i = 1; i <= limit; i++) {
            if (i % 15 == 0) {
                System.out.println("Число кратно 3 и 5; ");
                MultipleAtThreeAndFive.add(i);
                MultipleAtThree.add(i);
                MultipleAtFive.add(i);
            } else if (i % 3 == 0) {
                System.out.print("Число кратно 3; ");
                MultipleAtThree.add(i);
            } else if (i % 5 == 0) {
                System.out.print("Число кратно 5; ");
                MultipleAtFive.add(i);
            } else {System.out.print(i + "; ");}
        }
        System.out.println("\n" + "Числа кратные 3: " + MultipleAtThree);
        System.out.println("Числа кратные 5: " + MultipleAtFive);
        System.out.println("Числа кратные 3 и 5: " + MultipleAtThreeAndFive);
    }

    public long measure() {
        long start = System.nanoTime();
        Number();
        long end = System.nanoTime();
        return end - start;
    }
}
