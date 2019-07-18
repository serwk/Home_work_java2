package HomeWork_1.Manual;

public class Man implements Move {
    private double jump;
    private int run;

    Man(double j, int r){
        if(j < 0 || r < 0) return;
        jump = j;
        run = r;
    }

    @Override
    public boolean run(int length) {
        return run >= length;
    }

    @Override
    public boolean jump(double height) {
        return jump>=height;
    }

    @Override
    public String toString() {
        return "man: " + "j - " + jump + "; r - " + run;
    }
}
