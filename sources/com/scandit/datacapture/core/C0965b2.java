package com.scandit.datacapture.core;

import android.os.SystemClock;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.b2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0965b2 {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f18418a;
    private final Y1 b;
    private final Y1 c;
    private final Z1 d;
    private long e;

    public C0965b2(double d, Function1 onDelayUpdated) {
        Intrinsics.h(onDelayUpdated, "onDelayUpdated");
        this.f18418a = onDelayUpdated;
        this.b = new Y1(d);
        this.c = new Y1(d);
        this.d = new Z1(d);
    }

    public static void b(C0965b2 c0965b2, long j) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (c0965b2) {
            c0965b2.c.b(j, jUptimeMillis);
        }
        c0965b2.c();
    }

    public static void c(C0965b2 c0965b2, long j) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (c0965b2) {
            c0965b2.b.a(j, jUptimeMillis);
            c0965b2.c.a(j, jUptimeMillis);
        }
    }

    public final long a() {
        return this.e;
    }

    public static void a(C0965b2 c0965b2, long j) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (c0965b2) {
            c0965b2.b.b(j, jUptimeMillis);
        }
        c0965b2.c();
    }

    public /* synthetic */ C0965b2() {
        this(0.95d, X1.f18392a);
    }

    private final void c() {
        synchronized (this) {
            if (!this.b.c() && !this.c.c()) {
                long jA = this.d.a(this.b.b() - this.c.b());
                if (this.e != jA) {
                    this.e = jA;
                    this.f18418a.invoke(Long.valueOf(jA));
                }
            }
        }
    }

    public final void b() {
        synchronized (this) {
            this.b.a();
            this.c.a();
            this.e = 0L;
        }
    }
}
