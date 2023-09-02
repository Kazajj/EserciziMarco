
public class Esercizi {
    public static void main(String[] args) {
        int[] arrayToBalance = {12, -3, 22, 7};
        boolean result = testBilanciamento(arrayToBalance);
        if (result) {
            System.out.println("The array is BALANCED.");
        }
        else {
            System.out.println("The array is NOT balanced.");
        }
    }

    private static boolean testBilanciamento(int[] r) {
        if (hasNotRightSize(r.length)) return false;
        int balanceSum = r[0] + r[r.length - 1];
        int mirrorIndex = 0; //FORSE 1 ?
        return exploreArrayRecursion(r, r[mirrorIndex], r[r.length - 1 - mirrorIndex], mirrorIndex, balanceSum);
    }

    private static boolean hasNotRightSize(int size) {
        return size % 2 != 0 || size == 0;
    }

    private static boolean exploreArrayRecursion(int[] array, int leftSum, int rightSum, int mirrorIndex, int balanceSum) {
         // CONTROLLA INDICE DESTRO-SINISTRO
        if (array.length / 2 - 1 == mirrorIndex) return leftSum == rightSum;
        mirrorIndex++;
        return exploreArrayRecursion(array, leftSum + array[mirrorIndex], rightSum + array[array.length - 1 - mirrorIndex], mirrorIndex);
    }

//    // QUI AVEVO COMPRESO MALE L'ESERCIZIO MA MI DISPIACE LEVARLO :(
//
//    public static void main(String[] args) {
//        int[] arrayToBalance = {12, -3, 22, 7};
//        boolean result = testBilanciamento(arrayToBalance);
//        if (result) {
//            System.out.println("The array is BALANCED.");
//        }
//        else {
//            System.out.println("The array is NOT balanced.");
//        }
//    }
//
//    private static boolean testBilanciamento(int[] r) {
//        if (hasNotRightSize(r.length)) return false;
//        int mirrorIndex = 0;
//        return exploreArrayRecursion(r, r[mirrorIndex], r[r.length - 1 - mirrorIndex], mirrorIndex);
//    }
//
//    private static boolean hasNotRightSize(int size) {
//        return size % 2 != 0 || size == 0;
//    }
//
//    private static boolean exploreArrayRecursion(int[] array, int leftSum, int rightSum, int mirrorIndex) {
//        if (array.length / 2 - 1 == mirrorIndex) return leftSum == rightSum;
//        mirrorIndex++;
//        return exploreArrayRecursion(array, leftSum + array[mirrorIndex], rightSum + array[array.length - 1 - mirrorIndex], mirrorIndex);
//    }
}
