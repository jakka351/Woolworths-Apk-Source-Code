package com.google.common.hash;

import com.google.common.annotations.GwtIncompatible;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
abstract class Striped64 extends Number {
    public static final ThreadLocal g = new ThreadLocal();
    public static final Random h = new Random();
    public static final int i = Runtime.getRuntime().availableProcessors();
    public static final Unsafe j;
    public static final long k;
    public static final long l;
    public volatile transient Cell[] d;
    public volatile transient long e;
    public volatile transient int f;

    /* renamed from: com.google.common.hash.Striped64$1, reason: invalid class name */
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

    public static final class Cell {
        public static final Unsafe b;
        public static final long c;

        /* renamed from: a, reason: collision with root package name */
        public volatile long f14921a;

        static {
            try {
                Unsafe unsafeC = Striped64.c();
                b = unsafeC;
                c = unsafeC.objectFieldOffset(Cell.class.getDeclaredField("a"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        public Cell(long j) {
            this.f14921a = j;
        }

        public final boolean a(long j, long j2) {
            return b.compareAndSwapLong(this, c, j, j2);
        }
    }

    static {
        try {
            Unsafe unsafeC = c();
            j = unsafeC;
            k = unsafeC.objectFieldOffset(Striped64.class.getDeclaredField("e"));
            l = unsafeC.objectFieldOffset(Striped64.class.getDeclaredField("f"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public static Unsafe c() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                return (Unsafe) AccessController.doPrivileged(new AnonymousClass1());
            }
        } catch (PrivilegedActionException e) {
            throw new RuntimeException("Could not initialize intrinsics", e.getCause());
        }
    }

    public final boolean a(long j2, long j3) {
        return j.compareAndSwapLong(this, k, j2, j3);
    }

    public final boolean b() {
        return j.compareAndSwapInt(this, l, 0, 1);
    }
}
