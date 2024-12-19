
public class SelectionSort {
    public static void printArray(int arr[]) {
        System.out.println("After Sorting Array Is-");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }  
    public static void main(String[] args) {

        int arr[]={7,8,3,1,2};
        System.out.println("Given Array IS--");
        for(int i=0; i<arr.length;i++){
        System.out.print( arr[i]+ " ");
        }
        System.out.println();
        //Selection Sort

        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest] > arr[j]){
                    smallest =j;
                }
            }

            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;

        }

        printArray(arr);


    }


}
