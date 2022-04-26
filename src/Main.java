public class Main {

    public static void main(String[] args) {

        int price = 8010; // потрачено на покупку билета
        int milePrice = 20; // стоимость одной мили

        int mile = price / milePrice;
        System.out.println("Вам начислено " + mile + " миль");
    }

}
