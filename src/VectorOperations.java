import java.util.Scanner;
import java.util.Vector;

public class VectorOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<String> students = new Vector<>();
        
        while (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            
            if (choice == 5) {
                break;
            }
            
            switch (choice) {
                case 1:
                    // Add name
                    String nameToAdd = scanner.next();
                    students.add(nameToAdd);
                    System.out.println("Added");
                    break;
                    
                case 2:
                    // Insert at 1-based index
                    String nameToInsert = scanner.next();
                    int index = scanner.nextInt();
                    students.add(index - 1, nameToInsert); // convert to 0-based
                    System.out.println("Inserted");
                    break;
                    
                case 3:
                    // Remove name
                    String nameToRemove = scanner.next();
                    students.remove(nameToRemove);
                    System.out.println("Removed");
                    break;
                    
                case 4:
                    // Display vector
                    System.out.println(students);
                    break;
                    
                default:
                    System.out.println("Invalid choice");
            }
        }
        
        scanner.close();
    }
}