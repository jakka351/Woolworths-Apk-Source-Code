package com.github.doyaaaaaken.kotlincsv.dsl.context;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/github/doyaaaaaken/kotlincsv/dsl/context/WriteQuoteMode;", "", "kotlin-csv"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WriteQuoteMode {
    public static final /* synthetic */ WriteQuoteMode[] d = {new WriteQuoteMode("CANONICAL", 0), new WriteQuoteMode("ALL", 1), new WriteQuoteMode("NON_NUMERIC", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    WriteQuoteMode EF5;

    public static WriteQuoteMode valueOf(String str) {
        return (WriteQuoteMode) Enum.valueOf(WriteQuoteMode.class, str);
    }

    public static WriteQuoteMode[] values() {
        return (WriteQuoteMode[]) d.clone();
    }
}
