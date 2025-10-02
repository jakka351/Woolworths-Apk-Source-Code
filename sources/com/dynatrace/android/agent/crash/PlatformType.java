package com.dynatrace.android.agent.crash;

/* loaded from: classes4.dex */
public enum PlatformType {
    JAVA("a"),
    /* JADX INFO: Fake field, exist only in values array */
    JAVA_SCRIPT("j"),
    XAMARIN("x"),
    /* JADX INFO: Fake field, exist only in values array */
    DART("d"),
    CUSTOM("c");

    public final String d;

    PlatformType(String str) {
        this.d = str;
    }

    public final String a() {
        return this.d;
    }
}
