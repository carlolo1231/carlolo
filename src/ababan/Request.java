
package ababan;

public class Request {
    private int id;
    private String requesterName;
    private String supplyName;
    private int quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRequesterName() {
        return requesterName;
    }

    public void setRequesterName(String requesterName) {
        this.requesterName = requesterName;
    }

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", requesterName='" + requesterName + '\'' +
                ", supplyName='" + supplyName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}