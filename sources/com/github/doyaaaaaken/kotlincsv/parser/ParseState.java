package com.github.doyaaaaaken.kotlincsv.parser;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/github/doyaaaaaken/kotlincsv/parser/ParseState;", "", "kotlin-csv"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ParseState {
    public static final ParseState d;
    public static final ParseState e;
    public static final ParseState f;
    public static final ParseState g;
    public static final ParseState h;
    public static final ParseState i;
    public static final ParseState j;
    public static final /* synthetic */ ParseState[] k;

    static {
        ParseState parseState = new ParseState("START", 0);
        d = parseState;
        ParseState parseState2 = new ParseState("FIELD", 1);
        e = parseState2;
        ParseState parseState3 = new ParseState("DELIMITER", 2);
        f = parseState3;
        ParseState parseState4 = new ParseState("END", 3);
        g = parseState4;
        ParseState parseState5 = new ParseState("QUOTE_START", 4);
        h = parseState5;
        ParseState parseState6 = new ParseState("QUOTE_END", 5);
        i = parseState6;
        ParseState parseState7 = new ParseState("QUOTED_FIELD", 6);
        j = parseState7;
        k = new ParseState[]{parseState, parseState2, parseState3, parseState4, parseState5, parseState6, parseState7};
    }

    public static ParseState valueOf(String str) {
        return (ParseState) Enum.valueOf(ParseState.class, str);
    }

    public static ParseState[] values() {
        return (ParseState[]) k.clone();
    }
}
