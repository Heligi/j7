package workshop.Repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import workshop.elements.Receipt;

import javax.transaction.Transactional;

@Repository("receiptlRepository")
@Transactional
public class ReceiptlRepository implements ReceiptlRepositoryFactory {

    private final SessionFactory sessionFactory;

    @Autowired
    public ReceiptlRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Receipt create(Receipt receipt) {
        return (Receipt) sessionFactory.getCurrentSession().save(receipt);
    }
}
