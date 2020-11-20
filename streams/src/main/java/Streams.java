import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
//
//        List<String> myList = new ArrayList<String>(Arrays.asList("amanda", "sandy", "alina", "sky"));
//        myList
//                .stream()
//                .map(String::toUpperCase)
//                .forEach(result -> System.out.println(result)); // lamda expression

//        Stream.of("amanda", "sandy", "alina", "sky")
//                .findFirst()
//                .ifPresent(name -> System.out.println(name.toUpperCase()));

        IntStream.range(1, 5)
                .mapToObj(num -> "number: " + num)
                .forEach(System.out::println);

        Stream.of(38.7, 56.4, 89.0, 2.5)
                .mapToInt(Double::intValue)
                .mapToObj(cohort -> "G" + cohort)
                .forEach(System.out::println);
    }
}
