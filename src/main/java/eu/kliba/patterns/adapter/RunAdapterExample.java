package eu.kliba.patterns.adapter;

import eu.kliba.patterns.adapter.payd.PayD;
import eu.kliba.patterns.adapter.site.XpayImpl;
import eu.kliba.patterns.adapter.site.XpayToPayDAdapter;
import eu.kliba.patterns.adapter.xpay.Xpay;

public class RunAdapterExample {

    public static void main(String[] args) {

        //Object for Xpay
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("1234567890");
        xpay.setCustomerName("John Smith");
        xpay.setCardExpMonth("02");
        xpay.setCardExpYear("32");
        xpay.setCardCVVNo(235);
        xpay.setAmount(1000000.25D);

        PayD payD = new XpayToPayDAdapter(xpay);
        testPayD(payD);

    }

    private static void testPayD(PayD payD) {
        System.out.println(payD.getCardOwnerName());
        System.out.println(payD.getCustCardNo());
        System.out.println(payD.getCardExpMonthDate());
        System.out.println(payD.getCardExpMonthDate());
        System.out.println(payD.getCVVNo());
        System.out.println(payD.getTotalAmount());
    }
}
