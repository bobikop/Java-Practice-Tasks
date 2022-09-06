package Arrays;

public class Array_FirstUniqueElement {

/*
    write a program that can find the first duplicated element from the array
     */


    public static int firstDuplicatedElement(int[] array){

        int firsDuplicatedElement = 0;

        for (int each : array){
            int frequency = 0;
            for (int each2 : array){
                if (each == each2){
                    frequency++;
                }

            }
            if (frequency>1){
                firsDuplicatedElement = each;
            }
        }
        return firsDuplicatedElement;
    }

    public static int firstUniqueElement(int[] array2){

        int firstUniqueElement = 0;

        for( int each : array2){
            int frequency1 = 0;
            for (int each2 : array2){
                if (each == each2) {
                    frequency1++;
                }
                }
                if(frequency1 == 1){
                    firstUniqueElement = each;
                }
            }
            return firstUniqueElement;

    }



    public static void main(String[] args) {
        int[] arr = {8, 7, 7, 2, 5, 8, 3, 8, 1, 5, 3, 1};

        System.out.println(firstDuplicatedElement(arr));
        System.out.println(firstUniqueElement(arr));

//
//        String name = "manuela";
//        String[] name2 = name.split(" ");
//        System.out.println(Arrays.asList(name2));



    }

}
