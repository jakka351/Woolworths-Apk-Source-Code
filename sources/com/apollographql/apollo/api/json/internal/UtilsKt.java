package com.apollographql.apollo.api.json.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UtilsKt {
    public static final int a(double d) {
        int i = (int) d;
        if (i == d) {
            return i;
        }
        throw new IllegalStateException((d + " cannot be converted to Int").toString());
    }

    public static final long b(double d) {
        long j = (long) d;
        if (j == d) {
            return j;
        }
        throw new IllegalStateException((d + " cannot be converted to Long").toString());
    }

    public static final double c(long j) {
        double d = j;
        if (((long) d) == j) {
            return d;
        }
        throw new IllegalStateException((j + " cannot be converted to Double").toString());
    }

    public static final int d(long j) {
        int i = (int) j;
        if (i == j) {
            return i;
        }
        throw new IllegalStateException((j + " cannot be converted to Int").toString());
    }
}
