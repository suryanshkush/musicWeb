import java.util.*;
public class dogwatch{
/*public static void main (String args[]) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        marks[0] =sc.nextInt();
        marks[1] =sc.nextInt();


        System.out.println(marks[0]);
        System.out.println(marks[1]);
        
    }
}*/

public static void update (int mark[]){
 for (int i=0;i<mark.length;i++) {
     mark[i]=mark[i]+1;
 }
}
public static void main (String args[]){
    int mark[]={98,98,65};
    update(mark);

    for (int i=0;i<mark.length;i++){
        System.out.println(mark[i]);
    }


}

}