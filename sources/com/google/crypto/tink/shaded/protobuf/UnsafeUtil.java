package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class UnsafeUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f15120a = Logger.getLogger(UnsafeUtil.class.getName());
    public static final Unsafe b;
    public static final Class c;
    public static final MemoryAccessor d;
    public static final boolean e;
    public static final boolean f;
    public static final long g;
    public static final long h;
    public static final boolean i;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.UnsafeUtil$1, reason: invalid class name */
    class AnonymousClass1 implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() throws IllegalAccessException, SecurityException, IllegalArgumentException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() {
            return a();
        }
    }

    /* loaded from: classes6.dex */
    public static final class Android32MemoryAccessor extends MemoryAccessor {
        public Android32MemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final void c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final void d(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean e(long j, Object obj) {
            return UnsafeUtil.i ? UnsafeUtil.g(j, obj) != 0 : UnsafeUtil.h(j, obj) != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final byte f(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final byte g(long j, Object obj) {
            return UnsafeUtil.i ? UnsafeUtil.g(j, obj) : UnsafeUtil.h(j, obj);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final double h(long j, Object obj) {
            return Double.longBitsToDouble(l(j, obj));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final float i(long j, Object obj) {
            return Float.intBitsToFloat(j(j, obj));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final long k(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final void o(Object obj, long j, boolean z) {
            if (UnsafeUtil.i) {
                UnsafeUtil.l(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                UnsafeUtil.m(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final void p(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final void q(Object obj, long j, byte b) {
            if (UnsafeUtil.i) {
                UnsafeUtil.l(obj, j, b);
            } else {
                UnsafeUtil.m(obj, j, b);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final void r(Object obj, long j, double d) {
            u(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final void s(Object obj, long j, float f) {
            t(obj, Float.floatToIntBits(f), j);
        }
    }

    public static final class Android64MemoryAccessor extends MemoryAccessor {
        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final void c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final void d(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean e(long j, Object obj) {
            return UnsafeUtil.i ? UnsafeUtil.g(j, obj) != 0 : UnsafeUtil.h(j, obj) != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final byte f(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final byte g(long j, Object obj) {
            return UnsafeUtil.i ? UnsafeUtil.g(j, obj) : UnsafeUtil.h(j, obj);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final double h(long j, Object obj) {
            return Double.longBitsToDouble(l(j, obj));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final float i(long j, Object obj) {
            return Float.intBitsToFloat(j(j, obj));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final long k(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final void o(Object obj, long j, boolean z) {
            if (UnsafeUtil.i) {
                UnsafeUtil.l(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                UnsafeUtil.m(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final void p(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final void q(Object obj, long j, byte b) {
            if (UnsafeUtil.i) {
                UnsafeUtil.l(obj, j, b);
            } else {
                UnsafeUtil.m(obj, j, b);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final void r(Object obj, long j, double d) {
            u(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final void s(Object obj, long j, float f) {
            t(obj, Float.floatToIntBits(f), j);
        }
    }

    /* loaded from: classes6.dex */
    public static final class JvmMemoryAccessor extends MemoryAccessor {
        public JvmMemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final void c(long j, byte[] bArr, long j2, long j3) {
            this.f15121a.copyMemory((Object) null, j, bArr, UnsafeUtil.g + j2, j3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final void d(byte[] bArr, long j, long j2, long j3) {
            this.f15121a.copyMemory(bArr, UnsafeUtil.g + j, (Object) null, j2, j3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean e(long j, Object obj) {
            return this.f15121a.getBoolean(obj, j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final byte f(long j) {
            return this.f15121a.getByte(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final byte g(long j, Object obj) {
            return this.f15121a.getByte(obj, j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final double h(long j, Object obj) {
            return this.f15121a.getDouble(obj, j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final float i(long j, Object obj) {
            return this.f15121a.getFloat(obj, j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final long k(long j) {
            return this.f15121a.getLong(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final void o(Object obj, long j, boolean z) {
            this.f15121a.putBoolean(obj, j, z);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final void p(long j, byte b) {
            this.f15121a.putByte(j, b);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final void q(Object obj, long j, byte b) {
            this.f15121a.putByte(obj, j, b);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final void r(Object obj, long j, double d) {
            this.f15121a.putDouble(obj, j, d);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public final void s(Object obj, long j, float f) {
            this.f15121a.putFloat(obj, j, f);
        }
    }

    public static abstract class MemoryAccessor {

        /* renamed from: a, reason: collision with root package name */
        public final Unsafe f15121a;

        public MemoryAccessor(Unsafe unsafe) {
            this.f15121a = unsafe;
        }

        public final int a(Class cls) {
            return this.f15121a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f15121a.arrayIndexScale(cls);
        }

        public abstract void c(long j, byte[] bArr, long j2, long j3);

        public abstract void d(byte[] bArr, long j, long j2, long j3);

        public abstract boolean e(long j, Object obj);

        public abstract byte f(long j);

        public abstract byte g(long j, Object obj);

        public abstract double h(long j, Object obj);

        public abstract float i(long j, Object obj);

        public final int j(long j, Object obj) {
            return this.f15121a.getInt(obj, j);
        }

        public abstract long k(long j);

        public final long l(long j, Object obj) {
            return this.f15121a.getLong(obj, j);
        }

        public final Object m(long j, Object obj) {
            return this.f15121a.getObject(obj, j);
        }

        public final long n(Field field) {
            return this.f15121a.objectFieldOffset(field);
        }

        public abstract void o(Object obj, long j, boolean z);

        public abstract void p(long j, byte b);

        public abstract void q(Object obj, long j, byte b);

        public abstract void r(Object obj, long j, double d);

        public abstract void s(Object obj, long j, float f);

        public final void t(Object obj, int i, long j) {
            this.f15121a.putInt(obj, j, i);
        }

        public final void u(Object obj, long j, long j2) {
            this.f15121a.putLong(obj, j, j2);
        }

        public final void v(Object obj, long j, Object obj2) {
            this.f15121a.putObject(obj, j, obj2);
        }
    }

    static {
        Class cls;
        Class<?> cls2;
        boolean z;
        boolean z2;
        MemoryAccessor memoryAccessor;
        Unsafe unsafeI = i();
        b = unsafeI;
        c = Android.f15076a;
        Class cls3 = Long.TYPE;
        boolean zE = e(cls3);
        Class cls4 = Integer.TYPE;
        boolean zE2 = e(cls4);
        MemoryAccessor jvmMemoryAccessor = null;
        if (unsafeI != null) {
            if (!Android.a()) {
                jvmMemoryAccessor = new JvmMemoryAccessor(unsafeI);
            } else if (zE) {
                jvmMemoryAccessor = new Android64MemoryAccessor(unsafeI);
            } else if (zE2) {
                jvmMemoryAccessor = new Android32MemoryAccessor(unsafeI);
            }
        }
        d = jvmMemoryAccessor;
        Class cls5 = Byte.TYPE;
        if (unsafeI == null) {
            cls = Field.class;
            z = false;
        } else {
            try {
                cls2 = unsafeI.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls3);
            } catch (Throwable th) {
                cls = Field.class;
                f15120a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            }
            if (d() == null) {
                cls = Field.class;
                z = false;
            } else {
                if (!Android.a()) {
                    cls2.getMethod("getByte", cls3);
                    cls2.getMethod("putByte", cls3, cls5);
                    cls2.getMethod("getInt", cls3);
                    cls2.getMethod("putInt", cls3, cls4);
                    cls2.getMethod("getLong", cls3);
                    cls2.getMethod("putLong", cls3, cls3);
                    cls2.getMethod("copyMemory", cls3, cls3, cls3);
                    cls2.getMethod("copyMemory", Object.class, cls3, Object.class, cls3, cls3);
                }
                cls = Field.class;
                z = true;
            }
        }
        e = z;
        Unsafe unsafe = b;
        if (unsafe == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls6 = unsafe.getClass();
                cls6.getMethod("objectFieldOffset", cls);
                cls6.getMethod("arrayBaseOffset", Class.class);
                cls6.getMethod("arrayIndexScale", Class.class);
                cls6.getMethod("getInt", Object.class, cls3);
                cls6.getMethod("putInt", Object.class, cls3, cls4);
                cls6.getMethod("getLong", Object.class, cls3);
                cls6.getMethod("putLong", Object.class, cls3, cls3);
                cls6.getMethod("getObject", Object.class, cls3);
                cls6.getMethod("putObject", Object.class, cls3, Object.class);
                if (!Android.a()) {
                    cls6.getMethod("getByte", Object.class, cls3);
                    cls6.getMethod("putByte", Object.class, cls3, cls5);
                    cls6.getMethod("getBoolean", Object.class, cls3);
                    cls6.getMethod("putBoolean", Object.class, cls3, Boolean.TYPE);
                    cls6.getMethod("getFloat", Object.class, cls3);
                    cls6.getMethod("putFloat", Object.class, cls3, Float.TYPE);
                    cls6.getMethod("getDouble", Object.class, cls3);
                    cls6.getMethod("putDouble", Object.class, cls3, Double.TYPE);
                }
                z2 = true;
            } catch (Throwable th2) {
                f15120a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
            }
        }
        f = z2;
        g = b(byte[].class);
        b(boolean[].class);
        c(boolean[].class);
        b(int[].class);
        c(int[].class);
        b(long[].class);
        c(long[].class);
        b(float[].class);
        c(float[].class);
        b(double[].class);
        c(double[].class);
        b(Object[].class);
        c(Object[].class);
        Field fieldD = d();
        h = (fieldD == null || (memoryAccessor = d) == null) ? -1L : memoryAccessor.n(fieldD);
        i = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Object a(Class cls) {
        try {
            return b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int b(Class cls) {
        if (f) {
            return d.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (f) {
            d.b(cls);
        }
    }

    public static Field d() {
        Field declaredField;
        Field declaredField2;
        if (Android.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean e(Class cls) {
        if (!Android.a()) {
            return false;
        }
        try {
            Class cls2 = c;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte f(long j, byte[] bArr) {
        return d.g(g + j, bArr);
    }

    public static byte g(long j, Object obj) {
        return (byte) ((d.j((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte h(long j, Object obj) {
        return (byte) ((d.j((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new AnonymousClass1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(long j, byte b2) {
        d.p(j, b2);
    }

    public static void k(byte[] bArr, long j, byte b2) {
        d.q(bArr, g + j, b2);
    }

    public static void l(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int iJ = d.j(j2, obj);
        int i2 = ((~((int) j)) & 3) << 3;
        n(obj, ((255 & b2) << i2) | (iJ & (~(255 << i2))), j2);
    }

    public static void m(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i2 = (((int) j) & 3) << 3;
        n(obj, ((255 & b2) << i2) | (d.j(j2, obj) & (~(255 << i2))), j2);
    }

    public static void n(Object obj, int i2, long j) {
        d.t(obj, i2, j);
    }

    public static void o(Object obj, long j, long j2) {
        d.u(obj, j, j2);
    }

    public static void p(Object obj, long j, Object obj2) {
        d.v(obj, j, obj2);
    }
}
