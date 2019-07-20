package HomeWork_2;

public class MyEmptyStringException extends Exception {

    @Override
    public String toString() {
        return "An empty string was passed to the method";
    }
}
