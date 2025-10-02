package com.github.doyaaaaaken.kotlincsv.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/github/doyaaaaaken/kotlincsv/util/MalformedCSVException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "kotlin-csv"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public class MalformedCSVException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MalformedCSVException(String message) {
        super(message);
        Intrinsics.h(message, "message");
    }
}
