package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.collect.Maps;
import com.google.common.graph.AbstractBaseGraph;
import java.util.AbstractMap;
import java.util.Set;

@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class AbstractValueGraph<N, V> extends AbstractBaseGraph<N> implements ValueGraph<N, V> {

    /* renamed from: com.google.common.graph.AbstractValueGraph$1, reason: invalid class name */
    class AnonymousClass1 extends AbstractGraph<Object> {
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

        @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public final int e() {
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

        @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public final int k() {
            throw null;
        }

        @Override // com.google.common.graph.AbstractBaseGraph
        public final int m(Object obj) {
            throw null;
        }
    }

    @Override // com.google.common.graph.ValueGraph
    public final Set a() {
        return new AbstractBaseGraph.AnonymousClass1();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ValueGraph)) {
            return false;
        }
        ValueGraph valueGraph = (ValueGraph) obj;
        if (b() == valueGraph.b() && c().equals(valueGraph.c())) {
            return ((AbstractMap) Maps.b(a(), new au.com.woolworths.product.details.epoxy.a(this, 16))).equals(Maps.b(valueGraph.a(), new au.com.woolworths.product.details.epoxy.a(valueGraph, 16)));
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractMap) Maps.b(a(), new au.com.woolworths.product.details.epoxy.a(this, 16))).hashCode();
    }

    public final String toString() {
        return "isDirected: " + b() + ", allowsSelfLoops: " + d() + ", nodes: " + c() + ", edges: " + Maps.b(a(), new au.com.woolworths.product.details.epoxy.a(this, 16));
    }
}
