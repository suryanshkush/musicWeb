import java.util.*;
public class function {
    public static int cal(int a,int b){
        int sum =a+b;
        return sum;
    }
    public static void main (String args[]){
        Scanner inp =new Scanner(System.in);
        int x=inp.nextInt();
        int y=inp.nextInt();
        int del=cal(x,y);
        System.out.println(del);
    }
}
