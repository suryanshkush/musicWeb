public class potd {
    public static int SetBit(int num) {
        int count=0;
        while(num>0){
            if((num&1)!=0){
                count++;
            }
            num=num>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        int result= SetBit(15);
        System.out.println(result);

    }
       
}
