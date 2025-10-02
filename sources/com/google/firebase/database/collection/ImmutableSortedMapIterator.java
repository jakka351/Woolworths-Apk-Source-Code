package com.google.firebase.database.collection;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public class ImmutableSortedMapIterator<K, V> implements Iterator<Map.Entry<K, V>> {
    public final ArrayDeque d = new ArrayDeque();

    public ImmutableSortedMapIterator(LLRBNode lLRBNode, Object obj, Comparator comparator) {
        while (!lLRBNode.isEmpty()) {
            int iCompare = obj != null ? comparator.compare(lLRBNode.getKey(), obj) : 1;
            if (iCompare < 0) {
                lLRBNode = lLRBNode.i();
            } else if (iCompare == 0) {
                this.d.push((LLRBValueNode) lLRBNode);
                return;
            } else {
                this.d.push((LLRBValueNode) lLRBNode);
                lLRBNode = lLRBNode.n();
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d.size() > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ArrayDeque arrayDeque = this.d;
        try {
            LLRBValueNode lLRBValueNode = (LLRBValueNode) arrayDeque.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(lLRBValueNode.f15404a, lLRBValueNode.b);
            for (LLRBNode lLRBNodeN = lLRBValueNode.d; !lLRBNodeN.isEmpty(); lLRBNodeN = lLRBNodeN.n()) {
                arrayDeque.push((LLRBValueNode) lLRBNodeN);
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
