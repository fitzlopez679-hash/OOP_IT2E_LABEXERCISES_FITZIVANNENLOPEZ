import java.util.*;
import java.util.stream.Collectors;

public class Exer1_Functional {
    public static void main(String[] args) {
        Map<String, Integer> stockPool = new HashMap<>();
        stockPool.put("AAPL", 100);
        stockPool.put("GOOGL", 80);
        stockPool.put("TSLA", 120);

        int requestAmount = 50;

        Map<String, Integer> allocated = stockPool.entrySet()
            .stream()
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                e -> Math.min(requestAmount, e.getValue())
            ));

        System.out.println("Functional Allocation: " + allocated);
    }
}
