package com.google.common.hash;

import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class LittleEndianByteArray {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class JavaLittleEndianBytes implements LittleEndianBytes {
        public static final AnonymousClass1 d;
        public static final /* synthetic */ JavaLittleEndianBytes[] e;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.hash.LittleEndianByteArray$JavaLittleEndianBytes$1] */
        static {
            ?? r0 = new JavaLittleEndianBytes() { // from class: com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes.1
            };
            d = r0;
            e = new JavaLittleEndianBytes[]{r0};
        }

        public static JavaLittleEndianBytes valueOf(String str) {
            return (JavaLittleEndianBytes) Enum.valueOf(JavaLittleEndianBytes.class, str);
        }

        public static JavaLittleEndianBytes[] values() {
            return (JavaLittleEndianBytes[]) e.clone();
        }
    }

    public interface LittleEndianBytes {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class UnsafeByteArray implements LittleEndianBytes {
        public static final AnonymousClass1 d;
        public static final AnonymousClass2 e;
        public static final /* synthetic */ UnsafeByteArray[] f;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$1] */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$2] */
        static {
            ?? r0 = new UnsafeByteArray() { // from class: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.1
            };
            d = r0;
            ?? r1 = new UnsafeByteArray() { // from class: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.2
            };
            e = r1;
            f = new UnsafeByteArray[]{r0, r1};
            Unsafe unsafeA = a();
            unsafeA.arrayBaseOffset(byte[].class);
            if (unsafeA.arrayIndexScale(byte[].class) != 1) {
                throw new AssertionError();
            }
        }

        public static Unsafe a() {
            try {
                try {
                    return Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    return (Unsafe) AccessController.doPrivileged(new a());
                }
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        }

        public static /* synthetic */ Unsafe b() throws IllegalAccessException, SecurityException, IllegalArgumentException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        public static UnsafeByteArray valueOf(String str) {
            return (UnsafeByteArray) Enum.valueOf(UnsafeByteArray.class, str);
        }

        public static UnsafeByteArray[] values() {
            return (UnsafeByteArray[]) f.clone();
        }
    }

    static {
        try {
            if ("amd64".equals(System.getProperty("os.arch"))) {
                if (ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) {
                    UnsafeByteArray.AnonymousClass1 anonymousClass1 = UnsafeByteArray.d;
                } else {
                    UnsafeByteArray.AnonymousClass2 anonymousClass2 = UnsafeByteArray.e;
                }
            }
        } catch (Throwable unused) {
        }
    }
}
