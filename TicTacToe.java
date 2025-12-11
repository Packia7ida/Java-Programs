package Programs;

import java.util.*;
public class TicTacToe {
    static String[] board;
    static String turn;



    static String checkWinner(){
        String line = null;
        for(int i=0;i<8;i++){
            switch (i){
                case 0: {
                    line = board[0] + board[1] + board[2];
                    break;
                }
                case 1: {
                    line = board[3] + board[4] + board[5];
                    break;
                }
                case 2: {
                    line = board[6] + board[7] + board[8];
                    break;
                }
                case 3: {
                    line = board[0] + board[3] + board[6];
                    break;
                }
                case 4: {
                    line = board[1] + board[4] + board[7];
                    break;
                }
                case 5: {
                    line = board[2] + board[5] + board[8];
                    break;
                }
                case 6: {
                    line = board[0] + board[4] + board[8];
                    break;
                }
                case 7: {
                    line = board[2] + board[4] + board[6];
                    break;
                }
            }
            if(line.equals("XXX")){
                return "X";
            }
            else if(line.equals("OOO")){
                return "O";
            }
        }
        boolean hasEmpty = false;
        for (String s : board) {
            if (!s.equals("X") && !s.equals("O")) {
                hasEmpty = true;
                break;
            }
        }
        if (!hasEmpty) {
            return "draw";
        }
        System.out.print(turn + "'s turn; enter a slot number to place " + turn + " in:");
        return null;

    }
    static void printBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|---|---|---|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|---|---|---|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        String winner = null;

        System.out.println("Welcome to X x O game:");
        for (int i = 0; i < 9; i++) {
            board[i] = String.valueOf(i + 1);
        }
        printBoard();
        System.out.print("X starts the game:");
        while(winner==null){
            try {
                int num = in.nextInt();
                if (!(num > 0 && num <= 9)) {
                    System.out.println("Invalid Number");
                    continue;
                }
                if (board[num - 1].equals(String.valueOf(num))) {
                    board[num - 1] = turn;
                    turn = turn.equals("X") ? "O" : "X";
                    printBoard();
                    winner = checkWinner();
                } else {
                    System.out.println("Slot Already taken: Enter another number");
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter the number");
                in.nextLine();
            }
        }
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println("The match is draw");
        } else {
            System.out.println("Congratulation! : Winner is " + winner);
        }
        in.close();
    }
}
