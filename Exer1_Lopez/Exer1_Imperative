import java.util.*;

public class Imperative {
    public static void main(String[] args) {
        Map<String, Integer> stockPool = new HashMap<>();
        stockPool.put("AAPL", 100);
        stockPool.put("GOOGL", 80);
        stockPool.put("TSLA", 120);

        int requestAmount = 50;

        Map<String, Integer> allocated = new HashMap<>();

        for (Map.Entry<String, Integer> entry : stockPool.entrySet()) {
            String stock = entry.getKey();
            int available = entry.getValue();

            int allocate = Math.min(requestAmount, available);
            allocated.put(stock, allocate);
            stockPool.put(stock, available - allocate);
        }

        System.out.println("Imperative Allocation: " + allocated);
    }
}
