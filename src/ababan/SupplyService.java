
package ababan;

import java.util.ArrayList;
import java.util.List;

public class SupplyService {
    private List<Supply> supplies = new ArrayList<>();
    private int currentId = 1;

    public void addSupply(Supply supply) {
        supply.setId(currentId++);
        supplies.add(supply);
    }

    public List<Supply> viewSupplies() {
        return supplies;
    }

    public void updateSupply(int id, Supply updatedSupply) {
        for (Supply supply : supplies) {
            if (supply.getId() == id) {
                supply.setName(updatedSupply.getName());
                supply.setQuantity(updatedSupply.getQuantity());
                break;
            }
        }
    }

    public void deleteSupply(int id) {
        supplies.removeIf(supply -> supply.getId() == id);
    }
}