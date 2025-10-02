package com.dynatrace.android.agent.metrics;

/* loaded from: classes.dex */
public enum ConnectionType {
    OFFLINE("o"),
    MOBILE("m"),
    WIFI("w"),
    LAN("l"),
    OTHER("");

    public final String d;

    ConnectionType(String str) {
        this.d = str;
    }
}
