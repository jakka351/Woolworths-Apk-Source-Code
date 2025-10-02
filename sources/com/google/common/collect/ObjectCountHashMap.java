package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multisets;
import java.util.Arrays;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
class ObjectCountHashMap<K> {

    /* renamed from: a, reason: collision with root package name */
    public transient Object[] f14902a;
    public transient int[] b;
    public transient int c;
    public transient int d;
    public transient int[] e;
    public transient long[] f;
    public transient float g;
    public transient int h;

    public class MapEntry extends Multisets.AbstractEntry<K> {
        public final Object d;
        public int e;

        public MapEntry(int i) {
            this.d = ObjectCountHashMap.this.f14902a[i];
            this.e = i;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final Object a() {
            return this.d;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final int getCount() {
            int i = this.e;
            Object obj = this.d;
            ObjectCountHashMap objectCountHashMap = ObjectCountHashMap.this;
            if (i == -1 || i >= objectCountHashMap.c || !Objects.a(obj, objectCountHashMap.f14902a[i])) {
                this.e = objectCountHashMap.g(obj);
            }
            int i2 = this.e;
            if (i2 == -1) {
                return 0;
            }
            return objectCountHashMap.b[i2];
        }
    }

    public ObjectCountHashMap(int i, int i2) {
        h(i);
    }

    public void a() {
        this.d++;
        Arrays.fill(this.f14902a, 0, this.c, (Object) null);
        Arrays.fill(this.b, 0, this.c, 0);
        Arrays.fill(this.e, -1);
        Arrays.fill(this.f, -1L);
        this.c = 0;
    }

    public final void b(int i) {
        if (i > this.f.length) {
            p(i);
        }
        if (i >= this.h) {
            q(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }

    public int c() {
        return this.c == 0 ? -1 : 0;
    }

    public final int d(Object obj) {
        int iG = g(obj);
        if (iG == -1) {
            return 0;
        }
        return this.b[iG];
    }

    public final Object e(int i) {
        Preconditions.i(i, this.c);
        return this.f14902a[i];
    }

    public final int f(int i) {
        Preconditions.i(i, this.c);
        return this.b[i];
    }

    public final int g(Object obj) {
        int iC = Hashing.c(obj);
        int i = this.e[(r1.length - 1) & iC];
        while (i != -1) {
            long j = this.f[i];
            if (((int) (j >>> 32)) == iC && Objects.a(obj, this.f14902a[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    public void h(int i) {
        Preconditions.f("Initial capacity must be non-negative", i >= 0);
        int iA = Hashing.a(1.0f, i);
        int[] iArr = new int[iA];
        Arrays.fill(iArr, -1);
        this.e = iArr;
        this.g = 1.0f;
        this.f14902a = new Object[i];
        this.b = new int[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        this.f = jArr;
        this.h = Math.max(1, (int) (iA * 1.0f));
    }

    public void i(int i, int i2, int i3, Object obj) {
        this.f[i] = (i3 << 32) | 4294967295L;
        this.f14902a[i] = obj;
        this.b[i] = i2;
    }

    public void j(int i) {
        int i2 = this.c - 1;
        if (i >= i2) {
            this.f14902a[i] = null;
            this.b[i] = 0;
            this.f[i] = -1;
            return;
        }
        Object[] objArr = this.f14902a;
        objArr[i] = objArr[i2];
        int[] iArr = this.b;
        iArr[i] = iArr[i2];
        objArr[i2] = null;
        iArr[i2] = 0;
        long[] jArr = this.f;
        long j = jArr[i2];
        jArr[i] = j;
        jArr[i2] = -1;
        int[] iArr2 = this.e;
        int length = ((int) (j >>> 32)) & (iArr2.length - 1);
        int i3 = iArr2[length];
        if (i3 == i2) {
            iArr2[length] = i;
            return;
        }
        while (true) {
            long[] jArr2 = this.f;
            long j2 = jArr2[i3];
            int i4 = (int) j2;
            if (i4 == i2) {
                jArr2[i3] = (j2 & (-4294967296L)) | (4294967295L & i);
                return;
            }
            i3 = i4;
        }
    }

    public int k(int i) {
        int i2 = i + 1;
        if (i2 < this.c) {
            return i2;
        }
        return -1;
    }

    public int l(int i, int i2) {
        return i - 1;
    }

    public final int m(int i, Object obj) {
        CollectPreconditions.c(i, "count");
        long[] jArr = this.f;
        Object[] objArr = this.f14902a;
        int[] iArr = this.b;
        int iC = Hashing.c(obj);
        int[] iArr2 = this.e;
        int length = (iArr2.length - 1) & iC;
        int i2 = this.c;
        int i3 = iArr2[length];
        if (i3 == -1) {
            iArr2[length] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (((int) (j >>> 32)) == iC && Objects.a(obj, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return i4;
                }
                int i5 = (int) j;
                if (i5 == -1) {
                    jArr[i3] = ((-4294967296L) & j) | (4294967295L & i2);
                    break;
                }
                i3 = i5;
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i6 = i2 + 1;
        int length2 = this.f.length;
        if (i6 > length2) {
            int iMax = Math.max(1, length2 >>> 1) + length2;
            int i7 = iMax >= 0 ? iMax : Integer.MAX_VALUE;
            if (i7 != length2) {
                p(i7);
            }
        }
        i(i2, i, iC, obj);
        this.c = i6;
        if (i2 >= this.h) {
            q(this.e.length * 2);
        }
        this.d++;
        return 0;
    }

    public final int n(int i, Object obj) {
        int length = (r0.length - 1) & i;
        int i2 = this.e[length];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (((int) (this.f[i2] >>> 32)) == i && Objects.a(obj, this.f14902a[i2])) {
                int i4 = this.b[i2];
                if (i3 == -1) {
                    this.e[length] = (int) this.f[i2];
                } else {
                    long[] jArr = this.f;
                    jArr[i3] = (jArr[i3] & (-4294967296L)) | (((int) jArr[i2]) & 4294967295L);
                }
                j(i2);
                this.c--;
                this.d++;
                return i4;
            }
            int i5 = (int) this.f[i2];
            if (i5 == -1) {
                return 0;
            }
            i3 = i2;
            i2 = i5;
        }
    }

    public final int o(int i) {
        return n((int) (this.f[i] >>> 32), this.f14902a[i]);
    }

    public void p(int i) {
        this.f14902a = Arrays.copyOf(this.f14902a, i);
        this.b = Arrays.copyOf(this.b, i);
        long[] jArr = this.f;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(jArrCopyOf, length, i, -1L);
        }
        this.f = jArrCopyOf;
    }

    public final void q(int i) {
        if (this.e.length >= 1073741824) {
            this.h = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (i * this.g)) + 1;
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        long[] jArr = this.f;
        int i3 = i - 1;
        for (int i4 = 0; i4 < this.c; i4++) {
            int i5 = (int) (jArr[i4] >>> 32);
            int i6 = i5 & i3;
            int i7 = iArr[i6];
            iArr[i6] = i4;
            jArr[i4] = (i5 << 32) | (i7 & 4294967295L);
        }
        this.h = i2;
        this.e = iArr;
    }
}
