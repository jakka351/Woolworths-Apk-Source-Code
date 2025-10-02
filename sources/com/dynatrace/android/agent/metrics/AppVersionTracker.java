package com.dynatrace.android.agent.metrics;

import android.content.Context;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.SdkVersionProviderImpl;

/* loaded from: classes.dex */
public class AppVersionTracker {
    public static final String b;

    /* renamed from: a, reason: collision with root package name */
    public final Context f14133a;

    static {
        boolean z = Global.f14077a;
        b = "dtxAppVersionTracker";
    }

    public AppVersionTracker(Context context, SdkVersionProviderImpl sdkVersionProviderImpl) {
        this.f14133a = context;
    }
}
