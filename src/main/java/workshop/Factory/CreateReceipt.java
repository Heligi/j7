package workshop.Factory;


import org.springframework.stereotype.Component;
import workshop.elements.Receipt;

import java.util.Scanner;

@Component
public class CreateReceipt implements ReceiptFactory {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public Receipt input() {
        Receipt receipt;

        System.out.println("input nomer");
        int nomer = scanner.nextInt();
        System.out.println("input idMasters");
        int idMasters = scanner.nextInt();
        System.out.println("input repairPrice");
        int repairPrice = scanner.nextInt();

        receipt = new Receipt(nomer, idMasters, repairPrice);
        return receipt;
    }
}
