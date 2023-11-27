import java.util.*;
public class stringShortestPath {
    public static float feq(String str){ 
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){    
            if(str.charAt(i)=='w'){
                x--;
            }
            else if(str.charAt(i)=='n'){
                y++;
            } else if(str.charAt(i)=='e'){
                x++;
            } else {
                y--;
            }
        } 
        int x2=x*x,y2=y*y;
        return (float)Math.sqrt(x2+y2);

    }
    public static void main(String args[]){
        String str=new String("wneeenesennn");
       System.out.println( feq(str));
    }
    
}

    
