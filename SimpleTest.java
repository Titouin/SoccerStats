package projet_IHM;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SimpleTest {

	//DataManager myDataManager;
	
	@Before
	public void setUp() throws Exception {
		
		//Initialisation de la partie applicative
		//myDataManager = new DataManager();
	}
	
	@Test
	public void loadTest() {
		//Chargement du fichier 2013-11-03_tromso_stromsgodset_first.csv
		//assertNotEquals(myDataManager, null);

	}
	
	@Test
	public void recordNumberTest() {		

		//Vérifier que le nombre d'enregistrements est égal à 56661
		//assertEquals(new Integer(56660), myDataManager.getRecorNumber());
	    
	}
	
	@Test
	public void playerPositionTest() {
		//Récupérer l'enregistrement pour l'index 10000 et vérifier que la position en x du joueur avec l'id 5 est égale à 65.57721
		
	}	
	
	@Test
	public void playerHeatMapMaxValueTest() {
		//vérifier que le joueur #14 a été enregistré au maximum 314 fois dans la même zone d'un mètre carré
		
	}	

	@Test
	public void playerHeatMapCornerTest() {
		//vérifier que le joueur #14 n'a jamais été dans le coin de corner le plus proche de l'origine du repère des enregistrements
		
	}		
	
}



