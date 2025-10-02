package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.util.Collection;
import java.util.Iterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ForwardingCollection<E> extends ForwardingObject implements Collection<E> {
    @Override // com.google.common.collect.ForwardingObject
    /* renamed from: R1, reason: merged with bridge method [inline-methods] */
    public abstract Collection P1();

    public final Object[] U1() {
        return toArray(new Object[size()]);
    }

    public final String Y1() {
        int size = size();
        CollectPreconditions.b(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, llqqqql.a0061aaaaa));
        sb.append('[');
        boolean z = true;
        for (E e : this) {
            if (!z) {
                sb.append(", ");
            }
            if (e == this) {
                sb.append("(this Collection)");
            } else {
                sb.append(e);
            }
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public boolean add(Object obj) {
        return P1().add(obj);
    }

    public boolean addAll(Collection collection) {
        return P1().addAll(collection);
    }

    public void clear() {
        P1().clear();
    }

    public boolean contains(Object obj) {
        return P1().contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return P1().containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return P1().isEmpty();
    }

    public Iterator iterator() {
        return P1().iterator();
    }

    public boolean remove(Object obj) {
        return P1().remove(obj);
    }

    public boolean removeAll(Collection collection) {
        return P1().removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        return P1().retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return P1().size();
    }

    public Object[] toArray() {
        return P1().toArray();
    }

    public Object[] toArray(Object[] objArr) {
        return P1().toArray(objArr);
    }
}
