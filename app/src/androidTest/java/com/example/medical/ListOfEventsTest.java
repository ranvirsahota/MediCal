package com.example.medical;

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import androidx.test.rule.ActivityTestRule;
import com.example.medical.UI.ListOfEvents;

import org.junit.Rule;
import org.junit.runner.RunWith;
@RunWith(AndroidJUnit4ClassRunner.class)
public class ListOfEventsTest {
    @Rule
    public ActivityTestRule<ListOfEvents> listOfEventsActivityTestRule = new ActivityTestRule<> (ListOfEvents.class);
}