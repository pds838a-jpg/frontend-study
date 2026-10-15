public class NestedLoop {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 4;

        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= columns; column++) {
                System.out.print("[" + row + "행 " + column + "열]");
            }
            System.out.println();
        }
    }
}
