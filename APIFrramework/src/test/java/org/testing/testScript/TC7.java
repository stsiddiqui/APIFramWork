package org.testing.testScript;

import java.io.IOException;

import org.testing.utilities.LoadxmlData;
import org.testng.annotations.Test;


public class TC7 
{
  @Test
  public void testCase7() throws IOException
  {
	  String responce=LoadxmlData.readXMLdata("../APIFrramework/src/test/java/org/testing/payload/xmlfile.xml");
	  System.out.println(responce);
  }
}
