package HomeWork_5;

public class MyThread extends Thread {

    public float[] arr;


    public MyThread(float[] arr){
        this.arr = arr;
    }

    @Override
    public void run() {

        long a = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println("Calculation time in thread (millisecond): " + (System.currentTimeMillis() - a));

    }


}
