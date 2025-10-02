package com.google.firebase.firestore.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class OnlineState {
    public static final OnlineState d;
    public static final OnlineState e;
    public static final OnlineState f;
    public static final /* synthetic */ OnlineState[] g;

    static {
        OnlineState onlineState = new OnlineState("UNKNOWN", 0);
        d = onlineState;
        OnlineState onlineState2 = new OnlineState("ONLINE", 1);
        e = onlineState2;
        OnlineState onlineState3 = new OnlineState("OFFLINE", 2);
        f = onlineState3;
        g = new OnlineState[]{onlineState, onlineState2, onlineState3};
    }

    public static OnlineState valueOf(String str) {
        return (OnlineState) Enum.valueOf(OnlineState.class, str);
    }

    public static OnlineState[] values() {
        return (OnlineState[]) g.clone();
    }
}
