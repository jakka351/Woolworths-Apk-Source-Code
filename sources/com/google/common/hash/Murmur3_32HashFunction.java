package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;

@Immutable
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class Murmur3_32HashFunction extends AbstractHashFunction implements Serializable {

    public static final class Murmur3_32Hasher extends AbstractHasher {
    }

    static {
        int i = Hashing.f14919a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Murmur3_32HashFunction) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        Murmur3_32HashFunction.class.hashCode();
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
