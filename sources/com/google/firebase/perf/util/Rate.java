package com.google.firebase.perf.util;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class Rate {

    /* renamed from: a, reason: collision with root package name */
    public final long f15722a;
    public final long b;
    public final TimeUnit c;

    /* renamed from: com.google.firebase.perf.util.Rate$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15723a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f15723a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15723a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15723a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public Rate(long j, long j2, TimeUnit timeUnit) {
        this.f15722a = j;
        this.b = j2;
        this.c = timeUnit;
    }

    public final double a() {
        double d;
        long nanos;
        int i = AnonymousClass1.f15723a[this.c.ordinal()];
        long j = this.b;
        long j2 = this.f15722a;
        if (i == 1) {
            d = j2 / j;
            nanos = TimeUnit.SECONDS.toNanos(1L);
        } else if (i == 2) {
            d = j2 / j;
            nanos = TimeUnit.SECONDS.toMicros(1L);
        } else {
            if (i != 3) {
                return j2 / r1.toSeconds(j);
            }
            d = j2 / j;
            nanos = TimeUnit.SECONDS.toMillis(1L);
        }
        return d * nanos;
    }
}
