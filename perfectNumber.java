// check whether N is Perfect number or Not

public class perfectNumber {
    public static void main(String[]args){
        int N = 6;
        int sum = 0;

        for(int i=1;i<N;i++){
            if(N%i==0){
            sum=sum+i;
            }
        }
        if(sum==N){
            System.out.println("The Number is Perfect Number");
        } else {
            System.out.println("The Number is Not Perfect Number");
        }
    }
    
}
