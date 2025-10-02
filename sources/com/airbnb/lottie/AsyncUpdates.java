package com.airbnb.lottie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AsyncUpdates {
    public static final AsyncUpdates d;
    public static final AsyncUpdates e;
    public static final /* synthetic */ AsyncUpdates[] f;

    static {
        AsyncUpdates asyncUpdates = new AsyncUpdates("AUTOMATIC", 0);
        d = asyncUpdates;
        AsyncUpdates asyncUpdates2 = new AsyncUpdates("ENABLED", 1);
        e = asyncUpdates2;
        f = new AsyncUpdates[]{asyncUpdates, asyncUpdates2, new AsyncUpdates("DISABLED", 2)};
    }

    public static AsyncUpdates valueOf(String str) {
        return (AsyncUpdates) Enum.valueOf(AsyncUpdates.class, str);
    }

    public static AsyncUpdates[] values() {
        return (AsyncUpdates[]) f.clone();
    }
}
