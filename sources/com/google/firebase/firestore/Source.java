package com.google.firebase.firestore;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Source {
    public static final /* synthetic */ Source[] d = {new Source("DEFAULT", 0), new Source("SERVER", 1), new Source("CACHE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    Source EF5;

    public static Source valueOf(String str) {
        return (Source) Enum.valueOf(Source.class, str);
    }

    public static Source[] values() {
        return (Source[]) d.clone();
    }
}
