package com.example.avjindersinghsekhon.minimaltodo.Main;


import android.support.test.espresso.ViewInteraction;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import com.example.avjindersinghsekhon.minimaltodo.R;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class IntegrationTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void integrationTest() {
        ViewInteraction floatingActionButton = onView(
                allOf(withId(R.id.addToDoItemFAB),
                        childAtPosition(
                                allOf(withId(R.id.myCoordinatorLayout),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                2),
                        isDisplayed()));
        floatingActionButton.perform(click());

        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.userToDoEditText),
                        childAtPosition(
                                allOf(withId(R.id.toDoCustomTextInput),
                                        childAtPosition(
                                                withId(R.id.editTextParentLinearLayout),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatEditText.perform(replaceText("D"), closeSoftKeyboard());

        ViewInteraction floatingActionButton2 = onView(
                allOf(withId(R.id.makeToDoFloatingActionButton),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                1),
                        isDisplayed()));
        floatingActionButton2.perform(click());

        ViewInteraction appCompatImageView = onView(
                allOf(withClassName(is("android.support.v7.widget.AppCompatImageView")), withContentDescription("Search"),
                        childAtPosition(
                                allOf(withClassName(is("android.widget.LinearLayout")),
                                        childAtPosition(
                                                withId(R.id.search_option),
                                                0)),
                                1),
                        isDisplayed()));
        appCompatImageView.perform(click());

        ViewInteraction searchAutoComplete = onView(
                allOf(withClassName(is("android.widget.SearchView$SearchAutoComplete")),
                        childAtPosition(
                                allOf(withClassName(is("android.widget.LinearLayout")),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                1)),
                                0),
                        isDisplayed()));
        searchAutoComplete.perform(replaceText(""), closeSoftKeyboard());

        ViewInteraction appCompatImageView2 = onView(
                allOf(withClassName(is("android.support.v7.widget.AppCompatImageView")), withContentDescription("Clear query"),
                        childAtPosition(
                                allOf(withClassName(is("android.widget.LinearLayout")),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                1)),
                                1),
                        isDisplayed()));
        appCompatImageView2.perform(click());

        ViewInteraction floatingActionButton3 = onView(
                allOf(withId(R.id.addToDoItemFAB),
                        childAtPosition(
                                allOf(withId(R.id.myCoordinatorLayout),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                2),
                        isDisplayed()));
        floatingActionButton3.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.userToDoEditText),
                        childAtPosition(
                                allOf(withId(R.id.toDoCustomTextInput),
                                        childAtPosition(
                                                withId(R.id.editTextParentLinearLayout),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("Pp"), closeSoftKeyboard());

        ViewInteraction floatingActionButton4 = onView(
                allOf(withId(R.id.makeToDoFloatingActionButton),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                1),
                        isDisplayed()));
        floatingActionButton4.perform(click());

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());

        ViewInteraction floatingActionButton5 = onView(
                allOf(withId(R.id.addToDoItemFAB),
                        childAtPosition(
                                allOf(withId(R.id.myCoordinatorLayout),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                2),
                        isDisplayed()));
        floatingActionButton5.perform(click());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.userToDoEditText),
                        childAtPosition(
                                allOf(withId(R.id.toDoCustomTextInput),
                                        childAtPosition(
                                                withId(R.id.editTextParentLinearLayout),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("Aa"), closeSoftKeyboard());

        ViewInteraction floatingActionButton6 = onView(
                allOf(withId(R.id.makeToDoFloatingActionButton),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                1),
                        isDisplayed()));
        floatingActionButton6.perform(click());

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());

        ViewInteraction appCompatTextView = onView(
                allOf(withId(R.id.title), withText("Sort by title"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.support.v7.internal.view.menu.ListMenuItemView")),
                                        0),
                                0),
                        isDisplayed()));
        appCompatTextView.perform(click());

        ViewInteraction floatingActionButton7 = onView(
                allOf(withId(R.id.addToDoItemFAB),
                        childAtPosition(
                                allOf(withId(R.id.myCoordinatorLayout),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                2),
                        isDisplayed()));
        floatingActionButton7.perform(click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.userToDoEditText),
                        childAtPosition(
                                allOf(withId(R.id.toDoCustomTextInput),
                                        childAtPosition(
                                                withId(R.id.editTextParentLinearLayout),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatEditText4.perform(replaceText("Yy"), closeSoftKeyboard());

        ViewInteraction floatingActionButton8 = onView(
                allOf(withId(R.id.makeToDoFloatingActionButton),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                1),
                        isDisplayed()));
        floatingActionButton8.perform(click());

        ViewInteraction appCompatImageView3 = onView(
                allOf(withId(R.id.copyBtn),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.listItemLinearLayout),
                                        1),
                                1),
                        isDisplayed()));
        appCompatImageView3.perform(click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
