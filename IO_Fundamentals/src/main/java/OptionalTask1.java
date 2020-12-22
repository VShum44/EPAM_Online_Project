import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class OptionalTask1 {
          static File file = new File("data/data1.txt");
          static Random rnd = new Random();
          static int size = 20;

    public static void main(String[] args) {

        try ( FileWriter writer = new FileWriter(file)){

            for (int i = 0; i < size ; i++) {
                writer.write(String.valueOf(rnd.nextInt(100)) + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String s = bufferedReader.readLine();
            String [] arrString = s.split(" ");
            System.out.println("String Array: " + Arrays.toString(arrString));

            int [] arrInt = new int[arrString.length];

            for (int i = 0; i <arrInt.length ; i++) {
                arrInt[i] = Integer.parseInt(arrString[i]);
            }
            System.out.println("Int Array: " + Arrays.toString(arrInt));

            Arrays.sort(arrInt);
            System.out.println("Sorted Int Array: " + Arrays.toString(arrInt));

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (int i : arrInt) {
                bufferedWriter.write(i + " ");
            }
         bufferedWriter.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
