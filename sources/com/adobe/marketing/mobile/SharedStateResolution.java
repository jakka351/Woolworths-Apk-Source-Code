package com.adobe.marketing.mobile;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SharedStateResolution {
    public static final SharedStateResolution d;
    public static final SharedStateResolution e;
    public static final /* synthetic */ SharedStateResolution[] f;

    static {
        SharedStateResolution sharedStateResolution = new SharedStateResolution("LAST_SET", 0);
        d = sharedStateResolution;
        SharedStateResolution sharedStateResolution2 = new SharedStateResolution("ANY", 1);
        e = sharedStateResolution2;
        f = new SharedStateResolution[]{sharedStateResolution, sharedStateResolution2};
    }

    public static SharedStateResolution valueOf(String str) {
        return (SharedStateResolution) Enum.valueOf(SharedStateResolution.class, str);
    }

    public static SharedStateResolution[] values() {
        return (SharedStateResolution[]) f.clone();
    }
}
