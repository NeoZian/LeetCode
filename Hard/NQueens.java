package Hard;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        queenPlacement(board,0);
    }

    static int queenPlacement(boolean[][] board, int row){
        if(row == board.length){
            //printing that matrix
            display(board);
            System.out.println();
            return 1;
        }
        int count =0;

        for (int col = 0; col < board.length; col++) {
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count = count+queenPlacement(board,row+1);
                board[row][col] =false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col){
        //vertically-- row by row each cell checking if there is any truth already
        for(int i=0; i<row;i++){   //remember its already inside a loop from where it was called
            if(board[i][col]){
                return false;
            }
        }

        //diagonally left
        int maxLeft = Math.min(row,col);
        for (int i = 0; i <maxLeft ; i++) {
            if (board[row-1][col-1]){
                return false;

            }
        }

        //diagonally right
        int maxRight = Math.min(row,board.length-col-1);
        for (int i = 0; i <maxRight ; i++) {
            if (board[row-1][col+1]){
                return false;

            }
        }


        return true;
    }

    static void display(boolean[][] board){
//        for(boolean[] row: board){
//            for (boolean element: row){
//                if(element == true){
//                    System.out.print("Q");
//                }
//                else {
//                    System.out.print(".");
//                }
//            }
//            System.out.println();
//        }


        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j]){
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }

    }


}
