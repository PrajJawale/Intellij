package Practice;

public class Merchant {
    private String legalName ;
    private int transaction;
    private String location;

    public Merchant() {
    }

    public Merchant(String legalName, int transaction, String location) {
        this.legalName = legalName;
        this.transaction = transaction;
        this.location = location;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public int getTransaction() {
        return transaction;
    }

    public void setTransaction(int transaction) {
        this.transaction = transaction;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
