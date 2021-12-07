package com.pingidentity;

import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Your assignment is to write a method which returns a list of JIRA
 * tickets (as String). This will be used as a library in a bigger flow:
 * one program will provide the list of GitCommits, and another
 * will consume the list of Strings provided to do stuff on JIRA.
 */
public class App
{

    /**
   * This method makes use of the regex matcher and pattern operators in order to 
   * return a list of JIRA tickets present in the provided gitCommits. The compiled
   * pattern is one that conforms to the standards outlined by JIRA's API documentation.
   */
    public List<String> getJiraTickets(List<GitCommit> gitCommits)
    {
      List<String> tickets = new ArrayList<String>();
        int n = 0;
        Pattern p = Pattern.compile("((?<!([A-Za-z]{1,10})-?)[A-Z]+-\\d+)");
        Matcher m = p.matcher(gitCommits.get(n).getMessage());

        while (m.find()) {
            tickets.add(m.group());
            n++;
        }
        return tickets;
    }

}
