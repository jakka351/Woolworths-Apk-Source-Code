package com.medallia.digital.mobilesdk;

/* loaded from: classes.dex */
class x5 {

    /* renamed from: a, reason: collision with root package name */
    private a f16770a;
    private long b;

    public enum a {
        ONCE,
        FREQUENCY
    }

    public x5() {
        this.f16770a = a.ONCE;
    }

    public long a() {
        return this.b;
    }

    public a b() {
        if (this.f16770a == null) {
            this.f16770a = a.ONCE;
        }
        return this.f16770a;
    }

    public x5(long j) {
        this.b = j;
        this.f16770a = j == 0 ? a.ONCE : a.FREQUENCY;
    }

    public void a(long j) {
        this.b = j;
    }
}
