import java.util.Arrays;

class Theater {

    public int[][] theater;

    public Theater(int numRows, int numCols) {
        theater = new int[numRows][numCols];
    }

    public boolean bookSeat(int desRow, int desCol) {
        if (theater[desRow][desCol] == 0) {
            theater[desRow][desCol] = 1;
            System.out.println("You can book this seat.");
            return true;
        }
        System.out.println("You cannot book this seat.");
        return false;
    }

    public int availableSeats() {
        int totalSeats = 0;
        for (int i = 0; i < theater.length; i++) {
            for (int j = 0; j < theater[0].length; j++) {
                if (theater[i][j] == 0) {
                    totalSeats += 1;
                }
            }
        }
        return totalSeats;
    }
}
