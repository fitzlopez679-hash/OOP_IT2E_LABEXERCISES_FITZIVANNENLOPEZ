import java.util.*;

public class Exer1_Declarative {
    public static void main(String[] args) {
        Map<String, Integer> stockPool = new HashMap<>();
        stockPool.put("AAPL", 100);
        stockPool.put("GOOGL", 80);
        stockPool.put("TSLA", 120);

        int requestAmount = 50;

        Map<String, Integer> allocated = allocateStocks(stockPool, requestAmount);

        System.out.println("Declarative Allocation: " + allocated);
    }

    static Map<String, Integer> allocateStocks(Map<String, Integer> stockPool, int requestAmount) {
        Map<String, Integer> allocation = new HashMap<>();
        stockPool.forEach((stock, available) -> 
            allocation.put(stock, available >= requestAmount ? requestAmount : available)
        );
        return allocation;
    }
}

