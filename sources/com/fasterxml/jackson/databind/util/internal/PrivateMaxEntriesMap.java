package com.fasterxml.jackson.databind.util.internal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public final class PrivateMaxEntriesMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    public static final int r;
    public static final int s;
    public final ConcurrentHashMap d;
    public final long[] e;
    public final LinkedDeque f;
    public final AtomicLong g;
    public final AtomicLong h;
    public final ReentrantLock i;
    public final ConcurrentLinkedQueue j;
    public final AtomicLongArray k;
    public final AtomicLongArray l;
    public final AtomicReferenceArray m;
    public final AtomicReference n;
    public transient Set o;
    public transient Collection p;
    public transient Set q;

    public final class AddTask implements Runnable {
        public final Node d;

        public AddTask(Node node) {
            this.d = node;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PrivateMaxEntriesMap privateMaxEntriesMap = PrivateMaxEntriesMap.this;
            AtomicLong atomicLong = privateMaxEntriesMap.g;
            atomicLong.lazySet(atomicLong.get() + 1);
            Node node = this.d;
            if (node.get().a()) {
                privateMaxEntriesMap.f.offerLast(node);
                privateMaxEntriesMap.d();
            }
        }
    }

    public static final class Builder<K, V> {
        public long c = -1;
        public int b = 16;

        /* renamed from: a, reason: collision with root package name */
        public int f14342a = 16;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class DrainStatus {
        public static final AnonymousClass1 d;
        public static final AnonymousClass2 e;
        public static final AnonymousClass3 f;
        public static final /* synthetic */ DrainStatus[] g;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$DrainStatus$1] */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$DrainStatus$2] */
        /* JADX WARN: Type inference failed for: r2v0, types: [com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$DrainStatus$3] */
        static {
            ?? r0 = new DrainStatus() { // from class: com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus.1
                @Override // com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus
                public final boolean a(boolean z) {
                    return !z;
                }
            };
            d = r0;
            ?? r1 = new DrainStatus() { // from class: com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus.2
                @Override // com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus
                public final boolean a(boolean z) {
                    return true;
                }
            };
            e = r1;
            ?? r2 = new DrainStatus() { // from class: com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus.3
                @Override // com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus
                public final boolean a(boolean z) {
                    return false;
                }
            };
            f = r2;
            g = new DrainStatus[]{r0, r1, r2};
        }

        public static DrainStatus valueOf(String str) {
            return (DrainStatus) Enum.valueOf(DrainStatus.class, str);
        }

        public static DrainStatus[] values() {
            return (DrainStatus[]) g.clone();
        }

        public abstract boolean a(boolean z);
    }

    public final class EntryIterator implements Iterator<Map.Entry<K, V>> {
        public final Iterator d;
        public Node e;

        public EntryIterator() {
            this.d = PrivateMaxEntriesMap.this.d.values().iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.e = (Node) this.d.next();
            return new WriteThroughEntry(this.e);
        }

        @Override // java.util.Iterator
        public final void remove() {
            Node node = this.e;
            boolean z = node != null;
            int i = PrivateMaxEntriesMap.r;
            if (!z) {
                throw new IllegalStateException();
            }
            PrivateMaxEntriesMap.this.remove(node.d);
            this.e = null;
        }
    }

    public final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public final PrivateMaxEntriesMap d;

        public EntrySet() {
            this.d = PrivateMaxEntriesMap.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException("ConcurrentLinkedHashMap does not allow add to be called on entrySet()");
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            this.d.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Node node = (Node) this.d.d.get(entry.getKey());
            return node != null && node.e().equals(entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.d.remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.d.d.size();
        }
    }

    public final class KeyIterator implements Iterator<K> {
        public final Iterator d;
        public Object e;

        public KeyIterator() {
            this.d = PrivateMaxEntriesMap.this.d.keySet().iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Object next = this.d.next();
            this.e = next;
            return next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Object obj = this.e;
            boolean z = obj != null;
            int i = PrivateMaxEntriesMap.r;
            if (!z) {
                throw new IllegalStateException();
            }
            PrivateMaxEntriesMap.this.remove(obj);
            this.e = null;
        }
    }

    public final class KeySet extends AbstractSet<K> {
        public final PrivateMaxEntriesMap d;

        public KeySet() {
            this.d = PrivateMaxEntriesMap.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            this.d.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return PrivateMaxEntriesMap.this.d.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new KeyIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return this.d.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.d.d.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return this.d.d.keySet().toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final Object[] toArray(Object[] objArr) {
            return this.d.d.keySet().toArray(objArr);
        }
    }

    public static final class Node<K, V> extends AtomicReference<WeightedValue<V>> implements Linked<Node<K, V>> {
        public final Object d;
        public Node e;
        public Node f;

        public Node(Object obj, WeightedValue weightedValue) {
            super(weightedValue);
            this.d = obj;
        }

        @Override // com.fasterxml.jackson.databind.util.internal.Linked
        public final Node a() {
            return this.f;
        }

        @Override // com.fasterxml.jackson.databind.util.internal.Linked
        public final Node b() {
            return this.e;
        }

        @Override // com.fasterxml.jackson.databind.util.internal.Linked
        public final void c(Linked linked) {
            this.e = (Node) linked;
        }

        @Override // com.fasterxml.jackson.databind.util.internal.Linked
        public final void d(Linked linked) {
            this.f = (Node) linked;
        }

        public final Object e() {
            return ((WeightedValue) get()).b;
        }
    }

    public final class RemovalTask implements Runnable {
        public final Node d;

        public RemovalTask(Node node) {
            this.d = node;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PrivateMaxEntriesMap privateMaxEntriesMap = PrivateMaxEntriesMap.this;
            LinkedDeque linkedDeque = privateMaxEntriesMap.f;
            Node node = this.d;
            if (linkedDeque.d(node)) {
                Node nodeB = node.b();
                Node nodeA = node.a();
                if (nodeB == null) {
                    linkedDeque.d = nodeA;
                } else {
                    nodeB.f = nodeA;
                    node.c(null);
                }
                if (nodeA == null) {
                    linkedDeque.e = nodeB;
                } else {
                    nodeA.e = nodeB;
                    node.d(null);
                }
            }
            privateMaxEntriesMap.e(node);
        }
    }

    public static final class SerializationProxy<K, V> implements Serializable {
        public final HashMap d;
        public final long e;

        public SerializationProxy(PrivateMaxEntriesMap privateMaxEntriesMap) {
            this.d = new HashMap(privateMaxEntriesMap);
            this.e = privateMaxEntriesMap.h.get();
        }

        public Object readResolve() {
            Builder builder = new Builder();
            long j = this.e;
            boolean z = j >= 0;
            int i = PrivateMaxEntriesMap.r;
            if (!z) {
                throw new IllegalArgumentException();
            }
            builder.c = j;
            if (!(j >= 0)) {
                throw new IllegalStateException();
            }
            PrivateMaxEntriesMap privateMaxEntriesMap = new PrivateMaxEntriesMap(builder);
            privateMaxEntriesMap.putAll(this.d);
            return privateMaxEntriesMap;
        }
    }

    public final class UpdateTask implements Runnable {
        public final int d;
        public final Node e;

        public UpdateTask(Node node, int i) {
            this.d = i;
            this.e = node;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PrivateMaxEntriesMap privateMaxEntriesMap = PrivateMaxEntriesMap.this;
            AtomicLong atomicLong = privateMaxEntriesMap.g;
            atomicLong.lazySet(atomicLong.get() + this.d);
            LinkedDeque linkedDeque = privateMaxEntriesMap.f;
            Node node = this.e;
            if (linkedDeque.d(node) && node != linkedDeque.e) {
                Node nodeB = node.b();
                Node nodeA = node.a();
                if (nodeB == null) {
                    linkedDeque.d = nodeA;
                } else {
                    nodeB.f = nodeA;
                    node.c(null);
                }
                if (nodeA == null) {
                    linkedDeque.e = nodeB;
                } else {
                    nodeA.e = nodeB;
                    node.d(null);
                }
                Linked linked = linkedDeque.e;
                linkedDeque.e = node;
                if (linked == null) {
                    linkedDeque.d = node;
                } else {
                    linked.d(node);
                    node.c(linked);
                }
            }
            privateMaxEntriesMap.d();
        }
    }

    public final class ValueIterator implements Iterator<V> {
        public final Iterator d;
        public Node e;

        public ValueIterator() {
            this.d = PrivateMaxEntriesMap.this.d.values().iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Node node = (Node) this.d.next();
            this.e = node;
            return node.e();
        }

        @Override // java.util.Iterator
        public final void remove() {
            Node node = this.e;
            boolean z = node != null;
            int i = PrivateMaxEntriesMap.r;
            if (!z) {
                throw new IllegalStateException();
            }
            PrivateMaxEntriesMap.this.remove(node.d);
            this.e = null;
        }
    }

    public final class Values extends AbstractCollection<V> {
        public Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            PrivateMaxEntriesMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return PrivateMaxEntriesMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new ValueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return PrivateMaxEntriesMap.this.d.size();
        }
    }

    public static final class WeightedValue<V> {

        /* renamed from: a, reason: collision with root package name */
        public final int f14343a;
        public final Object b;

        public WeightedValue(Object obj, int i) {
            this.f14343a = i;
            this.b = obj;
        }

        public final boolean a() {
            return this.f14343a > 0;
        }
    }

    public final class WriteThroughEntry extends AbstractMap.SimpleEntry<K, V> {
        public WriteThroughEntry(Node node) {
            super(node.d, node.e());
        }

        @Override // java.util.AbstractMap.SimpleEntry, java.util.Map.Entry
        public final Object setValue(Object obj) {
            PrivateMaxEntriesMap.this.f(getKey(), obj, false);
            return super.setValue(obj);
        }

        public Object writeReplace() {
            return new AbstractMap.SimpleEntry(this);
        }
    }

    static {
        int iMin = Math.min(4, 1 << (32 - Integer.numberOfLeadingZeros(Runtime.getRuntime().availableProcessors() - 1)));
        r = iMin;
        s = iMin - 1;
    }

    public PrivateMaxEntriesMap(Builder builder) {
        int i = builder.f14342a;
        this.h = new AtomicLong(Math.min(builder.c, 9223372034707292160L));
        this.d = new ConcurrentHashMap(builder.b, 0.75f, i);
        this.i = new ReentrantLock();
        this.g = new AtomicLong();
        this.f = new LinkedDeque();
        this.j = new ConcurrentLinkedQueue();
        this.n = new AtomicReference(DrainStatus.d);
        int i2 = r;
        this.e = new long[i2];
        this.k = new AtomicLongArray(i2);
        this.l = new AtomicLongArray(i2);
        this.m = new AtomicReferenceArray(i2 * 16);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }

    public final void a(Node node) {
        int id = ((int) Thread.currentThread().getId()) & s;
        AtomicLongArray atomicLongArray = this.k;
        long j = atomicLongArray.get(id);
        atomicLongArray.lazySet(id, 1 + j);
        this.m.lazySet((id * 16) + ((int) (15 & j)), node);
        if (((DrainStatus) this.n.get()).a(j - this.l.get(id) < 4)) {
            g();
        }
    }

    public final void b(Runnable runnable) {
        this.j.add(runnable);
        this.n.lazySet(DrainStatus.e);
        g();
    }

    public final void c() {
        int i;
        Runnable runnable;
        int id = (int) Thread.currentThread().getId();
        int i2 = r + id;
        while (true) {
            i = 0;
            if (id >= i2) {
                break;
            }
            int i3 = s & id;
            long j = this.k.get(i3);
            while (i < 8) {
                long[] jArr = this.e;
                int i4 = (i3 * 16) + ((int) (jArr[i3] & 15));
                AtomicReferenceArray atomicReferenceArray = this.m;
                Node node = (Node) atomicReferenceArray.get(i4);
                if (node == null) {
                    break;
                }
                atomicReferenceArray.lazySet(i4, null);
                LinkedDeque linkedDeque = this.f;
                if (linkedDeque.d(node) && node != linkedDeque.e) {
                    Node nodeB = node.b();
                    Node nodeA = node.a();
                    if (nodeB == null) {
                        linkedDeque.d = nodeA;
                    } else {
                        nodeB.f = nodeA;
                        node.c(null);
                    }
                    if (nodeA == null) {
                        linkedDeque.e = nodeB;
                    } else {
                        nodeA.e = nodeB;
                        node.d(null);
                    }
                    Linked linked = linkedDeque.e;
                    linkedDeque.e = node;
                    if (linked == null) {
                        linkedDeque.d = node;
                    } else {
                        linked.d(node);
                        node.c(linked);
                    }
                }
                jArr[i3] = jArr[i3] + 1;
                i++;
            }
            this.l.lazySet(i3, j);
            id++;
        }
        while (i < 16 && (runnable = (Runnable) this.j.poll()) != null) {
            runnable.run();
            i++;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        AtomicReferenceArray atomicReferenceArray = this.m;
        ReentrantLock reentrantLock = this.i;
        reentrantLock.lock();
        while (true) {
            try {
                Node node = (Node) this.f.pollFirst();
                if (node == null) {
                    break;
                }
                this.d.remove(node.d, node);
                e(node);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        for (int i = 0; i < atomicReferenceArray.length(); i++) {
            atomicReferenceArray.lazySet(i, null);
        }
        while (true) {
            Runnable runnable = (Runnable) this.j.poll();
            if (runnable == null) {
                reentrantLock.unlock();
                return;
            }
            runnable.run();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        Iterator<V> it = this.d.values().iterator();
        while (it.hasNext()) {
            if (((Node) it.next()).e().equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        Node node;
        while (this.g.get() > this.h.get() && (node = (Node) this.f.pollFirst()) != null) {
            this.d.remove(node.d, node);
            e(node);
        }
    }

    public final void e(Node node) {
        WeightedValue weightedValue;
        do {
            weightedValue = (WeightedValue) node.get();
        } while (!node.compareAndSet(weightedValue, new WeightedValue(weightedValue.b, 0)));
        AtomicLong atomicLong = this.g;
        atomicLong.lazySet(atomicLong.get() - Math.abs(weightedValue.f14343a));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.q;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.q = entrySet;
        return entrySet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object f(Object obj, Object obj2, boolean z) {
        WeightedValue weightedValue;
        obj.getClass();
        obj2.getClass();
        WeightedValue weightedValue2 = new WeightedValue(obj2, 1);
        Node node = new Node(obj, weightedValue2);
        while (true) {
            Node node2 = (Node) this.d.putIfAbsent(node.d, node);
            if (node2 == null) {
                b(new AddTask(node));
                return null;
            }
            if (z) {
                a(node2);
                return node2.e();
            }
            do {
                weightedValue = (WeightedValue) node2.get();
                if (!weightedValue.a()) {
                    break;
                }
            } while (!node2.compareAndSet(weightedValue, weightedValue2));
            int i = 1 - weightedValue.f14343a;
            if (i == 0) {
                a(node2);
            } else {
                b(new UpdateTask(node2, i));
            }
            return weightedValue.b;
        }
    }

    public final void g() {
        DrainStatus.AnonymousClass1 anonymousClass1 = DrainStatus.d;
        DrainStatus.AnonymousClass3 anonymousClass3 = DrainStatus.f;
        AtomicReference atomicReference = this.n;
        ReentrantLock reentrantLock = this.i;
        if (reentrantLock.tryLock()) {
            try {
                atomicReference.lazySet(anonymousClass3);
                c();
                while (!atomicReference.compareAndSet(anonymousClass3, anonymousClass1) && atomicReference.get() == anonymousClass3) {
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                while (!atomicReference.compareAndSet(anonymousClass3, anonymousClass1) && atomicReference.get() == anonymousClass3) {
                }
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Node node = (Node) this.d.get(obj);
        if (node == null) {
            return null;
        }
        a(node);
        return node.e();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.o;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.o = keySet;
        return keySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        return f(obj, obj2, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object obj, Object obj2) {
        return f(obj, obj2, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        WeightedValue weightedValue;
        Node node = (Node) this.d.remove(obj);
        if (node == null) {
            return null;
        }
        do {
            weightedValue = (WeightedValue) node.get();
            if (!weightedValue.a()) {
                break;
            }
        } while (!node.compareAndSet(weightedValue, new WeightedValue(weightedValue.b, -weightedValue.f14343a)));
        b(new RemovalTask(node));
        return node.e();
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object replace(Object obj, Object obj2) {
        WeightedValue weightedValue;
        obj.getClass();
        obj2.getClass();
        WeightedValue weightedValue2 = new WeightedValue(obj2, 1);
        Node node = (Node) this.d.get(obj);
        if (node == null) {
            return null;
        }
        do {
            weightedValue = (WeightedValue) node.get();
            if (!weightedValue.a()) {
                return null;
            }
        } while (!node.compareAndSet(weightedValue, weightedValue2));
        int i = 1 - weightedValue.f14343a;
        if (i == 0) {
            a(node);
        } else {
            b(new UpdateTask(node, i));
        }
        return weightedValue.b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.p;
        if (collection != null) {
            return collection;
        }
        Values values = new Values();
        this.p = values;
        return values;
    }

    public Object writeReplace() {
        return new SerializationProxy(this);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        ConcurrentHashMap concurrentHashMap = this.d;
        Node node = (Node) concurrentHashMap.get(obj);
        if (node != null && obj2 != null) {
            WeightedValue weightedValue = (WeightedValue) node.get();
            while (true) {
                Object obj3 = weightedValue.b;
                if (obj2 != obj3 && !obj3.equals(obj2)) {
                    return false;
                }
                if (weightedValue.a() ? node.compareAndSet(weightedValue, new WeightedValue(weightedValue.b, -weightedValue.f14343a)) : false) {
                    if (concurrentHashMap.remove(obj, node)) {
                        b(new RemovalTask(node));
                        return true;
                    }
                } else {
                    weightedValue = (WeightedValue) node.get();
                    if (!weightedValue.a()) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        WeightedValue weightedValue;
        obj.getClass();
        obj2.getClass();
        obj3.getClass();
        WeightedValue weightedValue2 = new WeightedValue(obj3, 1);
        Node node = (Node) this.d.get(obj);
        if (node != null) {
            do {
                weightedValue = (WeightedValue) node.get();
                if (weightedValue.a()) {
                    Object obj4 = weightedValue.b;
                    if (obj2 != obj4 && !obj4.equals(obj2)) {
                        return false;
                    }
                }
            } while (!node.compareAndSet(weightedValue, weightedValue2));
            int i = 1 - weightedValue.f14343a;
            if (i == 0) {
                a(node);
                return true;
            }
            b(new UpdateTask(node, i));
            return true;
        }
        return false;
    }
}
