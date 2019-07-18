package HomeWork_1.Manual;

public class Treadmill {
    private int length;

    Treadmill(int l){
        if (l<=0) return;
        length = l;
    }

    int getLength(){
        return length;
    }

    @Override
    public String toString() {
        return "treadmill: " + length;
    }
}
