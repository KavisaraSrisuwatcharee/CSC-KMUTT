package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	    String trainingFile;
	    String testingFile;
	    String PredictFile;

	    trainingFile="creditRisk_Clean_NoCreditHistory_testing.arff";
		testingFile="creditRisk_Clean_NoCreditHistory_training.arff";
	    PredictFile="predict.arff";
	    LoanML loan=new LoanML(9,trainingFile,testingFile,PredictFile);
	    loan.trainAndTestDataSet();
	    loan.predictDataSet();
    }
}
