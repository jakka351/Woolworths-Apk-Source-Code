package com.fasterxml.jackson.databind.util.internal;

import com.fasterxml.jackson.databind.util.internal.Linked;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
final class LinkedDeque<E extends Linked<E>> extends AbstractCollection<E> implements Deque<E> {
    public Linked d;
    public Linked e;

    /* renamed from: com.fasterxml.jackson.databind.util.internal.LinkedDeque$1, reason: invalid class name */
    class AnonymousClass1 extends LinkedDeque<Linked<Object>>.AbstractLinkedIterator {
        @Override // com.fasterxml.jackson.databind.util.internal.LinkedDeque.AbstractLinkedIterator
        public final Linked a() {
            return this.d.a();
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.util.internal.LinkedDeque$2, reason: invalid class name */
    class AnonymousClass2 extends LinkedDeque<Linked<Object>>.AbstractLinkedIterator {
        @Override // com.fasterxml.jackson.databind.util.internal.LinkedDeque.AbstractLinkedIterator
        public final Linked a() {
            return this.d.b();
        }
    }

    public abstract class AbstractLinkedIterator implements Iterator<E> {
        public Linked d;

        public AbstractLinkedIterator(Linked linked) {
            this.d = linked;
        }

        public abstract Linked a();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Linked linked = this.d;
            this.d = a();
            return linked;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
    public final boolean add(Object obj) {
        return offerLast((Linked) obj);
    }

    @Override // java.util.Deque
    public final void addFirst(Object obj) {
        Linked linked = (Linked) obj;
        if (d(linked)) {
            throw new IllegalArgumentException();
        }
        Linked linked2 = this.d;
        this.d = linked;
        if (linked2 == null) {
            this.e = linked;
        } else {
            linked2.c(linked);
            linked.d(linked2);
        }
    }

    @Override // java.util.Deque
    public final void addLast(Object obj) {
        if (!offerLast((Linked) obj)) {
            throw new IllegalArgumentException();
        }
    }

    public final void b() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Linked linked = this.d;
        while (linked != null) {
            PrivateMaxEntriesMap.Node nodeA = linked.a();
            linked.c(null);
            linked.d(null);
            linked = nodeA;
        }
        this.e = null;
        this.d = null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final boolean contains(Object obj) {
        return (obj instanceof Linked) && d((Linked) obj);
    }

    public final boolean d(Linked linked) {
        return (linked.b() == null && linked.a() == null && linked != this.d) ? false : true;
    }

    @Override // java.util.Deque
    public final Iterator descendingIterator() {
        return new AnonymousClass2(this.e);
    }

    @Override // java.util.Deque, java.util.Queue
    public final Object element() {
        b();
        return this.d;
    }

    @Override // java.util.Deque
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final boolean offerLast(Linked linked) {
        if (d(linked)) {
            return false;
        }
        Linked linked2 = this.e;
        this.e = linked;
        if (linked2 == null) {
            this.d = linked;
            return true;
        }
        linked2.d(linked);
        linked.c(linked2);
        return true;
    }

    @Override // java.util.Deque
    public final Object getFirst() {
        b();
        return this.d;
    }

    @Override // java.util.Deque
    public final Object getLast() {
        b();
        return this.e;
    }

    @Override // java.util.Deque
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Linked pollFirst() {
        if (isEmpty()) {
            return null;
        }
        Linked linked = this.d;
        PrivateMaxEntriesMap.Node nodeA = linked.a();
        linked.d(null);
        this.d = nodeA;
        if (nodeA == null) {
            this.e = null;
            return linked;
        }
        nodeA.e = null;
        return linked;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.d == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Deque
    public final Iterator iterator() {
        return new AnonymousClass1(this.d);
    }

    @Override // java.util.Deque, java.util.Queue
    public final boolean offer(Object obj) {
        return offerLast((Linked) obj);
    }

    @Override // java.util.Deque
    public final boolean offerFirst(Object obj) {
        Linked linked = (Linked) obj;
        if (d(linked)) {
            return false;
        }
        Linked linked2 = this.d;
        this.d = linked;
        if (linked2 == null) {
            this.e = linked;
            return true;
        }
        linked2.c(linked);
        linked.d(linked2);
        return true;
    }

    @Override // java.util.Deque, java.util.Queue
    public final Object peek() {
        return this.d;
    }

    @Override // java.util.Deque
    public final Object peekFirst() {
        return this.d;
    }

    @Override // java.util.Deque
    public final Object peekLast() {
        return this.e;
    }

    @Override // java.util.Deque, java.util.Queue
    public final Object poll() {
        return pollFirst();
    }

    @Override // java.util.Deque
    public final Object pollLast() {
        if (isEmpty()) {
            return null;
        }
        Linked linked = this.e;
        PrivateMaxEntriesMap.Node nodeB = linked.b();
        linked.c(null);
        this.e = nodeB;
        if (nodeB == null) {
            this.d = null;
            return linked;
        }
        nodeB.f = null;
        return linked;
    }

    @Override // java.util.Deque
    public final Object pop() {
        b();
        return pollFirst();
    }

    @Override // java.util.Deque
    public final void push(Object obj) {
        Linked linked = (Linked) obj;
        if (d(linked)) {
            throw new IllegalArgumentException();
        }
        Linked linked2 = this.d;
        this.d = linked;
        if (linked2 == null) {
            this.e = linked;
        } else {
            linked2.c(linked);
            linked.d(linked2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final boolean remove(Object obj) {
        if (!(obj instanceof Linked)) {
            return false;
        }
        Linked linked = (Linked) obj;
        if (!d(linked)) {
            return false;
        }
        PrivateMaxEntriesMap.Node nodeB = linked.b();
        PrivateMaxEntriesMap.Node nodeA = linked.a();
        if (nodeB == null) {
            this.d = nodeA;
        } else {
            nodeB.f = nodeA;
            linked.c(null);
        }
        if (nodeA == null) {
            this.e = nodeB;
            return true;
        }
        nodeA.e = nodeB;
        linked.d(null);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Deque
    public final Object removeFirst() {
        b();
        return pollFirst();
    }

    @Override // java.util.Deque
    public final boolean removeFirstOccurrence(Object obj) {
        return remove(obj);
    }

    @Override // java.util.Deque
    public final Object removeLast() {
        b();
        if (isEmpty()) {
            return null;
        }
        Linked linked = this.e;
        PrivateMaxEntriesMap.Node nodeB = linked.b();
        linked.c(null);
        this.e = nodeB;
        if (nodeB == null) {
            this.d = null;
            return linked;
        }
        nodeB.f = null;
        return linked;
    }

    @Override // java.util.Deque
    public final boolean removeLastOccurrence(Object obj) {
        return remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final int size() {
        int i = 0;
        for (Linked linkedA = this.d; linkedA != null; linkedA = linkedA.a()) {
            i++;
        }
        return i;
    }

    @Override // java.util.Deque, java.util.Queue
    public final Object remove() {
        b();
        return pollFirst();
    }
}
