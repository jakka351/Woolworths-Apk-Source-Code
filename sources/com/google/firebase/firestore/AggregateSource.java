package com.google.firebase.firestore;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class AggregateSource {
    public static final /* synthetic */ AggregateSource[] d = {new AggregateSource("SERVER", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    AggregateSource EF5;

    public static AggregateSource valueOf(String str) {
        return (AggregateSource) Enum.valueOf(AggregateSource.class, str);
    }

    public static AggregateSource[] values() {
        return (AggregateSource[]) d.clone();
    }
}
