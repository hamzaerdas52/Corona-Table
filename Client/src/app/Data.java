package app;

import java.io.Serializable;
import java.util.Date;

public class Data implements Serializable
{
    private Date date;
    private String test,intensiveCare,death,circumstance,recovered;
    public Data(Date date,String test,String intensiveCare,String death,String circumstance,String recovered)
    {
        this.date=date;
        this.test=test;
        this.intensiveCare=intensiveCare;
        this.death=death;
        this.circumstance=circumstance;
        this.recovered=recovered;
    }
    public Data(){}
    public Date getDate()
    {
        return date;
    }
    public void setDate(Date date)
    {
        this.date=date;
    }
    public String getTest()
    {
        return test;
    }
    public void setTest(String test)
    {
        this.test=test;
    }
    public String getIntensiveCare()
    {
        return intensiveCare;
    }
    public void setIntensiveCare(String intensiveCare)
    {
        this.intensiveCare=intensiveCare;
    }
    public String getDeath()
    {
        return death;
    }
    public void setDeath(String death)
    {
        this.death=death;
    }
    public String getCircumstance()
    {
        return circumstance;
    }
    public void setCircumstance(String circumstance)
    {
        this.circumstance=circumstance;
    }
    public String getRecovered()
    {
        return recovered;
    }
    public void setRecovered(String recovered)
    {
        this.recovered=recovered;
    }
}