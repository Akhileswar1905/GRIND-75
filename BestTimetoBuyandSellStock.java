import java.util.Scanner;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prices[] = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        int i = 0, max = 0;
        for (int j = 1; j < prices.length; j++) {
            if (prices[j] > prices[i]) {
                max = Math.max(max, prices[j] - prices[i]);
            } else {
                i = j;
            }
        }
        return max;
    }
}
