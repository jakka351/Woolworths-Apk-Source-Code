package com.dynatrace.android.agent.events.lifecycle;

import com.dynatrace.android.agent.Global;
import com.dynatrace.android.lifecycle.SegmentFactory;
import com.dynatrace.android.lifecycle.appstart.AppStartAction;

/* loaded from: classes.dex */
public class AppStartSegmentFactory implements SegmentFactory<AppStartAction, AppStartSegment> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14121a;

    static {
        boolean z = Global.f14077a;
        f14121a = "dtxAppStartSegmentFactory";
    }
}
