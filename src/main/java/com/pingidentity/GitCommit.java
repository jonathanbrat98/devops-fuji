package com.pingidentity;

import java.util.Date;

/**
 * A domain object representing a git commit message. The intent is
 * for another program to provide these values by parsing a git repository. For
 * your purposes, you will initialize them in your tests (See AppTest.java)
 */
public class GitCommit
{
    private String message;
    private String sha1;
    private String author;
    private Date date;

    public void setMessage(String message)
    {
        this.message = message;
    }

    public String getMessage()
    {
        return message;
    }

    public void setSha1(String sha1)
    {
        this.sha1 = sha1;
    }

    public String getSha1()
    {
        return sha1;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public Date getDate()
    {
        return date;
    }
}
