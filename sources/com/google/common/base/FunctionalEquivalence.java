package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Arrays;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class FunctionalEquivalence<F, T> extends Equivalence<F> implements Serializable {
    @Override // com.google.common.base.Equivalence
    public final boolean a(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.common.base.Equivalence
    public final int b(Object obj) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionalEquivalence) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, null});
    }

    public final String toString() {
        return "null.onResultOf(null)";
    }
}
