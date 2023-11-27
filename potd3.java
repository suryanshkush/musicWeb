public class potd3 {
    public static StringBuilder remove(StringBuilder str1,StringBuilder str2,StringBuilder str3){
      //  StringBuilder str3 = new StringBuilder("");
    int a;

    for (char i=0; i<str1.length();i++){
          char ch = str1.charAt(i);
          a=1;
        for (char j=0;j<str2.length();j++){
           if (ch==str2.charAt(j)){
             a=2;
         }
           }

            if(a==1){
          // str3+=ch;
            str3.append(ch);
            }
        }

        return str3;
    }

    public static void main(String[] args){
      
         //String str1="occurence";
         StringBuilder str1 = new StringBuilder("occurrence");
        StringBuilder str2 = new StringBuilder("car");
         StringBuilder str3 = new StringBuilder("");
         System.out.println(remove(str1, str2,str3));
       
    }


    
}
