
package ababan;

import java.util.Scanner;

import java.util.Scanner;

public class SupplyRequestTrackerApp {
    private static SupplyService supplyService = new SupplyService();
    private static RequestService requestService = new RequestService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Supply Request Tracker");
            System.out.println("1. Manage Supplies");
            System.out.println("2. Manage Requests");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    manageSupplies();
                    break;
                case 2:
                    manageRequests();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void manageSupplies() {
        while (true) {
            System.out.println("Manage Supplies");
            System.out.println("1. Add Supply");
            System.out.println("2. View Supplies");
            System.out.println("3. Update Supply");
            System.out.println("4. Delete Supply");
            System.out.println("5. Back to Main Menu");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    Supply supply = new Supply();
                    System.out.print("Enter supply name: ");
                    supply.setName(scanner.nextLine());
                    System.out.print("Enter supply quantity: ");
                    supply.setQuantity(scanner.nextInt());
                    supplyService.addSupply(supply);
                    break;
                case 2:
                    System.out.println(supplyService.viewSupplies());
                    break;
                case 3:
                    System.out.print("Enter supply ID to update: ");
                    int idToUpdate = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Supply updatedSupply = new Supply();
                    System.out.print("Enter new supply name: ");
                    updatedSupply.setName(scanner.nextLine());
                    System.out.print("Enter new supply quantity: ");
                    updatedSupply.setQuantity(scanner.nextInt());
                    supplyService.updateSupply(idToUpdate, updatedSupply);
                    break;
                case 4:
                    System.out.print("Enter supply ID to delete: ");
                    int idToDelete = scanner.nextInt();
                    supplyService.deleteSupply(idToDelete);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void manageRequests() {
        while (true) {
            System.out.println("Manage Requests");
            System.out.println("1. Add Request");
            System.out.println("2. View Requests");
            System.out.println("3. Update Request");
            System.out.println("4. Delete Request");
            System.out.println("5. Back to Main Menu");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    Request request = new Request();
                    System.out.print("Enter requester name: ");
                    request.setRequesterName(scanner.nextLine());
                    System.out.print("Enter supply name: ");
                    request.setSupplyName(scanner.nextLine());
                    System.out.print("Enter quantity requested: ");
                    request.setQuantity(scanner.nextInt());
                    requestService.addRequest(request);
                    break;
                case 2:
                    System.out.println(requestService.viewRequests());
                    break;
                case 3:
                    System.out.print("Enter request ID to update: ");
                    int idToUpdate = scanner.nextInt();
                    scanner.nextLine(); 
                    Request updatedRequest = new Request();
                    System.out.print("Enter new requester name: ");
                    updatedRequest.setRequesterName(scanner.nextLine());
                    System.out.print("Enter new supply name: ");
                    updatedRequest.setSupplyName(scanner.nextLine());
                    System.out.print("Enter new quantity requested: ");
                    updatedRequest.setQuantity(scanner.nextInt());
                    requestService.updateRequest(idToUpdate, updatedRequest);
                    break;
                case 4:
                    System.out.print("Enter request ID to delete: ");
                    int idToDelete = scanner.nextInt();
                    requestService.deleteRequest(idToDelete);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}