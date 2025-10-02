package com.swrve.sdk.config;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SwrveStack {
    public static final /* synthetic */ SwrveStack[] d = {new SwrveStack("US", 0), new SwrveStack("EU", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    SwrveStack EF5;

    public static SwrveStack valueOf(String str) {
        return (SwrveStack) Enum.valueOf(SwrveStack.class, str);
    }

    public static SwrveStack[] values() {
        return (SwrveStack[]) d.clone();
    }
}
