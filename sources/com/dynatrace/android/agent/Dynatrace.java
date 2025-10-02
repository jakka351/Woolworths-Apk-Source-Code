package com.dynatrace.android.agent;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class Dynatrace {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14076a;
    public static final Object b;
    public static final AtomicBoolean c;

    /* renamed from: com.dynatrace.android.agent.Dynatrace$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            synchronized (Dynatrace.b) {
                Core.g(0L);
            }
        }
    }

    static {
        String str = AdkSettings.h;
        boolean z = Global.f14077a;
        f14076a = "dtxDynatrace";
        b = new Object();
        c = new AtomicBoolean(false);
    }

    public static boolean a() {
        if (Global.b.get()) {
            return Core.k.i.get();
        }
        return false;
    }
}
