package morix;

import junit.framework.Test;
import junit.framework.TestSuite;

import morix.bdd.BDDTestSuite;
import morix.serveur.ServeurTestSuite;
import morix.stock.StockTestSuite;

/**
 * Classe de suite de tests unitaires pour le programme Morix.
 *
 * @version 3.0
 * @author Matthias Brun
 *
 */
public class MorixTestSuite 
{

	/**
	 * Suite de tests..
	 *
	 * @return la suite de tests.
	 *
	 * @see junit.framework.TestSuite
	 *
	 */	
	public static Test suite() 
	{
		final TestSuite suite = new TestSuite("Suite de tests pour Morix");

		//$JUnit-BEGIN$
		suite.addTest(StockTestSuite.suite());
		suite.addTest(BDDTestSuite.suite());
		suite.addTest(ServeurTestSuite.suite());
		//$JUnit-END$

		return suite;
	}

}

