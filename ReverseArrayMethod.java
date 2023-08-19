package ProblemE7_7;

public class ReverseArrayMethod {
    public void reverseArray(){
        int values[]={1,4,9,16,9,7,4,9,11};
        int length=values.length;
        System.out.println("reverse array element is :");
        for(int i=length-1;i>=0;i--){
            System.out.print(values[i]+" ");
        }
    }

    public static void main(String[] args) {
        ReverseArrayMethod reverse=new ReverseArrayMethod();
        reverse.reverseArray();
    }

}
