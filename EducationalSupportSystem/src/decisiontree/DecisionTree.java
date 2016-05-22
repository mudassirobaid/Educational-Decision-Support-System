package decisiontree;

import Main.Matrix;
import Main.SupervisedLearner;

public class DecisionTree extends SupervisedLearner {

	private Node _root;

	@Override
	public void train(Matrix features, Matrix labels) throws Exception {
		ID3 id3 = new ID3();
		_root = id3.buildTree(features, labels);
		String fileName = "vowelWithGainRatio.txt";
		_root.dumpDot(features, labels, fileName);

	}

	@Override
	public void predict(double[] features, double[] labels) throws Exception {
		labels[0] = _root.makeDecision(features, _root.getAttribute().getColumnPositionID());
	}
}