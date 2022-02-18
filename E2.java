public class E2 {
    public static void main(String[] args) {
        int[] array1 = {0, 2, 5, 10, -3, 2};
        int[] array2 = {3, 2, 4, 6, 2, 7};
        int[] output = obtenerRestos(array1, array2);

        imprimirArray(array1);
        imprimirArray(array2);
        imprimirArray(output);

        int[] array3 = {0, 2, 5};
        int[] array4 = {3, 2, 4, 6};
        int[] output2 = obtenerRestos(array3, array4);

        imprimirArray(array3);
        imprimirArray(array4);
        imprimirArray(output2);
    }
    public static int[] obtenerRestos(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            int[] output = {};
            return output;
        }
        int[] output = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            output[i] = arr1[i] % arr2[i];
        }
        return output;
    }

    public static void imprimirArray(int[] arr) {
        for (int entero : arr) {
            System.out.print(entero + "\t");
        }
        System.out.println();
    }
}
