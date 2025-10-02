package com.dynatrace.android.agent.conf;

/* loaded from: classes.dex */
public enum DataCollectionLevel {
    OFF(0),
    PERFORMANCE(1),
    USER_BEHAVIOR(2);

    public final int d;

    DataCollectionLevel(int i) {
        this.d = i;
    }
}
