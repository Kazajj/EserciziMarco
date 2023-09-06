import java.util.Arrays;

public class Esercizi {

    public static void main(String[] args) {
//        int[] example1 = {-4, -4};
//        int[] example8 = {1, 7};
//        int[] example2 = {12, -3, 22, 7};
//        int[] example3 = {-3, 4, 100, -13, 9, -104, -8, -1};
//        int[] example4 = {24};
//        int[] example5 = {24, 1, 24};
//        int[] example6 = {0, 2, 2, 0};
//        int[] example7 = {};
//
//        runTestBilanciamento(example1);
//        runTestBilanciamento(example2);
//        runTestBilanciamento(example3);
//        runTestBilanciamento(example4);
//        runTestBilanciamento(example5);
//        runTestBilanciamento(example6);
//        runTestBilanciamento(example7);
//        runTestBilanciamento(example8);

        int[][] M = {{1},{1}};
        int[][] risultato = {{1},{1}};

        int[] M2 = {1};
        int[] risultato2 = {1};

        int z = 0;
    }

//    private static boolean testBilanciamento(int[] r) {
//        if (hasNotRightSize(r.length) || (r.length == 2 && r[0] != r[1])) return false; //If the size is NOT an even number OR the array is empty
//        int balanceSum = r[0] + r[r.length - 1]; //First sum is used as a reference for the balancing
//        int index = 0;
//        return exploreArrayRecursion(r, index, balanceSum); //Begin of recursion
//    }

//    private static boolean hasNotRightSize(int size) {
//        return size % 2 != 0 || size == 0;
//    }
//
//    private static boolean exploreArrayRecursion(int[] r, int index, int balanceSum) {
//        int currentSum = r[index] + r[r.length - 1 - index];
//
//        if (currentSum != balanceSum) return false; //Current sum is not equal to the original balancing sum
//        if (r.length / 2 - 1 == index) return true; //End of recursion
//
//        index++;
//        return exploreArrayRecursion(r, index, balanceSum); //Recursion
//    }

//    private static void runTestBilanciamento(int[] r) {
//        boolean result = testBilanciamento(r);
//        if (result) {
//            System.out.println("The array " + Arrays.toString(r) + " is: BALANCED.");
//        }
//        else {
//            System.out.println("The array " + Arrays.toString(r) + " is: NOT balanced.");
//        }
//    }

}
