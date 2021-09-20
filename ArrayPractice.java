public class ArrayPractice {
    public static void main(String[] args) {
        int[] arr=new int[4];
        System.out.println(arr.length);
        System.out.println(arr[0]);
        arr[0]=9;
        arr[1]=49;
        arr[2]=89;
        arr[3]=90;
        for(int index=0;index<=arr.length-1;index++){
            System.out.println(arr[index]);
        }
        int arr1[]={6,9,45,89};
        int arr2D[][]=new int[2][3];
        arr2D[0][0]=9;
    }
}
