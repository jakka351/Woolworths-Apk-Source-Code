package com.airbnb.epoxy;

import android.util.Log;

/* loaded from: classes4.dex */
class DebugTimer implements Timer {

    /* renamed from: a, reason: collision with root package name */
    public final String f13310a;
    public long b = -1;
    public String c = null;

    public DebugTimer(String str) {
        this.f13310a = str;
    }

    @Override // com.airbnb.epoxy.Timer
    public final void a(String str) {
        if (this.b != -1) {
            throw new IllegalStateException("Timer was already started");
        }
        this.b = System.nanoTime();
        this.c = str;
    }

    @Override // com.airbnb.epoxy.Timer
    public final void stop() {
        if (this.b == -1) {
            throw new IllegalStateException("Timer was not started");
        }
        Log.d(this.f13310a, String.format(YU.a.o(new StringBuilder(), this.c, ": %.3fms"), Float.valueOf((System.nanoTime() - this.b) / 1000000.0f)));
        this.b = -1L;
        this.c = null;
    }
}
