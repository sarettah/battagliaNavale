package com.example.dalsa.battaglianavale;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented ship_select_and_found.xmlect_and_found.xml, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under ship_select_and_found_select_and_found.xml.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.dalsa.battaglianavale", appContext.getPackageName());
    }
}
