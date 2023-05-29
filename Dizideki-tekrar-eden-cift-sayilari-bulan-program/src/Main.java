import java.util.Arrays;

public class Main {

    static boolean isFind(int [] arr , int value){

        for( int i : arr){
            if( i == value){
                return true;
            }
        }
        return  false;
    }

    public static void main(String[] args) {


        int [] list = { 2 , 9 , 8 , 3 , 4 , 1, 9, 1, 4 ,6 , 6};
        int [] newList = new int[list.length];
        int startIndex =0;

        for (int i = 0 ; i < list.length ; i++){
            for ( int k = 0 ; k < list.length ; k++){
                if( (i != k) && (list[i] == list [k])){

                    // Tekrar eden sayıların 2 ye bölümününden kalan çiftse listenin içerisine yazdırıcak.
                    if (list[i] % 2 == 0){
                        if(!isFind(newList , list[i])){
                            newList[startIndex++] = list[i];
                        }
                    }

                    break;
                }
            }
        }

        for (int value : newList){
            if ( value != 0){
                System.out.println(value);
            }
        }
    }
}