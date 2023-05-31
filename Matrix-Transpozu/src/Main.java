import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [][] matris  = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(Arrays.toString(matris[0]));
        System.out.println("Matris  : ");

        for (int[] row : matris){
            for(int col : row){
                System.out.print( " " + col + " ");
            }
            System.out.println();
        }

        System.out.println("Transpozu : ");
        int col = matris[0].length;


        for (int i =0 ; i <col ; i++){
            for(int j =0 ; j<matris.length ; j++){
                System.out.print(" " + matris[j][i] + " ");
            }
            System.out.println();
        }

    }
}