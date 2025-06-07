package challengeProblem;

public class WashingMachineMain {
    public static void main(String[] args) {

        WashingMachineProblem problem = new WashingMachineProblem();

        int[] machines = {2,0,10};

        System.out.println(problem.washingMachine(machines));
    }
}
