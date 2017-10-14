/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_02_15_stock_commission;

/**
 *
 * @author bluebackdev
 * Kathryn bought 600 shares of stock at a price of $21.77 per share. She must
 * pay her stockbroker a 2 percent commission for the transaction. Write a
 * program that calculates and displays the following:
 *  - The amount paid for the stock alone (without the commission)
 *  - The amount of the commission
 *  - The total amount paid (for the stock plus the commission)
 */
public class JAVA_PRG_02_15_Stock_Commission {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Define float for stock price and commission rate
        final float FLT_STOCK_PRICE = 21.77f;
        final float FLT_COMMISSION = 0.02f;
        
        
        // Declare float variables
        float fltStockAlone;
        float fltCommissionCost;
        float fltStockTotal;
        
        // Declare final value for stocks purchased
        final int INT_SHARES_BOUGHT = 600;
        
        // Calculate variables
        fltStockAlone = (float)INT_SHARES_BOUGHT * FLT_STOCK_PRICE;
        fltCommissionCost = fltStockAlone * FLT_COMMISSION;
        fltStockTotal = fltStockAlone + fltCommissionCost;
        
        // Output results to the console
        System.out.println("Initial stock purchase cost: $" + fltStockAlone +
                            "\nCommission cost: $" + fltCommissionCost +
                            "\nTotal stock purchase cost: $" + fltStockTotal);
    }
    
}
