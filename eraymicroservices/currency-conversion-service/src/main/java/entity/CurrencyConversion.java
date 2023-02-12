package entity;

import java.math.BigDecimal;


public class CurrencyConversion {
    private Long id;
    private String from;
    private String to;
    private BigDecimal amount;
    private BigDecimal conversionMultiple;
    private BigDecimal totalCalculate;
    private String environment;

    public CurrencyConversion() {
    }

    public CurrencyConversion(Long id, String from, String to, BigDecimal amount, BigDecimal conversionMultiple, BigDecimal totalCalculate, String environment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.conversionMultiple = conversionMultiple;
        this.totalCalculate = totalCalculate;
        this.environment = environment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public BigDecimal getTotalCalculate() {
        return totalCalculate;
    }

    public void setTotalCalculate(BigDecimal totalCalculate) {
        this.totalCalculate = totalCalculate;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
