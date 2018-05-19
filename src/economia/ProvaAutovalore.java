/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package economia;
import Jama.*;



public class ProvaAutovalore {
    public static void main(String args[]) {

        final int M = 8;                // Matrix size (square)

        Matrix m = new Matrix(M,M);   // Create matrix
	

        //           Fill with random numbers using Math.random()
	//           making a symmetric matrix matrix
        for(int i = 0; i < M; i++) {
            for(int j = 0; j <= i; j++) {
		double val = Math.random();
                m.set(i,j,val);
		m.set(j,i,val);
	    }
	}
        

        //              Print out initial matrix to System.out on
        //              cole of with 8 with 4 sig figs
        System.out.println("Initial Radom Matrix is:");
        m.print(8,4);
    


	//                  Get the Eigen value decomposition
	EigenvalueDecomposition eigen = m.eig();

	double [] realPart = eigen.getRealEigenvalues();
	double [] imagPart = eigen.getImagEigenvalues();

	for(int i = 0; i < realPart.length; i++) {
	    System.out.println("Eigen Value " + i + " is " +
			       "[" + realPart[i] + ", " + 
			       + imagPart[i] + "]");
	}


	//                 Get the block diagonal matrix of
	//                 Eigen values
	Matrix d = eigen.getD();
	System.out.println("Diagonal matrix of Eigen values is:");
        d.print(8,4);
	    


	Matrix evectors = eigen.getV();

	System.out.println("Matrix of Eigen Vectors is:");
	evectors.print(8,4);

	//           Get transpose of evectors
	Matrix trans = evectors.transpose();

	//           Form trans*evectors (which should be unit matrix)
	Matrix u = evectors.times(trans);

	System.out.println("Matrix of trans * evectors is :");
	u.print(8,4);


    }
}