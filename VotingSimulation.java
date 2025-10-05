class MinorAgeException extends Exception {
    public MinorAgeException(String message) {
        super(message);
    }
}

class VotingMachine {

    public void castVote(int age) throws MinorAgeException {
        if (age < 18) {
            throw new MinorAgeException("Voter is not eligible to vote.");
        } else {
            System.out.println("Vote cast successfully.");
        }
    }
}

public class VotingSimulation {
    public static void main(String[] args) {
        VotingMachine machine = new VotingMachine();

        try {
            machine.castVote(16);
        } catch (MinorAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println();

        try {
            machine.castVote(25);
        } catch (MinorAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
