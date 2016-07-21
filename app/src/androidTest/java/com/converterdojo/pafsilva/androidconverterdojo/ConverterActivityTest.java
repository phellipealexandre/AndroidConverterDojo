package com.converterdojo.pafsilva.androidconverterdojo;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class ConverterActivityTest  {

    @Rule
    public ActivityTestRule<ConverterActivity> activityRule = new ActivityTestRule<>(ConverterActivity.class);

    @Test
    public void shouldConvertFromArabicToRomanWhenCorrectSpinnersAreSelected() {
        onView(withId(R.id.spinnerFrom)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Arabic"))).perform(click());

        onView(withId(R.id.spinnerTo)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Roman"))).perform(click());

        onView(withId(R.id.edtInput)).perform(typeText("1"), closeSoftKeyboard());
        onView(withId(R.id.btnConvert)).perform(click());

        onView(withId(R.id.txtAnswer)).check(matches(withText("I")));
    }

    @Test
    public void shouldValidateEmptyInput() {
        onView(withId(R.id.spinnerFrom)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Arabic"))).perform(click());

        onView(withId(R.id.spinnerTo)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Roman"))).perform(click());

        onView(withId(R.id.edtInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.btnConvert)).perform(click());

        onView(withId(R.id.txtAnswer)).check(matches(withText("Empty Number!")));
    }

    @Test
    public void shouldConvertFromRomanToArabicWhenCorrectSpinnersAreSelected() {
        onView(withId(R.id.spinnerFrom)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Roman"))).perform(click());

        onView(withId(R.id.spinnerTo)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Arabic"))).perform(click());

        onView(withId(R.id.edtInput)).perform(typeText("I"), closeSoftKeyboard());
        onView(withId(R.id.btnConvert)).perform(click());

        onView(withId(R.id.txtAnswer)).check(matches(withText("1")));
    }
}
