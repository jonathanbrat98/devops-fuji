package com.pingidentity;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Example test
     */
    public void testApp()
    {
      /*
       * Here's an example of how you would initialize a GitCommit in order
       * to test the App:
       */
        GitCommit gitCommit = new GitCommit();
        gitCommit.setMessage("SSD-101 super duper feature\n"
            + "Fix tomcat issue with using forks over spoons.\n");
        gitCommit.setSha1("55c0bb88b6e4f096574991dd9217bcf8c745d05e");
        gitCommit.setAuthor("Example User <example@pingidentity.com>");
        App app = new App();
        // TODO: assert results
        app.getJiraTickets(Arrays.asList(gitCommit));
    }
}
