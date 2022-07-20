package LoveBabbar.Arrays;

public class BestTImeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 6, 4 };
        System.out.println(stocks(arr));
    }

    static int stocks(int[] arr){
        int minPrice = arr[0];
        int maxProfit = 0;
        for (int j : arr) {
            if (j < minPrice) minPrice = j;
            if (j - minPrice > maxProfit) maxProfit = j - minPrice;
        }
        return maxProfit;
    }
}
