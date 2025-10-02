package com.google.firebase.installations.time;

/* loaded from: classes.dex */
public class SystemClock implements Clock {

    /* renamed from: a, reason: collision with root package name */
    public static SystemClock f15629a;

    @Override // com.google.firebase.installations.time.Clock
    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
