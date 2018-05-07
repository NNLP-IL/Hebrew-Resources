package libsvm;
import java.io.IOException;


public class MySvmClassifier {
	
/*	Usage: svm-train [options] training_set_file [model_file]
			options:
			-s svm_type : set type of SVM (default 0)
				0 -- C-SVC
				1 -- nu-SVC
				2 -- one-class SVM
				3 -- epsilon-SVR
				4 -- nu-SVR
			-t kernel_type : set type of kernel function (default 2)
				0 -- linear: u'*v
				1 -- polynomial: (gamma*u'*v + coef0)^degree
				2 -- radial basis function: exp(-gamma*|u-v|^2)
				3 -- sigmoid: tanh(gamma*u'*v + coef0)
				4 -- precomputed kernel (kernel values in training_set_file)
			-d degree : set degree in kernel function (default 3)
			-g gamma : set gamma in kernel function (default 1/k)
			-r coef0 : set coef0 in kernel function (default 0)
			-c cost : set the parameter C of C-SVC, epsilon-SVR, and nu-SVR (default 1)
			-n nu : set the parameter nu of nu-SVC, one-class SVM, and nu-SVR (default 0.5)
			-p epsilon : set the epsilon in loss function of epsilon-SVR (default 0.1)
			-m cachesize : set cache memory size in MB (default 100)
			-e epsilon : set tolerance of termination criterion (default 0.001)
			-h shrinking: whether to use the shrinking heuristics, 0 or 1 (default 1)
			-b probability_estimates: whether to train an SVC or SVR model for probability estimates, 0 or 1 (default 0)
			-wi weight: set the parameter C of class i to weight*C in C-SVC (default 1)
			-v n: n-fold cross validation mode

			The k in the -g option means the number of attributes in the input data.

			option -v randomly splits the data into n parts and calculates cross
			validation accuracy/mean squared error on them.*/


	public void train(String trainingFileName,double c, double g){
		String[] train= new String[11];
		//String[] train= new String[13];
		// NOTICE: here we can define the weight of each type of mistake.
		train[0] = "-s"; train[1] = "0"; train[2] = "-t"; train[3] = "0";
		train[4] = "-g"; train[5] = ""+g; train[6] = "-c"; train[7] = ""+c; 
		train[8] = "-m"; train[9] = "300"; 
		train[10] = trainingFileName;
		//train[10] = "-d"; train[11] = "2";
		//train[12] = "-r"; train[13] = "100";
		//train[14] = trainingFileName;
		try {
			//svm_scale.main(argv);
			svm_train.main(train);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void predict(String testSet, String modelFileName, String outputFile) {
		String[] predict= new String[3];
		predict[0] = testSet; 
		predict[1] = modelFileName; 
		predict[2] = outputFile;
		try { 
			svm_predict.main(predict);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
