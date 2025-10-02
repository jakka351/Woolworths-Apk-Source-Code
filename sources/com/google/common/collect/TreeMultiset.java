package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.Serialization;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class TreeMultiset<E> extends AbstractSortedMultiset<E> implements Serializable {
    public static final /* synthetic */ int i = 0;
    public final transient GeneralRange h;

    /* renamed from: com.google.common.collect.TreeMultiset$1, reason: invalid class name */
    class AnonymousClass1 extends Multisets.AbstractEntry<Object> {
        public final /* synthetic */ AvlNode d;

        public AnonymousClass1(TreeMultiset treeMultiset, AvlNode avlNode) {
            this.d = avlNode;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final Object a() {
            return this.d.f14907a;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final int getCount() {
            int i = this.d.b;
            if (i != 0) {
                return i;
            }
            try {
                throw null;
            } catch (NullPointerException unused) {
                return 0;
            }
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$2, reason: invalid class name */
    class AnonymousClass2 implements Iterator<Multiset.Entry<Object>> {
        public AvlNode d;
        public Multiset.Entry e;

        public AnonymousClass2() {
            throw null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            AvlNode avlNode = this.d;
            if (avlNode == null) {
                return false;
            }
            if (!TreeMultiset.this.h.c(avlNode.f14907a)) {
                return true;
            }
            this.d = null;
            return false;
        }

        @Override // java.util.Iterator
        public final Multiset.Entry<Object> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AvlNode avlNode = this.d;
            Objects.requireNonNull(avlNode);
            int i = TreeMultiset.i;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(TreeMultiset.this, avlNode);
            this.e = anonymousClass1;
            Objects.requireNonNull(this.d.d);
            AvlNode avlNode2 = this.d.d;
            Objects.requireNonNull(avlNode2);
            this.d = avlNode2;
            return anonymousClass1;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Preconditions.q("no calls to next() since the last call to remove()", this.e != null);
            TreeMultiset.this.w2(((AnonymousClass1) this.e).d.f14907a);
            this.e = null;
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$3, reason: invalid class name */
    class AnonymousClass3 implements Iterator<Multiset.Entry<Object>> {
        public AvlNode d;
        public Multiset.Entry e;

        public AnonymousClass3() {
            throw null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            AvlNode avlNode = this.d;
            if (avlNode == null) {
                return false;
            }
            if (!TreeMultiset.this.h.d(avlNode.f14907a)) {
                return true;
            }
            this.d = null;
            return false;
        }

        @Override // java.util.Iterator
        public final Multiset.Entry<Object> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Objects.requireNonNull(this.d);
            AvlNode avlNode = this.d;
            int i = TreeMultiset.i;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(TreeMultiset.this, avlNode);
            this.e = anonymousClass1;
            Objects.requireNonNull(avlNode.c);
            AvlNode avlNode2 = this.d.c;
            Objects.requireNonNull(avlNode2);
            this.d = avlNode2;
            return anonymousClass1;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Preconditions.q("no calls to next() since the last call to remove()", this.e != null);
            TreeMultiset.this.w2(((AnonymousClass1) this.e).d.f14907a);
            this.e = null;
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14906a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f14906a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14906a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class Aggregate {
        public static final /* synthetic */ Aggregate[] d = {new Aggregate() { // from class: com.google.common.collect.TreeMultiset.Aggregate.1
        }, new Aggregate() { // from class: com.google.common.collect.TreeMultiset.Aggregate.2
        }};

        /* JADX INFO: Fake field, exist only in values array */
        Aggregate EF2;

        public static Aggregate valueOf(String str) {
            return (Aggregate) Enum.valueOf(Aggregate.class, str);
        }

        public static Aggregate[] values() {
            return (Aggregate[]) d.clone();
        }
    }

    public static final class AvlNode<E> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f14907a = null;
        public final int b = 1;
        public AvlNode c;
        public AvlNode d;

        public final String toString() {
            return new Multisets.ImmutableEntry(this.f14907a, this.b).toString();
        }
    }

    public static final class Reference<T> {
    }

    public TreeMultiset(GeneralRange generalRange) {
        super(generalRange.d);
        this.h = generalRange;
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        Comparator comparator = (Comparator) object;
        Serialization.a(AbstractSortedMultiset.class, "comparator").a(this, comparator);
        Serialization.FieldSetter fieldSetterA = Serialization.a(TreeMultiset.class, "range");
        BoundType boundType = BoundType.d;
        fieldSetterA.a(this, new GeneralRange(comparator, false, null, boundType, false, null, boundType));
        Serialization.a(TreeMultiset.class, "rootReference").a(this, new Reference());
        AvlNode avlNode = new AvlNode();
        Serialization.a(TreeMultiset.class, "header").a(this, avlNode);
        avlNode.d = avlNode;
        avlNode.c = avlNode;
        Serialization.d(this, objectInputStream, objectInputStream.readInt());
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(super.c().comparator());
        Serialization.g(this, objectOutputStream);
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset G0(Object obj, BoundType boundType) {
        return new TreeMultiset(this.h.b(new GeneralRange(this.f, false, null, BoundType.d, true, obj, boundType)));
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public final SortedMultiset K1(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return ((TreeMultiset) g2(obj, boundType)).G0(obj2, boundType2);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final boolean V1(int i2, Object obj) {
        CollectPreconditions.b(0, "newCount");
        CollectPreconditions.b(i2, "oldCount");
        Preconditions.g(this.h.a(obj));
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int add(int i2, Object obj) {
        CollectPreconditions.b(i2, "occurrences");
        if (i2 == 0) {
            try {
                throw null;
            } catch (NullPointerException unused) {
                return 0;
            }
        }
        Preconditions.g(this.h.a(obj));
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int b0(int i2, Object obj) {
        CollectPreconditions.b(i2, "occurrences");
        if (i2 != 0) {
            throw null;
        }
        try {
            throw null;
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        GeneralRange generalRange = this.h;
        if (!generalRange.e && !generalRange.h) {
            throw null;
        }
        new AnonymousClass2();
        throw null;
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public final Comparator comparator() {
        return this.f;
    }

    @Override // com.google.common.collect.Multiset
    public final int e2(Object obj) {
        try {
            throw null;
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final int g() {
        throw null;
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset g2(Object obj, BoundType boundType) {
        return new TreeMultiset(this.h.b(new GeneralRange(this.f, true, obj, boundType, false, null, BoundType.d)));
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator h() {
        new AnonymousClass2();
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator i() {
        new AnonymousClass2();
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return Multisets.b(this);
    }

    @Override // com.google.common.collect.AbstractSortedMultiset
    public final Iterator j() {
        new AnonymousClass3();
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int w2(Object obj) {
        CollectPreconditions.b(0, "count");
        if (this.h.a(obj)) {
            throw null;
        }
        return 0;
    }
}
