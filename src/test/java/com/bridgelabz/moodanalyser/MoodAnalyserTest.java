package com.bridgelabz.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public  void givenMessage_WhenSad_ShouldReturnSad()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in SAD Mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("SAD", mood);
    }
    @Test
    public  void givenMessage_WhenMessageDoNotSad_ShouldReturnHappy()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("Happy", mood);

    }
    @Test
    public  void givenMessage_WhenNullMood_ShouldReturnHappy()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("Null");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("Happy", mood);

    }
}
