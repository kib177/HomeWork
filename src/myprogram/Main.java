package myprogram;

import myprogram.WorkForNumber.WorkForNumber;

public class Main {

    public static void main(String[] args) {
        WorkForNumber workForNumber = new WorkForNumber();
        System.out.println("\n Время выполнения (мс): "+(double) workForNumber.measure()/1000000);
        System.out.println("\n Использованно памяти (Мб):" + (double) (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/1000000);
    }
}
