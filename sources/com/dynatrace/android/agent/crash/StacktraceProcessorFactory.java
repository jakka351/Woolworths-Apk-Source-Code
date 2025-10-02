package com.dynatrace.android.agent.crash;

import com.dynatrace.android.agent.conf.InstrumentationFlavor;

/* loaded from: classes.dex */
public class StacktraceProcessorFactory {
    public static StacktraceProcessor a(Throwable th, InstrumentationFlavor instrumentationFlavor) {
        String strB;
        return ((instrumentationFlavor == InstrumentationFlavor.XAMARIN || instrumentationFlavor == InstrumentationFlavor.MAUI) && (strB = XamarinStacktraceProcessor.b(th)) != null) ? new SafeXamarinStacktraceProcessor(strB, th) : new JavaStacktraceProcessor(th, Integer.MAX_VALUE);
    }
}
