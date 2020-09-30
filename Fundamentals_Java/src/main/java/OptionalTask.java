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

    public static void main(String[] args) throws IOException {
        System.out.println("Укажите над каким количеством чисел вы хотите произвести вычислительные операции?");
        int n = Integer.parseInt(reader.readLine());
        Integer [] numbers = new Integer[n];
        System.out.println("---------------------------");
        System.out.println("Теперь вводите числа:");

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("\nЗаданные числа: " + Arrays.toString(numbers));
        theLongestAndTheShortest(numbers);


    }
    /*
    1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
     */
    public static void theLongestAndTheShortest(Integer [] numbers){
        if(numbers.length <= 0){
            System.out.println("Выполнение операций невозможно");
            return;
        }

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
        //Задел к заданию 2
        Collections.reverse(numbersLength);

        System.out.println("Самое длинное число: " + numbersLength.get(numbersLength.size()-1)[1]
                + " его длинна: " + numbersLength.get(numbersLength.size()-1)[0]);
        System.out.println("Самое короткое число: " + numbersLength.get(0)[1]
                + " его длинна: " + numbersLength.get(0)[0]);

    }


}
