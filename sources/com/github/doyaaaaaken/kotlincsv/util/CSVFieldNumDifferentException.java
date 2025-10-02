package com.github.doyaaaaaken.kotlincsv.util;

import YU.a;
import io.jsonwebtoken.JwtParser;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/github/doyaaaaaken/kotlincsv/util/CSVFieldNumDifferentException;", "Lcom/github/doyaaaaaken/kotlincsv/util/MalformedCSVException;", "kotlin-csv"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CSVFieldNumDifferentException extends MalformedCSVException {
    public CSVFieldNumDifferentException(int i, int i2, int i3) {
        super(a.l(a.q(i, i3, "Fields num seems to be ", " on each row, but on ", "th csv row, fields num is "), i2, JwtParser.SEPARATOR_CHAR));
    }
}
