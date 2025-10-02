package androidx.collection;

import YU.a;
import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/collection/ObjectList;", "E", "", "Landroidx/collection/MutableObjectList;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class ObjectList<E> {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f694a;
    public int b;

    public final Object a() {
        if (!d()) {
            return this.f694a[0];
        }
        RuntimeHelpersKt.d("ObjectList is empty.");
        throw null;
    }

    public final Object b(int i) {
        if (i >= 0 && i < this.b) {
            return this.f694a[i];
        }
        f(i);
        throw null;
    }

    public final int c(Object obj) {
        int i = 0;
        if (obj == null) {
            Object[] objArr = this.f694a;
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Object[] objArr2 = this.f694a;
        int i3 = this.b;
        while (i < i3) {
            if (obj.equals(objArr2[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean d() {
        return this.b == 0;
    }

    public final boolean e() {
        return this.b != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ObjectList) {
            ObjectList objectList = (ObjectList) obj;
            int i = objectList.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.f694a;
                Object[] objArr2 = objectList.f694a;
                IntRange intRangeO = RangesKt.o(0, i2);
                int i3 = intRangeO.d;
                int i4 = intRangeO.e;
                if (i3 > i4) {
                    return true;
                }
                while (Intrinsics.c(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final void f(int i) {
        StringBuilder sbR = a.r(i, "Index ", " must be in 0..");
        sbR.append(this.b - 1);
        RuntimeHelpersKt.c(sbR.toString());
        throw null;
    }

    public final int hashCode() {
        Object[] objArr = this.f694a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        Function1<Object, CharSequence> function1 = new Function1<Object, CharSequence>() { // from class: androidx.collection.ObjectList.toString.1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return obj == ObjectList.this ? "(this)" : String.valueOf(obj);
            }
        };
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f694a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) function1.invoke(obj));
            i2++;
        }
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }
}
