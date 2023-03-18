
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
        boolean found = true;

        do {
            System.out.println("Enter 1 to add a student");
            System.out.println("Enter 2 to search for a student");
            System.out.println("Enter 3 to display all students");
            System.out.println("Enter 4 to exit");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter name:");
                    String name = scan.nextLine();
                    System.out.println("Enter regno:");
                    int regno = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter email:");
                    String email = scan.nextLine();
                    System.out.println("Enter phone:");
                    String phone = scan.nextLine();
                    System.out.println("Enter class:");
                    String clss = scan.nextLine();
                    System.out.println("Enter department:");
                    String dept = scan.nextLine();
                    arr[count] = new Student(regno, name, email, phone, clss, dept);
                    count++;
                    break;

                case 2:
                    System.out.println("Enter the name of the student you want to search:");
                    String searchName = scan.nextLine();
                    System.out.println("Enter the regno of the student you want to search:");
                    int searchRegno = scan.nextInt();
                    scan.nextLine();
                    found = false;
                    for (int i = 0; i < count; i++) {
                        if (arr[i].Name.equals(searchName) && arr[i].RegNo == searchRegno) {
                            arr[i].Display();
                            found = true;
                            break;
                    if(!found){
                System.out.println("Student not found");
            }
            break;
                

            case 3:
                 for(int i=0;i<count;i++){
                   arr[i].display();
            }
            break;

            case 4:
                System.out.println("Exist");
            break;
    }

        }while(choice!=4);




        }

    
}}}


                   
                   

