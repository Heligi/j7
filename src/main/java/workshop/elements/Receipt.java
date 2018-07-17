package workshop.elements;

import javax.persistence.*;

@Entity
@Table(name = "receipt")
@NamedQuery(name = "Receipt.getAll", query = "SELECT c from receipt c")
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nomer")
    private int nomer;

    @Column(name = "idMasters")
    private int idMasters;

    @Column(name = "repairPrice")
    private int repairPrice;

    public Receipt(int nomer, int nameMasters, int repairPrice) {
        this.nomer = nomer;
        this.idMasters = nameMasters;
        this.repairPrice = repairPrice;
    }

    public Receipt() {
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public int getNameMasters() {
        return idMasters;
    }

    public void setNameMasters(int nameMasters) {
        this.idMasters = nameMasters;
    }

    public int getRepairPrice() {
        return repairPrice;
    }

    public void setRepairPrice(int repairPrice) {
        this.repairPrice = repairPrice;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "id=" + id +
                ", nomer=" + nomer +
                ", idMasters=" + idMasters +
                ", repairPrice=" + repairPrice +
                '}';
    }
}
