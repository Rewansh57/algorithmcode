// time complexity of o(n^2
//
public class selectionsort{
    public static void main(String[] args) {
        int [] array ={4,5,3,2,7,8,3,4,6,34,56,76,56,38888,3,5,6,54,65,7,35,46,5,65,7,68,768,7,9,8};
       long start= System.nanoTime();
        selection_sort(array);
        long end=System.nanoTime();

        for (int i :array){
            System.out.println(i);
        }
        System.out.println(end -start);


    }
    public static void selection_sort(int [] array){
        for (int i =0;i<array.length-1;i++){
            int min=i;

            for (int j=i+1;j<array.length;j++ ){
                if (array[min]>array[j]){
                    min=j;

                }

            }
            int temp=array[i];
             array[i]=array[min];
             array[min]=temp;


        }
    }
}

