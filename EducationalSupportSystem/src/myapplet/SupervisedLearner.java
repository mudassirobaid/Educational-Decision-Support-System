package Main;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public abstract class SupervisedLearner {

		public abstract void train(Matrix features, Matrix labels) throws Exception;

	public abstract void predict(double[] features, double[] labels) throws Exception;

	public double measureAccuracy(Matrix features, Matrix labels, Matrix confusion) throws Exception
	{
		if(features.rows() != labels.rows())
			throw(new Exception("Expected the features and labels to have the same number of rows"));
		if(labels.cols() != 1)
			throw(new Exception("Sorry, this method currently only supports one-dimensional labels"));
		if(features.rows() == 0)
			throw(new Exception("Expected at least one row"));

		int labelValues = labels.valueCount(0);
		if(labelValues == 0) 
		{
			double[] pred = new double[1];
			double sse = 0.0;
			for(int i = 0; i < features.rows(); i++)
			{
				double[] feat = features.row(i);
				double[] targ = labels.row(i);
				pred[0] = 0.0; 
                                predict(feat, pred);
				double delta = targ[0] - pred[0];
				sse += (delta * delta);
			}
			return Math.sqrt(sse / features.rows());
		}
		else
		{
			
			if(confusion != null)
			{
				confusion.setSize(labelValues, labelValues);
				for(int i = 0; i < labelValues; i++)
					confusion.setAttrName(i, labels.attrValue(0, i));
			}
			int correctCount = 0;
			double[] prediction = new double[1];
			for(int i = 0; i < features.rows(); i++)
			{
				double[] feat = features.row(i);
				int targ = (int)labels.get(i, 0);
				if(targ >= labelValues)
					throw new Exception("The label is out of range");
				predict(feat, prediction);
				int pred = (int)prediction[0];
				if(confusion != null)
					confusion.set(targ, pred, confusion.get(targ, pred) + 1);
				if(pred == targ)
					correctCount++;
			}
			return (double)correctCount / features.rows();
		}
	}

}