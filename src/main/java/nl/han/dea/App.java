package nl.han.dea;

import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        App app = new App();
        app.streamingfizzbuzz();
    }

    public void streamingfizzbuzz(){
        IntStream.range(1,1000).forEach(number -> {
            System.out.println(FizzBuzzFactory.create(number).getResultaat());
        });
    }

}
