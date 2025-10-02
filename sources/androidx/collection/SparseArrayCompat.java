package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/collection/SparseArrayCompat;", "E", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class SparseArrayCompat<E> implements Cloneable {
    public /* synthetic */ boolean d;
    public /* synthetic */ int[] e;
    public /* synthetic */ Object[] f;
    public /* synthetic */ int g;

    public SparseArrayCompat(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.e = new int[i5];
        this.f = new Object[i5];
    }

    public final void a(int i, Object obj) {
        int i2 = this.g;
        if (i2 != 0 && i <= this.e[i2 - 1]) {
            d(i, obj);
            return;
        }
        if (this.d && i2 >= this.e.length) {
            SparseArrayCompatKt.a(this);
        }
        int i3 = this.g;
        if (i3 >= this.e.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.e, i7);
            Intrinsics.g(iArrCopyOf, "copyOf(...)");
            this.e = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f, i7);
            Intrinsics.g(objArrCopyOf, "copyOf(...)");
            this.f = objArrCopyOf;
        }
        this.e[i3] = i;
        this.f[i3] = obj;
        this.g = i3 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final SparseArrayCompat clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.f(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) objClone;
        sparseArrayCompat.e = (int[]) this.e.clone();
        sparseArrayCompat.f = (Object[]) this.f.clone();
        return sparseArrayCompat;
    }

    public final int c(int i) {
        if (this.d) {
            SparseArrayCompatKt.a(this);
        }
        return this.e[i];
    }

    public final void d(int i, Object obj) {
        int iA = ContainerHelpersKt.a(this.g, i, this.e);
        if (iA >= 0) {
            this.f[iA] = obj;
            return;
        }
        int i2 = ~iA;
        int i3 = this.g;
        if (i2 < i3) {
            Object[] objArr = this.f;
            if (objArr[i2] == SparseArrayCompatKt.f704a) {
                this.e[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.d && i3 >= this.e.length) {
            SparseArrayCompatKt.a(this);
            i2 = ~ContainerHelpersKt.a(this.g, i, this.e);
        }
        int i4 = this.g;
        if (i4 >= this.e.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.e, i8);
            Intrinsics.g(iArrCopyOf, "copyOf(...)");
            this.e = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f, i8);
            Intrinsics.g(objArrCopyOf, "copyOf(...)");
            this.f = objArrCopyOf;
        }
        int i9 = this.g;
        if (i9 - i2 != 0) {
            int[] iArr = this.e;
            int i10 = i2 + 1;
            ArraysKt.q(i10, i2, i9, iArr, iArr);
            Object[] objArr2 = this.f;
            ArraysKt.t(objArr2, i10, objArr2, i2, this.g);
        }
        this.e[i2] = i;
        this.f[i2] = obj;
        this.g++;
    }

    public final int e() {
        if (this.d) {
            SparseArrayCompatKt.a(this);
        }
        return this.g;
    }

    public final Object f(int i) {
        if (this.d) {
            SparseArrayCompatKt.a(this);
        }
        Object[] objArr = this.f;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.g * 28);
        sb.append('{');
        int i = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(c(i2));
            sb.append('=');
            Object objF = f(i2);
            if (objF != this) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }
}
