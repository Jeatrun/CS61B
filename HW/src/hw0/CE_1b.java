package hw0;

public class CE_1b {
    public void exec(int size) {
        int col = 0;
        int row = 0;
        while (row < size) {
            col = 0;
            while (col <= row) {
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
