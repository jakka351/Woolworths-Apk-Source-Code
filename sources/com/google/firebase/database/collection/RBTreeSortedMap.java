package com.google.firebase.database.collection;

import com.google.firebase.database.collection.LLRBNode;
import com.google.firebase.firestore.model.DocumentKey;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class RBTreeSortedMap<K, V> extends ImmutableSortedMap<K, V> {
    public final LLRBNode d;
    public final Comparator e;

    public static class Builder<A, B, C> {

        /* renamed from: a, reason: collision with root package name */
        public final List f15405a;
        public final Map b;
        public LLRBValueNode c;
        public LLRBValueNode d;

        public static class Base1_2 implements Iterable<BooleanChunk> {
            public final long d;
            public final int e;

            /* renamed from: com.google.firebase.database.collection.RBTreeSortedMap$Builder$Base1_2$1, reason: invalid class name */
            class AnonymousClass1 implements Iterator<BooleanChunk> {
                public int d;

                public AnonymousClass1() {
                    this.d = Base1_2.this.e - 1;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return this.d >= 0;
                }

                @Override // java.util.Iterator
                public final BooleanChunk next() {
                    long j = Base1_2.this.d;
                    int i = this.d;
                    long j2 = j & (1 << i);
                    BooleanChunk booleanChunk = new BooleanChunk();
                    booleanChunk.f15406a = j2 == 0;
                    booleanChunk.b = (int) Math.pow(2.0d, i);
                    this.d--;
                    return booleanChunk;
                }

                @Override // java.util.Iterator
                public final void remove() {
                }
            }

            public Base1_2(int i) {
                int i2 = i + 1;
                int iFloor = (int) Math.floor(Math.log(i2) / Math.log(2.0d));
                this.e = iFloor;
                this.d = (((long) Math.pow(2.0d, iFloor)) - 1) & i2;
            }

            @Override // java.lang.Iterable
            public final Iterator<BooleanChunk> iterator() {
                return new AnonymousClass1();
            }
        }

        public static class BooleanChunk {

            /* renamed from: a, reason: collision with root package name */
            public boolean f15406a;
            public int b;
        }

        public Builder(List list, Map map) {
            this.f15405a = list;
            this.b = map;
        }

        public static RBTreeSortedMap b(List list, Map map, Comparator comparator) {
            Builder builder = new Builder(list, map);
            Collections.sort(list, comparator);
            Base1_2.AnonymousClass1 anonymousClass1 = new Base1_2(list.size()).new AnonymousClass1();
            int size = list.size();
            while (anonymousClass1.hasNext()) {
                BooleanChunk booleanChunk = (BooleanChunk) anonymousClass1.next();
                int i = booleanChunk.b;
                size -= i;
                boolean z = booleanChunk.f15406a;
                LLRBNode.Color color = LLRBNode.Color.e;
                if (z) {
                    builder.c(color, i, size);
                } else {
                    builder.c(color, i, size);
                    int i2 = booleanChunk.b;
                    size -= i2;
                    builder.c(LLRBNode.Color.d, i2, size);
                }
            }
            LLRBNode lLRBNode = builder.c;
            if (lLRBNode == null) {
                lLRBNode = LLRBEmptyNode.f15403a;
            }
            return new RBTreeSortedMap(lLRBNode, comparator);
        }

        public final LLRBNode a(int i, int i2) {
            if (i2 == 0) {
                return LLRBEmptyNode.f15403a;
            }
            Map map = this.b;
            List list = this.f15405a;
            if (i2 == 1) {
                Object obj = list.get(i);
                return new LLRBBlackValueNode(obj, map.get(obj), null, null);
            }
            int i3 = i2 / 2;
            int i4 = i + i3;
            LLRBNode lLRBNodeA = a(i, i3);
            LLRBNode lLRBNodeA2 = a(i4 + 1, i3);
            Object obj2 = list.get(i4);
            return new LLRBBlackValueNode(obj2, map.get(obj2), lLRBNodeA, lLRBNodeA2);
        }

        public final void c(LLRBNode.Color color, int i, int i2) {
            LLRBNode lLRBNodeA = a(i2 + 1, i - 1);
            Object obj = this.f15405a.get(i2);
            LLRBNode.Color color2 = LLRBNode.Color.d;
            Map map = this.b;
            LLRBValueNode lLRBRedValueNode = color == color2 ? new LLRBRedValueNode(obj, map.get(obj), null, lLRBNodeA) : new LLRBBlackValueNode(obj, map.get(obj), null, lLRBNodeA);
            if (this.c == null) {
                this.c = lLRBRedValueNode;
                this.d = lLRBRedValueNode;
            } else {
                this.d.q(lLRBRedValueNode);
                this.d = lLRBRedValueNode;
            }
        }
    }

    public RBTreeSortedMap(LLRBNode lLRBNode, Comparator comparator) {
        this.d = lLRBNode;
        this.e = comparator;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final boolean b(Object obj) {
        return m(obj) != null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Object d(DocumentKey documentKey) {
        LLRBNode lLRBNodeM = m(documentKey);
        if (lLRBNodeM != null) {
            return lLRBNodeM.getValue();
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Comparator g() {
        return this.e;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Object h() {
        return this.d.f().getKey();
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Object i() {
        return this.d.e().getKey();
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ImmutableSortedMapIterator(this.d, null, this.e);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final ImmutableSortedMap j(Object obj, Object obj2) {
        LLRBNode lLRBNode = this.d;
        Comparator comparator = this.e;
        return new RBTreeSortedMap(((LLRBValueNode) lLRBNode.c(obj, obj2, comparator)).a(LLRBNode.Color.e, null, null), comparator);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Iterator k(Object obj) {
        return new ImmutableSortedMapIterator(this.d, obj, this.e);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final ImmutableSortedMap l(Object obj) {
        if (!b(obj)) {
            return this;
        }
        LLRBNode lLRBNode = this.d;
        Comparator comparator = this.e;
        return new RBTreeSortedMap(lLRBNode.d(obj, comparator).a(LLRBNode.Color.e, null, null), comparator);
    }

    public final LLRBNode m(Object obj) {
        LLRBNode lLRBNodeN = this.d;
        while (!lLRBNodeN.isEmpty()) {
            int iCompare = this.e.compare(obj, lLRBNodeN.getKey());
            if (iCompare < 0) {
                lLRBNodeN = lLRBNodeN.n();
            } else {
                if (iCompare == 0) {
                    return lLRBNodeN;
                }
                lLRBNodeN = lLRBNodeN.i();
            }
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final int size() {
        return this.d.size();
    }
}
