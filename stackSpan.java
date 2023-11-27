public class stackSpan {
    public static void StockSpan(int[] price,int[] span){
    span[0]=1; 
    }
    
    public static void main(String args[]){
          int[] price={6,3,9,2,5,3};
          int[] span =new int[price.length];
          StockSpan(price,span);

          for(int i=0; i<price.length;i++){
            System.out.println(span[i]+" ");
          }
    }
}
