package HomeWork_1.Manual;

public class Wall {
    private double height;

    Wall(double h){
        if (h<=0) return;
        height = h;
    }

    double getHeight(){
        return height;
    }

    @Override
    public String toString() {
        return "wall: " + height;
    }
}
