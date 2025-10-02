package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SmallPersistentVector<E> extends AbstractPersistentList<E> implements ImmutableList<E> {
    public static final SmallPersistentVector e = new SmallPersistentVector(new Object[0]);
    public final Object[] d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector$Companion;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public SmallPersistentVector(Object[] objArr) {
        this.d = objArr;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList H0(Function1 function1) {
        Object[] objArr = this.d;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) ((AbstractPersistentList.AnonymousClass1) function1).invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    Intrinsics.g(objArrCopyOf, "copyOf(...)");
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? e : new SmallPersistentVector(ArraysKt.z(0, length, objArrCopyOf));
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList add(int i, Object obj) {
        Object[] objArr = this.d;
        ListImplementation.b(i, objArr.length);
        if (i == objArr.length) {
            return add(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            ArraysKt.x(objArr, 0, objArr2, i, 6);
            ArraysKt.t(objArr, i + 1, objArr2, i, objArr.length);
            objArr2[i] = obj;
            return new SmallPersistentVector(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.g(objArrCopyOf, "copyOf(...)");
        ArraysKt.t(objArr, i + 1, objArrCopyOf, i, objArr.length - 1);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new PersistentVector(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList addAll(Collection collection) {
        Object[] objArr = this.d;
        if (collection.size() + objArr.length > 32) {
            PersistentVectorBuilder persistentVectorBuilderBuilder = builder();
            persistentVectorBuilderBuilder.addAll(collection);
            return persistentVectorBuilderBuilder.g();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        Intrinsics.g(objArrCopyOf, "copyOf(...)");
        int length = objArr.length;
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new SmallPersistentVector(objArrCopyOf);
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: b */
    public final int getF() {
        return this.d.length;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentVectorBuilder builder() {
        return new PersistentVectorBuilder(this, null, this.d, 0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i) {
        ListImplementation.a(i, getF());
        return this.d[i];
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        return ArraysKt.Q(this.d, obj);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.d;
        Intrinsics.h(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.d;
        ListImplementation.b(i, objArr.length);
        return new BufferIterator(objArr, i, objArr.length);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList m1(int i) {
        Object[] objArr = this.d;
        ListImplementation.a(i, objArr.length);
        if (objArr.length == 1) {
            return e;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        Intrinsics.g(objArrCopyOf, "copyOf(...)");
        ArraysKt.t(objArr, i, objArrCopyOf, i + 1, objArr.length);
        return new SmallPersistentVector(objArrCopyOf);
    }

    @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList set(int i, Object obj) {
        Object[] objArr = this.d;
        ListImplementation.a(i, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.g(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i] = obj;
        return new SmallPersistentVector(objArrCopyOf);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList add(Object obj) {
        Object[] objArr = this.d;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            Intrinsics.g(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[objArr.length] = obj;
            return new SmallPersistentVector(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new PersistentVector(objArr, objArr2, objArr.length + 1, 0);
    }
}
