package workshopTesting.elementsTesting;

import org.hibernate.SessionFactory;
import org.junit.Test;
import workshop.elements.Receipt;

import java.util.Scanner;

public class ReceiptTest {

    private final Scanner scanner = new Scanner(System.in);
    private final SessionFactory sessionFactory;

    public ReceiptTest(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public Receipt create(Receipt receipt) {
        return (Receipt) sessionFactory.getCurrentSession().save(receipt);
    }


    public void input() {
        Receipt receipt;

        ReceiptTest receiptTest;

        System.out.println("input nomer");
        int nomer = scanner.nextInt();
        System.out.println("input idMasters");
        int idMasters = scanner.nextInt();
        System.out.println("input repairPrice");
        int repairPrice = scanner.nextInt();

        receipt = new Receipt(nomer, idMasters, repairPrice);

    }

}
