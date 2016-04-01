package morix.stock;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Classe de suite de tests unitaire pour le stock du programme Morix.
 *
 * @version 3.0
 * @author Matthias Brun
 *
 */
public class StockTestSuite
{

	/**
	 * Suite de tests pour le stock de Morix..
	 *
	 * @return la suite de tests.
	 *
	 * @see junit.framework.TestSuite
	 *
	 */	
	public static Test suite() 
	{
		final Class<?>[] classesTest = {
			// TODO : insérer ici les classes de test. 
		};

		final TestSuite suite = new TestSuite(classesTest);

		/* alternative */
		/*
		final TestSuite suite = new TestSuite("Suite de tests pour le stock de Morix.");

		//$JUnit-BEGIN$
		suite.addTest(new TestSuite(
			//TODO : insérer ici une classe de test
		));
		//suite.addTest(new TestSuite(
			//TODO : insérer ici une classe de test
		));
		//$JUnit-END$
		*/

		return suite;
	}

}

