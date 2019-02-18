package nl.han.dea;

public class FizzBuzzFactory {

    public static final int FIZZ_NUMBER = 5;
    public static final int BUZZ_NUMBER = 3;
    public static final int FIZZBUZZ_NUMBER = FIZZ_NUMBER * BUZZ_NUMBER;

    public static Resultaat create(int number) {

        if(number % FIZZBUZZ_NUMBER == 0){
            return new FizzBuzz(number + " FizzBuzz");
        }else if(number % FIZZ_NUMBER == 0){
            return new Fizz(number + " Fizz");
        }else if(number % BUZZ_NUMBER == 0){
            return new Buzz(number + " Buzz");
        }else{
            return new Resultaat(number + " kan niet gefizzbuzz-ed worden");
        }
    }

}
