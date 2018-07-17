package workshop;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import workshop.Factory.ReceiptFactory;
import workshop.Repository.ReceiptlRepositoryFactory;

@Component
public class Menu {


    private final ReceiptFactory receiptFactory;
    private final ReceiptlRepositoryFactory receiptlRepositoryFactory;

    @Autowired
    public Menu(ReceiptlRepositoryFactory receiptlRepositoryFactory, ReceiptFactory receiptFactory) {
        this.receiptlRepositoryFactory = receiptlRepositoryFactory;
        this.receiptFactory = receiptFactory;
    }

    public void start() {
        receiptlRepositoryFactory.create(receiptFactory.input());
    }
}
