package sn.objis.monpremierprojet;

import junit.framework.TestCase;

public class CalculTest extends TestCase {
	private Calcul calcul;

	protected void setUp() throws Exception {
		super.setUp();
		calcul=new Calcul();
	}

	public void testSomme(){
		 assertTrue(calcul.somme(3, 5)==8);
	}
	public void testProduit(){
		assertTrue(calcul.produit(3, 5)==15);
	}
}
