package ProblemE7_6;

public class AlternatingSum {
    public static void main(String[] args) {
        int values[]={1,4,9,16,9,7,4,9,11};
        int length=values.length;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<length;i++){
            if(i%2==0){
                sum1=sum1+values[i];
            }
            else {
                sum2=sum2+values[i];
            }
        }
        int sum=sum1-sum2;
        System.out.println("alternating sum is: " +sum);
    }
}
