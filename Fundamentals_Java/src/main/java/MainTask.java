/*
       1. Приветствовать любого пользователя при вводе его имени через командную строку.
       2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
       3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
       4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение)
       и вывести результат на консоль.
       5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
       Осуществить проверку корректности ввода чисел.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Random;

public class MainTask {

    private static String name;

    public static void main(String[] args) throws IOException, InterruptedException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        sayHello();
        viceVersaArguments();
        printRandomNumbers(5);
        numbersSum();
        System.out.println(defineMonth());
    }
    /*
                     Task #1
     */
    public static void sayHello() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите свое имя:");
         name = reader.readLine();
        System.out.println(name + ", мы бесконечно рады видеть вас в нашей программе!!!!\n" +
                "Впереди вас ждет много интересного:)");

    }

    /*
                     Task #2
     */
    public static void viceVersaArguments() throws IOException, InterruptedException {
        System.out.println("И так, " + name + ", Начнем!\nВводите все что хотите в столбик" +
                " пока не надоест," +
                " потом мы переврнем все это кверхтормашками." +
                "\nА когда надоест нажми ENTER в пустой строке");
         ArrayList<String> words = new ArrayList<String>();
         while (true){
             BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             String argument = reader.readLine();
             if(argument.isEmpty()) break;

             words.add(0,argument);
         }
        for (String word: words){
            System.out.println(word);
        }
        Thread.sleep(1500);
        System.out.println(" \nАха-ха-ха!!! Ну как !? Правда весело!?\n");
    }
    /*
                     Task #3
     */

    public static void printRandomNumbers( int amount ) throws InterruptedException {
        Thread.sleep(1500);
        System.out.println(name + "! А теперь давайте немного отдохнем! И просто посмотрим как " +
                "выводятся случайные числа в строчку и столбик");

        System.out.println("В столбик");
        Random rnd = new Random();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < amount; i++) {
            numbers.add(rnd.nextInt(100));
            Thread.sleep(1500);
            System.out.println(numbers.get(i));
        }
        System.out.println("В строчку");
        for (Integer number: numbers){
            Thread.sleep(1500);
            System.out.print(number + " ");
        }
        System.out.println("\n");
    }

    /*
                     Task #4
     */
    public static void numbersSum() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("И так, " + name + ",а теперь давайте сосчитаем общую сумму всех чисел, " +
                "которые вы введете в столбик.\n" +
                "Когда чисел будет достаточно - нажми ENTER в пустой строке.");

            Thread.sleep(500);


        int sum = 0;
        while (true) {
            String stringNumber = reader.readLine();


            if (stringNumber.isEmpty()) break;

            try {
                sum += Integer.parseInt(stringNumber);
            }catch (RuntimeException e){
                System.out.println("Упс! " + name + ", " + name +  "! Вводить надо числа и без пробелов," +
                        " попробуй еще раз!(последнея строка не пойдет в зачет, имей в виду)");
            }
        }
        System.out.println("Сумма всех твоих чисел равна: " + sum);
    }
    /*
                         Task #5
         */
    public static Month defineMonth() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Month[] months = Month.values();
        int number = months.length;

        System.out.println(name + ", введите номер и увидите соответствующий ему месяц: ");

        do{
            try {
                number = Integer.parseInt(reader.readLine());
                if(number <= 0 || number > months.length ){
                    System.out.println("А " + name + " помнит сколько месяцев в году? Попробуй еще раз");
                }

            }catch (RuntimeException e){
                System.out.println("Упс! " + name + ", " + name +  "! Вводить надо числа и без пробелов," +
                        " попробуй еще раз!");
            }

        } while (number <= 0 || number > months.length ) ;

        return months[number - 1];
    }
}
