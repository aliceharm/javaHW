import java.nio.file.NotDirectoryException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import javax.swing.text.AttributeSet.ColorAttribute;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;

public class hw3 {
    public static void main(String[] args) {
        //1.Создать новый список, добавить несколько строк и вывести коллекцию на экран.

        List<String> colorlist = new ArrayList<>();
        colorlist.add("красный");
        colorlist.add("оранжевый");
        colorlist.add("желтый");
        colorlist.add("зелёный");
        colorlist.add("голубой");
        colorlist.add("синий");
        System.out.println(colorlist);
          
//2.Итерация всех элементов списка цветов и добавления к каждому символа '!'.

        ListIterator<String> newList = colorlist.listIterator();
        while (newList.hasNext()) {
            newList.set(newList.next().concat("!"));
        }
        System.out.println(colorlist);

//3.Вставить элемент в список в первой позиции.

        colorlist.add(0, "фиолетовый");
        System.out.println(colorlist);

//4.Извлечь элемент (по указанному индексу) из заданного списка.

        System.out.println(colorlist.get(2));

//5.Обновить определенный элемент списка по заданному индексу.

        System.out.println(colorlist.set(1, "бордовый!"));
        System.out.println(colorlist); 

//6.Удалить третий элемент из списка.

        colorlist.remove(2);
        System.out.println(colorlist);

//7.Поиска элемента в списке по строке.

        System.out.println(colorlist.contains("фиолетовый"));

//8.Создать новый список и добавить в него несколько елементов первого списка.

        List<String> listt = new ArrayList<>();
        for (int i = 0; i < colorlist.size();){
            listt.add(colorlist.get(i));  
            i += 2;         
        }
        System.out.println(listt);

//9.Удалить из первого списка все элементы отсутствующие во втором списке.

for (int i = 0; i < colorlist.size(); i++)
    if (listt.contains(colorlist.get(i)) == false)
        colorlist.remove(i);

System.out.println(colorlist);

//10.*Сортировка списка.

Collections.sort(listt);
System.out.println(listt);
    }
}
