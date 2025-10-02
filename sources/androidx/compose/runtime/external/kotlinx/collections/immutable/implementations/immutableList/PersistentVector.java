package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PersistentVector<E> extends AbstractPersistentList<E> implements PersistentList<E> {
    public final Object[] d;
    public final Object[] e;
    public final int f;
    public final int g;

    public PersistentVector(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.d = objArr;
        this.e = objArr2;
        this.f = i;
        this.g = i2;
        if (!(getG() > 32)) {
            PreconditionsKt.a("Trie-based persistent vector should have at least 33 elements, got " + getG());
        }
        int length = objArr2.length;
    }

    public static Object[] d(Object[] objArr, int i, int i2, Object obj, ObjectRef objectRef) {
        Object[] objArrCopyOf;
        int iA = UtilsKt.a(i2, i);
        if (i == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                Intrinsics.g(objArrCopyOf, "copyOf(...)");
            }
            ArraysKt.t(objArr, iA + 1, objArrCopyOf, iA, 31);
            objectRef.f1679a = objArr[31];
            objArrCopyOf[iA] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        Intrinsics.g(objArrCopyOf2, "copyOf(...)");
        int i3 = i - 5;
        Object obj2 = objArr[iA];
        Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iA] = d((Object[]) obj2, i3, i2, obj, objectRef);
        while (true) {
            iA++;
            if (iA >= 32 || objArrCopyOf2[iA] == null) {
                break;
            }
            Object obj3 = objArr[iA];
            Intrinsics.f(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iA] = d((Object[]) obj3, i3, 0, objectRef.f1679a, objectRef);
        }
        return objArrCopyOf2;
    }

    public static Object[] h(Object[] objArr, int i, int i2, ObjectRef objectRef) {
        Object[] objArrH;
        int iA = UtilsKt.a(i2, i);
        if (i == 5) {
            objectRef.f1679a = objArr[iA];
            objArrH = null;
        } else {
            Object obj = objArr[iA];
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrH = h((Object[]) obj, i - 5, i2, objectRef);
        }
        if (objArrH == null && iA == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.g(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iA] = objArrH;
        return objArrCopyOf;
    }

    public static Object[] n(Object[] objArr, int i, int i2, Object obj) {
        int iA = UtilsKt.a(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.g(objArrCopyOf, "copyOf(...)");
        if (i == 0) {
            objArrCopyOf[iA] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iA];
        Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iA] = n((Object[]) obj2, i - 5, i2, obj);
        return objArrCopyOf;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList H0(Function1 function1) {
        PersistentVectorBuilder persistentVectorBuilder = new PersistentVectorBuilder(this, this.d, this.e, this.g);
        persistentVectorBuilder.I(function1);
        return persistentVectorBuilder.g();
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList add(Object obj) {
        int iM = m();
        int i = this.f;
        int i2 = i - iM;
        Object[] objArr = this.d;
        Object[] objArr2 = this.e;
        if (i2 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return i(objArr, objArr2, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        Intrinsics.g(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i2] = obj;
        return new PersistentVector(objArr, objArrCopyOf, i + 1, this.g);
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: b, reason: from getter */
    public final int getG() {
        return this.f;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentVectorBuilder builder() {
        return new PersistentVectorBuilder(this, this.d, this.e, this.g);
    }

    public final PersistentVector g(Object obj, Object[] objArr, int i) {
        int iM = m();
        int i2 = this.f;
        int i3 = i2 - iM;
        Object[] objArr2 = this.e;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        Intrinsics.g(objArrCopyOf, "copyOf(...)");
        if (i3 < 32) {
            ArraysKt.t(objArr2, i + 1, objArrCopyOf, i, i3);
            objArrCopyOf[i] = obj;
            return new PersistentVector(objArr, objArrCopyOf, i2 + 1, this.g);
        }
        Object obj2 = objArr2[31];
        ArraysKt.t(objArr2, i + 1, objArrCopyOf, i, i3 - 1);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return i(objArr, objArrCopyOf, objArr3);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        ListImplementation.a(i, getG());
        if (m() <= i) {
            objArr = this.e;
        } else {
            objArr = this.d;
            for (int i2 = this.g; i2 > 0; i2 -= 5) {
                Object obj = objArr[UtilsKt.a(i, i2)];
                Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    public final PersistentVector i(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f;
        int i2 = i >> 5;
        int i3 = this.g;
        if (i2 <= (1 << i3)) {
            return new PersistentVector(j(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new PersistentVector(j(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    public final Object[] j(int i, Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf;
        int iA = UtilsKt.a(getG() - 1, i);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            Intrinsics.g(objArrCopyOf, "copyOf(...)");
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i == 5) {
            objArrCopyOf[iA] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iA] = j(i - 5, (Object[]) objArrCopyOf[iA], objArr2);
        return objArrCopyOf;
    }

    public final Object[] k(Object[] objArr, int i, int i2, ObjectRef objectRef) {
        Object[] objArrCopyOf;
        int iA = UtilsKt.a(i2, i);
        if (i == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                Intrinsics.g(objArrCopyOf, "copyOf(...)");
            }
            ArraysKt.t(objArr, iA, objArrCopyOf, iA + 1, 32);
            objArrCopyOf[31] = objectRef.f1679a;
            objectRef.f1679a = objArr[iA];
            return objArrCopyOf;
        }
        int iA2 = objArr[31] == null ? UtilsKt.a(m() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        Intrinsics.g(objArrCopyOf2, "copyOf(...)");
        int i3 = i - 5;
        int i4 = iA + 1;
        if (i4 <= iA2) {
            while (true) {
                Object obj = objArrCopyOf2[iA2];
                Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iA2] = k((Object[]) obj, i3, 0, objectRef);
                if (iA2 == i4) {
                    break;
                }
                iA2--;
            }
        }
        Object obj2 = objArrCopyOf2[iA];
        Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iA] = k((Object[]) obj2, i3, i2, objectRef);
        return objArrCopyOf2;
    }

    public final AbstractPersistentList l(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.f - i;
        if (i4 != 1) {
            Object[] objArr2 = this.e;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            Intrinsics.g(objArrCopyOf, "copyOf(...)");
            int i5 = i4 - 1;
            if (i3 < i5) {
                ArraysKt.t(objArr2, i3, objArrCopyOf, i3 + 1, i4);
            }
            objArrCopyOf[i5] = null;
            return new PersistentVector(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                Intrinsics.g(objArr, "copyOf(...)");
            }
            return new SmallPersistentVector(objArr);
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArrH = h(objArr, i2, i - 1, objectRef);
        Intrinsics.e(objArrH);
        Object obj = objectRef.f1679a;
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (objArrH[1] != null) {
            return new PersistentVector(objArrH, objArr3, i, i2);
        }
        Object obj2 = objArrH[0];
        Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new PersistentVector((Object[]) obj2, objArr3, i, i2 - 5);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        ListImplementation.b(i, this.f);
        return new PersistentVectorIterator(this.d, i, this.e, this.f, (this.g / 5) + 1);
    }

    public final int m() {
        return (this.f - 1) & (-32);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList m1(int i) {
        ListImplementation.a(i, this.f);
        int iM = m();
        Object[] objArr = this.d;
        int i2 = this.g;
        return i >= iM ? l(objArr, iM, i2, i - iM) : l(k(objArr, i2, i, new ObjectRef(this.e[0])), iM, i2, 0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList set(int i, Object obj) {
        int i2 = this.f;
        ListImplementation.a(i, i2);
        int iM = m();
        Object[] objArr = this.d;
        Object[] objArr2 = this.e;
        int i3 = this.g;
        if (iM > i) {
            return new PersistentVector(n(objArr, i3, i, obj), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        Intrinsics.g(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i & 31] = obj;
        return new PersistentVector(objArr, objArrCopyOf, i2, i3);
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList add(int i, Object obj) {
        int i2 = this.f;
        ListImplementation.b(i, i2);
        if (i == i2) {
            return add(obj);
        }
        int iM = m();
        Object[] objArr = this.d;
        if (i >= iM) {
            return g(obj, objArr, i - iM);
        }
        ObjectRef objectRef = new ObjectRef(null);
        return g(objectRef.f1679a, d(objArr, this.g, i, obj, objectRef), 0);
    }
}
