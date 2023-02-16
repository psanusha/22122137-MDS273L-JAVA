import java.util.*;

class LAB3 {
    static float Mean(int array[]) {
        int sum = 0;
        float mean;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        mean = (float)sum / array.length;
        System.out.println(mean);
        return mean;
    }

    static float Median(int array[]) {
        float median;
        int x = array.length / 2;
        Arrays.sort(array);
        if (array.length % 2 != 0) {
            median = array[x];
        } else {
            median = (array[x - 1] + array[x]) / 2.0f;
        }
        return median;
    }

    static int Mode(int[] array) {
        int maxvalue = 0;
        int maxcount = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > maxcount) {
                maxcount = count;
                maxvalue = array[i];
            }
        }
        return maxvalue;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the array: ");
        size = Integer.parseInt(scan.nextLine());
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the values in the array" + i + ":");
            array[i] = Integer.parseInt(scan.nextLine());
        }
        int ch;
        do {
            System.out.println("Choose your Operation\n1. Mean\n2. Median\n3. Mode\n4. All 3");
            int choice = Integer.parseInt(scan.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("The mean of the array element is: " + Mean(array));
                    break;
                case 2:
                    System.out.println("The median is: " + Median(array));
                    break;
                case 3:
                    System.out.println("The mode is: " + Mode(array));
                    break;
                case 4:
                    System.out.println("The mean is  :" + Mean(array) + "\nThe median is  :" + Median(array) + "\nThe mode is :" + Mode(array));
                    break;
                default:
    System.out.println("Invalid choice!!!");


       }
       System.out.println("Press 1 continue: ");
       ch=Integer.parseInt(scan.nextLine());
    }while(ch==1);
    
    
    
}
    }

            















// import java.util.*;
// class lab3{
//     static float mean(int[] array){
//         int sum=0;
//         float mean;
//         for (int i=0;i<array.length;i++){
//             sum+=array[i];
//         }
//         float a=array.length;
//         float s=sum;
//         mean=s/a;
//         return mean;
//     }
//     static float median(int[] array){
//         int x;
//         int a;
//         float median;
//         float y;
//         if (array.length%2!=0){
//             x=(array.length/2);
//             median = array[x];
//         }else{
//             x=(array.length/2);
//             y=(array[x-1]+array[x]);
//             median=y/2;
            
//         }
//         return median;   
// }



// public static void main(String[] args){
//         Scanner scan=new Scanner(System.in);
//         int k;
//         System.out.println("Enter the number of values you want in the array : ");
//         k=Integer.parseInt(scan.nextLine());
//         int[] array=new int[k];
//         for (int i=0;i<k;i++){
//             System.out.println("Enter the value for the index "+i+" element of the array : ");
//             array[i]=Integer.parseInt(scan.nextLine());
//         }
//         // float h=median(array);
//         // System.out.println(h);

// }
// }