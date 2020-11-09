package com.company;

import weka.classifiers.Classifier;
import weka.classifiers.evaluation.Evaluation;
import weka.classifiers.functions.Logistic;
import weka.core.Instances;
import weka.core.converters.ArffLoader;

import java.io.File;
import java.io.IOException;

public class LoanML {
    Classifier classifier;
    int classAttribute;
    String trainFile,testFile,predictFile;
    String pmmlLoanModel;

    public LoanML(int classAttribute, String trainFile, String testFile, String predictFile) {
        this.classAttribute = classAttribute;
        this.trainFile = trainFile;
        this.testFile = testFile;
        this.predictFile = predictFile;
    }
    public Instances getData(String fileName,int classAtt){
        try {
            int classIndex=classAtt;
            ArffLoader loader=new ArffLoader();
            loader.setFile(new File(fileName));
            Instances dataSet=loader.getDataSet();
            dataSet.setClassIndex(classIndex);
            return dataSet;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
//    public void trainAndTestDataSet(){
//
//    }
    public void trainAndTestDataSet(){
        try {
            Instances trainDataSet = getData(trainFile, classAttribute);
            Instances testDataset = getData(testFile, classAttribute);
            classifier = new Logistic();
            classifier.buildClassifier(trainDataSet);
            System.out.println(classifier);
            Instances testingDataSet=getData(testFile,classAttribute);
            Evaluation eval = new Evaluation(trainDataSet);
            eval.evaluateModel(classifier, testDataset);
//            System.out.println("Logistic Evaluation");
            System.out.println(eval.toSummaryString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
