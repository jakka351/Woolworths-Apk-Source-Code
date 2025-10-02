package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class AbstractNetwork<N, E> implements Network<N, E> {

    /* renamed from: com.google.common.graph.AbstractNetwork$1, reason: invalid class name */
    class AnonymousClass1 extends AbstractGraph<Object> {

        /* renamed from: com.google.common.graph.AbstractNetwork$1$1, reason: invalid class name and collision with other inner class name */
        class C03181 extends AbstractSet<EndpointPair<Object>> {
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

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.Graph
        public final Set a() {
            throw null;
        }

        @Override // com.google.common.graph.BaseGraph
        public final boolean b() {
            throw null;
        }

        @Override // com.google.common.graph.BaseGraph
        public final Set c() {
            throw null;
        }

        @Override // com.google.common.graph.BaseGraph
        public final boolean d() {
            throw null;
        }

        @Override // com.google.common.graph.BaseGraph
        public final Set f(Object obj) {
            throw null;
        }

        @Override // com.google.common.graph.BaseGraph
        public final Set g(Object obj) {
            throw null;
        }

        @Override // com.google.common.graph.BaseGraph
        public final Set i(Object obj) {
            throw null;
        }
    }

    /* renamed from: com.google.common.graph.AbstractNetwork$2, reason: invalid class name */
    class AnonymousClass2 implements Predicate<Object> {
        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Network)) {
            return false;
        }
        Network network = (Network) obj;
        if (b() == network.b() && c().equals(network.c())) {
            return ((AbstractMap) Maps.b(a(), new au.com.woolworths.product.details.epoxy.a(this, 15))).equals(Maps.b(network.a(), new au.com.woolworths.product.details.epoxy.a(network, 15)));
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractMap) Maps.b(a(), new au.com.woolworths.product.details.epoxy.a(this, 15))).hashCode();
    }

    public final String toString() {
        return "isDirected: " + b() + ", allowsParallelEdges: " + h() + ", allowsSelfLoops: " + d() + ", nodes: " + c() + ", edges: " + Maps.b(a(), new au.com.woolworths.product.details.epoxy.a(this, 15));
    }
}
