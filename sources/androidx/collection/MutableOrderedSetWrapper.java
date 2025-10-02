package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableSet;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/collection/MutableOrderedSetWrapper;", "E", "Landroidx/collection/OrderedSetWrapper;", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MutableOrderedSetWrapper<E> extends OrderedSetWrapper<E> implements Set<E>, KMutableSet {
    public final MutableOrderedScatterSet e;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010)\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/collection/MutableOrderedSetWrapper$iterator$1", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.collection.MutableOrderedSetWrapper$iterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator<Object>, KMutableIterator {
        public int d = -1;
        public final Iterator e;

        public AnonymousClass1() {
            this.e = SequencesKt.o(new MutableOrderedSetWrapper$iterator$1$iterator$1(MutableOrderedSetWrapper.this, this, null));
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.e.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            return this.e.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i = this.d;
            if (i != -1) {
                MutableOrderedSetWrapper.this.e.i(i);
                this.d = -1;
            }
        }
    }

    public MutableOrderedSetWrapper(MutableOrderedScatterSet mutableOrderedScatterSet) {
        super(mutableOrderedScatterSet);
        this.e = mutableOrderedScatterSet;
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.e.b(obj);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        Intrinsics.h(elements, "elements");
        MutableOrderedScatterSet mutableOrderedScatterSet = this.e;
        mutableOrderedScatterSet.getClass();
        int i = mutableOrderedScatterSet.g;
        for (Object obj : elements) {
            int iE = mutableOrderedScatterSet.e(obj);
            mutableOrderedScatterSet.b[iE] = obj;
            long[] jArr = mutableOrderedScatterSet.c;
            int i2 = mutableOrderedScatterSet.d;
            jArr[iE] = (i2 & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((iE & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            mutableOrderedScatterSet.d = iE;
            if (mutableOrderedScatterSet.e == Integer.MAX_VALUE) {
                mutableOrderedScatterSet.e = iE;
            }
        }
        return i != mutableOrderedScatterSet.g;
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public final void clear() {
        this.e.d();
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new AnonymousClass1();
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.e.h(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:
    
        if (((r5 & ((~r5) << 6)) & r12) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        r14 = -1;
     */
    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean removeAll(java.util.Collection r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "elements"
            kotlin.jvm.internal.Intrinsics.h(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = r20
            androidx.collection.MutableOrderedScatterSet r2 = r1.e
            r2.getClass()
            int r3 = r2.g
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r4 = r0.hasNext()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto La3
            java.lang.Object r4 = r0.next()
            if (r4 == 0) goto L29
            int r7 = r4.hashCode()
            goto L2a
        L29:
            r7 = r6
        L2a:
            r8 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r7 = r7 * r8
            int r8 = r7 << 16
            r7 = r7 ^ r8
            r8 = r7 & 127(0x7f, float:1.78E-43)
            int r9 = r2.f
            int r7 = r7 >>> 7
            r7 = r7 & r9
        L38:
            long[] r10 = r2.f696a
            int r11 = r7 >> 3
            r12 = r7 & 7
            int r12 = r12 << 3
            r13 = r10[r11]
            long r13 = r13 >>> r12
            int r11 = r11 + r5
            r10 = r10[r11]
            int r15 = 64 - r12
            long r10 = r10 << r15
            r21 = r5
            r15 = r6
            long r5 = (long) r12
            long r5 = -r5
            r12 = 63
            long r5 = r5 >> r12
            long r5 = r5 & r10
            long r5 = r5 | r13
            long r10 = (long) r8
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r5
            long r12 = r10 - r12
            long r10 = ~r10
            long r10 = r10 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
        L65:
            r16 = 0
            int r14 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r14 == 0) goto L88
            int r14 = java.lang.Long.numberOfTrailingZeros(r10)
            int r14 = r14 >> 3
            int r14 = r14 + r7
            r14 = r14 & r9
            r18 = r12
            java.lang.Object[] r12 = r2.b
            r12 = r12[r14]
            boolean r12 = kotlin.jvm.internal.Intrinsics.c(r12, r4)
            if (r12 == 0) goto L80
            goto L95
        L80:
            r12 = 1
            long r12 = r10 - r12
            long r10 = r10 & r12
            r12 = r18
            goto L65
        L88:
            r18 = r12
            long r10 = ~r5
            r12 = 6
            long r10 = r10 << r12
            long r5 = r5 & r10
            long r5 = r5 & r18
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 == 0) goto L9c
            r14 = -1
        L95:
            if (r14 < 0) goto L16
            r2.i(r14)
            goto L16
        L9c:
            int r6 = r15 + 8
            int r7 = r7 + r6
            r7 = r7 & r9
            r5 = r21
            goto L38
        La3:
            r21 = r5
            int r0 = r2.g
            if (r3 == r0) goto Laa
            return r21
        Laa:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedSetWrapper.removeAll(java.util.Collection):boolean");
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        Intrinsics.h(elements, "elements");
        return this.e.j(elements);
    }
}
