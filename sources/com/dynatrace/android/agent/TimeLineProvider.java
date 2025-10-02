package com.dynatrace.android.agent;

import android.os.SystemClock;

/* loaded from: classes.dex */
public class TimeLineProvider {
    public static final TimeLineProvider b = new TimeLineProvider(new DeviceStartTimeProvider(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.elapsedRealtimeNanos()));

    /* renamed from: a, reason: collision with root package name */
    public final DeviceStartTimeProvider f14081a;

    public TimeLineProvider(DeviceStartTimeProvider deviceStartTimeProvider) {
        this.f14081a = deviceStartTimeProvider;
    }

    public final long a() {
        return SystemClock.elapsedRealtime() + this.f14081a.f14075a;
    }
}
