package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/collection/LongSparseArray;", "E", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class LongSparseArray<E> implements Cloneable {
    public /* synthetic */ boolean d;
    public /* synthetic */ long[] e;
    public /* synthetic */ Object[] f;
    public /* synthetic */ int g;

    public LongSparseArray(int i) {
        if (i == 0) {
            this.e = ContainerHelpersKt.b;
            this.f = ContainerHelpersKt.c;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.e = new long[i5];
        this.f = new Object[i5];
    }

    public final void a() {
        int i = this.g;
        Object[] objArr = this.f;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.g = 0;
        this.d = false;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final LongSparseArray clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.f(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        LongSparseArray longSparseArray = (LongSparseArray) objClone;
        longSparseArray.e = (long[]) this.e.clone();
        longSparseArray.f = (Object[]) this.f.clone();
        return longSparseArray;
    }

    public final Object c(long j) {
        Object obj;
        int iB = ContainerHelpersKt.b(this.e, this.g, j);
        if (iB < 0 || (obj = this.f[iB]) == LongSparseArrayKt.f689a) {
            return null;
        }
        return obj;
    }

    public final Object d(long j) {
        Object obj;
        int iB = ContainerHelpersKt.b(this.e, this.g, j);
        if (iB < 0 || (obj = this.f[iB]) == LongSparseArrayKt.f689a) {
            return -1L;
        }
        return obj;
    }

    public final int e(long j) {
        if (this.d) {
            int i = this.g;
            long[] jArr = this.e;
            Object[] objArr = this.f;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != LongSparseArrayKt.f689a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.d = false;
            this.g = i2;
        }
        return ContainerHelpersKt.b(this.e, this.g, j);
    }

    public final boolean f() {
        return j() == 0;
    }

    public final long g(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.g)) {
            RuntimeHelpersKt.a("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.d) {
            long[] jArr = this.e;
            Object[] objArr = this.f;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != LongSparseArrayKt.f689a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.d = false;
            this.g = i3;
        }
        return this.e[i];
    }

    public final void h(long j, Object obj) {
        int iB = ContainerHelpersKt.b(this.e, this.g, j);
        if (iB >= 0) {
            this.f[iB] = obj;
            return;
        }
        int i = ~iB;
        int i2 = this.g;
        Object obj2 = LongSparseArrayKt.f689a;
        if (i < i2) {
            Object[] objArr = this.f;
            if (objArr[i] == obj2) {
                this.e[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.d) {
            long[] jArr = this.e;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.f;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.d = false;
                this.g = i3;
                i = ~ContainerHelpersKt.b(this.e, i3, j);
            }
        }
        int i5 = this.g;
        if (i5 >= this.e.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.e, i9);
            Intrinsics.g(jArrCopyOf, "copyOf(...)");
            this.e = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f, i9);
            Intrinsics.g(objArrCopyOf, "copyOf(...)");
            this.f = objArrCopyOf;
        }
        int i10 = this.g;
        if (i10 - i != 0) {
            long[] jArr2 = this.e;
            int i11 = i + 1;
            ArraysKt.r(i11, jArr2, i, jArr2, i10);
            Object[] objArr3 = this.f;
            ArraysKt.t(objArr3, i11, objArr3, i, this.g);
        }
        this.e[i] = j;
        this.f[i] = obj;
        this.g++;
    }

    public final void i(long j) {
        int iB = ContainerHelpersKt.b(this.e, this.g, j);
        if (iB >= 0) {
            Object[] objArr = this.f;
            Object obj = objArr[iB];
            Object obj2 = LongSparseArrayKt.f689a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.d = true;
            }
        }
    }

    public final int j() {
        if (this.d) {
            int i = this.g;
            long[] jArr = this.e;
            Object[] objArr = this.f;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != LongSparseArrayKt.f689a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.d = false;
            this.g = i2;
        }
        return this.g;
    }

    public final Object k(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.g)) {
            RuntimeHelpersKt.a("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.d) {
            long[] jArr = this.e;
            Object[] objArr = this.f;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != LongSparseArrayKt.f689a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.d = false;
            this.g = i3;
        }
        return this.f[i];
    }

    public final String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.g * 28);
        sb.append('{');
        int i = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(g(i2));
            sb.append('=');
            Object objK = k(i2);
            if (objK != sb) {
                sb.append(objK);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }

    public /* synthetic */ LongSparseArray(Object obj) {
        this(10);
    }
}
