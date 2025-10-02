package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.graph.EndpointPair;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
abstract class EndpointPairIterator<N> extends AbstractIterator<EndpointPair<N>> {
    public final BaseGraph f;
    public final Iterator g;
    public Object h = null;
    public Iterator i = ImmutableSet.w().iterator();

    public static final class Directed<N> extends EndpointPairIterator<N> {
        @Override // com.google.common.collect.AbstractIterator
        public final Object a() {
            while (!this.i.hasNext()) {
                if (!c()) {
                    b();
                    return null;
                }
            }
            Object obj = this.h;
            Objects.requireNonNull(obj);
            return new EndpointPair.Ordered(obj, this.i.next());
        }
    }

    public static final class Undirected<N> extends EndpointPairIterator<N> {
        public HashSet j;

        @Override // com.google.common.collect.AbstractIterator
        public final Object a() {
            do {
                Objects.requireNonNull(this.j);
                while (this.i.hasNext()) {
                    Object next = this.i.next();
                    if (!this.j.contains(next)) {
                        Object obj = this.h;
                        Objects.requireNonNull(obj);
                        return new EndpointPair.Unordered(next, obj);
                    }
                }
                this.j.add(this.h);
            } while (c());
            this.j = null;
            b();
            return null;
        }
    }

    public EndpointPairIterator(BaseGraph baseGraph) {
        this.f = baseGraph;
        this.g = baseGraph.c().iterator();
    }

    public final boolean c() {
        Preconditions.r(!this.i.hasNext());
        Iterator it = this.g;
        if (!it.hasNext()) {
            return false;
        }
        Object next = it.next();
        this.h = next;
        this.i = this.f.f(next).iterator();
        return true;
    }
}
