package androidx.compose.ui.node;

import androidx.collection.MutableLongList;
import androidx.collection.MutableObjectList;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/HitTestResult;", "", "Landroidx/compose/ui/Modifier$Node;", "HitTestResultIterator", "SubList", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class HitTestResult implements List<Modifier.Node>, KMappedMarker {
    public final MutableObjectList d = new MutableObjectList(16);
    public final MutableLongList e = new MutableLongList(16);
    public int f = -1;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/node/HitTestResult$SubList;", "", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public final class SubList implements List<Modifier.Node>, KMappedMarker {
        public final int d;
        public final int e;

        public SubList(int i, int i2) {
            this.d = i;
            this.e = i2;
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ void add(int i, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends Modifier.Node> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return (obj instanceof Modifier.Node) && indexOf((Modifier.Node) obj) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((Modifier.Node) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final Modifier.Node get(int i) {
            Object objB = HitTestResult.this.d.b(i + this.d);
            Intrinsics.f(objB, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) objB;
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof Modifier.Node)) {
                return -1;
            }
            Modifier.Node node = (Modifier.Node) obj;
            int i = this.d;
            int i2 = this.e;
            if (i <= i2) {
                int i3 = i;
                while (!Intrinsics.c(HitTestResult.this.d.b(i3), node)) {
                    if (i3 != i2) {
                        i3++;
                    }
                }
                return i3 - i;
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            int i = this.d;
            return HitTestResult.this.new HitTestResultIterator(i, i, this.e);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Modifier.Node)) {
                return -1;
            }
            Modifier.Node node = (Modifier.Node) obj;
            int i = this.e;
            int i2 = this.d;
            if (i2 <= i) {
                while (!Intrinsics.c(HitTestResult.this.d.b(i), node)) {
                    if (i != i2) {
                        i--;
                    }
                }
                return i - i2;
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator<Modifier.Node> listIterator() {
            int i = this.d;
            return HitTestResult.this.new HitTestResultIterator(i, i, this.e);
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ Modifier.Node remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ Object removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ Object removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ Modifier.Node set(int i, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.e - this.d;
        }

        @Override // java.util.List
        public final void sort(Comparator<? super Modifier.Node> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final List<Modifier.Node> subList(int i, int i2) {
            int i3 = this.d;
            return HitTestResult.this.new SubList(i + i3, i3 + i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return CollectionToArray.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final ListIterator<Modifier.Node> listIterator(int i) {
            int i2 = this.d;
            int i3 = this.e;
            return HitTestResult.this.new HitTestResultIterator(i + i2, i2, i3);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            return CollectionToArray.b(this, objArr);
        }
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        androidx.collection.internal.RuntimeHelpersKt.c("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b() {
        /*
            r7 = this;
            r0 = 2139095040(0x7f800000, float:Infinity)
            r1 = 0
            long r0 = androidx.compose.ui.node.HitTestResultKt.a(r0, r1, r1)
            int r2 = r7.f
            int r2 = r2 + 1
            int r3 = kotlin.collections.CollectionsKt.I(r7)
            if (r2 > r3) goto L44
        L11:
            androidx.collection.MutableLongList r4 = r7.e
            if (r2 < 0) goto L3a
            int r5 = r4.b
            if (r2 >= r5) goto L3d
            long[] r4 = r4.f684a
            r4 = r4[r2]
            int r6 = androidx.compose.ui.node.DistanceAndFlags.a(r4, r0)
            if (r6 >= 0) goto L24
            r0 = r4
        L24:
            float r4 = androidx.compose.ui.node.DistanceAndFlags.b(r0)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L34
            boolean r4 = androidx.compose.ui.node.DistanceAndFlags.d(r0)
            if (r4 == 0) goto L34
            goto L39
        L34:
            if (r2 == r3) goto L39
            int r2 = r2 + 1
            goto L11
        L39:
            return r0
        L3a:
            r4.getClass()
        L3d:
            java.lang.String r0 = "Index must be between 0 and size"
            androidx.collection.internal.RuntimeHelpersKt.c(r0)
            r0 = 0
            throw r0
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.HitTestResult.b():long");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f = -1;
        this.d.j();
        this.e.b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof Modifier.Node) && indexOf((Modifier.Node) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((Modifier.Node) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.d.m(i, i2);
        MutableLongList mutableLongList = this.e;
        if (i >= 0) {
            int i3 = mutableLongList.b;
            if (i <= i3 && i2 >= 0 && i2 <= i3) {
                if (i2 < i) {
                    RuntimeHelpersKt.a("The end index must be < start index");
                    throw null;
                }
                if (i2 != i) {
                    if (i2 < i3) {
                        long[] jArr = mutableLongList.f684a;
                        ArraysKt.r(i, jArr, i2, jArr, i3);
                    }
                    mutableLongList.b -= i2 - i;
                    return;
                }
                return;
            }
        } else {
            mutableLongList.getClass();
        }
        RuntimeHelpersKt.c("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List
    public final Modifier.Node get(int i) {
        Object objB = this.d.b(i);
        Intrinsics.f(objB, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (Modifier.Node) objB;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Modifier.Node)) {
            return -1;
        }
        Modifier.Node node = (Modifier.Node) obj;
        int I = CollectionsKt.I(this);
        if (I >= 0) {
            int i = 0;
            while (!Intrinsics.c(this.d.b(i), node)) {
                if (i != I) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d.d();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new HitTestResultIterator(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Modifier.Node)) {
            return -1;
        }
        Modifier.Node node = (Modifier.Node) obj;
        for (int I = CollectionsKt.I(this); -1 < I; I--) {
            if (Intrinsics.c(this.d.b(I), node)) {
                return I;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<Modifier.Node> listIterator() {
        return new HitTestResultIterator(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Modifier.Node remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Modifier.Node set(int i, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d.b;
    }

    @Override // java.util.List
    public final void sort(Comparator<? super Modifier.Node> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<Modifier.Node> subList(int i, int i2) {
        return new SubList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<Modifier.Node> listIterator(int i) {
        return new HitTestResultIterator(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CollectionToArray.b(this, objArr);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/node/HitTestResult$HitTestResultIterator;", "", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public final class HitTestResultIterator implements ListIterator<Modifier.Node>, KMappedMarker {
        public int d;
        public final int e;
        public final int f;

        public HitTestResultIterator(HitTestResult hitTestResult, int i, int i2) {
            this((i2 & 1) != 0 ? 0 : i, 0, hitTestResult.d.b);
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void add(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.d < this.f;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.d > this.e;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            MutableObjectList mutableObjectList = HitTestResult.this.d;
            int i = this.d;
            this.d = i + 1;
            Object objB = mutableObjectList.b(i);
            Intrinsics.f(objB, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) objB;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.d - this.e;
        }

        @Override // java.util.ListIterator
        public final Modifier.Node previous() {
            MutableObjectList mutableObjectList = HitTestResult.this.d;
            int i = this.d - 1;
            this.d = i;
            Object objB = mutableObjectList.b(i);
            Intrinsics.f(objB, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) objB;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return (this.d - this.e) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void set(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public HitTestResultIterator(int i, int i2, int i3) {
            this.d = i;
            this.e = i2;
            this.f = i3;
        }
    }
}
