public class Main {
    public static void main(String[] args) {
        int[][] matrix=new int[SumOfDiagonal.sizeMatrix("row")][SumOfDiagonal.sizeMatrix("column")];
        SumOfDiagonal.addValues(matrix);
        SumOfDiagonal.display(matrix, "matrix");
        SumOfDiagonal.display(matrix, "sum");
    }
}