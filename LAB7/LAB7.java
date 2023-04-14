import java.io.*;
import java.util.*;
class LAB7{
    
    static float Mean(float[] array){
        float sum = 0;
        for(int i = 0;i<array.length;i++){
            sum = sum + array[i];
        }
        float mean = sum/array.length;
        return mean;
    }

    static float Median(float[] array){
        int x = array.length;
        float median;
        Arrays.sort(array);
        if (array.length % 2 == 0) {
            median = array[x];
            
        } else {
            median = (array[(x - 1)/2] + array[x/2]) / 2.0f;
        }
        return median;
    
    }

    static float Mode(float[] array){
        int maxcount = 0;
        float maxvalue = 0.0f;
        for(int i =0;i<array.length;i++){
            int count = 0;
            for(int j =0;j<array.length;j++){
                if(array[i] == array[j]){
                    count= count+1;
                }
            }
            if(count>maxcount){
                maxcount = count;
                maxvalue = array[i];
            }
        }
        
        return maxvalue;

    }
    static float Min(float[] array){
        float min=0;
        for (int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }

    static float Max(float[] array){
        float max=0;
        for(int i =0;i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    static void display(String[][] array,int ct,String filename){
            String[] first={"Parameters","Mean","Median","Mode","Max","Min"};
            String[] second={"Sepal Length",Mean(splen)+"",Median(splen)+"",Mode(splen)+"",Max(splen)+"",Min(splen)+""};
            String[] third={"Sepal Width",Mean(spwid)+"",Median(spwid)+"",Mode(spwid)+"",Max(spwid)+"",Min(spwid)+""};
            String[] fourth={"Petal Length",Mean(ptlen)+"",Median(ptlen)+"",Mode(ptlen)+"",Max(ptlen)+"",Min(ptlen)+""};
            String[] fifth={"Petal Width",Mean(ptwid)+"",Median(ptwid)+"",Mode(ptwid)+"",Max(ptwid)+"",Min(ptwid)+""};
            
            System.out.println(Arrays.toString(first));
            System.out.println(Arrays.toString(second));
            System.out.println(Arrays.toString(third));
            System.out.println(Arrays.toString(fourth));
            System.out.println(Arrays.toString(fifth));

            try{
                FileWriter write=new FileWriter(filename,true);
                write.write(Arrays.toString(first)+"\n");
                write.write(Arrays.toString(second)+"\n");
                write.write(Arrays.toString(third)+"\n");
                write.write(Arrays.toString(fourth)+"\n");
                write.write(Arrays.toString(fifth)+"\n");
                write.close();

            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            



            }
        


    public static void main(String[] args){
        // int[] iris-setosa = new int[6];
        // int[] iris-versicolor = new int[6];
        // int[] iris-verginica = new int[6];
        String[][] iris = new String[1024][5];
        String txt;
        int c=0;

        try{
            File file = new File("C:/Users/anusha ps/Downloads/Iris.csv");
            Scanner read = new Scanner(file);
            
            while(read.hasNextLine()){
                txt = read.nextLine();
                String[] arr = txt.split(",");
                iris[c][0] = arr[1];  //
                iris[c][1] = arr[2];
                iris[c][2] = arr[3];
                iris[c][3] = arr[4];
                iris[c][4] = arr[5];
                c = c+1;
                // System.out.println(arr[1]);
            }
           
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        float[] splen = new float[c];
        float[] spwid = new float[c];
        float[] ptlen = new float[c];
        float[] ptwid = new float[c];
        String[] speci = new String[c];
        for(int i =1;i<c;i++){
            splen[i-1]=Float.parseFloat(iris[i][0]);
            spwid[i-1]=Float.parseFloat(iris[i][1]);
            ptlen[i-1]=Float.parseFloat(iris[i][2]);
            ptwid[i-1]=Float.parseFloat(iris[i][3]);
            speci[i-1]=iris[i][4];
        }


        int t1=0;
        int t2=0;
        int t3=0;
        String[][] setosa=new String[1024][6];
        String[][] versicolor=new String[1024][6];
        String[][] virginica=new String[1024][6];
        for(int i=1;i<n;i++){
            if(iris[i][5].equals("Iris-setosa")){
                setosa[t1]=iris[i];
                t1++;
            }
            if(iris[i][5].equals("Iris-versicolor")){
                versicolor[t2]=iris[i];
                t2++;
            } 
            
            if(iris[i][5].equals("Iris-virginica")){
                virginica[t3]=iris[i];
                t3++;
            }

        }
        for(int k=0;k<t2;k++){
            for(int m=0;m<6;m++){
                System.out.print(versicolor[k][m]+" ");
            }
            System.out.println();
        }
        String file="summary.txt";
        System.out.println("Total Summary : ");
        display(iris,c-1,file);
        System.out.println("Setosa : ");
        display(setosa,t1-1,file);
        System.out.println("Versicolor : ");
        display(versicolor,t2-1,file);
        System.out.println("Virginica : ");
        display(virginica,t3-1,file);
        

    }
}