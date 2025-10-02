package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.common.graph.EndpointPairIterator;
import com.google.common.primitives.Ints;
import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
abstract class AbstractBaseGraph<N> implements BaseGraph<N> {

    /* renamed from: com.google.common.graph.AbstractBaseGraph$1, reason: invalid class name */
    class AnonymousClass1 extends AbstractSet<EndpointPair<Object>> {
        public AnonymousClass1() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (obj instanceof EndpointPair) {
                EndpointPair endpointPair = (EndpointPair) obj;
                Object obj2 = endpointPair.d;
                boolean zB = endpointPair.b();
                AbstractBaseGraph abstractBaseGraph = AbstractBaseGraph.this;
                if (zB == abstractBaseGraph.b() && abstractBaseGraph.c().contains(obj2) && abstractBaseGraph.f(obj2).contains(endpointPair.e)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            AbstractBaseGraph abstractBaseGraph = AbstractBaseGraph.this;
            if (abstractBaseGraph.b()) {
                return new EndpointPairIterator.Directed(abstractBaseGraph);
            }
            EndpointPairIterator.Undirected undirected = new EndpointPairIterator.Undirected(abstractBaseGraph);
            undirected.j = new HashSet(Maps.c(abstractBaseGraph.c().size() + 1));
            return undirected;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return Ints.e(AbstractBaseGraph.this.n());
        }
    }

    /* renamed from: com.google.common.graph.AbstractBaseGraph$2, reason: invalid class name */
    class AnonymousClass2 extends IncidentEdgeSet<Object> {
        public static final /* synthetic */ int d = 0;

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            throw null;
        }
    }

    @Override // com.google.common.graph.BaseGraph
    public int e() {
        return b() ? i(null).size() : m(null);
    }

    @Override // com.google.common.graph.BaseGraph
    public int k() {
        return b() ? f(null).size() : m(null);
    }

    public int m(Object obj) {
        if (b()) {
            return Ints.e(i(obj).size() + f(obj).size());
        }
        return Ints.e(r0.size() + ((d() && g(obj).contains(obj)) ? 1 : 0));
    }

    public long n() {
        long jM = 0;
        while (c().iterator().hasNext()) {
            jM += m(r0.next());
        }
        Preconditions.r((1 & jM) == 0);
        return jM >>> 1;
    }
}
