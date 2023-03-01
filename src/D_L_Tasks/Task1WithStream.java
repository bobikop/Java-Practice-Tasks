package D_L_Tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Task1WithStream {


    static int solution2(int[] A, String[] D) {
        int result = 0;
        Map<String, List<Integer>> mapList = new HashMap<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        for (int i = 0; i < D.length; i++) {
            LocalDate date = LocalDate.parse(D[i], formatter);
            String month = date.getMonth().toString();
            List<Integer> temp = mapList.getOrDefault(month,new ArrayList<>());
            temp.add(A[i]);
            mapList.put(month,temp);
        }

        for(Map.Entry <String,List<Integer>> each: mapList.entrySet()){
            int tempResult = 0;
            for(Integer transaction : each.getValue()){
                tempResult += transaction;
            }
            Stream<Integer> cardPayments =  each.getValue().stream().filter(x->x<0);
            if(cardPayments.reduce(0,(x,y)->x+y)>= 100 && cardPayments.count()>2){
                result += 5;
            }
            result = tempResult - 60;
        }
        return result;
    }









}