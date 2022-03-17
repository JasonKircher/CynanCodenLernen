import java.util.Arrays;

public class MainArray {
    public static void main(String[] args) {

        Integer[][] quadrad = {{1, 9, 5, 16}, {8, 3, 4, 15}, {7, 2, 6, 14}, {13, 12, 11, 10}};
        int magicNum = 0;

        for (int i = 1; i < quadrad.length * quadrad.length +1; i++) {
            magicNum += i;
        }
        magicNum = magicNum / quadrad.length;
        System.out.println(magicNum);
        boolean isMagicalSpalte = false;
        boolean isMagical = false;
        for (int i = 0; i < quadrad.length; i++) {
            int temp = 0;
            int tempSpalte = 0;
            for(int j = 0; j < quadrad[i].length; j++) {
                temp += quadrad[i][j];
                tempSpalte += quadrad[j][i];
            }
            isMagicalSpalte = tempSpalte == magicNum;
            isMagical = temp == magicNum;
            if(!isMagical||!isMagicalSpalte) {
                break;
            }
            System.out.println(Arrays.deepToString(quadrad[i]));
        }
        int tempDiagonalL = 0;
        int tempDiagonalR = 0;
        for (int i = 0; i < quadrad.length; i++) {
            tempDiagonalR += quadrad[i][quadrad.length -1 - i];
            tempDiagonalL += quadrad[i][i];
        }
        boolean isMagicalDiagonalL = tempDiagonalL == magicNum;
        boolean isMagicalDiagonalR = tempDiagonalR == magicNum;
        if(!isMagicalDiagonalL||!isMagicalDiagonalR||!isMagical||!isMagicalSpalte) {
            System.out.println("Nicht magisch");
        }
        else {
            System.out.println("MAGIC");
        }
    }
}
