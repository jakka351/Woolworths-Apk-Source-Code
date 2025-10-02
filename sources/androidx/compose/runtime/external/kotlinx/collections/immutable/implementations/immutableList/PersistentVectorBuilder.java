package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "E", "Lkotlin/collections/AbstractMutableList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PersistentVectorBuilder<E> extends AbstractMutableList<E> implements PersistentList.Builder<E> {
    public PersistentList d;
    public Object[] e;
    public Object[] f;
    public int g;
    public MutabilityOwnership h = new MutabilityOwnership();
    public Object[] i;
    public Object[] j;
    public int k;

    public PersistentVectorBuilder(AbstractPersistentList abstractPersistentList, Object[] objArr, Object[] objArr2, int i) {
        this.d = abstractPersistentList;
        this.e = objArr;
        this.f = objArr2;
        this.g = i;
        this.i = objArr;
        this.j = objArr2;
        this.k = abstractPersistentList.size();
    }

    public static void h(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final void B(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.k;
        int i2 = i >> 5;
        int i3 = this.g;
        if (i2 > (1 << i3)) {
            this.i = D(this.g + 5, t(objArr), objArr2);
            this.j = objArr3;
            this.g += 5;
            this.k++;
            return;
        }
        if (objArr == null) {
            this.i = objArr2;
            this.j = objArr3;
            this.k = i + 1;
        } else {
            this.i = D(i3, objArr, objArr2);
            this.j = objArr3;
            this.k++;
        }
    }

    public final Object[] D(int i, Object[] objArr, Object[] objArr2) {
        int iA = UtilsKt.a(getK() - 1, i);
        Object[] objArrO = o(objArr);
        if (i == 5) {
            objArrO[iA] = objArr2;
            return objArrO;
        }
        objArrO[iA] = D(i - 5, (Object[]) objArrO[iA], objArr2);
        return objArrO;
    }

    public final int E(Function1 function1, Object[] objArr, int i, int i2, ObjectRef objectRef, ArrayList arrayList, ArrayList arrayList2) {
        if (m(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = objectRef.f1679a;
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrS = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) function1.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrS = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : s();
                    i2 = 0;
                }
                objArrS[i2] = obj2;
                i2++;
            }
        }
        objectRef.f1679a = objArrS;
        if (objArr2 != objArrS) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int F(Function1 function1, Object[] objArr, int i, ObjectRef objectRef) {
        Object[] objArrO = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrO = o(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrO[i2] = obj;
                i2++;
            }
        }
        objectRef.f1679a = objArrO;
        return i2;
    }

    public final int G(Function1 function1, int i, ObjectRef objectRef) {
        int iF = F(function1, this.j, i, objectRef);
        if (iF == i) {
            return i;
        }
        Object obj = objectRef.f1679a;
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iF, i, (Object) null);
        this.j = objArr;
        this.k -= i - iF;
        return iF;
    }

    public final boolean I(Function1 function1) {
        Object[] objArrY;
        int i;
        Function1 function12 = function1;
        int iO = O();
        Object[] objArrU = null;
        ObjectRef objectRef = new ObjectRef(null);
        boolean z = false;
        if (this.i != null) {
            AbstractListIterator abstractListIteratorN = n(0);
            int iF = 32;
            while (iF == 32 && abstractListIteratorN.hasNext()) {
                iF = F(function12, (Object[]) abstractListIteratorN.next(), 32, objectRef);
            }
            if (iF == 32) {
                abstractListIteratorN.hasNext();
                int iG = G(function12, iO, objectRef);
                if (iG == 0) {
                    x(this.k, this.g, this.i);
                }
                if (iG != iO) {
                }
            } else {
                int iPreviousIndex = abstractListIteratorN.previousIndex() << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iE = iF;
                while (abstractListIteratorN.hasNext()) {
                    iE = E(function12, (Object[]) abstractListIteratorN.next(), 32, iE, objectRef, arrayList2, arrayList);
                    function12 = function1;
                }
                int iE2 = E(function1, this.j, iO, iE, objectRef, arrayList2, arrayList);
                Object obj = objectRef.f1679a;
                Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iE2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrY = this.i;
                    Intrinsics.e(objArrY);
                } else {
                    objArrY = y(this.i, iPreviousIndex, this.g, arrayList.iterator());
                }
                int size = iPreviousIndex + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    PreconditionsKt.a("invalid size");
                }
                if (size == 0) {
                    this.g = 0;
                } else {
                    int i2 = size - 1;
                    while (true) {
                        i = this.g;
                        if ((i2 >> i) != 0) {
                            break;
                        }
                        this.g = i - 5;
                        Object[] objArr2 = objArrY[0];
                        Intrinsics.f(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrY = objArr2;
                    }
                    objArrU = u(i2, i, objArrY);
                }
                this.i = objArrU;
                this.j = objArr;
                this.k = size + iE2;
            }
            z = true;
        } else if (G(function12, iO, objectRef) != iO) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] J(Object[] objArr, int i, int i2, ObjectRef objectRef) {
        int iA = UtilsKt.a(i2, i);
        if (i == 0) {
            Object obj = objArr[iA];
            Object[] objArrO = o(objArr);
            ArraysKt.t(objArr, iA, objArrO, iA + 1, 32);
            objArrO[31] = objectRef.f1679a;
            objectRef.f1679a = obj;
            return objArrO;
        }
        int iA2 = objArr[31] == null ? UtilsKt.a(L() - 1, i) : 31;
        Object[] objArrO2 = o(objArr);
        int i3 = i - 5;
        int i4 = iA + 1;
        if (i4 <= iA2) {
            while (true) {
                Object obj2 = objArrO2[iA2];
                Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrO2[iA2] = J((Object[]) obj2, i3, 0, objectRef);
                if (iA2 == i4) {
                    break;
                }
                iA2--;
            }
        }
        Object obj3 = objArrO2[iA];
        Intrinsics.f(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrO2[iA] = J((Object[]) obj3, i3, i2, objectRef);
        return objArrO2;
    }

    public final Object K(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.k - i;
        if (i4 == 1) {
            Object obj = this.j[0];
            x(i, i2, objArr);
            return obj;
        }
        Object[] objArr2 = this.j;
        Object obj2 = objArr2[i3];
        Object[] objArrO = o(objArr2);
        ArraysKt.t(objArr2, i3, objArrO, i3 + 1, i4);
        objArrO[i4 - 1] = null;
        this.i = objArr;
        this.j = objArrO;
        this.k = (i + i4) - 1;
        this.g = i2;
        return obj2;
    }

    public final int L() {
        int i = this.k;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] M(Object[] objArr, int i, int i2, Object obj, ObjectRef objectRef) {
        int iA = UtilsKt.a(i2, i);
        Object[] objArrO = o(objArr);
        if (i != 0) {
            Object obj2 = objArrO[iA];
            Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrO[iA] = M((Object[]) obj2, i - 5, i2, obj, objectRef);
            return objArrO;
        }
        if (objArrO != objArr) {
            ((AbstractList) this).modCount++;
        }
        objectRef.f1679a = objArrO[iA];
        objArrO[iA] = obj;
        return objArrO;
    }

    public final void N(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrS;
        if (i3 < 1) {
            PreconditionsKt.a("requires at least one nullBuffer");
        }
        Object[] objArrO = o(objArr);
        objArr2[0] = objArrO;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            ArraysKt.t(objArrO, size + 1, objArr3, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrS = objArrO;
            } else {
                objArrS = s();
                i3--;
                objArr2[i3] = objArrS;
            }
            int i7 = i2 - i6;
            ArraysKt.t(objArrO, 0, objArr3, i7, i2);
            ArraysKt.t(objArrO, size + 1, objArrS, i4, i7);
            objArr3 = objArrS;
        }
        Iterator<E> it = collection.iterator();
        h(objArrO, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrS2 = s();
            h(objArrS2, 0, it);
            objArr2[i8] = objArrS2;
        }
        h(objArr3, 0, it);
    }

    public final int O() {
        int i = this.k;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        ListImplementation.b(i, getK());
        if (i == getK()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iL = L();
        if (i >= iL) {
            l(obj, this.i, i - iL);
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.i;
        Intrinsics.e(objArr);
        l(objectRef.f1679a, k(objArr, this.g, i, obj, objectRef), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        PersistentVectorBuilder<E> persistentVectorBuilder;
        Object[] objArrS;
        ListImplementation.b(i, this.k);
        if (i == this.k) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.k - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.j;
            Object[] objArrO = o(objArr);
            ArraysKt.t(objArr, size2 + 1, objArrO, i3, O());
            h(objArrO, i3, collection.iterator());
            this.j = objArrO;
            this.k = collection.size() + this.k;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iO = O();
        int size3 = collection.size() + this.k;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= L()) {
            objArrS = s();
            collection2 = collection;
            N(collection2, i, this.j, iO, objArr2, size, objArrS);
            persistentVectorBuilder = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            persistentVectorBuilder = this;
            if (size3 > iO) {
                int i4 = size3 - iO;
                Object[] objArrQ = q(i4, persistentVectorBuilder.j);
                persistentVectorBuilder.j(collection2, i, i4, objArr2, size, objArrQ);
                objArr2 = objArr2;
                objArrS = objArrQ;
            } else {
                Object[] objArr3 = persistentVectorBuilder.j;
                objArrS = s();
                int i5 = iO - size3;
                ArraysKt.t(objArr3, 0, objArrS, i5, iO);
                int i6 = 32 - i5;
                Object[] objArrQ2 = q(i6, persistentVectorBuilder.j);
                int i7 = size - 1;
                objArr2[i7] = objArrQ2;
                persistentVectorBuilder.j(collection2, i, i6, objArr2, i7, objArrQ2);
                collection2 = collection2;
            }
        }
        persistentVectorBuilder.i = z(persistentVectorBuilder.i, i2, objArr2);
        persistentVectorBuilder.j = objArrS;
        persistentVectorBuilder.k = collection2.size() + persistentVectorBuilder.k;
        return true;
    }

    @Override // kotlin.collections.AbstractMutableList
    /* renamed from: b, reason: from getter */
    public final int getK() {
        return this.k;
    }

    @Override // kotlin.collections.AbstractMutableList
    public final Object d(int i) {
        ListImplementation.a(i, getK());
        ((AbstractList) this).modCount++;
        int iL = L();
        if (i >= iL) {
            return K(this.i, iL, this.g, i - iL);
        }
        ObjectRef objectRef = new ObjectRef(this.j[0]);
        Object[] objArr = this.i;
        Intrinsics.e(objArr);
        K(J(objArr, this.g, i, objectRef), iL, this.g, 0);
        return objectRef.f1679a;
    }

    public final PersistentList g() {
        PersistentList persistentVector;
        Object[] objArr = this.i;
        if (objArr == this.e && this.j == this.f) {
            persistentVector = this.d;
        } else {
            this.h = new MutabilityOwnership();
            this.e = objArr;
            Object[] objArr2 = this.j;
            this.f = objArr2;
            if (objArr != null) {
                persistentVector = new PersistentVector(objArr, objArr2, this.k, this.g);
            } else if (objArr2.length == 0) {
                persistentVector = SmallPersistentVector.e;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.k);
                Intrinsics.g(objArrCopyOf, "copyOf(...)");
                persistentVector = new SmallPersistentVector(objArrCopyOf);
            }
        }
        this.d = persistentVector;
        return persistentVector;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        ListImplementation.a(i, getK());
        if (L() <= i) {
            objArr = this.j;
        } else {
            objArr = this.i;
            Intrinsics.e(objArr);
            for (int i2 = this.g; i2 > 0; i2 -= 5) {
                Object obj = objArr[UtilsKt.a(i, i2)];
                Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    public final int i() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.i == null) {
            throw new IllegalStateException("root is null");
        }
        int i4 = i >> 5;
        AbstractListIterator abstractListIteratorN = n(L() >> 5);
        int i5 = i3;
        Object[] objArrQ = objArr2;
        while (abstractListIteratorN.previousIndex() != i4) {
            Object[] objArr3 = (Object[]) abstractListIteratorN.previous();
            ArraysKt.t(objArr3, 0, objArrQ, 32 - i2, 32);
            objArrQ = q(i2, objArr3);
            i5--;
            objArr[i5] = objArrQ;
        }
        Object[] objArr4 = (Object[]) abstractListIteratorN.previous();
        int iL = i3 - (((L() >> 5) - 1) - i4);
        if (iL < i3) {
            objArr2 = objArr[iL];
            Intrinsics.e(objArr2);
        }
        N(collection, i, objArr4, 32, objArr, iL, objArr2);
    }

    public final Object[] k(Object[] objArr, int i, int i2, Object obj, ObjectRef objectRef) {
        Object obj2;
        int iA = UtilsKt.a(i2, i);
        if (i == 0) {
            objectRef.f1679a = objArr[31];
            Object[] objArrO = o(objArr);
            ArraysKt.t(objArr, iA + 1, objArrO, iA, 31);
            objArrO[iA] = obj;
            return objArrO;
        }
        Object[] objArrO2 = o(objArr);
        int i3 = i - 5;
        Object obj3 = objArrO2[iA];
        Intrinsics.f(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrO2[iA] = k((Object[]) obj3, i3, i2, obj, objectRef);
        while (true) {
            iA++;
            if (iA >= 32 || (obj2 = objArrO2[iA]) == null) {
                break;
            }
            objArrO2[iA] = k((Object[]) obj2, i3, 0, objectRef.f1679a, objectRef);
        }
        return objArrO2;
    }

    public final void l(Object obj, Object[] objArr, int i) {
        int iO = O();
        Object[] objArrO = o(this.j);
        if (iO < 32) {
            ArraysKt.t(this.j, i + 1, objArrO, i, iO);
            objArrO[i] = obj;
            this.i = objArr;
            this.j = objArrO;
            this.k++;
            return;
        }
        Object[] objArr2 = this.j;
        Object obj2 = objArr2[31];
        ArraysKt.t(objArr2, i + 1, objArrO, i, 31);
        objArrO[i] = obj;
        B(objArr, objArrO, t(obj2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        ListImplementation.b(i, this.k);
        return new PersistentVectorMutableIterator(this, i);
    }

    public final boolean m(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.h;
    }

    public final AbstractListIterator n(int i) {
        Object[] objArr = this.i;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iL = L() >> 5;
        ListImplementation.b(i, iL);
        int i2 = this.g;
        return i2 == 0 ? new SingleElementListIterator(objArr, i) : new TrieIterator(objArr, i, iL, i2 / 5);
    }

    public final Object[] o(Object[] objArr) {
        if (objArr == null) {
            return s();
        }
        if (m(objArr)) {
            return objArr;
        }
        Object[] objArrS = s();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        ArraysKt.x(objArr, 0, objArrS, length, 6);
        return objArrS;
    }

    public final Object[] q(int i, Object[] objArr) {
        if (m(objArr)) {
            ArraysKt.t(objArr, i, objArr, 0, 32 - i);
            return objArr;
        }
        Object[] objArrS = s();
        ArraysKt.t(objArr, i, objArrS, 0, 32 - i);
        return objArrS;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(final Collection collection) {
        return I(new Function1<Object, Boolean>() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder.removeAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(collection.contains(obj));
            }
        });
    }

    public final Object[] s() {
        Object[] objArr = new Object[33];
        objArr[32] = this.h;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        ListImplementation.a(i, getK());
        if (L() > i) {
            ObjectRef objectRef = new ObjectRef(null);
            Object[] objArr = this.i;
            Intrinsics.e(objArr);
            this.i = M(objArr, this.g, i, obj, objectRef);
            return objectRef.f1679a;
        }
        Object[] objArrO = o(this.j);
        if (objArrO != this.j) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrO[i2];
        objArrO[i2] = obj;
        this.j = objArrO;
        return obj2;
    }

    public final Object[] t(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.h;
        return objArr;
    }

    public final Object[] u(int i, int i2, Object[] objArr) {
        if (i2 < 0) {
            PreconditionsKt.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iA = UtilsKt.a(i, i2);
        Object obj = objArr[iA];
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objU = u(i, i2 - 5, (Object[]) obj);
        if (iA < 31) {
            int i3 = iA + 1;
            if (objArr[i3] != null) {
                if (m(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrS = s();
                ArraysKt.t(objArr, 0, objArrS, 0, i3);
                objArr = objArrS;
            }
        }
        if (objU == objArr[iA]) {
            return objArr;
        }
        Object[] objArrO = o(objArr);
        objArrO[iA] = objU;
        return objArrO;
    }

    public final Object[] w(Object[] objArr, int i, int i2, ObjectRef objectRef) {
        Object[] objArrW;
        int iA = UtilsKt.a(i2 - 1, i);
        if (i == 5) {
            objectRef.f1679a = objArr[iA];
            objArrW = null;
        } else {
            Object obj = objArr[iA];
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrW = w((Object[]) obj, i - 5, i2, objectRef);
        }
        if (objArrW == null && iA == 0) {
            return null;
        }
        Object[] objArrO = o(objArr);
        objArrO[iA] = objArrW;
        return objArrO;
    }

    public final void x(int i, int i2, Object[] objArr) {
        if (i2 == 0) {
            this.i = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.j = objArr;
            this.k = i;
            this.g = i2;
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Intrinsics.e(objArr);
        Object[] objArrW = w(objArr, i2, i, objectRef);
        Intrinsics.e(objArrW);
        Object obj = objectRef.f1679a;
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.j = (Object[]) obj;
        this.k = i;
        if (objArrW[1] == null) {
            this.i = (Object[]) objArrW[0];
            this.g = i2 - 5;
        } else {
            this.i = objArrW;
            this.g = i2;
        }
    }

    public final Object[] y(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            PreconditionsKt.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            PreconditionsKt.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrO = o(objArr);
        int iA = UtilsKt.a(i, i2);
        int i3 = i2 - 5;
        objArrO[iA] = y((Object[]) objArrO[iA], i, i3, it);
        while (true) {
            iA++;
            if (iA >= 32 || !it.hasNext()) {
                break;
            }
            objArrO[iA] = y((Object[]) objArrO[iA], 0, i3, it);
        }
        return objArrO;
    }

    public final Object[] z(Object[] objArr, int i, Object[][] objArr2) {
        Iterator itA = ArrayIteratorKt.a(objArr2);
        int i2 = i >> 5;
        int i3 = this.g;
        Object[] objArrY = i2 < (1 << i3) ? y(objArr, i, i3, itA) : o(objArr);
        while (itA.hasNext()) {
            this.g += 5;
            objArrY = t(objArrY);
            int i4 = this.g;
            y(objArrY, 1 << i4, i4, itA);
        }
        return objArrY;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iO = O();
        if (iO < 32) {
            Object[] objArrO = o(this.j);
            objArrO[iO] = obj;
            this.j = objArrO;
            this.k = getK() + 1;
        } else {
            B(this.i, this.j, t(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iO = O();
        Iterator<E> it = collection.iterator();
        if (32 - iO >= collection.size()) {
            Object[] objArrO = o(this.j);
            h(objArrO, iO, it);
            this.j = objArrO;
            this.k = collection.size() + this.k;
            return true;
        }
        int size = ((collection.size() + iO) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrO2 = o(this.j);
        h(objArrO2, iO, it);
        objArr[0] = objArrO2;
        for (int i = 1; i < size; i++) {
            Object[] objArrS = s();
            h(objArrS, 0, it);
            objArr[i] = objArrS;
        }
        this.i = z(this.i, L(), objArr);
        Object[] objArrS2 = s();
        h(objArrS2, 0, it);
        this.j = objArrS2;
        this.k = collection.size() + this.k;
        return true;
    }
}
