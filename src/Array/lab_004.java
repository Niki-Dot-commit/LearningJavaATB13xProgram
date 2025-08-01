package Array;

import java.util.Arrays;

public class lab_004 {
    public static void main(String[] args) {
        int[] marks ={ 51, 61,45,86,34,78,89};
        System.out.println("-------");
        for(int i=0 ; i < marks.length ;i++){
            System.out.println(marks[i]);
        }
        //        System.out.println(marks); // Ref Address
        Arrays.sort(marks);
        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);
        }
    }
    }
