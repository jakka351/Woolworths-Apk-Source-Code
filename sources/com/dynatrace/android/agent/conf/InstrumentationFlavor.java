package com.dynatrace.android.agent.conf;

/* loaded from: classes.dex */
public enum InstrumentationFlavor {
    PLAIN("pl"),
    XAMARIN("xm"),
    /* JADX INFO: Fake field, exist only in values array */
    CORDOVA("cd"),
    /* JADX INFO: Fake field, exist only in values array */
    FLUTTER("fl"),
    REACT_NATIVE("rn"),
    JETPACK_COMPOSE("jc"),
    MAUI("ma");

    public final String d;

    InstrumentationFlavor(String str) {
        this.d = str;
    }
}
