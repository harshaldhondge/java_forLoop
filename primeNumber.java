// check whether 5 is Prime number or Not

public class primeNumber {
    public static void main(String[]args){

        int count = 0;

        for(int i=1;i<=5;i++){
            if(5%i==0){
            count++;
            }
        }
        if(count==2){
            System.out.println("The Number is Prime Number");
        } else {
            System.out.println("The Number is Not Prime Number");
        }
    }
    
}
