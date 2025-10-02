package com.scandit.datacapture.core;

import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes6.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ P0 f18355a = new P0();
    private static final long b;
    private static final long c;
    private static final long d;
    private static final long e;

    static {
        int i = Duration.g;
        DurationUnit durationUnit = DurationUnit.g;
        b = DurationKt.h(1000L, durationUnit);
        c = DurationKt.h(2000L, durationUnit);
        d = DurationKt.h(500L, durationUnit);
        e = DurationKt.h(250L, durationUnit);
    }

    private P0() {
    }

    public static long a() {
        return c;
    }

    public static long b() {
        return b;
    }

    public static long c() {
        return d;
    }

    public static long d() {
        return e;
    }
}
