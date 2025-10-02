package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.collect.Iterators;
import com.google.errorprone.annotations.Immutable;
import java.util.Arrays;
import java.util.Iterator;

@Immutable
@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class EndpointPair<N> implements Iterable<N> {
    public final Object d;
    public final Object e;

    public static final class Ordered<N> extends EndpointPair<N> {
        @Override // com.google.common.graph.EndpointPair
        public final boolean b() {
            return true;
        }

        @Override // com.google.common.graph.EndpointPair
        public final Object d() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (obj != this) {
                if (!(obj instanceof EndpointPair)) {
                    return false;
                }
                EndpointPair endpointPair = (EndpointPair) obj;
                if (true != endpointPair.b() || !this.d.equals(endpointPair.d()) || !this.e.equals(endpointPair.g())) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.graph.EndpointPair
        public final Object g() {
            return this.e;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.d, this.e});
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public final Iterator iterator() {
            return Iterators.g(this.d, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(this.d);
            sb.append(" -> ");
            return android.support.v4.media.session.a.o(this.e, ">", sb);
        }
    }

    public static final class Unordered<N> extends EndpointPair<N> {
        @Override // com.google.common.graph.EndpointPair
        public final boolean b() {
            return false;
        }

        @Override // com.google.common.graph.EndpointPair
        public final Object d() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EndpointPair)) {
                return false;
            }
            EndpointPair endpointPair = (EndpointPair) obj;
            Object obj2 = endpointPair.e;
            Object obj3 = endpointPair.d;
            if (endpointPair.b()) {
                return false;
            }
            Object obj4 = this.d;
            boolean zEquals = obj4.equals(obj3);
            Object obj5 = this.e;
            return zEquals ? obj5.equals(obj2) : obj4.equals(obj2) && obj5.equals(obj3);
        }

        @Override // com.google.common.graph.EndpointPair
        public final Object g() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        public final int hashCode() {
            return this.e.hashCode() + this.d.hashCode();
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public final Iterator iterator() {
            return Iterators.g(this.d, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.d);
            sb.append(", ");
            return android.support.v4.media.session.a.o(this.e, "]", sb);
        }
    }

    public EndpointPair(Object obj, Object obj2) {
        obj.getClass();
        this.d = obj;
        obj2.getClass();
        this.e = obj2;
    }

    public abstract boolean b();

    public abstract Object d();

    public abstract Object g();

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return Iterators.g(this.d, this.e);
    }
}
