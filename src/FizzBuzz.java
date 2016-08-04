/**
 * Created by rush on 8/4/16.
 */
public class FizzBuzz {

    public void doIt(){
        for(int i = 1 ; i <= 100 ; i++){
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");

            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");

            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");

            }
            else {
                System.out.println(i);
            }
        }
    }

}



