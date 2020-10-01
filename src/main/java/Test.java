import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Date;

/*
Для проверки теорий на практике
 */

public class Test {

    private static final String TASK_6 = "TASK_6";
    private static final String TASK_7 = "TASK_7";

    public static void main(String[] args) throws IOException {

        Integer [] n = {123645,-5587,7899,813,9067};

        taskSixAndTaskSeven(n,TASK_7);

    }
    public static void taskSixAndTaskSeven(Integer [] numbers, String TASK_NUMBER){

        int number = 0; //сюда запишем результат(если он не равен нулю то успех)

        for (int i = 0; i < numbers.length; i++) {
            boolean isOk = true;
            // выполняем деление числа на отдельные числа в случае если оно длиннее единицы
            if(numbers[i].toString().length() > 1){

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
            }
            if(isOk){
                number = numbers[i];
                break;
            }
        }
        if(number != 0){
            if (TASK_NUMBER.equals(TASK_6)){
                System.out.println("Первое число в котором все цифры идут потвозрастанию: " + number);
                return;
            }
            if (TASK_NUMBER.equals(TASK_7)){
                System.out.println("Первое число в котором ни одна цифра не повторяется: " + number);
                return;
            }
        }
        else {
            System.out.println("Такого числа нет в списке");
        }
    }
}
