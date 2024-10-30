
package ababan;


import java.util.ArrayList;
import java.util.List;

public class RequestService {
    private List<Request> requests = new ArrayList<>();
    private int currentId = 1;

    public void addRequest(Request request) {
        request.setId(currentId++);
        requests.add(request);
    }

    public List<Request> viewRequests() {
        return requests;
    }

    public void updateRequest(int id, Request updatedRequest) {
        for (Request request : requests) {
            if (request.getId() == id) {
                request.setRequesterName(updatedRequest.getRequesterName());
                request.setSupplyName(updatedRequest.getSupplyName());
                request.setQuantity(updatedRequest.getQuantity());
                break;
            }
        }
    }

    public void deleteRequest(int id) {
        requests.removeIf(request -> request.getId() == id);
    }
}