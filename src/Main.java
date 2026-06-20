import java.util.*;

public class Main {

    public static void main(String[] args) {

        MLP mlp = new MLP();
        TrainingDataSet trainDataset = new TrainingDataSet();
        mlp.train(trainDataset.getData());

        TestingDataSet testDataset = new TestingDataSet();
        EvaluationMetrics metrics = new EvaluationMetrics();
        metrics.evaluate(mlp, testDataset.getData());

        System.out.println();
        System.out.println("===== MODEL EVALUATION =====");
        System.out.println("\nConfusion Matrix");
        metrics.printConfusionMatrix();

        System.out.println("\nAccuracy  : " + (metrics.getAccuracy() * 100) + "%");
        System.out.println("Precision : " + metrics.getPrecision());
        System.out.println("Recall    : " + metrics.getRecall());
        System.out.println("F1 Score  : " + metrics.getF1Score());

        Scanner scanner = new Scanner(System.in);
        String continueChoice; // Variable to store user's choice to continue or exit

        // The do-while loop starts here, only wrapping the interactive prediction phase
        do {
            System.out.println();
            System.out.println("===== STUDENT PASS / FAIL PREDICTION =====");

            System.out.print("Enter Study Hours (normalized): ");
            double studyHours = scanner.nextDouble();

            System.out.print("Enter Attendance (normalized): ");
            double attendance = scanner.nextDouble();

            System.out.print("Enter Assignment Score (normalized): ");
            double assignmentScore = scanner.nextDouble();
            
            studyHours = studyHours / 10.0;
            attendance = attendance / 100.0;
            assignmentScore = assignmentScore / 100.0;

            double prediction = mlp.predict(new double[]{studyHours, attendance, assignmentScore});

            System.out.println();
            System.out.println("Prediction Value : " + prediction);
            System.out.printf(
    "Pass Probability : %.2f%%\n",
    prediction * 100
);

            if (prediction >= 0.5) {
                System.out.println("Predicted Result : PASS");
            } else {
                System.out.println("Predicted Result : FAIL");
            }

            // Ask the user if they want to run another prediction
            System.out.print("\nDo you want to predict another student? (yes/no): ");
            continueChoice = scanner.next();

        } while (continueChoice.equalsIgnoreCase("yes")); // Loop continues as long as the user types "yes"

        System.out.println("\nExiting prediction system. Goodbye!");
        scanner.close();
    }
}
