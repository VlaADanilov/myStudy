package Trader;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws InvalidTotalException, InvalidAmountException, InvalidTotalScaleException {
        int amount = 5555;
        BigDecimal total = BigDecimal.valueOf(12.8);
        try{
            TradeRequest.registerTrade(amount, total);
            System.out.printf("Trade registered with total price = %s for amount = %d", total ,amount);
        }catch (InvalidAmountException e){
            System.out.println("Amount should be greater than 0");
        }catch ( InvalidTotalException e){
            System.out.println("Total should be greater than 0");
        }catch( InvalidTotalScaleException e){
            System.out.println(e.getMessage());
        }catch( Exception e){
            System.out.println("Unknown error");
        }
    }
}
