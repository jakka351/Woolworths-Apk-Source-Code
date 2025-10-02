package com.google.firebase.firestore;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ListenSource {
    public static final ListenSource d;
    public static final ListenSource e;
    public static final /* synthetic */ ListenSource[] f;

    static {
        ListenSource listenSource = new ListenSource("DEFAULT", 0);
        d = listenSource;
        ListenSource listenSource2 = new ListenSource("CACHE", 1);
        e = listenSource2;
        f = new ListenSource[]{listenSource, listenSource2};
    }

    public static ListenSource valueOf(String str) {
        return (ListenSource) Enum.valueOf(ListenSource.class, str);
    }

    public static ListenSource[] values() {
        return (ListenSource[]) f.clone();
    }
}
