package com.dynatrace.android.agent.data;

/* loaded from: classes.dex */
enum SessionState {
    f(true, false),
    g(true, true),
    h(false, true);

    public final boolean d;
    public final boolean e;

    SessionState(boolean z, boolean z2) {
        this.d = z;
        this.e = z2;
    }
}
