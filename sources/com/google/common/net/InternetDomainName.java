package com.google.common.net;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.errorprone.annotations.Immutable;
import io.jsonwebtoken.JwtParser;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

@Immutable
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class InternetDomainName {
    static {
        CharMatcher.c(".。．｡");
        new Joiner(String.valueOf(JwtParser.SEPARATOR_CHAR));
        CharMatcher.g('0', '9').q(CharMatcher.g('a', 'z').q(CharMatcher.g('A', Matrix.MATRIX_TYPE_ZERO))).q(CharMatcher.c("-_"));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InternetDomainName) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return null;
    }
}
