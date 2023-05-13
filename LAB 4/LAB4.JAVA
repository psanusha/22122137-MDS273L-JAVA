import java.util.*;
class lab4aatry{
    static String acc_num;
    static String holder_name;
    static float acc_balance;

    static float[] deposit(Scanner scan) {
        float[] deparr = new float[4];
        deparr[0] = acc_balance;
        System.out.println("Enter the amount you want to deposit:");
        String depositStr = scan.next();
        float deposit = Float.parseFloat(depositStr);    
        deparr[1] = deposit;
        acc_balance = acc_balance+deposit;
        deparr[2] = 0; // Update this value accordingly if needed
        deparr[3] = acc_balance;
        return deparr;
    }

    

    static float[] withdraw(Scanner scan){
        float[] widarr = new float[4];
        widarr[0]=acc_balance;
        widarr[1]=0;
        System.out.println("enter the amount you want to withdraw:");
        String withdrawStr = scan.next();
        float withdraw = Float.parseFloat(withdrawStr);
        if(withdraw>acc_balance){
            System.out.println("insufiicient balance");
        }
        else{
            acc_balance = acc_balance-withdraw;
            widarr[3]=acc_balance;
        }
        return widarr;
    }
    

    static void transaction(float[][] arr, int count) {
        System.out.println("Acc Balance |   Deposit    | Withdrawal   |   New Balance");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%12.2f | ", arr[i][j]);
            }
            System.out.println();
        }
    }


    static void summary(){
        System.out.println("account number is"+acc_num);
        System.out.println("holder name is:"+holder_name);
        System.out.println("account balance is"+acc_balance);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float[][] arr = new float[1024][4];
        System.out.println("enter acc_num:");
        acc_num = scan.nextLine();
        System.out.println("enter holdername:");
        holder_name = scan.nextLine();
        System.out.println("enter acc_balance");
        acc_balance = Float.parseFloat(scan.nextLine());
        int input;
        int num=0;

        do{
            System.out.println("enter your choice:");
            System.out.println("1-->Deposite");
            System.out.println("2-->Withdraw");
            System.out.println("3-->Transaction");
            System.out.println("4-->Summary");
            int choice = scan.nextInt();
            

            switch(choice){
                case 1:
                float[] a=deposit(scan);
                arr[num] =a;
                num = num+1;
                
                break;

                case 2:
                float[] b = withdraw(scan);
                if(b.length==4){
                    arr[num] =b;
                    num = num+1;
                    break;

                }
                

                case 3:
                transaction(arr,num);
                break;

                case 4:
                summary();
                break;
            }
            System.out.println("enter 1 to continue");
            input = scan.nextInt();
        }while(input ==1);

   }
}