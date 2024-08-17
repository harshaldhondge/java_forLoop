/* Take N as input. Print all its factors
Input = 6
Output = 1 2 3 6
*/

public class factors{
    public static void main(String[]args){

        for(int i=1;i<=6;i++){
            if(6%i==0){
                System.out.println(i);
            }
        }
    }    
}
