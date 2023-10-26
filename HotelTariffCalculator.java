package GuviJavaPractices2;

import java.util.Scanner;

public class HotelTariffCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        double roomRent = scanner.nextDouble();
        int days = scanner.nextInt();
        scanner.close();
        double tariff = roomRent * days;
        switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                tariff = tariff + (tariff * 0.20);
                break;
            default:
                break;
        }
        System.out.printf("%.2f", tariff);
    }
}
