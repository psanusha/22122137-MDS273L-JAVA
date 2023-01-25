import java.util.Scanner;
class LAB1{
    public static void main(String[] args){
        String Name,Course,University,Place,State;
        char Gender;
        int Age;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Name,Course,Age,University,Gender,Place,State :");
        Name = scan.nextLine();
        Course = scan.nextLine();
        Age = Integer.parseInt(scan.nextLine());
        University = scan.nextLine();
        Gender = scan.nextLine().charAt(0);
        Place = scan.nextLine();
        State = scan.nextLine();
        System.out.println("Name:"+Name+ "\nCourse:"+Course+ "\nAge:"+Age+ "\nUniversity:"+University+ "\nGender:"+Gender+ "\nPlace:"+Place+ "\nState:"+State);
        if(Gender == 'm'){
            System.out.println("MALE");
        }
        else if(Gender == 'f'){
            System.out.println("FEMALE");
        }
        else{
            System.out.println("DEFAULT");
        }

      

        switch(State){
            case "Andhrapradesh","Karnataka","Kerala","TamilNadu","Telangana":
                System.out.println("The Student is from Southern state of India");
                break;
            case "Uttarpradesh","Haryana","Punjab","Himachalpradesh","Uttarakhand","Delhi","Madyapradesh":
                System.out.println("The Student is from Northern state of India");
                break;
            case "Arunachalpradesh","Sikkim","Meghalaya","Nagaland","Bihar","Odisha":
                System.out.println("The Student is from Eastern state of India");
                break;
            case "Gujarat","Goa","Rajasthan":
                System.out.println("The Student is from Western state of India");
                break;
            

        }


         
// System.out.println("Enter your Course :");
//         System.out.println("Enter your Age :");
//         System.out.println("Enter your University :");
//         System.out.println("Enter your Gender :");
//         System.out.println("Enter your Place :");
//         System.out.println("Enter your State :");







        

    }
}
