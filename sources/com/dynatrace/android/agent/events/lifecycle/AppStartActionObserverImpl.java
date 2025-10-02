package com.dynatrace.android.agent.events.lifecycle;

import com.dynatrace.android.agent.Global;
import com.dynatrace.android.lifecycle.appstart.AppStartActionObserver;

/* loaded from: classes.dex */
public class AppStartActionObserverImpl implements AppStartActionObserver {
    public static final String b;

    /* renamed from: a, reason: collision with root package name */
    public final AppStartSegmentFactory f14119a = new AppStartSegmentFactory();

    static {
        boolean z = Global.f14077a;
        b = "dtxAppStartActionObserverImpl";
    }
}
