

public class hw2 {
    
    public static void main(String[] arg) {
//1.Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
String strmain = "ищем";
System.out.println("ищем вхождение: " + strmain.contains("ищ"));

//2.Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
StringBuilder str2 = new StringBuilder("мещи");
System.out.println("ищем вращение: " + strmain.equals(str2.reverse().toString()));

//3.*Напишите программу, чтобы перевернуть строку с помощью рекурсии
StringBuilder build2 = new StringBuilder("Hello");
System.out.println(build2.reverse());   

//4.Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().

StringBuilder builder = new StringBuilder("");
int x = 57;
int y = 3;
builder.append(y).append(" + ").append(x).append("=").append(x+y).append("\n")
.append(y).append(" - ").append(x).append("=").append(y-x).append("\n")
.append(x).append(" * ").append(y).append("=").append(x*y).append("\n")
.append(x).append(" / ").append(y).append("=").append(x/y);  //а тут такие переменные
        
System.out.println(builder.toString());

//5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().


int index = builder.indexOf("=");

builder.deleteCharAt(index).insert(index, "равно").toString();


System.out.println(builder.toString());

//6.Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
System.out.println(builder.toString().replaceAll(" = ", " равно ")); // проще так=)
int ind = builder.indexOf("=", 0);
System.out.println(builder.replace(ind, ind+3, " равно "));
 

//7. Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
long begin = System.currentTimeMillis();
StringBuilder builder2 = new StringBuilder("");
for (int i=0;i<1000;i++){
    builder2.append("d");
  } 

long end = System.currentTimeMillis();
System.out.println(end - begin);

long begin2 = System.currentTimeMillis();
String strr = "";
for (int i=0;i<1000;i++){
    strr += "d";
  } 

long end2 = System.currentTimeMillis();
System.out.println(end2 - begin2);



}
}