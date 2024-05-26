package dsa_lab_exam;

public class question4{
    int array[];
    int max;
    public question4(int value){
       max=value;
        array=new int[value];
        for(int i=0;i< array.length;i++){
            array[i]=max;
            for(int j=0;j< array.length;j++){
                if(array[j]>array[i]){}
            }
        }

    }

    public static void main(String[] args) {
        int[] array={1,4,2,3,5};

    }
}