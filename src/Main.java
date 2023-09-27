import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 7, 8, 9, 7, 6, 9, 6, 4, 8,};
        int count = 0;
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        for(int j = 0; j < array.length; j++)
        {
            numbers.add(array[j]);
        }
        ////Perkeliu i gala////
        while (count < 51)
        {
            int result = numbers.getFirst() + numbers.getLast();
            int x = 0;
            if(result <= 9 && result > 0)
            {
                numbers.addLast(result);
            }
            else if(result == 10)
            {
            numbers.addLast(1);
            }
            else if(result > 10)
            {
            numbers.addLast(1);
            numbers.addLast(result - 10);
            }
            System.out.println(numbers);

            x = Math.min(numbers.getLast(), numbers.getFirst());
            System.out.println(x);
            ///iskelti i pirma skaiciu////
            while(x > 0)
            {
                numbers.addFirst(numbers.getLast());
                numbers.removeLast();
                x--;
            }
            count++;
        }
        int[] sum = new int[numbers.size()];
        int suma = 0;
        for(int k = 0; k < sum.length; k++)
        {
            sum[k] = numbers.get(k);
            suma = suma + sum[k];
        }
        System.out.println(suma);
    }
}
