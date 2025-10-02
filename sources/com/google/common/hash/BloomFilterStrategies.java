package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.BloomFilter;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
abstract class BloomFilterStrategies implements BloomFilter.Strategy {
    public static final /* synthetic */ BloomFilterStrategies[] d = {new BloomFilterStrategies() { // from class: com.google.common.hash.BloomFilterStrategies.1
    }, new BloomFilterStrategies() { // from class: com.google.common.hash.BloomFilterStrategies.2
    }};

    /* JADX INFO: Fake field, exist only in values array */
    BloomFilterStrategies EF2;

    public static final class LockFreeBitArray {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicLongArray f14918a;
        public final LongAddable b;

        public LockFreeBitArray(long[] jArr) {
            Preconditions.f("data length is zero!", jArr.length > 0);
            this.f14918a = new AtomicLongArray(jArr);
            this.b = (LongAddable) LongAddables.f14920a.get();
            long jBitCount = 0;
            for (long j : jArr) {
                jBitCount += Long.bitCount(j);
            }
            this.b.add(jBitCount);
        }

        public static long[] a(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = atomicLongArray.get(i);
            }
            return jArr;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof LockFreeBitArray) {
                return Arrays.equals(a(this.f14918a), a(((LockFreeBitArray) obj).f14918a));
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(a(this.f14918a));
        }
    }

    public static BloomFilterStrategies valueOf(String str) {
        return (BloomFilterStrategies) Enum.valueOf(BloomFilterStrategies.class, str);
    }

    public static BloomFilterStrategies[] values() {
        return (BloomFilterStrategies[]) d.clone();
    }
}
