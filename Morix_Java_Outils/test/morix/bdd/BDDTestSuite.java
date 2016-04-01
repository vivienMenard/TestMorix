package morix.bdd;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Classe de suite de tests unitaire pour l'accès à la base de données du programme Morix.
 *
 * @version 3.0
 * @author Matthias Brun
 *
 */
public class BDDTestSuite
{

	/**
	 * Suite de tests pour l'accès à la base de données de Morix..
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
		final TestSuite suite = new TestSuite("Suite de tests pour l'accès à la base de données de Morix.");

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

