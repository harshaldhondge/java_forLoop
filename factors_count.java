/* Take N as input. Print count of its factors
Input = 6
Output = 4
*/

public class factors_count{
    public static void main(String[]args){

        int count = 0;
        for(int i=1;i<=6;i++){
            if(6%i==0){
                count++;
            }
        }
        System.out.println(count);
    }    
}
