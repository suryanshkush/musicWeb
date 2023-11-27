import java.util.Scanner;

public class TwoArray {
    public static void main(string args[]){
        int arr[][]=new int[3][3];
        Scanner sc=new Scanner(system.in);
         
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                arr[i][j]=sc.nextLine();
            }
            
        }
         for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }

    }

}
