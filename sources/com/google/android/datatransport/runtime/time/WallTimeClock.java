package com.google.android.datatransport.runtime.time;

/* loaded from: classes.dex */
public class WallTimeClock implements Clock {
    @Override // com.google.android.datatransport.runtime.time.Clock
    public final long a() {
        return System.currentTimeMillis();
    }
}
