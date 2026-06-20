import java.util.*;

class TestingDataSet{
    ArrayList<TrainingData> testDataset;
    
    TestingDataSet(){
        testDataset = new ArrayList<>();
        testDataset.add(new TrainingData(new double[]{0.22, 0.48, 0.38},0));
        testDataset.add(new TrainingData(new double[]{0.35, 0.57, 0.47},0));
        testDataset.add(new TrainingData(new double[]{0.65, 0.74, 0.63},1));
        testDataset.add(new TrainingData(new double[]{0.85, 0.86, 0.79},1));
        testDataset.add(new TrainingData(new double[]{0.95, 0.91, 0.87},1));
    }
    
    public ArrayList<TrainingData> getData(){
        return testDataset;
    }
}