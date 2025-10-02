package com.dynatrace.android.agent.crash;

import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;

/* loaded from: classes4.dex */
class SafeXamarinStacktraceProcessor implements StacktraceProcessor {
    public static final String c;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f14110a;
    public final String b;

    static {
        boolean z = Global.f14077a;
        c = "dtxSafeXamarinCrashProcessor";
    }

    public SafeXamarinStacktraceProcessor(String str, Throwable th) {
        this.f14110a = th;
        this.b = str;
    }

    @Override // com.dynatrace.android.agent.crash.StacktraceProcessor
    public final StacktraceData a() {
        try {
            return new XamarinStacktraceProcessor(this.b).a();
        } catch (Exception e) {
            if (Global.f14077a) {
                Utility.g(e, c, "invalid Xamarin crash");
            }
            return new JavaStacktraceProcessor(this.f14110a, Integer.MAX_VALUE).a();
        }
    }
}
