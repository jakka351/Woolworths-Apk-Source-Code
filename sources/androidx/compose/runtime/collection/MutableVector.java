package androidx.compose.runtime.collection;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "MutableVectorList", "SubList", "VectorListIterator", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MutableVector<T> implements RandomAccess {
    public Object[] d;
    public List e;
    public int f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$MutableVectorList;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class MutableVectorList<T> implements List<T>, KMutableList {
        public final MutableVector d;

        public MutableVectorList(MutableVector mutableVector) {
            this.d = mutableVector;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(Object obj) {
            this.d.c(obj);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection collection) {
            MutableVector mutableVector = this.d;
            return mutableVector.f(mutableVector.f, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.d.h();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.d.i(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection collection) {
            MutableVector mutableVector = this.d;
            mutableVector.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!mutableVector.i(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final Object get(int i) {
            MutableVectorKt.a(i, this);
            return this.d.d[i];
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.d.j(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.d.f == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            MutableVector mutableVector = this.d;
            Object[] objArr = mutableVector.d;
            for (int i = mutableVector.f - 1; i >= 0; i--) {
                if (Intrinsics.c(obj, objArr[i])) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.d.k(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection collection) {
            MutableVector mutableVector = this.d;
            mutableVector.getClass();
            if (collection.isEmpty()) {
                return false;
            }
            int i = mutableVector.f;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                mutableVector.k(it.next());
            }
            return i != mutableVector.f;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection collection) {
            MutableVector mutableVector = this.d;
            int i = mutableVector.f;
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (!collection.contains(mutableVector.d[i2])) {
                    mutableVector.l(i2);
                }
            }
            return i != mutableVector.f;
        }

        @Override // java.util.List
        public final Object set(int i, Object obj) {
            MutableVectorKt.a(i, this);
            Object[] objArr = this.d.d;
            Object obj2 = objArr[i];
            objArr[i] = obj;
            return obj2;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.d.f;
        }

        @Override // java.util.List
        public final List subList(int i, int i2) {
            MutableVectorKt.b(i, i2, this);
            return new SubList(i, i2, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return CollectionToArray.a(this);
        }

        @Override // java.util.List
        public final void add(int i, Object obj) {
            this.d.b(i, obj);
        }

        @Override // java.util.List
        public final ListIterator listIterator(int i) {
            return new VectorListIterator(this, i);
        }

        @Override // java.util.List
        public final Object remove(int i) {
            MutableVectorKt.a(i, this);
            return this.d.l(i);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            return CollectionToArray.b(this, objArr);
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection collection) {
            return this.d.f(i, collection);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$SubList;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class SubList<T> implements List<T>, KMutableList {
        public final Object d;
        public final int e;
        public int f;

        public SubList(int i, int i2, List list) {
            this.d = list;
            this.e = i;
            this.f = i2;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean add(Object obj) {
            int i = this.f;
            this.f = i + 1;
            this.d.add(i, obj);
            return true;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final boolean addAll(int i, Collection collection) {
            this.d.addAll(i + this.e, collection);
            int size = collection.size();
            this.f += size;
            return size > 0;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i = this.f - 1;
            int i2 = this.e;
            if (i2 <= i) {
                while (true) {
                    this.d.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.f = i2;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i = this.f;
            for (int i2 = this.e; i2 < i; i2++) {
                if (Intrinsics.c(this.d.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final Object get(int i) {
            MutableVectorKt.a(i, this);
            return this.d.get(i + this.e);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i = this.f;
            int i2 = this.e;
            for (int i3 = i2; i3 < i; i3++) {
                if (Intrinsics.c(this.d.get(i3), obj)) {
                    return i3 - i2;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f == this.e;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new VectorListIterator(this, 0);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i = this.f - 1;
            int i2 = this.e;
            if (i2 > i) {
                return -1;
            }
            while (!Intrinsics.c(this.d.get(i), obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - i2;
        }

        @Override // java.util.List
        public final ListIterator listIterator() {
            return new VectorListIterator(this, 0);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i = this.f;
            for (int i2 = this.e; i2 < i; i2++) {
                ?? r2 = this.d;
                if (Intrinsics.c(r2.get(i2), obj)) {
                    r2.remove(i2);
                    this.f--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection collection) {
            int i = this.f;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.f;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection collection) {
            int i = this.f;
            int i2 = i - 1;
            int i3 = this.e;
            if (i3 <= i2) {
                while (true) {
                    ?? r3 = this.d;
                    if (!collection.contains(r3.get(i2))) {
                        r3.remove(i2);
                        this.f--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.f;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final Object set(int i, Object obj) {
            MutableVectorKt.a(i, this);
            return this.d.set(i + this.e, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f - this.e;
        }

        @Override // java.util.List
        public final List subList(int i, int i2) {
            MutableVectorKt.b(i, i2, this);
            return new SubList(i, i2, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return CollectionToArray.a(this);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final void add(int i, Object obj) {
            this.d.add(i + this.e, obj);
            this.f++;
        }

        @Override // java.util.List
        public final ListIterator listIterator(int i) {
            return new VectorListIterator(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            return CollectionToArray.b(this, objArr);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection collection) {
            this.d.addAll(this.f, collection);
            int size = collection.size();
            this.f += size;
            return size > 0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final Object remove(int i) {
            MutableVectorKt.a(i, this);
            this.f--;
            return this.d.remove(i + this.e);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$VectorListIterator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class VectorListIterator<T> implements ListIterator<T>, KMutableListIterator {
        public final Object d;
        public int e;

        public VectorListIterator(List list, int i) {
            this.d = list;
            this.e = i;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void add(Object obj) {
            this.d.add(this.e, obj);
            this.e++;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.e < this.d.size();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.e > 0;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            int i = this.e;
            this.e = i + 1;
            return this.d.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.e;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final Object previous() {
            int i = this.e - 1;
            this.e = i;
            return this.d.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.e - 1;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            int i = this.e - 1;
            this.e = i;
            this.d.remove(i);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void set(Object obj) {
            this.d.set(this.e, obj);
        }
    }

    public MutableVector(Object[] objArr, int i) {
        this.d = objArr;
        this.f = i;
    }

    public final void b(int i, Object obj) {
        int i2 = this.f + 1;
        if (this.d.length < i2) {
            n(i2);
        }
        Object[] objArr = this.d;
        int i3 = this.f;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.f++;
    }

    public final void c(Object obj) {
        int i = this.f + 1;
        if (this.d.length < i) {
            n(i);
        }
        Object[] objArr = this.d;
        int i2 = this.f;
        objArr[i2] = obj;
        this.f = i2 + 1;
    }

    public final void d(int i, MutableVector mutableVector) {
        int i2 = mutableVector.f;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f + i2;
        if (this.d.length < i3) {
            n(i3);
        }
        Object[] objArr = this.d;
        int i4 = this.f;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(mutableVector.d, 0, objArr, i, i2);
        this.f += i2;
    }

    public final void e(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.f + size;
        if (this.d.length < i2) {
            n(i2);
        }
        Object[] objArr = this.d;
        int i3 = this.f;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.f += size;
    }

    public final boolean f(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.f + size;
        if (this.d.length < i3) {
            n(i3);
        }
        Object[] objArr = this.d;
        int i4 = this.f;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (T t : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.z0();
                throw null;
            }
            objArr[i2 + i] = t;
            i2 = i5;
        }
        this.f += size;
        return true;
    }

    public final List g() {
        List list = this.e;
        if (list != null) {
            return list;
        }
        MutableVectorList mutableVectorList = new MutableVectorList(this);
        this.e = mutableVectorList;
        return mutableVectorList;
    }

    public final void h() {
        Object[] objArr = this.d;
        int i = this.f;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f = 0;
    }

    public final boolean i(Object obj) {
        int i = this.f - 1;
        if (i >= 0) {
            for (int i2 = 0; !Intrinsics.c(this.d[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final int j(Object obj) {
        Object[] objArr = this.d;
        int i = this.f;
        for (int i2 = 0; i2 < i; i2++) {
            if (Intrinsics.c(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean k(Object obj) {
        int iJ = j(obj);
        if (iJ < 0) {
            return false;
        }
        l(iJ);
        return true;
    }

    public final Object l(int i) {
        Object[] objArr = this.d;
        Object obj = objArr[i];
        int i2 = this.f;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.f - 1;
        this.f = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void m(int i, int i2) {
        if (i2 > i) {
            int i3 = this.f;
            if (i2 < i3) {
                Object[] objArr = this.d;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.f;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.d[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.f = i5;
        }
    }

    public final void n(int i) {
        Object[] objArr = this.d;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.d = objArr2;
    }

    public final void o(Comparator comparator) {
        Arrays.sort(this.d, 0, this.f, comparator);
    }
}
