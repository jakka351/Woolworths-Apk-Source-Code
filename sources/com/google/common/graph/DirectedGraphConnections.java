package com.google.common.graph;

import com.google.common.collect.AbstractIterator;
import com.google.common.graph.ElementOrder;
import java.util.AbstractSet;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class DirectedGraphConnections<N, V> implements GraphConnections<N, V> {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f14915a = null;

    /* renamed from: com.google.common.graph.DirectedGraphConnections$1, reason: invalid class name */
    class AnonymousClass1 extends AbstractSet<Object> {

        /* renamed from: com.google.common.graph.DirectedGraphConnections$1$1, reason: invalid class name and collision with other inner class name */
        class C03191 extends AbstractIterator<Object> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            throw null;
        }
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$2, reason: invalid class name */
    class AnonymousClass2 extends AbstractSet<Object> {

        /* renamed from: com.google.common.graph.DirectedGraphConnections$2$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Object> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        /* renamed from: com.google.common.graph.DirectedGraphConnections$2$2, reason: invalid class name and collision with other inner class name */
        class C03202 extends AbstractIterator<Object> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            throw null;
        }
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$3, reason: invalid class name */
    class AnonymousClass3 extends AbstractSet<Object> {

        /* renamed from: com.google.common.graph.DirectedGraphConnections$3$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Object> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        /* renamed from: com.google.common.graph.DirectedGraphConnections$3$2, reason: invalid class name */
        class AnonymousClass2 extends AbstractIterator<Object> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            throw null;
        }
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$4, reason: invalid class name */
    class AnonymousClass4 extends AbstractIterator<EndpointPair<Object>> {
        @Override // com.google.common.collect.AbstractIterator
        public final Object a() {
            throw null;
        }
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14916a;

        static {
            int[] iArr = new int[ElementOrder.Type.values().length];
            f14916a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14916a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class NodeConnection<N> {

        public static final class Pred<N> extends NodeConnection<N> {
            public final boolean equals(Object obj) {
                if (obj instanceof Pred) {
                    throw null;
                }
                return false;
            }

            public final int hashCode() {
                Pred.class.hashCode();
                throw null;
            }
        }

        public static final class Succ<N> extends NodeConnection<N> {
            public final boolean equals(Object obj) {
                if (obj instanceof Succ) {
                    throw null;
                }
                return false;
            }

            public final int hashCode() {
                Succ.class.hashCode();
                throw null;
            }
        }
    }

    public static final class PredAndSucc {
    }
}
