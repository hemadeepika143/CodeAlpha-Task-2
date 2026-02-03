import java.util.Scanner;

public class StockTradingPlatform {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String stockName = "ABC Corp";
        double stockPrice = 100.0;
        int ownedStocks = 0;

        int choice;

        do {
            System.out.println("\n=== Stock Trading Platform ===");
            System.out.println("Stock: " + stockName);
            System.out.println("Price per stock: ₹" + stockPrice);
            System.out.println("Owned stocks: " + ownedStocks);

            System.out.println("\n1. Buy Stock");
            System.out.println("2. Sell Stock");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter quantity to buy: ");
                    int buyQty = sc.nextInt();
                    ownedStocks += buyQty;
                    System.out.println("Successfully bought " + buyQty + " stocks.");
                    break;

                case 2:
                    System.out.print("Enter quantity to sell: ");
                    int sellQty = sc.nextInt();
                    if (sellQty <= ownedStocks) {
                        ownedStocks -= sellQty;
                        System.out.println("Successfully sold " + sellQty + " stocks.");
                    } else {
                        System.out.println("Not enough stocks to sell!");
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using Stock Trading Platform!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}
