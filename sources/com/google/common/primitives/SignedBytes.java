package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes6.dex */
public final class SignedBytes {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LexicographicalComparator implements Comparator<byte[]> {
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
        public final int compare(byte[] bArr, byte[] bArr2) {
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            int iMin = Math.min(bArr3.length, bArr4.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = Byte.compare(bArr3[i], bArr4[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return bArr3.length - bArr4.length;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "SignedBytes.lexicographicalComparator()";
        }
    }
}
