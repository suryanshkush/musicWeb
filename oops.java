public class oops {
    public static void main (String args[]) {
    Pen p1 = new Pen();
    p1.setcolor("blue");
    System.out.println(p1.getcolor());
    p1.settip(5);
    System.out.println(p1.gettip());
    BankAccount myacc=new BankAccount();
    myacc.username="dssfdds";
    //myacc.password="jfhkgjhgggggg";
    myacc.setpassword("jfdhkdj");

    }
} 
class BankAccount{
    public String username;

    private String password;
    public void setpassword(String pwd){
        password=pwd;
    }
}
class Pen{
    String color;
    int tip;
      
    String getcolor(){
        return this.color;
    }   
    void setcolor(String newcolor){
        color = newcolor;}

    String gettip(){
        return this.color;

    }
    void settip(int newtip){
        tip=newtip;
    }
}