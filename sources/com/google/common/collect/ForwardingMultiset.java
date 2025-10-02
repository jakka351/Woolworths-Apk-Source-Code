package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multisets;
import java.util.Iterator;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ForwardingMultiset<E> extends ForwardingCollection<E> implements Multiset<E> {

    public class StandardElementSet extends Multisets.ElementSet<E> {
        @Override // com.google.common.collect.Multisets.ElementSet
        public final Multiset h() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            throw null;
        }
    }

    @Override // com.google.common.collect.Multiset
    public boolean V1(int i, Object obj) {
        return P1().V1(i, obj);
    }

    @Override // com.google.common.collect.Multiset
    public int add(int i, Object obj) {
        return P1().add(i, obj);
    }

    @Override // com.google.common.collect.Multiset
    public int b0(int i, Object obj) {
        return P1().b0(i, obj);
    }

    @Override // com.google.common.collect.ForwardingCollection
    /* renamed from: b2 */
    public abstract Multiset P1();

    public Set c() {
        return P1().c();
    }

    @Override // com.google.common.collect.Multiset
    public final int e2(Object obj) {
        return P1().e2(obj);
    }

    public Set entrySet() {
        return P1().entrySet();
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final boolean equals(Object obj) {
        return obj == this || P1().equals(obj);
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final int hashCode() {
        return P1().hashCode();
    }

    @Override // com.google.common.collect.Multiset
    public int w2(Object obj) {
        return P1().w2(obj);
    }
}
