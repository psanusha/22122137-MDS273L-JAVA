
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


// import java.util.Scanner;
// class Student{
//     int regno;
//     String name;
//     int ph;
//     String cls;
//     String dept;

//     Student(int regno,String name,int ph,String cls,String dept){
//         this.regno = regno;
//         this.name = name;
//         this.ph = ph;
//         this.cls = cls;
//         this.dept = dept;

//     }
    
//     public void display(){
//         System.out.println("regno"+regno);
//         System.out.println("name"+name);
//         System.out.println("phone no"+ph);
//         System.out.println("class"+cls);
//         System.out.println("department"+dept);
//     }

//     public class file2{

//         public static void main(String[] args){
//             Scanner scan = new Scanner(System.in);
//             Student[] arr = new Student[100];
//             int count = 0;
//             int input;
//             do{
//                 System.out.println("enter your choice:");
//                 System.out.println("1-->add student");
//                 System.out.println("2-->search a student");
//                 System.out.println("3-->display");
//                 int choice = scan.nextInt();
    
//                 switch(choice){
//                     case 1:
//                     System.out.println("enter regno:");
//                     int regno = scan.nextInt();
//                     scan.nextLine();
//                     System.out.println("ente name:");
//                     String name = scan.nextLine();
//                     System.out.println("ph:");
//                     int ph = scan.nextInt();
//                     System.out.println("cls:");
//                     String cls = scan.nextLine();
//                     System.out.println("dept:");
//                     String dept = scan.nextLine();
//                     arr[count] = new Student(regno,name,ph,cls,dept);
//                     count = count+1;
//                     break;
    
    
//                     case 2:
//                     System.out.println("enter the regno you want to search:");
//                     int sregno = scan.nextInt();
//                     System.out.println("enter the name you want to search:");
//                     String sname = scan.nextLine();
//                     boolean found = false;
//                     for(int i =0;i<arr.length;i++){
//                         if(arr[i].regno==sregno && arr[i].name.equals(sname)){
//                             System.out.println(arr[i]);
//                             found = true;
//                             break;
//                         }
//                     }
//                     if(!found){
//                         System.out.println("name is not found");
//                     }
//                     break;
    
//                     case 3:
//                     for(int i =0;i<count;i++){
//                         arr[i].display();
//                     }
//                     break;
    
//                 }System.out.println("enter 0 to continue");
//                 input = scan.nextInt();
    
//         }while(input==0);
//     }}
//     }