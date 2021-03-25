package com.bridgelabz.moodanalyser;

public class MoodAnalyser
{
    public String message;
    public MoodAnalyser(String msg)
    {
        message=msg;
    }
    public String analyseMood()
    {
        try
        {
            if (message.contains("SAD"))
                return "SAD";
            else
                return "Happy";
        }
        catch(NullPointerException e)
        {
            return "HAPPY";
        }
    }
}
