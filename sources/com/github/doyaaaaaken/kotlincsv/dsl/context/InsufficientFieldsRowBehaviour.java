package com.github.doyaaaaaken.kotlincsv.dsl.context;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/github/doyaaaaaken/kotlincsv/dsl/context/InsufficientFieldsRowBehaviour;", "", "kotlin-csv"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InsufficientFieldsRowBehaviour {
    public static final /* synthetic */ InsufficientFieldsRowBehaviour[] d = {new InsufficientFieldsRowBehaviour("ERROR", 0), new InsufficientFieldsRowBehaviour("IGNORE", 1), new InsufficientFieldsRowBehaviour("EMPTY_STRING", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    InsufficientFieldsRowBehaviour EF5;

    public static InsufficientFieldsRowBehaviour valueOf(String str) {
        return (InsufficientFieldsRowBehaviour) Enum.valueOf(InsufficientFieldsRowBehaviour.class, str);
    }

    public static InsufficientFieldsRowBehaviour[] values() {
        return (InsufficientFieldsRowBehaviour[]) d.clone();
    }
}
