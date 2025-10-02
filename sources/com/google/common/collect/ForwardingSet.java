package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ForwardingSet<E> extends ForwardingCollection<E> implements Set<E> {
    @Override // com.google.common.collect.ForwardingCollection
    /* renamed from: b2, reason: merged with bridge method [inline-methods] */
    public abstract Set P1();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return obj == this || P1().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return P1().hashCode();
    }
}
