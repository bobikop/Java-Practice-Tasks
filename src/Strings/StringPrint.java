package Strings;

import java.util.ArrayList;
import java.util.List;

public class StringPrint {

    public static void main(String[] args) {


        //System.out.println(hasDuplicateBookingsExpl());

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

// Add elements to the lists
        list1.add("apple");
        list1.add("banana");
        list2.add("apple");
        list2.add("banana");

       // boolean areEqual = list1.equals(list2); // This will return true
String explanation ="";
        if(list1.equals(list2)){
            for(String legs : list1){
                 explanation += legs + "\n";
            }
            System.out.println(explanation);
        }else{
            System.out.println("Not same");
        }


    }

    public static String hasDuplicateBookingsExpl() {

        // Generate tripLegs using currentItinerary
        List<String> currentTripLegs = new ArrayList<>();

        // Generate tripLegs using unsmoothedItinerary
        List<String> unsmoothTripLegs = new ArrayList<>();

        // Build the explanation string
        String explanation = "Current Itinerary Trip Legs:\n";
        for (String currentLeg : currentTripLegs) {
            explanation += currentLeg + "\n";
        }

        explanation += "\nUnsmoothed Itinerary Trip Legs:\n";
        for (String unsmoothLeg : unsmoothTripLegs) {
            explanation += unsmoothLeg + "\n";
        }

        Object leg;
        explanation += "\nArrival Port: " ;

        return explanation;
    }



}
