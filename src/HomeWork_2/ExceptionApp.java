package HomeWork_2;

import java.io.IOException;

/**
 Java. Level 2. Home work 2.

 @author Sergey Bondarenko
 @version dated July 20, 2019
 */

public class ExceptionApp {

    final static int SIZE = 4;

    public static void main(String[] args){

        String str1 = "1 3 1 2\\n2 3 2 2\\n5 6 7 1\\n3 3 1 0";
        String str2 = "1 3 1 2\\n2 s 2 2\\n5 6 7 1\\n3 3 1 0";
        String str3 = "1 3 1 2\\n2 3 2 2\\n5 6 1\\n3 3 1 0";

        String[] strings = {str1,str2,str3};

        for (String str: strings) {
            try {
                System.out.println("\nInitial matrix: " + str);

                String[][] arr = getArr(str);
                int amount = getHalfAmount(arr);

                System.out.println("Half amount: " + amount);

            } catch (MyEmptyStringException exc){
                System.out.println(exc);
            } catch (MyArrayDataException exc){
                System.out.println(exc);
            } catch (MySizeArrayException exc){
                System.out.println(exc);
            }
        }

    }

    public static String[][] getArr(String expression) throws MyEmptyStringException, MySizeArrayException{

        if (expression == ""){
            throw new MyEmptyStringException();
        }

        String[][] arr = new String[SIZE][SIZE];

        int i = 0, j = 0;

        for (String strI : expression.split("\\\\n")){

            j = 0;

            if (i == SIZE){
                throw new MySizeArrayException();
            }
            for (String strJ : strI.split(" ")){
                if (j == SIZE){
                    throw new MySizeArrayException();
                }

                arr[i][j] = strJ;
                j++;
            }
            i++;

        }

        // Replace null with an empty string
        for (i = 0; i<SIZE; i++){
            for (j = 0; j<SIZE; j++){
                if (arr[i][j] == null){
                    throw new MySizeArrayException();
                }
            }
        }

        return arr;
    }

    public static int getHalfAmount(String[][] str) throws MyArrayDataException {

        int amount = 0;

        int i = 0, j = 0;

        for (i = 0; i < SIZE; i++){
            for (j = 0; j < SIZE; j++){
                try {
                    amount += Integer.parseInt(str[i][j]);
                } catch (NumberFormatException exc){
                    throw new MyArrayDataException("["+ i +"][" + j + "]", str[i][j]);
                }
            }
        }

        return amount/2;
    }

}
