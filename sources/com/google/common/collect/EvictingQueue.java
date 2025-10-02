package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class EvictingQueue<E> extends ForwardingQueue<E> implements Serializable {
    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final /* bridge */ /* synthetic */ Object P1() {
        return null;
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection
    /* renamed from: R1 */
    public final /* bridge */ /* synthetic */ Collection P1() {
        return null;
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        return true;
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < 0) {
            return Iterators.a(this, collection.iterator());
        }
        clear();
        Preconditions.f("number to skip cannot be negative", size >= 0);
        Iterable anonymousClass6 = new FluentIterable<Object>() { // from class: com.google.common.collect.Iterables.6
            public final /* synthetic */ Iterable e;
            public final /* synthetic */ int f;

            /* renamed from: com.google.common.collect.Iterables$6$1 */
            class AnonymousClass1 implements Iterator<Object> {
                public boolean d = true;
                public final /* synthetic */ Iterator e;

                public AnonymousClass1(Iterator it) {
                    it = it;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public final Object next() {
                    Object next = it.next();
                    this.d = false;
                    return next;
                }

                @Override // java.util.Iterator
                public final void remove() {
                    CollectPreconditions.d(!this.d);
                    it.remove();
                }
            }

            public AnonymousClass6(int size2, Collection collection2) {
                collection = collection2;
                i = size2;
            }

            @Override // java.lang.Iterable
            public final Iterator iterator() {
                Iterable iterable = collection;
                boolean z = iterable instanceof List;
                int i = i;
                if (z) {
                    List list = (List) iterable;
                    return list.subList(Math.min(list.size(), i), list.size()).iterator();
                }
                Iterator it = iterable.iterator();
                it.getClass();
                Preconditions.f("numberToAdvance must be nonnegative", i >= 0);
                for (int i2 = 0; i2 < i && it.hasNext(); i2++) {
                    it.next();
                }
                return new Iterator<Object>() { // from class: com.google.common.collect.Iterables.6.1
                    public boolean d = true;
                    public final /* synthetic */ Iterator e;

                    public AnonymousClass1(Iterator it2) {
                        it = it2;
                    }

                    @Override // java.util.Iterator
                    public final boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override // java.util.Iterator
                    public final Object next() {
                        Object next = it.next();
                        this.d = false;
                        return next;
                    }

                    @Override // java.util.Iterator
                    public final void remove() {
                        CollectPreconditions.d(!this.d);
                        it.remove();
                    }
                };
            }
        };
        return anonymousClass6 instanceof Collection ? addAll((Collection) anonymousClass6) : Iterators.a(this, anonymousClass6.iterator());
    }

    @Override // com.google.common.collect.ForwardingQueue
    /* renamed from: b2 */
    public final Queue P1() {
        return null;
    }

    @Override // com.google.common.collect.ForwardingQueue, java.util.Queue
    public final boolean offer(Object obj) {
        obj.getClass();
        return true;
    }
}
