
public class ArrayDemo {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array length: " + numbers.length);

        for (int num : numbers) {
            System.out.println(num);
        }

        int[][] jagged = new int[3][];

        jagged[0] = new int[]{1, 2, 3};

        jagged[1] = new int[]{4, 5};

        jagged[2] = new int[]{6, 7, 8, 9};

        for (int i = 0; i < jagged.length; i++) {

            for (int j = 0; j < jagged[i].length; j++) {

                System.out.print(jagged[i][j] + " ");

            }

            System.out.println();

        }

    }
}
