import java.util.*;

class LAB3 {
    static float Mean(int array[]) {
        int sum = 0;
        float mean;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        mean = (float)sum / array.length;
        return mean;
    }

    
    

    static float Median(int array[]) {
    float median;
    int n = array.length;
    for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if (array[j] > array[j+1]) {
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }
    int x = n / 2;
    if (n % 2 != 0) {
        median = array[x];
    } else {
        median = (array[x - 1] + array[x]) / 2.0f;
    }
    return median;
}


static float Mode(int[] array){
    int maxcount=0;
    int maxvalue=0;
    for(int i =0;i<array.length;i++){
        int count=1;
        for(int j=0;j<i;j++){
            if(array[i]==array[j]){
                count=count+1;
            }
            

        }
        if(count>maxcount){
            maxvalue=array[i];
            maxcount=count;
        }
        
    }return maxvalue;

}
public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int size = scan.nextInt();
    int[] arr= new int[size];
    int input;

    System.out.println("Enter the values:");
    for(int i =0;i<arr.length;i++){
        arr[i]=scan.nextInt();
    }

    
    do{
        System.out.println("Enter your choice:");
        System.out.println("1-->Mean");
        System.out.println("2-->Median");
        System.out.println("3-->Mode");
        System.out.println("4-->Display all");
        
    int ch= scan.nextInt();
    switch(ch){
        case 1:
        System.out.println("Mean is "+Mean(arr));
        break;

        case 2:
        System.out.println("Median is "+Median(arr));
        break;

        case 3:
        System.out.println("Mode is"+Mode(arr));
        break;

        case 4:
        System.out.println("Mean is " +Mean(arr)+"\nMedian is " +Median(arr)+"\nMode is " +Mode(arr));
        break;

    }System.out.println("Enter 1 to continue");
    input=scan.nextInt();
    


    }while(input==1);

  }
}
            

    