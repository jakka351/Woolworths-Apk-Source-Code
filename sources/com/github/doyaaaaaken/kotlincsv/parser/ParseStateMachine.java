package com.github.doyaaaaaken.kotlincsv.parser;

import com.github.doyaaaaaken.kotlincsv.util.CSVParseFormatException;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/github/doyaaaaaken/kotlincsv/parser/ParseStateMachine;", "", "kotlin-csv"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ParseStateMachine {

    /* renamed from: a, reason: collision with root package name */
    public ParseState f14348a = ParseState.d;
    public final ArrayList b = new ArrayList();
    public final StringBuilder c = new StringBuilder();
    public long d;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ParseState.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[4] = 4;
            iArr[6] = 5;
            iArr[5] = 6;
            iArr[3] = 7;
        }
    }

    public final void a() {
        StringBuilder sb = this.c;
        this.b.add(sb.toString());
        sb.setLength(0);
    }

    public final long b(char c, Character ch, long j) {
        long j2 = this.d;
        int iOrdinal = this.f14348a.ordinal();
        ParseState parseState = ParseState.h;
        ParseState parseState2 = ParseState.e;
        ParseState parseState3 = ParseState.f;
        StringBuilder sb = this.c;
        ParseState parseState4 = ParseState.g;
        switch (iOrdinal) {
            case 0:
                if (c != 65279) {
                    if (c == '\"') {
                        this.f14348a = parseState;
                    } else if (c == ',') {
                        a();
                        this.f14348a = parseState3;
                    } else if (c == '\n' || c == 8232 || c == 8233 || c == 133) {
                        a();
                        this.f14348a = parseState4;
                    } else if (c == '\r') {
                        if (ch != null && ch.charValue() == '\n') {
                            this.d++;
                        }
                        a();
                        this.f14348a = parseState4;
                    } else {
                        sb.append(c);
                        this.f14348a = parseState2;
                    }
                }
                this.d++;
                break;
            case 1:
                if (c == '\"') {
                    if (ch == null || ch.charValue() != '\"') {
                        throw new CSVParseFormatException(j, this.d, c, "must appear escapeChar(\") after escapeChar(\")");
                    }
                    sb.append(ch.charValue());
                    this.f14348a = parseState2;
                    this.d++;
                } else if (c == ',') {
                    a();
                    this.f14348a = parseState3;
                } else if (c == '\n' || c == 8232 || c == 8233 || c == 133) {
                    a();
                    this.f14348a = parseState4;
                } else if (c == '\r') {
                    if (ch != null && ch.charValue() == '\n') {
                        this.d++;
                    }
                    a();
                    this.f14348a = parseState4;
                } else {
                    sb.append(c);
                    this.f14348a = parseState2;
                }
                this.d++;
                break;
            case 2:
                if (c == '\"') {
                    this.f14348a = parseState;
                } else if (c == ',') {
                    a();
                    this.f14348a = parseState3;
                } else if (c == '\n' || c == 8232 || c == 8233 || c == 133) {
                    a();
                    this.f14348a = parseState4;
                } else if (c == '\r') {
                    if (ch != null && ch.charValue() == '\n') {
                        this.d++;
                    }
                    a();
                    this.f14348a = parseState4;
                } else {
                    sb.append(c);
                    this.f14348a = parseState2;
                }
                this.d++;
                break;
            case 3:
                throw new CSVParseFormatException(j, this.d, c, "unexpected error");
            case 4:
            case 6:
                ParseState parseState5 = ParseState.j;
                if (c != '\"') {
                    sb.append(c);
                    this.f14348a = parseState5;
                } else if (ch != null && ch.charValue() == '\"') {
                    sb.append('\"');
                    this.f14348a = parseState5;
                    this.d++;
                } else {
                    this.f14348a = ParseState.i;
                }
                this.d++;
                break;
            case 5:
                if (c == ',') {
                    a();
                    this.f14348a = parseState3;
                } else if (c == '\n' || c == 8232 || c == 8233 || c == 133) {
                    a();
                    this.f14348a = parseState4;
                } else {
                    if (c != '\r') {
                        throw new CSVParseFormatException(j, this.d, c, "must appear delimiter or line terminator after quote end");
                    }
                    if (ch != null && ch.charValue() == '\n') {
                        this.d++;
                    }
                    a();
                    this.f14348a = parseState4;
                }
                this.d++;
                break;
        }
        return this.d - j2;
    }
}
