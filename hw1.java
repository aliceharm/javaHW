import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

public class hw1 {
    public static void main(String[] arg) {

    //1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int i = new Random().nextInt(2000);
        System.out.println(Integer.toString(i)  + " - ваше выпавшее число");

    //2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n = Integer.toBinaryString(i).length() - 1;
        System.out.println( n + " -  старший бит");
    
    //3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        ArrayList<Integer> m1 = new ArrayList<Integer>(); 
        for (int j=i;j<Short.MAX_VALUE;j++){
            if (j % n == 0) {
                m1.add(j);
            }
        }
     //   System.out.println(m1 + " -  кратные числа");  
        
    //4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
    ArrayList<Integer> m2 = new ArrayList<Integer>(); 
    for (int j=Short.MIN_VALUE;j<i;j++){
        if (j % n != 0) {
            m2.add(j);
        }
    }
    //System.out.println(m2 + " -  НЕкратные числа");         

    }



    




    
}
