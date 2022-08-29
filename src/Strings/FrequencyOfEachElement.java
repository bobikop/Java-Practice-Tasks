package InterviewTasks.arrays;

import java.util.*;

public class FrequencyOfEachElement {

     /*
    Given the array return the output
                testArray = {"Apple","Banana","Apple","Cherry"}
                Output Example
                Apple = 2
                Banana = 1
                Cherry = 1
     */

    public static void main(String[] args) {

        String[] testArray = {"Apple","Banana","Apple","Cherry"};

        Map<String, Integer> map = new HashMap<>();

        for (String each : testArray){
            int frequency = 0;
            for (String each2 : testArray){
                if (each.equals(each2)) {

                    frequency++;
                }
            }
            map.put(each,frequency);


        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }


        System.out.println("-------------------------------------");
        //solution 2

        List<String> temp = Arrays.asList(testArray);
        for(String each : new LinkedHashSet<>(temp)){
            System.out.println(each + "=" + Collections.frequency(temp,each));

        }

        System.out.println("---------------------------------------");
        //Solution 3:
        Arrays.stream(testArray).distinct().forEach( e -> System.out.println(e+"="+Arrays.stream(testArray).filter( p -> p.equals(e)).count() ));
    }




}
