package com.bridgelabz.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in SAD Mood");
        String mood=null;
        try
        {
            mood = moodAnalyser.analyseMood();
        }
        catch (MoodAnalyserException e)
        {
            e.printStackTrace();
        }
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenMessageDoNotSad_ShouldReturnHappy()
    {

        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood=null;
        try
        {
            mood = moodAnalyser.analyseMood();
        }
        catch (MoodAnalyserException e)
        {
            e.printStackTrace();
            Assertions.assertEquals("Happy", mood);
        }
    }

    @Test
    public  void givenMessage_WhenNullMood_ShouldReturnHappy()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("Null");
        try
        {
            String mood = moodAnalyser.analyseMood();
        }
        catch (MoodAnalyserException e)
        {
            e.printStackTrace();
            Assertions.assertEquals("Enter Message", e.getMessage());
        }
    }

    @Test
    public  void givenMessage_WhenEmptyMessage_ShouldThrowException()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser(" ");
        try
        {
            String mood = moodAnalyser.analyseMood();
        }
        catch (MoodAnalyserException e)
        {
            e.printStackTrace();
            Assertions.assertEquals("Enter Message", e.getMessage());
        }
    }
}
