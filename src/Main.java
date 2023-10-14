public class Main{
    public static void main(String[] args)
    {
        int[] massive = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        System.out.print("Каким был в начале :        ");
        showout(massive);

        sort(massive);

        System.out.print("Каким стал после сортировки наш массив: ");
        showout(massive);
    }
    private static void sort(int[] massive)
    {
        boolean isAlreadySorted;
        do
        {
            isAlreadySorted = sort(massive, 0) & sort(massive, 1);
        } while (!isAlreadySorted);
    }
    private static boolean sort(int[] massive, int startIndex)
    {
        boolean isAlreadySorted = true;
        for (int index = startIndex; index < massive.length - 1; index += 2)
        {
            if (massive[index] > massive[index + 1])
            {
                isAlreadySorted = false;
                swap(massive, index, index + 1);
            }
        }
        return isAlreadySorted;
    }
    private static void swap(int[] massive, int leftIndex, int rightIndex)
    {
        massive[leftIndex] ^= massive[rightIndex];
        massive[rightIndex] ^= massive[leftIndex];
        massive[leftIndex] ^= massive[rightIndex];
    }
    private static void showout(int[] massive)
    {
        for (int index = 0; index < massive.length - 1; ++index)
        {
            System.out.print(massive[index] + ", ");
        }
        System.out.println(massive[massive.length - 1]);
    }
    private static void bubbleSort(int[] massive)
    {
        boolean isAlreadySorted = false;
        for (int i = 0; i < massive.length - 1 && !isAlreadySorted; i++)
        {
            isAlreadySorted = true;
            for (int j = 0; j < massive.length - i - 1; j++)
            {
                if (massive[j] > massive[j + 1])
                {
                    swap(massive, j, j + 1);
                    isAlreadySorted = false;
                }
            }
        }
    }
}