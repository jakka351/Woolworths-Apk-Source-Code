package io.reactivex.internal.queue;

import io.reactivex.internal.fuseable.SimplePlainQueue;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class MpscLinkedQueue<T> implements SimplePlainQueue<T> {
    public final AtomicReference d;
    public final AtomicReference e;

    public static final class LinkedQueueNode<E> extends AtomicReference<LinkedQueueNode<E>> {
        public Object d;
    }

    public MpscLinkedQueue() {
        AtomicReference atomicReference = new AtomicReference();
        this.d = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.e = atomicReference2;
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode();
        atomicReference2.lazySet(linkedQueueNode);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return ((LinkedQueueNode) this.e.get()) == ((LinkedQueueNode) this.d.get());
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode();
        linkedQueueNode.d = obj;
        ((LinkedQueueNode) this.d.getAndSet(linkedQueueNode)).lazySet(linkedQueueNode);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        LinkedQueueNode linkedQueueNode;
        AtomicReference atomicReference = this.e;
        LinkedQueueNode linkedQueueNode2 = (LinkedQueueNode) atomicReference.get();
        LinkedQueueNode linkedQueueNode3 = linkedQueueNode2.get();
        if (linkedQueueNode3 != null) {
            Object obj = linkedQueueNode3.d;
            linkedQueueNode3.d = null;
            atomicReference.lazySet(linkedQueueNode3);
            return obj;
        }
        if (linkedQueueNode2 == ((LinkedQueueNode) this.d.get())) {
            return null;
        }
        do {
            linkedQueueNode = linkedQueueNode2.get();
        } while (linkedQueueNode == null);
        Object obj2 = linkedQueueNode.d;
        linkedQueueNode.d = null;
        atomicReference.lazySet(linkedQueueNode);
        return obj2;
    }
}
