package com.converterdojo.pafsilva.androidconverterdojo;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewAction;
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

        onView(withId(R.id.edtInput)).perform(typeText("88"), closeSoftKeyboard());
        onView(withId(R.id.btnConvert)).perform(click());

        onView(withId(R.id.txtAnswer)).check(matches(withText("LXXXVIII")));
    }

    @Test
    public void shouldNotConvertWhenSameValuesOnSpinnersAreSelected() {
        onView(withId(R.id.spinnerFrom)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Arabic"))).perform(click());

        onView(withId(R.id.spinnerTo)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Arabic"))).perform(click());

        onView(withId(R.id.edtInput)).perform(typeText("88"), closeSoftKeyboard());
        onView(withId(R.id.btnConvert)).perform(click());

        onView(withId(R.id.txtAnswer)).check(matches(withText("88")));
    }

    @Test
    public void shouldNotConvertWhenSameValuesOnSpinnersAreSelected2() {
        onView(withId(R.id.spinnerFrom)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Roman"))).perform(click());

        onView(withId(R.id.spinnerTo)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Roman"))).perform(click());

        onView(withId(R.id.edtInput)).perform(typeText("IV"), closeSoftKeyboard());
        onView(withId(R.id.btnConvert)).perform(click());

        onView(withId(R.id.txtAnswer)).check(matches(withText("IV")));
    }
}
