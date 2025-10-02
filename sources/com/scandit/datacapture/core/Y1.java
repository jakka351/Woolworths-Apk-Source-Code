package com.scandit.datacapture.core;

import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
final class Y1 {

    /* renamed from: a, reason: collision with root package name */
    private final double f18396a;
    private final LinkedHashMap b = new LinkedHashMap();
    private double c;
    private boolean d;

    public Y1(double d) {
        this.f18396a = d;
    }

    public final void a(long j, long j2) {
        this.b.put(C0956a2.a(j), Long.valueOf(j2));
    }

    public final void b(long j, long j2) {
        Long l = (Long) this.b.remove(C0956a2.a(j));
        if (l != null) {
            long jLongValue = j2 - l.longValue();
            if (!this.d) {
                this.c = jLongValue;
                this.d = true;
            } else {
                double d = this.c;
                double d2 = this.f18396a;
                this.c = ((1.0d - d2) * jLongValue) + (d * d2);
            }
        }
    }

    public final boolean c() {
        return !this.d;
    }

    public final void a() {
        this.b.clear();
        this.c = 0.0d;
        this.d = false;
    }

    public final long b() {
        return (long) this.c;
    }
}
