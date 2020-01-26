package API.APItesting;

import java.io.IOException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class APITestCases 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public APITestCases( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( APITestCases.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testCreateUser() throws IOException
    {
    	assertTrue(APIMethods.createUser("https://reqres.in/api/users"));
    }
    
    public void testRetrieveUserList() throws IOException
    {
    	assertTrue(APIMethods.retrieveUserList("https://reqres.in/api/users?page=2"));
    }
    
    public void testRetrieveUser() throws IOException
    {   
    assertTrue(APIMethods.retrieveUser("https://reqres.in/api/users/2")); 
    }
      
    public void testRetrieveUserNotFound() throws IOException
    {
    	assertTrue(APIMethods.retrieveUserNotFound("https://reqres.in/api/users/23"));
    }
        
    public void testUpdateUser() throws IOException
    { 
    	assertTrue(APIMethods.updateUser("https://reqres.in/api/users/2"));
    }
    
    public void testDeleteUser() throws IOException
    {
    	assertTrue(APIMethods.deleteUser("https://reqres.in/api/users/2"));
    }
    
}
