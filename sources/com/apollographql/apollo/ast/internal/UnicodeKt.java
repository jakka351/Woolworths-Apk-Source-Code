package com.apollographql.apollo.ast.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"apollo-ast"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UnicodeKt {
    public static final void a(int i, StringBuilder sb) {
        if ((i >>> 16) == 0) {
            sb.append((char) i);
        } else {
            sb.append((char) ((i >>> 10) + 55232));
            sb.append((char) ((i & 1023) + 56320));
        }
    }

    public static final int b(int i, int i2) {
        return ((i << 10) + i2) - 56613888;
    }
}
