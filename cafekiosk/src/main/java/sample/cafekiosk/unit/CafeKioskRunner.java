package sample.cafekiosk.unit;

import sample.cafekiosk.unit.beverage.Americano;
import sample.cafekiosk.unit.beverage.Latte;

public class CafeKioskRunner {
    public static void main(String[] args) {
        CafeKiosk cakeKiosk = new CafeKiosk();

        cakeKiosk.add(new Americano());
        System.out.println(">>> 아메리카노 추가");

        cakeKiosk.add(new Latte());
        System.out.println(">>> 라떼 추가");

        int totalPrice = cakeKiosk.calculateTotalPrice();
        System.out.println("총 주문가격 : " + totalPrice);
    }
}
