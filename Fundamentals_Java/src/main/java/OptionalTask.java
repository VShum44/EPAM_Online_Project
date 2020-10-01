/*
Для успешного выполнения задания достаточно реализовать 2-4 пункта.
Задание. Ввести n чисел с консоли.
1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
2.     Вывести числа в порядке возрастания (убывания) значений их длины.
3.     Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
4.     Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
5.     Найти количество чисел, содержащих только четные цифры,
       а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
6.     Найти число, цифры в котором идут в строгом порядке возрастания.
       Если таких чисел несколько, найти первое из них.
7.     Найти число, состоящее только из различных цифр.
       Если таких чисел несколько, найти первое из них.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class OptionalTask {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final String TASK_6 = "TASK_6";
    private static final String TASK_7 = "TASK_7";

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Укажите над каким количеством чисел вы хотите произвести вычислительные операции?");
        int n = Integer.parseInt(reader.readLine());
        Integer [] numbers = new Integer[n];
        System.out.println("---------------------------");
        System.out.println("Теперь вводите числа:");

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("\nЗаданные числа: " + Arrays.toString(numbers));
        Thread.sleep(1000);
        theLongestAndTheShortest(numbers);
        taskSixAndTaskSeven(numbers,TASK_6);
        taskSixAndTaskSeven(numbers,TASK_7);

    }
    /*
                                   Задание 1 и 2
                                      Задание 1
             1.Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

     */
    public static void theLongestAndTheShortest(Integer [] numbers) throws InterruptedException {
        if(numbers.length <= 0){
            System.out.println("Выполнение операций невозможно");
            return;
        }

        System.out.println("Задание 1");

        System.out.println("Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.");

        List<int []> numbersLength = new ArrayList<int[]>();

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i].toString().startsWith("-")){
                numbersLength.add(new int []{ numbers[i].toString().length() - 1, numbers[i]});
            }else {
                numbersLength.add(new int []{ numbers[i].toString().length(), numbers[i]});
            }
        }

        numbersLength.sort(new Comparator<int []>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        }) ;

        System.out.println("Самое длинное число: " + numbersLength.get(numbersLength.size()-1)[1]
                + " его длинна: " + numbersLength.get(numbersLength.size()-1)[0]);
        System.out.println("Самое короткое число: " + numbersLength.get(0)[1]
                + " его длинна: " + numbersLength.get(0)[0]);
        Thread.sleep(2000);
        System.out.println("--------------------------------------");
        /*
                                  Задание 2
                  Вывести числа в порядке возрастания (убывания) значений их длины.
         */
        System.out.println("Задание 2");
        System.out.println("Теперь выводим числа в порядке возрастания (убывания) значений их длины\n");
        System.out.println("В порядке возрастания значений их длины");
        Thread.sleep(2000);
        for (int i = 0; i < numbersLength.size(); i++) {
            System.out.println(numbersLength.get(i)[1]);
        }
        System.out.println("\nВ порядке убывания значений их длины");
        Thread.sleep(2000);
        for (int i = numbersLength.size() - 1; i >= 0; i--) {
            System.out.println(numbersLength.get(i)[1]);
        }
        System.out.println("");
    }

    /*                     Задание 6 и 7
          6. Найти число, цифры в котором идут в строгом порядке возрастания.
             Если таких чисел несколько, найти первое из них.
          7. Найти число, состоящее только из различных цифр.
             Если таких чисел несколько, найти первое из них.
     */
    public static void taskSixAndTaskSeven(Integer [] numbers, String TASK_NUMBER){

        int number = 0; //сюда запишем результат(если он не равен нулю то успех)

        for (int i = 0; i < numbers.length; i++) {
            boolean isOk = true;
            // выполняем деление числа на отдельные числа в случае если оно длиннее единицы
            if(numbers[i].toString().length() <= 1){continue;}

                char [] splitNumber = numbers[i].toString().toCharArray();

                for (int j = 0; j < splitNumber.length -1; j++) {
                    //Задание 6
                    //Проверяем на строгую очередность возрастания
                    // (одинаковые цифры на соседних позициях тоже идут в зачет возрастания)
                    if(TASK_NUMBER.equals(TASK_6))
                        if(Integer.valueOf(splitNumber[j]) > Integer.valueOf(splitNumber[j + 1])){
                            isOk = false;
                            break;
                        }
                    //Задание 7
                    //Проверяем есть ли одинаковые цифры в числе
                    if(TASK_NUMBER.equals(TASK_7))
                        for (int k = j + 1; k < splitNumber.length ; k++) {
                            if(Integer.valueOf(splitNumber[j]) == Integer.valueOf(splitNumber[k])){
                                isOk = false;
                                break;
                            }
                        }
                }

            if(isOk){
                number = numbers[i];
                break;
            }
        }
        if(number != 0){
            if (TASK_NUMBER.equals(TASK_6)){
                System.out.println(TASK_6);
                System.out.println("Первое число в котором все цифры идут в порядке возрастания: " + number);
                return;
            }

            if (TASK_NUMBER.equals(TASK_7)){
                System.out.println(TASK_7);
                System.out.println("Первое число в котором ни одна цифра не повторяется: " + number);
                return;
            }
        }
        else {
            if(TASK_NUMBER.equals(TASK_6)) {
                System.out.println(TASK_6);
                System.out.println("Нет числа в котором все цифры идут в порядке возрастания: ");
                return;
            }
            if(TASK_NUMBER.equals(TASK_7)) {
                System.out.println(TASK_6);
                System.out.println("Нет числа в котором ни одна цифра не повторяется: ");
                return;
            }
        }
    }

}
