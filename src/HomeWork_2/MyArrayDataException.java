package HomeWork_2;

public class MyArrayDataException extends Exception {
    private String cell;
    private String value;

    MyArrayDataException(String c, String v){
        cell = c;
        value = v;
    }

    @Override
    public String toString() {
        return "Array's cell " + cell + " does not contain a number: " + value;
    }
}
