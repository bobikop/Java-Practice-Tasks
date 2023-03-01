package D_L_Tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SolutionSentTask1 {
    public int solution(int[] A, String[] D) {
         int balance = 0;
        List<Transaction> list = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        for (int i = 0; i < D.length; i++) {
            LocalDate date = LocalDate.parse(D[i], formatter);
            list.add(new Transaction(date, A[i]));
        }
    
        Map<String, int[]> map = new HashMap<>();
        for (Transaction value : list) {
            String month = value.date.getMonth().toString();
            int amount = value.amount;    map.put(month, new int[]{amount, 1});
            if (amount < 0) {
                if (!map.containsKey(month)) {
                    map.put(month, new int[]{amount, 1});
                } else {
                    int[] a = map.get(month);
                    a[0] = a[0] + amount;
                    a[1] = a[1] + 1;
                    map.put(month, a);
                }
            }
        }
        int count = 0;
        for (int[] arr : map.values()) {
            if (arr[1] >= 3 && arr[0] <= -100){
                count++;
            }
        }
        for (Transaction transaction : list) {
            balance += transaction.amount;
        }
        balance = balance - 60 + count * 5;

        return balance;
    }

    static class Transaction {
        LocalDate date;
        int amount;

        public Transaction(LocalDate date, int amount) {
            this.date = date;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "date=" + date +
                    ", amount=" + amount +
                    '}';
    }
}
}