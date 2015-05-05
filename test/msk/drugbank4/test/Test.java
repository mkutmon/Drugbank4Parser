package msk.drugbank4.test;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import msk.drugbank4.DrugBankParser;
import msk.drugbank4.DrugModel;

import org.jdom2.JDOMException;
import org.junit.Assert;
import org.junit.Before;

public class Test {

	private File drugbankXmlFile;
	@Before
	public void setUp() throws Exception {
		drugbankXmlFile = new File("resources/drugbank-example.xml");
	}

	@org.junit.Test
	public void test() {
		DrugBankParser parser = new DrugBankParser();
		try {
			Set<DrugModel> drugs = parser.parse(drugbankXmlFile);
			Assert.assertTrue(drugs.size() == 4);
			for(DrugModel d : drugs) {
				if(d.getName().equals("Cetuximab")) {
					Assert.assertTrue(d.getTargets().size() == 12);
				}
			}
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
