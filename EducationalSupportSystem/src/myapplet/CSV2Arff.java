package myapplet;
import weka.core.Instances;
 import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;
 
 import java.io.File;
public class CSV2Arff {
    public static String output=null;
public static void main(String[] args) throws Exception {
    output="output1.arff";
     CSVLoader loader = new CSVLoader();
     loader.setSource(new File("E:\train.csv"));
     Instances data = loader.getDataSet();

     ArffSaver saver = new ArffSaver();
     saver.setInstances(data);
     saver.setFile(new File("D:/dataset1/output.arff"));
     saver.setDestination(new File("D:/dataset1/"+output));
     saver.writeBatch();
    }
}
