package com.google.common.primitives;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Comparator;
import java.util.Objects;
import sun.misc.Unsafe;

@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes6.dex */
public final class UnsignedBytes {

    @VisibleForTesting
    public static class LexicographicalComparatorHolder {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class PureJavaComparator implements Comparator<byte[]> {
            public static final /* synthetic */ PureJavaComparator[] d = {new PureJavaComparator("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            PureJavaComparator EF5;

            public static PureJavaComparator valueOf(String str) {
                return (PureJavaComparator) Enum.valueOf(PureJavaComparator.class, str);
            }

            public static PureJavaComparator[] values() {
                return (PureJavaComparator[]) d.clone();
            }

            @Override // java.util.Comparator
            public final int compare(byte[] bArr, byte[] bArr2) {
                byte[] bArr3 = bArr;
                byte[] bArr4 = bArr2;
                int iMin = Math.min(bArr3.length, bArr4.length);
                for (int i = 0; i < iMin; i++) {
                    int i2 = (bArr3[i] & 255) - (bArr4[i] & 255);
                    if (i2 != 0) {
                        return i2;
                    }
                }
                return bArr3.length - bArr4.length;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @VisibleForTesting
        public static final class UnsafeComparator implements Comparator<byte[]> {
            public static final Unsafe e;
            public static final int f;

            /* JADX INFO: Fake field, exist only in values array */
            UnsafeComparator EF5;
            public static final /* synthetic */ UnsafeComparator[] g = {new UnsafeComparator("INSTANCE", 0)};
            public static final boolean d = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);

            /* renamed from: com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator$1, reason: invalid class name */
            class AnonymousClass1 implements PrivilegedExceptionAction<Unsafe> {
                public static Unsafe a() throws IllegalAccessException, SecurityException, IllegalArgumentException {
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    throw new NoSuchFieldError("the Unsafe");
                }

                @Override // java.security.PrivilegedExceptionAction
                public final /* bridge */ /* synthetic */ Unsafe run() {
                    return a();
                }
            }

            static {
                Unsafe unsafeB = b();
                e = unsafeB;
                int iArrayBaseOffset = unsafeB.arrayBaseOffset(byte[].class);
                f = iArrayBaseOffset;
                if (!"64".equals(System.getProperty("sun.arch.data.model")) || iArrayBaseOffset % 8 != 0 || unsafeB.arrayIndexScale(byte[].class) != 1) {
                    throw new Error();
                }
            }

            public static int a(byte[] bArr, byte[] bArr2) {
                int iMin = Math.min(bArr.length, bArr2.length);
                int i = iMin & (-8);
                int i2 = 0;
                while (i2 < i) {
                    Unsafe unsafe = e;
                    long j = f + i2;
                    long j2 = unsafe.getLong(bArr, j);
                    long j3 = unsafe.getLong(bArr2, j);
                    if (j2 != j3) {
                        if (d) {
                            return Long.compareUnsigned(j2, j3);
                        }
                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j2 ^ j3) & (-8);
                        return ((int) ((j2 >>> iNumberOfTrailingZeros) & 255)) - ((int) ((j3 >>> iNumberOfTrailingZeros) & 255));
                    }
                    i2 += 8;
                }
                while (i2 < iMin) {
                    int i3 = (bArr[i2] & 255) - (bArr2[i2] & 255);
                    if (i3 != 0) {
                        return i3;
                    }
                    i2++;
                }
                return bArr.length - bArr2.length;
            }

            public static Unsafe b() {
                try {
                    try {
                        return Unsafe.getUnsafe();
                    } catch (SecurityException unused) {
                        return (Unsafe) AccessController.doPrivileged(new AnonymousClass1());
                    }
                } catch (PrivilegedActionException e2) {
                    throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
                }
            }

            public static UnsafeComparator valueOf(String str) {
                return (UnsafeComparator) Enum.valueOf(UnsafeComparator.class, str);
            }

            public static UnsafeComparator[] values() {
                return (UnsafeComparator[]) g.clone();
            }

            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
                return a(bArr, bArr2);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
            }
        }

        static {
            try {
                Object[] enumConstants = Class.forName(LexicographicalComparatorHolder.class.getName().concat("$UnsafeComparator")).getEnumConstants();
                Objects.requireNonNull(enumConstants);
            } catch (Throwable unused) {
            }
        }
    }
}
