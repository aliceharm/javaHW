import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class hw4 {
    
    public static void main(String[] args) {

        try {
            //1.Сохранить в файл строку и загрузить из файла строку с выводом в консоль используя классы FileWriter и FileReader
            
            FileWriter fw = new FileWriter("1.txt");
            fw.append("Петров А. Н." +  " 23" + " М" + "\n");
            fw.append("Иванов Б. Б." + " 45" + " М" + "\n");
            fw.append("Сидоров В. В." + " 12" + " М" + "\n");
            fw.append("Сергеева К. В." + " 33" + " Ж" + "\n");
            fw.append("Федорова В. К." + " 34" + " Ж" + "\n");
            fw.flush();

            FileReader fr = new FileReader("1.txt");
            String text = "";
            while (fr.ready()){
                text += (char)fr.read();
            }

            //2.Загрузить из файла многострочный текст формата ФИО возраст и пол через пробелы. Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"
            
            String[] parts = text.split("\n");
            System.out.println(Arrays.toString(parts));

            //3.Загруженный и разбитый по строкам текст загрузить в подготовленные списки. Фамилии, имена, отчества, возрас и пол в отдельных списках.

            ArrayList<String> name = new ArrayList<>();
            ArrayList<String> lastname = new ArrayList<>();
            ArrayList<String> fatname = new ArrayList<>();
            ArrayList<Integer> age = new ArrayList<>();
            ArrayList<Boolean> sex = new ArrayList<>();
            for (int i = 0; i < parts.length; i++) {
                String[] tmp = parts[i].split(" ");
                lastname.add(tmp[0]);
                name.add(tmp[1]);
                fatname.add(tmp[2]);
                age.add(Integer.parseInt(tmp[3]));
                sex.add(tmp[4].contains("Ж")?false:true);                
            }
            //4.Отсортировать по возрасту используя дополнительный список индексов.

            List<Integer> sortedList = age.stream().sorted().collect(Collectors.toList());
            ArrayList<Integer> indexs = new ArrayList<>();

            for (int i = 0; i < age.size(); i++) {
                for (int j = 0; j < age.size(); j++) {
                     if (age.get(j) == sortedList.get(i)) {
                        indexs.add(j);
                    }
                }
            }

            StringBuilder rezult = new StringBuilder("");
            for (int j = 0; j < age.size(); j++) {
                int i = indexs.get(j);
                rezult.append(lastname.get(i)).append(" ").append(name.get(i)).append(fatname.get(i)).append(" ").append(age.get(i)).append("\n");
            }
            System.out.println(rezult);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}