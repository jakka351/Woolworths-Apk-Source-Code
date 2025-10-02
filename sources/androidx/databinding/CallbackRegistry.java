package androidx.databinding;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class CallbackRegistry<C, T, A> implements Cloneable {
    public ArrayList d = new ArrayList();
    public long e = 0;
    public long[] f;
    public int g;
    public final NotifierCallback h;

    public static abstract class NotifierCallback<C, T, A> {
        public abstract void a(int i, Object obj, Object obj2, Object obj3);
    }

    public CallbackRegistry(NotifierCallback notifierCallback) {
        this.h = notifierCallback;
    }

    public final boolean a(int i) {
        int i2;
        if (i < 64) {
            return ((1 << i) & this.e) != 0;
        }
        long[] jArr = this.f;
        if (jArr != null && (i2 = (i / 64) - 1) < jArr.length) {
            return ((1 << (i % 64)) & jArr[i2]) != 0;
        }
        return false;
    }

    public synchronized void b(int i, Object obj, Object obj2) throws Throwable {
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.g++;
            int size = this.d.size();
            int length = this.f == null ? -1 : r0.length - 1;
            d(obj, i, length, obj2);
            c(obj, i, obj2, (length + 2) * 64, size, 0L);
            int i2 = this.g - 1;
            this.g = i2;
            if (i2 == 0) {
                long[] jArr = this.f;
                if (jArr != null) {
                    for (int length2 = jArr.length - 1; length2 >= 0; length2--) {
                        long j = this.f[length2];
                        if (j != 0) {
                            e((length2 + 1) * 64, j);
                            this.f[length2] = 0;
                        }
                    }
                }
                long j2 = this.e;
                if (j2 != 0) {
                    e(0, j2);
                    this.e = 0L;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void c(Object obj, int i, Object obj2, int i2, int i3, long j) {
        long j2 = 1;
        while (i2 < i3) {
            if ((j & j2) == 0) {
                this.h.a(i, this.d.get(i2), obj, obj2);
            }
            j2 <<= 1;
            i2++;
        }
    }

    public final Object clone() {
        CallbackRegistry callbackRegistry;
        CloneNotSupportedException e;
        synchronized (this) {
            try {
                callbackRegistry = (CallbackRegistry) super.clone();
                try {
                    callbackRegistry.e = 0L;
                    callbackRegistry.f = null;
                    callbackRegistry.g = 0;
                    callbackRegistry.d = new ArrayList();
                    int size = this.d.size();
                    for (int i = 0; i < size; i++) {
                        if (!a(i)) {
                            callbackRegistry.d.add(this.d.get(i));
                        }
                    }
                } catch (CloneNotSupportedException e2) {
                    e = e2;
                    e.printStackTrace();
                    return callbackRegistry;
                }
            } catch (CloneNotSupportedException e3) {
                callbackRegistry = null;
                e = e3;
            }
        }
        return callbackRegistry;
    }

    public final void d(Object obj, int i, int i2, Object obj2) {
        if (i2 < 0) {
            c(obj, i, obj2, 0, Math.min(64, this.d.size()), this.e);
            return;
        }
        long j = this.f[i2];
        int i3 = (i2 + 1) * 64;
        int iMin = Math.min(this.d.size(), i3 + 64);
        d(obj, i, i2 - 1, obj2);
        c(obj, i, obj2, i3, iMin, j);
    }

    public final void e(int i, long j) {
        long j2 = Long.MIN_VALUE;
        for (int i2 = i + 63; i2 >= i; i2--) {
            if ((j & j2) != 0) {
                this.d.remove(i2);
            }
            j2 >>>= 1;
        }
    }

    public final void f(int i) {
        if (i < 64) {
            this.e = (1 << i) | this.e;
            return;
        }
        int i2 = (i / 64) - 1;
        long[] jArr = this.f;
        if (jArr == null) {
            this.f = new long[this.d.size() / 64];
        } else if (jArr.length <= i2) {
            long[] jArr2 = new long[this.d.size() / 64];
            long[] jArr3 = this.f;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f = jArr2;
        }
        long j = 1 << (i % 64);
        long[] jArr4 = this.f;
        jArr4[i2] = j | jArr4[i2];
    }
}
