package HomeWork_5;

/**
 Java. Level 2. Home work 5

 @author Sergey Bondarenko
 @version dated August 01, 2019
 */

public class MultithreadingApp {

    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args){

        // calculation in single thread
        CalculationSingleThread();

        // calculation in dual thread
        CalculationDualThread();
    }

    public static void CalculationSingleThread(){

        float[] arr = new float[size];

        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println("Calculation time in single thread (millisecond): " + (System.currentTimeMillis() - a));

    }

    public static void CalculationDualThread(){

        float[] arr = new float[size];

        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }

        float[] arr1 = new float[h];
        float[] arr2 = new float[h];

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);

        System.out.println("Split time into two arrays (millisecond): " + (System.currentTimeMillis() - a));

        MyThread myThread1 = new MyThread(arr1);
        MyThread myThread2 = new MyThread(arr2);

        try {
            myThread1.join();
            myThread2.join();
        } catch (InterruptedException e){
            System.out.println("Main thread aborted");
            return;
        }

        a = System.currentTimeMillis();
        System.arraycopy(myThread1.arr, 0, arr, 0, h);
        System.arraycopy(myThread2.arr, 0, arr, h, h);
        System.out.println("Bonding time of two arrays (millisecond): " + (System.currentTimeMillis() - a));
    }
}
