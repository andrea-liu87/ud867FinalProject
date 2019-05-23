package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class EmptyStringTest {

    @Rule
    public final ActivityTestRule<MainActivity> testActvScope = new ActivityTestRule<>(MainActivity.class);

    private Context context = InstrumentationRegistry.getContext();

    private final EndpointsAsyncTask asyncTask = new EndpointsAsyncTask();

    @Test
    public void emptyStringTest(){
        String returnString = asyncTask.doInBackground(context);
        Assert.assertTrue(returnString != null);
    }
}
