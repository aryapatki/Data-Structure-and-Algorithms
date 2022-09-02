import java.util.HashMap;
import java.util.HashSet;

public class IsValidSudoku {
    public static void main(String[] args) {
        char [][] board = {{'5','3','.','.','7','.','.','.','.'}
        ,{'6','.','.','1','9','5','.','.','.'}
        ,{'.','9','8','.','.','.','.','6','.'}
        ,{'8','.','.','.','6','.','.','.','3'}
        ,{'4','.','.','8','.','3','.','.','1'}
        ,{'7','.','.','.','2','.','.','.','6'}
        ,{'.','6','.','.','.','.','2','8','.'}
        ,{'.','.','.','4','1','1','.','.','5'}
        ,{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(board));
        
    }

    public static boolean isValidSudoku(char[][] board) {
      HashSet<Integer> set1=new HashSet<>();
        System.out.println("bla");
      //checking horizontal lines
      System.out.println("horizontal lines");  
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j]!='.'){
                    
                    if(!set1.add(Integer.valueOf(String.valueOf(board[i][j])))) return false;
                }
            }
            System.out.println("i - "+ set1);
            set1.clear();
        }
// vertical lines
System.out.println("vertical lines");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[j][i]!='.'){
                    
                    if(!set1.add(Integer.valueOf(String.valueOf(board[j][i])))) return false;
                }
            }
            System.out.println("i - "+ set1);
            set1.clear();
        }
//boxes
System.out.println("boxes");
        HashSet<Integer> set2= new HashSet<>();
        HashSet<Integer> set3= new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j]=='.'){}
                else if(j<3){
                    if(!set1.add(Integer.valueOf(String.valueOf(board[i][j])))) return false;
                }
                else if(j<6){
                    if(!set2.add(Integer.valueOf(String.valueOf(board[i][j])))) return false;
                }
                else if(j<9){
                    if(!set3.add(Integer.valueOf(String.valueOf(board[i][j])))) return false;
                }
            }
            if((i+1)%3==0) {
                System.out.println(set1);
                System.out.println(set2);
                System.out.println(set3);
                set1.clear();
                set2.clear();
                set3.clear();
            }
        }
        return true;
    }
}
