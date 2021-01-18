package com.example.walkinclinicservices;

import android.widget.TextView;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;


import androidx.test.annotation.UiThreadTest;
import androidx.test.rule.ActivityTestRule;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertNotEquals;

public class patientProfileTest {
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
    public void checkAddress() throws Exception {
        assertNotNull(mActivity.findViewById(R.id.textView43));
        text = mActivity.findViewById(R.id.addressText);
        text.setText("User1");
        String name = text.getText().toString();
        assertNotEquals("user", name);
    }
}