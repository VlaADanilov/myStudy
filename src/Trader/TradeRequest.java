package Trader;

import java.math.BigDecimal;

public class TradeRequest {

    private int amount;
    private BigDecimal total;

    private TradeRequest(int amount, BigDecimal total){
        this.amount = amount;
        this.total = total;
    }

    public static TradeRequest registerTrade(int amount, BigDecimal total) throws InvalidAmountException, InvalidTotalException, InvalidTotalScaleException{
        if(amount <= 0) throw new InvalidAmountException();

        if(total.compareTo(new BigDecimal(0))<=0) throw new InvalidTotalException();

        if(total.scale()>2) throw new InvalidTotalScaleException(total.scale(), 2);

        return new TradeRequest(amount, total);
    }
}
