import java.util.*;

import java.util.Scanner;
class LAB2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] arr = new String[1024];
        int count=0;
        int cont;
        do{
            System.out.println("Enter your choice:");
            System.out.println("1-->To enter names");
            System.out.println("2-->To search for a name");
            System.out.println("3-->To remove a name");
            System.out.println("4-->To display all the names");
            int choice=scan.nextInt();
            scan.nextLine();
    
            
            switch(choice){
                case 1:
                System.out.println("Enter the name:");
                String name = scan.nextLine();
                boolean fnd=false;
                for(int i=0;i<count;i++){
                    if(name.equalsIgnoreCase(arr[i])){
                        fnd = true;
                        break;

                    }

                }
                if(!fnd){
                        arr[count]=name;
                        count=count+1;

                    
                }
                break;

                case 2:
                System.out.println("Enter the name you want to search:");
                String search = scan.nextLine();
                boolean found = false;
                for(int i=0;i<count;i++){
                    if(search.equalsIgnoreCase(arr[i])){
                        System.out.println(search+"is at the index "+i);
                        found=true;
                        break;
                    }
                    
                }
                if(!found){
                    System.out.println("name is not found");
                }
                break;

                case 3:
                System.out.println("Enter the name you want to remove:");
                String remove = scan.nextLine();
                int index =-1;
                for(int i =0;i<count;i++){
                    if(remove.equalsIgnoreCase(arr[i])){
                        index=i;
                        break;
                    }
                }
                if(index==-1){
                    System.out.println("not found");
                }else{
                    for(int j=index;j<count-1;j++){
                        arr[j]=arr[j+1];

                    }
                    arr[count-1]=null;
                    count=count-1;
                }
                break;
                

                case 4:
                for(int i =0;i<count;i++){
                    System.out.println(arr[i]);

                }
                


            }
            System.out.println("enter 1 if you wanna continue");
            cont=scan.nextInt();
        }while(cont==1);
    }
}



