package com.github.doyaaaaaken.kotlincsv.util;

import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/github/doyaaaaaken/kotlincsv/util/CSVParseFormatException;", "Lcom/github/doyaaaaaken/kotlincsv/util/MalformedCSVException;", "kotlin-csv"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CSVParseFormatException extends MalformedCSVException {
    public CSVParseFormatException(long j, long j2, char c, String message) {
        Intrinsics.h(message, "message");
        StringBuilder sb = new StringBuilder();
        sb.append(message);
        sb.append(" [rowNum = ");
        sb.append(j);
        a.A(sb, ", colIndex = ", j2, ", char = ");
        sb.append(c);
        sb.append(']');
        super(sb.toString());
    }
}
