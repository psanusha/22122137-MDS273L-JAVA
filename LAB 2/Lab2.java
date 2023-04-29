import java.util.*;

class Lab2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of names");
        int n = scan.nextInt();
        String[] name = new String[n];
        int count = 0;
        boolean found = false;
        
        int choose;
        do {
            System.out.println("Enter your choice");
            System.out.println("1. Add a name");
            System.out.println("2. Search for a name");
            System.out.println("3. Remove a name");
            System.out.println("4. Print all names");
            System.out.println("5. Exit the program");
            choose = scan.nextInt();
            
            switch(choose) {
                case 1:
                    System.out.println("Enter the name");
                    name[count] = scan.next();
                    count++;
                    break;
                    
                case 2:
                    System.out.println("Enter the name you want to search");
                    String search = scan.next();
                    found = false;
                    for(int i = 0; i < count; i++) {
                        if(name[i].equalsIgnoreCase(search)) {
                            System.out.println("The name is at index " + i);
                            found = true;
                        }
                    }
                    if(!found) {
                        System.out.println("Name not found");
                    }
                    break;
                    
                case 3:
                    System.out.println("Enter the name you want to remove");
                    String remove = scan.next();
                    int index = -1;
                    for(int i = 0; i < count; i++) {
                        if(name[i].equalsIgnoreCase(remove)) {
                            index = i;
                            break;
                        }
                    }
                    if(index == -1) {
                        System.out.println("Name not found");
                    } else {
                        for(int i = index; i < count - 1; i++) {
                            name[i] = name[i + 1];
                        }
                        count--;
                        System.out.println("Name removed successfully");
                    }
                    break;
                    
                case 4:
                    System.out.println("Printing all names");
                    for(int i = 0; i < count; i++) {
                        System.out.println(name[i]);
                    }
                    break;
                    
                case 5:
                    System.out.println("Exiting the program");
                    break;
                    
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while(choose != 5);
        scan.close();
    }
}













