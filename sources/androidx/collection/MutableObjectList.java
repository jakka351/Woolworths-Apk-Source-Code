package androidx.collection;

import YU.a;
import androidx.collection.internal.RuntimeHelpersKt;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/collection/MutableObjectList;", "E", "Landroidx/collection/ObjectList;", "MutableObjectListIterator", "ObjectListMutableList", "SubList", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MutableObjectList<E> extends ObjectList<E> {
    public ObjectListMutableList c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/collection/MutableObjectList$MutableObjectListIterator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class MutableObjectListIterator<T> implements ListIterator<T>, KMutableListIterator {
        public final Object d;
        public int e;

        public MutableObjectListIterator(List list, int i) {
            this.d = list;
            this.e = i - 1;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void add(Object obj) {
            int i = this.e + 1;
            this.e = i;
            this.d.add(i, obj);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.e < this.d.size() - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.e >= 0;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            int i = this.e + 1;
            this.e = i;
            return this.d.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.e + 1;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final Object previous() {
            int i = this.e;
            this.e = i - 1;
            return this.d.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.e;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            this.d.remove(this.e);
            this.e--;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void set(Object obj) {
            this.d.set(this.e, obj);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/collection/MutableObjectList$ObjectListMutableList;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class ObjectListMutableList<T> implements List<T>, KMutableList {
        public final MutableObjectList d;

        public ObjectListMutableList(MutableObjectList mutableObjectList) {
            this.d = mutableObjectList;
        }

        @Override // java.util.List
        public final void add(int i, Object obj) {
            int i2;
            MutableObjectList mutableObjectList = this.d;
            if (i < 0 || i > (i2 = mutableObjectList.b)) {
                StringBuilder sbR = a.r(i, "Index ", " must be in 0..");
                sbR.append(mutableObjectList.b);
                RuntimeHelpersKt.c(sbR.toString());
                throw null;
            }
            int i3 = i2 + 1;
            Object[] objArr = mutableObjectList.f694a;
            if (objArr.length < i3) {
                mutableObjectList.n(i3, objArr);
            }
            Object[] objArr2 = mutableObjectList.f694a;
            int i4 = mutableObjectList.b;
            if (i != i4) {
                ArraysKt.t(objArr2, i + 1, objArr2, i, i4);
            }
            objArr2[i] = obj;
            mutableObjectList.b++;
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection elements) {
            Intrinsics.h(elements, "elements");
            MutableObjectList mutableObjectList = this.d;
            if (i < 0 || i > mutableObjectList.b) {
                StringBuilder sbR = a.r(i, "Index ", " must be in 0..");
                sbR.append(mutableObjectList.b);
                RuntimeHelpersKt.c(sbR.toString());
                throw null;
            }
            int i2 = 0;
            if (elements.isEmpty()) {
                return false;
            }
            int size = elements.size() + mutableObjectList.b;
            Object[] objArr = mutableObjectList.f694a;
            if (objArr.length < size) {
                mutableObjectList.n(size, objArr);
            }
            Object[] objArr2 = mutableObjectList.f694a;
            if (i != mutableObjectList.b) {
                ArraysKt.t(objArr2, elements.size() + i, objArr2, i, mutableObjectList.b);
            }
            for (T t : elements) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                objArr2[i2 + i] = t;
                i2 = i3;
            }
            mutableObjectList.b = elements.size() + mutableObjectList.b;
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.d.j();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.d.c(obj) >= 0;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection elements) {
            Intrinsics.h(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (this.d.c(it.next()) < 0) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final Object get(int i) {
            ObjectListKt.a(i, this);
            return this.d.b(i);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.d.c(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.d.d();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            MutableObjectList mutableObjectList = this.d;
            if (obj == null) {
                Object[] objArr = mutableObjectList.f694a;
                for (int i = mutableObjectList.b - 1; -1 < i; i--) {
                    if (objArr[i] == null) {
                        return i;
                    }
                }
            } else {
                Object[] objArr2 = mutableObjectList.f694a;
                for (int i2 = mutableObjectList.b - 1; -1 < i2; i2--) {
                    if (obj.equals(objArr2[i2])) {
                        return i2;
                    }
                }
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.d.k(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection elements) {
            Intrinsics.h(elements, "elements");
            MutableObjectList mutableObjectList = this.d;
            mutableObjectList.getClass();
            int i = mutableObjectList.b;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                mutableObjectList.k(it.next());
            }
            return i != mutableObjectList.b;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection elements) {
            Intrinsics.h(elements, "elements");
            MutableObjectList mutableObjectList = this.d;
            mutableObjectList.getClass();
            int i = mutableObjectList.b;
            Object[] objArr = mutableObjectList.f694a;
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (!elements.contains(objArr[i2])) {
                    mutableObjectList.l(i2);
                }
            }
            return i != mutableObjectList.b;
        }

        @Override // java.util.List
        public final Object set(int i, Object obj) {
            ObjectListKt.a(i, this);
            MutableObjectList mutableObjectList = this.d;
            if (i < 0 || i >= mutableObjectList.b) {
                mutableObjectList.f(i);
                throw null;
            }
            Object[] objArr = mutableObjectList.f694a;
            Object obj2 = objArr[i];
            objArr[i] = obj;
            return obj2;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.d.b;
        }

        @Override // java.util.List
        public final List subList(int i, int i2) {
            ObjectListKt.b(i, i2, this);
            return new SubList(i, i2, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return CollectionToArray.a(this);
        }

        @Override // java.util.List
        public final ListIterator listIterator(int i) {
            return new MutableObjectListIterator(this, i);
        }

        @Override // java.util.List
        public final Object remove(int i) {
            ObjectListKt.a(i, this);
            return this.d.l(i);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray(Object[] array) {
            Intrinsics.h(array, "array");
            return CollectionToArray.b(this, array);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(Object obj) {
            this.d.g(obj);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection elements) {
            Intrinsics.h(elements, "elements");
            MutableObjectList mutableObjectList = this.d;
            int i = mutableObjectList.b;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                mutableObjectList.g(it.next());
            }
            return i != mutableObjectList.b;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/collection/MutableObjectList$SubList;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final boolean addAll(int i, Collection elements) {
            Intrinsics.h(elements, "elements");
            this.d.addAll(i + this.e, elements);
            this.f = elements.size() + this.f;
            return elements.size() > 0;
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
        public final boolean containsAll(Collection elements) {
            Intrinsics.h(elements, "elements");
            Iterator<T> it = elements.iterator();
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
            ObjectListKt.a(i, this);
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
            return new MutableObjectListIterator(this, 0);
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
            return new MutableObjectListIterator(this, 0);
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
        public final boolean removeAll(Collection elements) {
            Intrinsics.h(elements, "elements");
            int i = this.f;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.f;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection elements) {
            Intrinsics.h(elements, "elements");
            int i = this.f;
            int i2 = i - 1;
            int i3 = this.e;
            if (i3 <= i2) {
                while (true) {
                    ?? r3 = this.d;
                    if (!elements.contains(r3.get(i2))) {
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
            ObjectListKt.a(i, this);
            return this.d.set(i + this.e, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f - this.e;
        }

        @Override // java.util.List
        public final List subList(int i, int i2) {
            ObjectListKt.b(i, i2, this);
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
            return new MutableObjectListIterator(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray(Object[] array) {
            Intrinsics.h(array, "array");
            return CollectionToArray.b(this, array);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection elements) {
            Intrinsics.h(elements, "elements");
            this.d.addAll(this.f, elements);
            this.f = elements.size() + this.f;
            return elements.size() > 0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final Object remove(int i) {
            ObjectListKt.a(i, this);
            this.f--;
            return this.d.remove(i + this.e);
        }
    }

    public MutableObjectList(int i) {
        this.f694a = i == 0 ? ObjectListKt.f695a : new Object[i];
    }

    public final void g(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.f694a;
        if (objArr.length < i) {
            n(i, objArr);
        }
        Object[] objArr2 = this.f694a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void h(List elements) {
        Intrinsics.h(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int i = this.b;
        int size = elements.size() + i;
        Object[] objArr = this.f694a;
        if (objArr.length < size) {
            n(size, objArr);
        }
        Object[] objArr2 = this.f694a;
        int size2 = elements.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = elements.get(i2);
        }
        this.b = elements.size() + this.b;
    }

    public final List i() {
        ObjectListMutableList objectListMutableList = this.c;
        if (objectListMutableList != null) {
            return objectListMutableList;
        }
        ObjectListMutableList objectListMutableList2 = new ObjectListMutableList(this);
        this.c = objectListMutableList2;
        return objectListMutableList2;
    }

    public final void j() {
        ArraysKt.B(this.f694a, 0, this.b, null);
        this.b = 0;
    }

    public final boolean k(Object obj) {
        int iC = c(obj);
        if (iC < 0) {
            return false;
        }
        l(iC);
        return true;
    }

    public final Object l(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            f(i);
            throw null;
        }
        Object[] objArr = this.f694a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            ArraysKt.t(objArr, i, objArr, i + 1, i2);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return obj;
    }

    public final void m(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            StringBuilder sbQ = a.q(i, i2, "Start (", ") and end (", ") must be in 0..");
            sbQ.append(this.b);
            RuntimeHelpersKt.c(sbQ.toString());
            throw null;
        }
        if (i2 < i) {
            RuntimeHelpersKt.a("Start (" + i + ") is more than end (" + i2 + ')');
            throw null;
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.f694a;
                ArraysKt.t(objArr, i, objArr, i2, i3);
            }
            int i4 = this.b;
            int i5 = i4 - (i2 - i);
            ArraysKt.B(this.f694a, i5, i4, null);
            this.b = i5;
        }
    }

    public final void n(int i, Object[] oldContent) {
        Intrinsics.h(oldContent, "oldContent");
        int length = oldContent.length;
        Object[] objArr = new Object[Math.max(i, (length * 3) / 2)];
        ArraysKt.t(oldContent, 0, objArr, 0, length);
        this.f694a = objArr;
    }

    public /* synthetic */ MutableObjectList() {
        this(16);
    }
}
