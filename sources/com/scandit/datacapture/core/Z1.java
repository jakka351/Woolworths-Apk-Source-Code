package com.scandit.datacapture.core;

/* loaded from: classes6.dex */
final class Z1 {

    /* renamed from: a, reason: collision with root package name */
    private final double f18400a;
    private double b;
    private boolean c;

    public Z1(double d) {
        this.f18400a = d;
    }

    public final long a(long j) {
        if (this.c) {
            double d = this.b;
            double d2 = this.f18400a;
            this.b = ((1.0d - d2) * j) + (d * d2);
        } else {
            this.b = j;
            this.c = true;
        }
        return (long) this.b;
    }
}
