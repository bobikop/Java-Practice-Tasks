package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample_Peek {

    public static void main(String[] args) {





        List<String> roles = Stream.of("Admin", "Manager", "Employee")
                .filter(obj -> obj.equals("Admin"))
//                .filter(obj ->{
//                    System.out.println("Printing" + " " + obj);
//                    return obj.equals("Admin");
//                })
                .peek(obj -> System.out.println("Printing" + " " + obj))
                .collect(Collectors.toList());

    }

}
