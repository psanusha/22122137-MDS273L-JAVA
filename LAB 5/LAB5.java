
import java.util.Scanner;

class Student {
    int RegNo;
    String Name;
    String Email;
    String Phone;
    String Class;
    String Department;

    Student(int RegNo, String Name, String Email, String Phone, String Class, String Department) {
        this.RegNo = RegNo;
        this.Name = Name;
        this.Email = Email;
        this.Phone = Phone;
        this.Class = Class;
        this.Department = Department;
    }

    public void Display() {
        System.out.println("Reg No: " + RegNo);
        System.out.println("Name: " + Name);
        System.out.println("Email: " + Email);
        System.out.println("Phone: " + Phone);
        System.out.println("Class: " + Class);
        System.out.println("Department: " + Department);
    }
}

public class LAB5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student[] arr = new Student[100];
        int count = 0;
        int input;
        do {
            System.out.println("Enter your choice:");
            System.out.println("1 --> Add student");
            System.out.println("2 --> Search a student");
            System.out.println("3 --> Display");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter regno:");
                    int RegNo = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter name:");
                    String Name = scan.nextLine();
                    System.out.println("Enter email");
                    String Email = scan.nextLine();
                    System.out.println("Enter phone number:");
                    String Phone = scan.nextLine();
                    System.out.println("Enter class:");
                    String Class = scan.nextLine();
                    System.out.println("Enter department:");
                    String Department = scan.nextLine();
                    arr[count] = new Student(RegNo,Name,Email,Phone,Class,Department);
                    count = count + 1;
                    break;

                case 2:
                    System.out.println("Enter the regno you want to search:");
                    int sregno = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter the name you want to search:");
                    String sname = scan.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (arr[i].RegNo == sregno && arr[i].Name.equals(sname)) {
                            arr[i].Display();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Name not found.");
                    }
                    break;

                case 3:
                    for (int i = 0; i < count; i++) {
                        arr[i].Display();
                    }
                    break;
            }

            System.out.println("Enter 0 to continue or any other number to exit:");
            input = scan.nextInt();
            scan.nextLine();
        } while (input == 0);

        
    }
}


