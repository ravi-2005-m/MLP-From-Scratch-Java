import java.util.*;

public class EvaluationMetrics {
    private int tp;
    private int tn;
    private int fp;
    private int fn;
    
    public void evaluate(
    MLP mlp,
    ArrayList<TrainingData> testDataset){
        tp = tn = fp = fn = 0;
        for(TrainingData row : testDataset){
            double prediction = mlp.predict(row.inputs);
            int predictedClass = prediction >= 0.5 ? 1 : 0;
            int actualClass = (int)row.expectedOutput;
            
            if(predictedClass==1 && actualClass==1){
                tp++;
            }else if(predictedClass==1 && actualClass==0){
                fp++;
            }else if(predictedClass==0 && actualClass==0){
                tn++;
            }else{
                fn++;
            }
        }
    }
    
    public double getAccuracy() {
        return (double)(tp + tn) / (tp + tn + fp + fn);
    }
    
    public double getPrecision() {
        return (double) tp / (tp + fp);
    }
    
    public double getRecall() {
        return (double) tp / (tp + fn);
    }
    
    public double getF1Score() {
        double precision = getPrecision();
        double recall = getRecall();
    
        return 2 * precision * recall / (precision + recall);
    }
    
    public void printConfusionMatrix(){

    System.out.println();

    System.out.println(
        "         Actual"
    );

    System.out.println(
        "         0    1"
    );

    System.out.println(
        "Pred 0   " +
        tn + "    " +
        fn
    );

    System.out.println(
        "Pred 1   " +
        fp + "    " +
        tp
    );
}

}
