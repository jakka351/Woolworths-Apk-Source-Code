package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import java.math.BigInteger;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes6.dex */
public final class UnsignedLongs {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LexicographicalComparator implements Comparator<long[]> {
        public static final /* synthetic */ LexicographicalComparator[] d = {new LexicographicalComparator("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        LexicographicalComparator EF5;

        public static LexicographicalComparator valueOf(String str) {
            return (LexicographicalComparator) Enum.valueOf(LexicographicalComparator.class, str);
        }

        public static LexicographicalComparator[] values() {
            return (LexicographicalComparator[]) d.clone();
        }

        @Override // java.util.Comparator
        public final int compare(long[] jArr, long[] jArr2) {
            long[] jArr3 = jArr;
            long[] jArr4 = jArr2;
            int iMin = Math.min(jArr3.length, jArr4.length);
            for (int i = 0; i < iMin; i++) {
                long j = jArr3[i];
                long j2 = jArr4[i];
                if (j != j2) {
                    return UnsignedLongs.a(j, j2);
                }
            }
            return jArr3.length - jArr4.length;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }
    }

    public static final class ParseOverflowDetection {

        /* renamed from: a, reason: collision with root package name */
        public static final long[] f14943a = new long[37];
        public static final int[] b = new int[37];
        public static final int[] c = new int[37];

        static {
            long j;
            BigInteger bigInteger = new BigInteger("10000000000000000", 16);
            for (int i = 2; i <= 36; i++) {
                long[] jArr = f14943a;
                long j2 = i;
                long j3 = -1;
                if (j2 < 0) {
                    j = UnsignedLongs.a(-1L, j2) < 0 ? 0L : 1L;
                } else {
                    long j4 = (Long.MAX_VALUE / j2) << 1;
                    j = j4 + (UnsignedLongs.a((-1) - (j4 * j2), j2) >= 0 ? 1 : 0);
                }
                jArr[i] = j;
                int[] iArr = b;
                if (j2 < 0) {
                    if (UnsignedLongs.a(-1L, j2) < 0) {
                    }
                    iArr[i] = (int) j3;
                    c[i] = bigInteger.toString(i).length() - 1;
                } else {
                    j3 = (-1) - (((Long.MAX_VALUE / j2) << 1) * j2);
                    if (UnsignedLongs.a(j3, j2) < 0) {
                        j2 = 0;
                    }
                }
                j3 -= j2;
                iArr[i] = (int) j3;
                c[i] = bigInteger.toString(i).length() - 1;
            }
        }
    }

    public static int a(long j, long j2) {
        return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }
}
