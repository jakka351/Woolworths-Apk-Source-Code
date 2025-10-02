package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;

@Immutable
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class Murmur3_128HashFunction extends AbstractHashFunction implements Serializable {
    public static final HashFunction d = null;

    public static final class Murmur3_128Hasher extends AbstractStreamingHasher {
    }

    static {
        int i = Hashing.f14919a;
    }

    public final boolean equals(Object obj) {
        return obj instanceof Murmur3_128HashFunction;
    }

    public final int hashCode() {
        return Murmur3_128HashFunction.class.hashCode();
    }

    public final String toString() {
        return "Hashing.murmur3_128(0)";
    }
}
