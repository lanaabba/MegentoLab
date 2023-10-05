package TestCases;

import java.util.Random;

import org.testng.asserts.SoftAssert;

public class Parameters {
	static String Url="https://magento.softwaretestingboard.com/";
	static String [] firstNameRandom={"Eman", "Ahmad", "Lana", "Eva", "Malik"};
	Random rand = new Random();
	int randomIndex = rand.nextInt(firstNameRandom.length);
	String randomName = firstNameRandom[randomIndex];
	
	static String [] lasttNameRandom={"Mohammad", "Khaled", "Hamze", "Ehab", "Oday"};
	Random rand1 = new Random();
	int randomIndex1 = rand.nextInt(lasttNameRandom.length);
	String randomName1 = lasttNameRandom[randomIndex];
	static SoftAssert Check =new SoftAssert();

	
	
	



	

}
