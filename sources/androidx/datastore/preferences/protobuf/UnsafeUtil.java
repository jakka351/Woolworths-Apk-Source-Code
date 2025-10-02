package androidx.datastore.preferences.protobuf;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class UnsafeUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f2681a;
    public static final Class b;
    public static final MemoryAccessor c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final long g;
    public static final boolean h;

    /* renamed from: androidx.datastore.preferences.protobuf.UnsafeUtil$1, reason: invalid class name */
    class AnonymousClass1 implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() throws IllegalAccessException, SecurityException, IllegalArgumentException {
            for (java.lang.reflect.Field field : Unsafe.class.getDeclaredFields()) {
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

    /* loaded from: classes2.dex */
    public static final class Android32MemoryAccessor extends MemoryAccessor {
        public Android32MemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void d(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean e(long j, Object obj) {
            return UnsafeUtil.h ? UnsafeUtil.i(j, obj) != 0 : UnsafeUtil.j(j, obj) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final byte f(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final byte g(long j, Object obj) {
            return UnsafeUtil.h ? UnsafeUtil.i(j, obj) : UnsafeUtil.j(j, obj);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final double h(long j, Object obj) {
            return Double.longBitsToDouble(l(j, obj));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final float i(long j, Object obj) {
            return Float.intBitsToFloat(j(j, obj));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final long k(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void o(Object obj, long j, boolean z) {
            if (UnsafeUtil.h) {
                UnsafeUtil.n(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                UnsafeUtil.o(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void p(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void q(Object obj, long j, byte b) {
            if (UnsafeUtil.h) {
                UnsafeUtil.n(obj, j, b);
            } else {
                UnsafeUtil.o(obj, j, b);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void r(Object obj, long j, double d) {
            u(obj, j, Double.doubleToLongBits(d));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void s(Object obj, long j, float f) {
            t(obj, Float.floatToIntBits(f), j);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean x() {
            return false;
        }
    }

    public static final class Android64MemoryAccessor extends MemoryAccessor {
        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void d(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean e(long j, Object obj) {
            return UnsafeUtil.h ? UnsafeUtil.i(j, obj) != 0 : UnsafeUtil.j(j, obj) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final byte f(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final byte g(long j, Object obj) {
            return UnsafeUtil.h ? UnsafeUtil.i(j, obj) : UnsafeUtil.j(j, obj);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final double h(long j, Object obj) {
            return Double.longBitsToDouble(l(j, obj));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final float i(long j, Object obj) {
            return Float.intBitsToFloat(j(j, obj));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final long k(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void o(Object obj, long j, boolean z) {
            if (UnsafeUtil.h) {
                UnsafeUtil.n(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                UnsafeUtil.o(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void p(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void q(Object obj, long j, byte b) {
            if (UnsafeUtil.h) {
                UnsafeUtil.n(obj, j, b);
            } else {
                UnsafeUtil.o(obj, j, b);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void r(Object obj, long j, double d) {
            u(obj, j, Double.doubleToLongBits(d));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void s(Object obj, long j, float f) {
            t(obj, Float.floatToIntBits(f), j);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean x() {
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static final class JvmMemoryAccessor extends MemoryAccessor {
        public JvmMemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void c(long j, byte[] bArr, long j2, long j3) {
            this.f2682a.copyMemory((Object) null, j, bArr, UnsafeUtil.f + j2, j3);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void d(byte[] bArr, long j, long j2, long j3) {
            this.f2682a.copyMemory(bArr, UnsafeUtil.f + j, (Object) null, j2, j3);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean e(long j, Object obj) {
            return this.f2682a.getBoolean(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final byte f(long j) {
            return this.f2682a.getByte(j);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final byte g(long j, Object obj) {
            return this.f2682a.getByte(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final double h(long j, Object obj) {
            return this.f2682a.getDouble(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final float i(long j, Object obj) {
            return this.f2682a.getFloat(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final long k(long j) {
            return this.f2682a.getLong(j);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void o(Object obj, long j, boolean z) {
            this.f2682a.putBoolean(obj, j, z);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void p(long j, byte b) {
            this.f2682a.putByte(j, b);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void q(Object obj, long j, byte b) {
            this.f2682a.putByte(obj, j, b);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void r(Object obj, long j, double d) {
            this.f2682a.putDouble(obj, j, d);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void s(Object obj, long j, float f) {
            this.f2682a.putFloat(obj, j, f);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean w() {
            if (!super.w()) {
                return false;
            }
            try {
                Class<?> cls = this.f2682a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                UnsafeUtil.a(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean x() {
            if (!super.x()) {
                return false;
            }
            try {
                Class<?> cls = this.f2682a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                UnsafeUtil.a(th);
                return false;
            }
        }
    }

    public static abstract class MemoryAccessor {

        /* renamed from: a, reason: collision with root package name */
        public final Unsafe f2682a;

        public MemoryAccessor(Unsafe unsafe) {
            this.f2682a = unsafe;
        }

        public final int a(Class cls) {
            return this.f2682a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f2682a.arrayIndexScale(cls);
        }

        public abstract void c(long j, byte[] bArr, long j2, long j3);

        public abstract void d(byte[] bArr, long j, long j2, long j3);

        public abstract boolean e(long j, Object obj);

        public abstract byte f(long j);

        public abstract byte g(long j, Object obj);

        public abstract double h(long j, Object obj);

        public abstract float i(long j, Object obj);

        public final int j(long j, Object obj) {
            return this.f2682a.getInt(obj, j);
        }

        public abstract long k(long j);

        public final long l(long j, Object obj) {
            return this.f2682a.getLong(obj, j);
        }

        public final Object m(long j, Object obj) {
            return this.f2682a.getObject(obj, j);
        }

        public final long n(java.lang.reflect.Field field) {
            return this.f2682a.objectFieldOffset(field);
        }

        public abstract void o(Object obj, long j, boolean z);

        public abstract void p(long j, byte b);

        public abstract void q(Object obj, long j, byte b);

        public abstract void r(Object obj, long j, double d);

        public abstract void s(Object obj, long j, float f);

        public final void t(Object obj, int i, long j) {
            this.f2682a.putInt(obj, j, i);
        }

        public final void u(Object obj, long j, long j2) {
            this.f2682a.putLong(obj, j, j2);
        }

        public final void v(Object obj, long j, Object obj2) {
            this.f2682a.putObject(obj, j, obj2);
        }

        public boolean w() {
            Unsafe unsafe = this.f2682a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                UnsafeUtil.a(th);
                return false;
            }
        }

        public boolean x() {
            Unsafe unsafe = this.f2682a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return UnsafeUtil.f() != null;
            } catch (Throwable th) {
                UnsafeUtil.a(th);
                return false;
            }
        }
    }

    static {
        Unsafe unsafeK = k();
        f2681a = unsafeK;
        b = Android.f2592a;
        boolean zG = g(Long.TYPE);
        boolean zG2 = g(Integer.TYPE);
        MemoryAccessor jvmMemoryAccessor = null;
        if (unsafeK != null) {
            if (!Android.a()) {
                jvmMemoryAccessor = new JvmMemoryAccessor(unsafeK);
            } else if (zG) {
                jvmMemoryAccessor = new Android64MemoryAccessor(unsafeK);
            } else if (zG2) {
                jvmMemoryAccessor = new Android32MemoryAccessor(unsafeK);
            }
        }
        c = jvmMemoryAccessor;
        d = jvmMemoryAccessor == null ? false : jvmMemoryAccessor.x();
        e = jvmMemoryAccessor == null ? false : jvmMemoryAccessor.w();
        f = d(byte[].class);
        d(boolean[].class);
        e(boolean[].class);
        d(int[].class);
        e(int[].class);
        d(long[].class);
        e(long[].class);
        d(float[].class);
        e(float[].class);
        d(double[].class);
        e(double[].class);
        d(Object[].class);
        e(Object[].class);
        java.lang.reflect.Field fieldF = f();
        g = (fieldF == null || jvmMemoryAccessor == null) ? -1L : jvmMemoryAccessor.n(fieldF);
        h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(UnsafeUtil.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static long b(ByteBuffer byteBuffer) {
        return c.l(g, byteBuffer);
    }

    public static Object c(Class cls) {
        try {
            return f2681a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int d(Class cls) {
        if (e) {
            return c.a(cls);
        }
        return -1;
    }

    public static void e(Class cls) {
        if (e) {
            c.b(cls);
        }
    }

    public static java.lang.reflect.Field f() {
        java.lang.reflect.Field declaredField;
        java.lang.reflect.Field declaredField2;
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

    public static boolean g(Class cls) {
        if (!Android.a()) {
            return false;
        }
        try {
            Class cls2 = b;
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

    public static byte h(long j, byte[] bArr) {
        return c.g(f + j, bArr);
    }

    public static byte i(long j, Object obj) {
        return (byte) ((c.j((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte j(long j, Object obj) {
        return (byte) ((c.j((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static Unsafe k() {
        try {
            return (Unsafe) AccessController.doPrivileged(new AnonymousClass1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void l(long j, byte b2) {
        c.p(j, b2);
    }

    public static void m(byte[] bArr, long j, byte b2) {
        c.q(bArr, f + j, b2);
    }

    public static void n(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int iJ = c.j(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        p(obj, ((255 & b2) << i) | (iJ & (~(255 << i))), j2);
    }

    public static void o(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        p(obj, ((255 & b2) << i) | (c.j(j2, obj) & (~(255 << i))), j2);
    }

    public static void p(Object obj, int i, long j) {
        c.t(obj, i, j);
    }

    public static void q(Object obj, long j, long j2) {
        c.u(obj, j, j2);
    }

    public static void r(Object obj, long j, Object obj2) {
        c.v(obj, j, obj2);
    }
}
