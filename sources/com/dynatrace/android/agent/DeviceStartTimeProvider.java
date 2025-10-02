package com.dynatrace.android.agent;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class DeviceStartTimeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final long f14075a;
    public final long b;

    public DeviceStartTimeProvider(long j, long j2, long j3) {
        this.f14075a = j - j2;
        this.b = TimeUnit.MILLISECONDS.toNanos(j) - j3;
    }
}
