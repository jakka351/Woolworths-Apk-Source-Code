package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.hash.BloomFilterStrategies;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class BloomFilter<T> implements Predicate<T>, Serializable {
    public final BloomFilterStrategies.LockFreeBitArray d;

    public static class SerialForm<T> implements Serializable {
        public final long[] d;

        public SerialForm(BloomFilter bloomFilter) {
            this.d = BloomFilterStrategies.LockFreeBitArray.a(bloomFilter.d.f14918a);
        }

        public Object readResolve() {
            new BloomFilter(new BloomFilterStrategies.LockFreeBitArray(this.d));
            throw null;
        }
    }

    public interface Strategy extends Serializable {
    }

    public BloomFilter(BloomFilterStrategies.LockFreeBitArray lockFreeBitArray) {
        Preconditions.b(0, "numHashFunctions (%s) must be > 0", false);
        this.d = lockFreeBitArray;
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private Object writeReplace() {
        return new SerialForm(this);
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        throw null;
    }

    @Override // com.google.common.base.Predicate
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BloomFilter) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0, null, null, this.d});
    }
}
