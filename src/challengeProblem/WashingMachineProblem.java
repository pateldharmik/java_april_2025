package challengeProblem;

public class WashingMachineProblem {

    public int washingMachine(int[] machines) {
        int sum = 0;
        int maxMoves = 0;

        for (int i = 0; i < machines.length; i++) {
            sum = sum + machines[i];
        }

        if (sum % 3 == 0) {
            int elementsInEachMachine = sum / machines.length;
            int imbalance = 0;

            for (int i = 0; i < machines.length; i++) {
                machines[i] = elementsInEachMachine - machines[i];
                imbalance = imbalance + machines[i];

                maxMoves = Math.max(maxMoves, Math.max(Math.abs(imbalance), machines[i]));
            }
        } else {
            return -1;
        }
        return maxMoves;
    }
}
