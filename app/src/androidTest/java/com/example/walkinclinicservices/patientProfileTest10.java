package com.example.walkinclinicservices;

import android.widget.TextView;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;


import androidx.test.annotation.UiThreadTest;
import androidx.test.rule.ActivityTestRule;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertNotEquals;

public class patientProfileTest10 {
    @Rule
    public ActivityTestRule<patientProfile> mActivityTestRule = new ActivityTestRule<>(patientProfile.class);
    private patientProfile mActivity = null;
    private TextView text;

    @Before
    public void setUp() throws Exception{
        mActivity = mActivityTestRule.getActivity();
    }


    @Test
    @UiThreadTest
    public void checkText() throws Exception {
        assertNotNull(mActivity.findViewById(R.id.textView43));
    }
}