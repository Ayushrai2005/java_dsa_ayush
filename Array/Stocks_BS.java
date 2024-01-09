// public class Stocks_BS {

//     public static int buyAndSellStocks(int prices[]) {
//         int buyprice = prices[0];
//         int maxProfit = 0;

//         //
//         for (int i = 0; i < prices.length; i++) {
//             if (prices[i] < buyprice) {

//                 buyprice = prices[i];
//             }

//             else {
//                 int profit = prices[i] - buyprice;
//                 maxProfit = Math.max(maxProfit, profit);

//             }
//         }
//         return maxProfit;

//     }

//     public static void main(String[] args) {

//         int prices[] = { 7, 1, 5, 3, 6, 4 };

//         System.out.println(buyAndSellStocks(prices)); // code by chat gpt

//     }

// }





public class Stocks_BS {

    public static int buyAndSellStocks(int prices[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;

        //
        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) {
                int profit = prices[i] - buyprice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyprice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("Profit : " + buyAndSellStocks(prices));  //this is a code of Apna college
    }
}

