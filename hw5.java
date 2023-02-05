import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class hw5 {
    public static void main(String[] args) {
//1/Создать словарь HashMap. Обобщение <Integer, String>.
Map<Integer, String> diccol = new HashMap<>();

//2/Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
diccol.put(1000,"красный");
diccol.put(1001,"оранжевый");
diccol.put(1002,"желтый");

//3/Изменить значения дописав восклицательные знаки.
diccol.replaceAll((a, b) -> b + "!");
System.out.println(diccol);

// дозаполним для сравнения
Random rnd1=new Random();
for (int i = 1; i < 1000_000; i++) {
    int key=rnd1.nextInt(10000000);

    while (diccol.containsKey(key)==true) {
        key=rnd1.nextInt(10000000);
    }

    diccol.put(key, "что-то");
}
System.out.println(diccol.size());

//4/*Создать TreeMap, заполнить аналогично.
TreeMap<Integer, String> treed = new TreeMap<>();
treed.put(1000,"красный");
treed.put(1001,"оранжевый");
treed.put(1002,"желтый");
//5/*Увеличить количество элементов до 1000 случайными ключами и общей строкой.
Random rnd=new Random();
for (int i = 1; i < 1000000; i++) {
    int key=rnd.nextInt(10000000);

    while (treed.containsKey(key)==true) {
        key=rnd.nextInt(10000000);
    }

    treed.put(key, "общая строка");
}
System.out.println(treed.size());

//6/**Сравнить время последовательного и случайного перебора тысячи элементов словарей.
long start1 = System.currentTimeMillis();
        Iterator<String> iterator = diccol.values().iterator();
        while (iterator.hasNext()){
            String tmp= iterator.next();

        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);

        long start2 = System.currentTimeMillis();
        Iterator<String> iterator1 = treed.values().iterator();
        while (iterator1.hasNext()){
            String tmp= iterator1.next();
        }
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);

    }
    
}
