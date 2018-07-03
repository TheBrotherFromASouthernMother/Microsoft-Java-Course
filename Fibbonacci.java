public class Fibbonacci {
    public static int getNthFibonnaciNumber(int n) {
        int[] sequence = new int[n];
        sequence[0] = 1;
        sequence[1] = 1;
        int current;
        System.out.println(sequence[0]);
        System.out.println(sequence[1]);
        for (int i = 2; i < n; i ++) {
            current = sequence[i-1] + sequence[i-2];
            sequence[i] = current;
            System.out.println(sequence[i]);
        }
        return sequence[n -1];
    }

    public static int geNthFibbonacciNumberByRecursion(int[] fibSequence, int target, int currentIteration) {
        if (currentIteration < 3) {
            currentIteration = 3;
        }

        if (fibSequence[1] < 1) {
            fibSequence[0] = 1;
            fibSequence[1] = 1;
        } else if (fibSequence.length != 2) {
            return -1;
        }

        int next = fibSequence[0] + fibSequence[1];
        fibSequence[0] = fibSequence[1];
        fibSequence[1] = next;
        if (currentIteration == target) {
            return n[1];
        } else {
            return geNthFibbonacciNumberByRecursion(fibSequence, target, currentIteration + 1);
        }
    }

    public static void main(String []args) {
        int[] sequence = {1, 1};
//        getNthFibonnaciNumber(10);
        System.out.println(geNthFibbonacciNumberByRecursion(sequence,  11, 1));
    }
}
