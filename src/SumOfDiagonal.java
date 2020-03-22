import java.util.Scanner;

public class SumOfDiagonal {
    static Scanner sc = new Scanner(System.in);
    static int row;
    static int column;

    public static int sizeMatrix(String type) {

        int result = 0;
        try {
            if (type.equals("row")) {
                do {
                    System.out.print("Row: ");
                    row = sc.nextInt();
                } while (row <= 0);
                result = row;
            } else if (type.equals("column")) {
                do {
                    System.out.print("Column: ");
                    column = sc.nextInt();
                } while (column != row);
                result = column;
            }
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return result;
    }

    public static void addValues(int[][] matrix) {
        try {
            for (int row = 0; row < matrix.length; row++) {
                for (int column = 0; column < matrix[row].length; column++) {
                    System.out.print("Enter element [" + row + "][" + column + "]: ");
                    matrix[row][column] = sc.nextInt();
                }
            }
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
    }

    public static void display(int[][] matrix, String type) {
        int sum;
        try {
            if (type.equals("matrix")) {
                for (int row = 0; row < matrix.length; row++) {
                    for (int column = 0; column < matrix[row].length; column++) {
                        System.out.print(matrix[row][column] + "\t");
                    }
                    System.out.println();
                }
            } else if (type.equals("sum")) {
                sum = sumOfDiagonal(matrix);
                System.out.print("Sum of diagonal line: " + sum);
            }
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
    }

    public static int sumOfDiagonal(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (row == column) {
                    sum = sum + matrix[row][column];
                }
            }
        }
        return sum;
    }
}