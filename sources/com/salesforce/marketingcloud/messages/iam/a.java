package com.salesforce.marketingcloud.messages.iam;

import android.os.CountDownTimer;

/* loaded from: classes6.dex */
abstract class a extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    private long f16995a;
    private long b;

    public a(long j, long j2) {
        super(j - j2, 500L);
        this.b = j;
    }

    public long a() {
        return this.b - this.f16995a;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        this.f16995a = 0L;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        this.f16995a = j;
    }
}
