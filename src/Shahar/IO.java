package Shahar;

import java.util.Scanner;

public class IO {
    public static Scanner scan = new Scanner(System.in);
    /**
     * This method prints an array of integers
     * @param arr an integer array that we want to print
     */
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4d", arr[i]);
        }
        System.out.println();
    }
    public static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            print(arr[i]);
        }
    }


    public static void printPretty(int[][] arr){
        System.out.printf("%4s", "");

        for (int i = 0; i < arr[0].length; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%3d|", i);
            //print the columns
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }


    public static void print(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4s", arr[i]);
        }
        System.out.println();
    }
    public static void print(String[][] arr){
        for (int i = 0; i < arr.length; i++) {
            print(arr[i]);
        }
    }

    public static void printBoard(String[] arr){
        System.out.printf("|");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4s|", arr[i]);
        }
        System.out.printf("\n________________\n");
    }
    public static void printBoard(String[][] arr){
        System.out.printf("\n________________\n");
        for (int i = 0; i < arr.length; i++) {
            printBoard(arr[i]);
        }
    }

    public static double getDouble(String prompt) {
        System.out.println(prompt);
        double n = scan.nextDouble(); //alt + Enter here...
        return n;
    }

    public static int getInt(String prompt){
        System.out.println(prompt);
        int n = scan.nextInt(); //alt + Enter here...
        return n;
    }

    public static String getString(String message){
        if (!message.endsWith(":") && !message.endsWith(": "))
            message+=": ";
        System.out.println(message);
        return scan.next();
    }

    public static String getSentence(String prompt){
        System.out.println(prompt);
        return scan.nextLine();
    }

    public static int[] getIntArray(String prompt){
        //ask the user for the size:
        int n = getInt("Enter the array size");
        //init an array of the requested size:
        int[] result = new int[n];
        //loop through the array and fill it:
        for (int i = 0; i < n; i++) {
            result[i] = getInt(prompt);
        }
        return result;
    }

   public static String[] getStringArray(String message, int size){
       String[] result = new String[size];
       for (int i = 0; i < result.length; i++) {
           System.out.println(message);
           result[i] = scan.next();
       }
       return result;
   }

    public static int[][] getIntArraydbl() {
        int size = IO.getInt("Enter the array size", 0);
        int[][] arr = new int[size][size];

        for (int row = 0; row< arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                String s = String.format("Enter value for %d, %d", row, col);
                arr[row][col] = IO.getInt(s);
            }
        }
        return arr;
    }

    public static int getInt(String prompt, int from, int to){
        int result;
        do {
            result = getInt(prompt);
        }while (result < from || result > to);
        return result;
    }

    public static int getInt(String prompt, int from){
        return getInt(prompt, from, Integer.MAX_VALUE);
    }


    public static void printLineSep(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print("_");
        }
        System.out.println();
    }
}