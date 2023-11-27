import java.util.*;

public class arrayslec9{
    public static void bubblesort(int array[]) {
        for(int turn=0;turn<array.length-1;turn++){//outer loop
            int swap=0;
            for(int j=0;j<array.length-1-turn;j++){//inner loop
                if (array[j+1]<array[j]) {
                    int temp=array[j];             //swap
                    array[j]=array[j+1];
                    array[j+1]=temp; }
                    swap++;
                    System.out.print(swap);
            }
        }
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+",");
       }
    } 

 public static void main(String args[]) {
    int array[]={2,6,9,8,3};
    bubblesort(array);  
}
}


