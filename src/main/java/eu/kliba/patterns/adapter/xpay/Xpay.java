package eu.kliba.patterns.adapter.xpay;

public interface Xpay {

    //Adapter as a real world adapter which is used to connect two different pieces of equipment
    //that cannot be connected directly. An adapter sits in-between these equipments, it gets the
    //flow from the equipment and provides it to the other equipment in the form it wants,
    // which otherwise, is impossible to get due to their incompatible interfaces.

    String getCreditCardNo();
    String getCustomerName();
    String getCardExpMonth();
    String getCardExpYear();
    Integer getCardCVVNo();
    Double getAmount();

    void setCreditCardNo(String creditCardNo);
    void setCustomerName(String customerName);
    void setCardExpMonth(String cardExpMonth);
    void setCardExpYear(String year);
    void setCardCVVNo(Integer cardCVVNo);
    void setAmount(Double amount);

}
