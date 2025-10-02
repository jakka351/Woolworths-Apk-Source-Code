package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.MapMaker;
import com.google.common.collect.MapMakerInternalMap.InternalEntry;
import com.google.common.collect.MapMakerInternalMap.Segment;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes6.dex */
class MapMakerInternalMap<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    public static final AnonymousClass1 m = new AnonymousClass1();
    public final transient int d;
    public final transient int e;
    public final transient Segment[] f;
    public final int g;
    public final Equivalence h;
    public final transient InternalEntryHelper i;
    public transient Set j;
    public transient Collection k;
    public transient Set l;

    /* renamed from: com.google.common.collect.MapMakerInternalMap$1, reason: invalid class name */
    public class AnonymousClass1 implements WeakValueReference<Object, Object, DummyInternalEntry> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public final WeakValueReference a(ReferenceQueue referenceQueue, WeakValueEntry weakValueEntry) {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public final /* bridge */ /* synthetic */ InternalEntry c() {
            return null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public final void clear() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public final Object get() {
            return null;
        }
    }

    public static abstract class AbstractSerializationProxy<K, V> extends ForwardingConcurrentMap<K, V> implements Serializable {
        public final Strength d;
        public final Strength e;
        public final Equivalence f;
        public final int g;
        public transient AbstractMap h;

        /* JADX WARN: Multi-variable type inference failed */
        public AbstractSerializationProxy(Strength strength, Strength strength2, Equivalence equivalence, int i, ConcurrentMap concurrentMap) {
            this.d = strength;
            this.e = strength2;
            this.f = equivalence;
            this.g = i;
            this.h = (AbstractMap) concurrentMap;
        }

        @Override // com.google.common.collect.ForwardingConcurrentMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Object P1() {
            return this.h;
        }

        @Override // com.google.common.collect.ForwardingConcurrentMap, com.google.common.collect.ForwardingMap
        /* renamed from: R1 */
        public final Map P1() {
            return this.h;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, java.util.concurrent.ConcurrentMap] */
        @Override // com.google.common.collect.ForwardingConcurrentMap
        /* renamed from: Y1 */
        public final ConcurrentMap P1() {
            return this.h;
        }
    }

    public static abstract class AbstractStrongKeyEntry<K, V, E extends InternalEntry<K, V, E>> implements InternalEntry<K, V, E> {
        public final Object d;
        public final int e;

        public AbstractStrongKeyEntry(Object obj, int i) {
            this.d = obj;
            this.e = i;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public InternalEntry a() {
            return null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final int c() {
            return this.e;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final Object getKey() {
            return this.d;
        }
    }

    public static abstract class AbstractWeakKeyEntry<K, V, E extends InternalEntry<K, V, E>> extends WeakReference<K> implements InternalEntry<K, V, E> {
        public final int d;

        public AbstractWeakKeyEntry(ReferenceQueue referenceQueue, Object obj, int i) {
            super(obj, referenceQueue);
            this.d = i;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public InternalEntry a() {
            return null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final int c() {
            return this.d;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final Object getKey() {
            return get();
        }
    }

    public static final class CleanupMapTask implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static final class DummyInternalEntry implements InternalEntry<Object, Object, DummyInternalEntry> {
        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final InternalEntry a() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final int c() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final Object getKey() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final Object getValue() {
            throw new AssertionError();
        }
    }

    public final class EntryIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<Map.Entry<K, V>> {
    }

    public final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            MapMakerInternalMap mapMakerInternalMap;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = (mapMakerInternalMap = MapMakerInternalMap.this).get(key)) != null && mapMakerInternalMap.i.e().a().d(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && MapMakerInternalMap.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    public abstract class HashIterator<T> implements Iterator<T> {
        public int d;
        public int e = -1;
        public Segment f;
        public AtomicReferenceArray g;
        public InternalEntry h;
        public WriteThroughEntry i;
        public WriteThroughEntry j;

        public HashIterator() {
            this.d = MapMakerInternalMap.this.f.length - 1;
            a();
        }

        public final void a() {
            this.i = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i = this.d;
                if (i < 0) {
                    return;
                }
                Segment[] segmentArr = MapMakerInternalMap.this.f;
                this.d = i - 1;
                Segment segment = segmentArr[i];
                this.f = segment;
                if (segment.e != 0) {
                    this.g = this.f.h;
                    this.e = r0.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        public final boolean b(InternalEntry internalEntry) {
            MapMakerInternalMap mapMakerInternalMap = MapMakerInternalMap.this;
            try {
                Object key = internalEntry.getKey();
                Object value = internalEntry.getKey() == null ? null : internalEntry.getValue();
                if (value == null) {
                    this.f.g();
                    return false;
                }
                this.i = new WriteThroughEntry(key, value);
                this.f.g();
                return true;
            } catch (Throwable th) {
                this.f.g();
                throw th;
            }
        }

        public final WriteThroughEntry c() {
            WriteThroughEntry writeThroughEntry = this.i;
            if (writeThroughEntry == null) {
                throw new NoSuchElementException();
            }
            this.j = writeThroughEntry;
            a();
            return this.j;
        }

        public final boolean d() {
            InternalEntry internalEntry = this.h;
            if (internalEntry == null) {
                return false;
            }
            while (true) {
                this.h = internalEntry.a();
                InternalEntry internalEntry2 = this.h;
                if (internalEntry2 == null) {
                    return false;
                }
                if (b(internalEntry2)) {
                    return true;
                }
                internalEntry = this.h;
            }
        }

        public final boolean e() {
            while (true) {
                int i = this.e;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray atomicReferenceArray = this.g;
                this.e = i - 1;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(i);
                this.h = internalEntry;
                if (internalEntry != null && (b(internalEntry) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.i != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            return c();
        }

        @Override // java.util.Iterator
        public final void remove() {
            CollectPreconditions.d(this.j != null);
            MapMakerInternalMap.this.remove(this.j.d);
            this.j = null;
        }
    }

    public interface InternalEntry<K, V, E extends InternalEntry<K, V, E>> {
        InternalEntry a();

        int c();

        Object getKey();

        Object getValue();
    }

    public interface InternalEntryHelper<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> {
        Segment a(MapMakerInternalMap mapMakerInternalMap, int i);

        void b(Segment segment, InternalEntry internalEntry, Object obj);

        Strength c();

        InternalEntry d(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2);

        Strength e();

        InternalEntry f(Segment segment, Object obj, int i, InternalEntry internalEntry);
    }

    public final class KeyIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<K> {
        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public final Object next() {
            return c().d;
        }
    }

    public final class KeySet extends AbstractSet<K> {
        public KeySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new KeyIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return MapMakerInternalMap.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    public static abstract class Segment<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> extends ReentrantLock {
        public static final /* synthetic */ int j = 0;
        public final MapMakerInternalMap d;
        public volatile int e;
        public int f;
        public int g;
        public volatile AtomicReferenceArray h;
        public final AtomicInteger i = new AtomicInteger();

        public Segment(MapMakerInternalMap mapMakerInternalMap, int i) {
            this.d = mapMakerInternalMap;
            AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
            this.g = (atomicReferenceArray.length() * 3) / 4;
            this.h = atomicReferenceArray;
        }

        public final void a(ReferenceQueue referenceQueue) {
            int i = 0;
            do {
                Object objPoll = referenceQueue.poll();
                if (objPoll == null) {
                    return;
                }
                InternalEntry internalEntry = (InternalEntry) objPoll;
                MapMakerInternalMap mapMakerInternalMap = this.d;
                mapMakerInternalMap.getClass();
                int iC = internalEntry.c();
                Segment segmentB = mapMakerInternalMap.b(iC);
                segmentB.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = segmentB.h;
                    int length = iC & (atomicReferenceArray.length() - 1);
                    InternalEntry internalEntry2 = (InternalEntry) atomicReferenceArray.get(length);
                    InternalEntry internalEntryA = internalEntry2;
                    while (true) {
                        if (internalEntryA == null) {
                            break;
                        }
                        if (internalEntryA == internalEntry) {
                            segmentB.f++;
                            InternalEntry internalEntryI = segmentB.i(internalEntry2, internalEntryA);
                            int i2 = segmentB.e - 1;
                            atomicReferenceArray.set(length, internalEntryI);
                            segmentB.e = i2;
                            break;
                        }
                        internalEntryA = internalEntryA.a();
                    }
                    i++;
                } finally {
                    segmentB.unlock();
                }
            } while (i != 16);
        }

        public final void b(ReferenceQueue referenceQueue) {
            int i = 0;
            do {
                Object objPoll = referenceQueue.poll();
                if (objPoll == null) {
                    return;
                }
                WeakValueReference weakValueReference = (WeakValueReference) objPoll;
                MapMakerInternalMap mapMakerInternalMap = this.d;
                mapMakerInternalMap.getClass();
                InternalEntry internalEntryC = weakValueReference.c();
                int iC = internalEntryC.c();
                Segment segmentB = mapMakerInternalMap.b(iC);
                Object key = internalEntryC.getKey();
                segmentB.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = segmentB.h;
                    int length = (atomicReferenceArray.length() - 1) & iC;
                    InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                    InternalEntry internalEntryA = internalEntry;
                    while (true) {
                        if (internalEntryA == null) {
                            break;
                        }
                        Object key2 = internalEntryA.getKey();
                        if (internalEntryA.c() != iC || key2 == null || !segmentB.d.h.d(key, key2)) {
                            internalEntryA = internalEntryA.a();
                        } else if (((WeakValueEntry) internalEntryA).b() == weakValueReference) {
                            segmentB.f++;
                            InternalEntry internalEntryI = segmentB.i(internalEntry, internalEntryA);
                            int i2 = segmentB.e - 1;
                            atomicReferenceArray.set(length, internalEntryI);
                            segmentB.e = i2;
                        }
                    }
                    i++;
                } finally {
                    segmentB.unlock();
                }
            } while (i != 16);
        }

        public final void c() {
            AtomicReferenceArray atomicReferenceArray = this.h;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.e;
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
            this.g = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                InternalEntry internalEntryA = (InternalEntry) atomicReferenceArray.get(i2);
                if (internalEntryA != null) {
                    InternalEntry internalEntryA2 = internalEntryA.a();
                    int iC = internalEntryA.c() & length2;
                    if (internalEntryA2 == null) {
                        atomicReferenceArray2.set(iC, internalEntryA);
                    } else {
                        InternalEntry internalEntry = internalEntryA;
                        while (internalEntryA2 != null) {
                            int iC2 = internalEntryA2.c() & length2;
                            if (iC2 != iC) {
                                internalEntry = internalEntryA2;
                                iC = iC2;
                            }
                            internalEntryA2 = internalEntryA2.a();
                        }
                        atomicReferenceArray2.set(iC, internalEntry);
                        while (internalEntryA != internalEntry) {
                            int iC3 = internalEntryA.c() & length2;
                            InternalEntry internalEntryD = this.d.i.d(k(), internalEntryA, (InternalEntry) atomicReferenceArray2.get(iC3));
                            if (internalEntryD != null) {
                                atomicReferenceArray2.set(iC3, internalEntryD);
                            } else {
                                i--;
                            }
                            internalEntryA = internalEntryA.a();
                        }
                    }
                }
            }
            this.h = atomicReferenceArray2;
            this.e = i;
        }

        public final InternalEntry d(int i, Object obj) {
            if (this.e == 0) {
                return null;
            }
            for (InternalEntry internalEntryA = (InternalEntry) this.h.get((r0.length() - 1) & i); internalEntryA != null; internalEntryA = internalEntryA.a()) {
                if (internalEntryA.c() == i) {
                    Object key = internalEntryA.getKey();
                    if (key == null) {
                        m();
                    } else if (this.d.h.d(obj, key)) {
                        return internalEntryA;
                    }
                }
            }
            return null;
        }

        public void e() {
        }

        public void f() {
        }

        public final void g() {
            if ((this.i.incrementAndGet() & 63) == 0) {
                j();
            }
        }

        public final Object h(Object obj, int i, Object obj2, boolean z) {
            lock();
            try {
                j();
                int i2 = this.e + 1;
                if (i2 > this.g) {
                    c();
                    i2 = this.e + 1;
                }
                AtomicReferenceArray atomicReferenceArray = this.h;
                int length = (atomicReferenceArray.length() - 1) & i;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                for (InternalEntry internalEntryA = internalEntry; internalEntryA != null; internalEntryA = internalEntryA.a()) {
                    Object key = internalEntryA.getKey();
                    if (internalEntryA.c() == i && key != null && this.d.h.d(obj, key)) {
                        Object value = internalEntryA.getValue();
                        if (value == null) {
                            this.f++;
                            l(internalEntryA, obj2);
                            this.e = this.e;
                            unlock();
                            return null;
                        }
                        if (z) {
                            unlock();
                            return value;
                        }
                        this.f++;
                        l(internalEntryA, obj2);
                        unlock();
                        return value;
                    }
                }
                this.f++;
                InternalEntry internalEntryF = this.d.i.f(k(), obj, i, internalEntry);
                l(internalEntryF, obj2);
                atomicReferenceArray.set(length, internalEntryF);
                this.e = i2;
                unlock();
                return null;
            } catch (Throwable th) {
                unlock();
                throw th;
            }
        }

        public final InternalEntry i(InternalEntry internalEntry, InternalEntry internalEntry2) {
            int i = this.e;
            InternalEntry internalEntryA = internalEntry2.a();
            while (internalEntry != internalEntry2) {
                InternalEntry internalEntryD = this.d.i.d(k(), internalEntry, internalEntryA);
                if (internalEntryD != null) {
                    internalEntryA = internalEntryD;
                } else {
                    i--;
                }
                internalEntry = internalEntry.a();
            }
            this.e = i;
            return internalEntryA;
        }

        public final void j() {
            if (tryLock()) {
                try {
                    f();
                    this.i.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public abstract Segment k();

        public final void l(InternalEntry internalEntry, Object obj) {
            this.d.i.b(k(), internalEntry, obj);
        }

        public final void m() {
            if (tryLock()) {
                try {
                    f();
                } finally {
                    unlock();
                }
            }
        }
    }

    public static final class SerializationProxy<K, V> extends AbstractSerializationProxy<K, V> {
        /* JADX WARN: Multi-variable type inference failed */
        @J2ktIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            int i = objectInputStream.readInt();
            MapMaker mapMaker = new MapMaker();
            Preconditions.g(i >= 0);
            mapMaker.b = i;
            Strength strength = mapMaker.d;
            Preconditions.p("Key strength was already set to %s", strength, strength == null);
            Strength strength2 = this.d;
            strength2.getClass();
            mapMaker.d = strength2;
            Strength.AnonymousClass1 anonymousClass1 = Strength.d;
            if (strength2 != anonymousClass1) {
                mapMaker.f14893a = true;
            }
            Strength strength3 = mapMaker.e;
            Preconditions.p("Value strength was already set to %s", strength3, strength3 == null);
            Strength strength4 = this.e;
            strength4.getClass();
            mapMaker.e = strength4;
            if (strength4 != anonymousClass1) {
                mapMaker.f14893a = true;
            }
            Equivalence equivalence = mapMaker.f;
            Preconditions.p("key equivalence was already set to %s", equivalence, equivalence == null);
            Equivalence equivalence2 = this.f;
            equivalence2.getClass();
            mapMaker.f = equivalence2;
            mapMaker.f14893a = true;
            int i2 = mapMaker.c;
            Preconditions.n(i2, "concurrency level was already set to %s", i2 == -1);
            int i3 = this.g;
            Preconditions.g(i3 > 0);
            mapMaker.c = i3;
            this.h = (AbstractMap) mapMaker.a();
            while (true) {
                Object object = objectInputStream.readObject();
                if (object == null) {
                    return;
                } else {
                    this.h.put(object, objectInputStream.readObject());
                }
            }
        }

        private Object readResolve() {
            return this.h;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeInt(this.h.size());
            for (Map.Entry<K, V> entry : this.h.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class Strength {
        public static final AnonymousClass1 d;
        public static final AnonymousClass2 e;
        public static final /* synthetic */ Strength[] f;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.collect.MapMakerInternalMap$Strength$1] */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.google.common.collect.MapMakerInternalMap$Strength$2] */
        static {
            ?? r0 = new Strength() { // from class: com.google.common.collect.MapMakerInternalMap.Strength.1
                @Override // com.google.common.collect.MapMakerInternalMap.Strength
                public final Equivalence a() {
                    return Equivalence.c();
                }
            };
            d = r0;
            ?? r1 = new Strength() { // from class: com.google.common.collect.MapMakerInternalMap.Strength.2
                @Override // com.google.common.collect.MapMakerInternalMap.Strength
                public final Equivalence a() {
                    return Equivalence.e();
                }
            };
            e = r1;
            f = new Strength[]{r0, r1};
        }

        public static Strength valueOf(String str) {
            return (Strength) Enum.valueOf(Strength.class, str);
        }

        public static Strength[] values() {
            return (Strength[]) f.clone();
        }

        public abstract Equivalence a();
    }

    public static class StrongKeyDummyValueEntry<K> extends AbstractStrongKeyEntry<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>> implements StrongValueEntry<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>> {

        public static final class Helper<K> implements InternalEntryHelper<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> {
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Segment a(MapMakerInternalMap mapMakerInternalMap, int i) {
                return new StrongKeyDummyValueSegment(mapMakerInternalMap, i);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final /* bridge */ /* synthetic */ void b(Segment segment, InternalEntry internalEntry, Object obj) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength c() {
                return Strength.d;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry d(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2) {
                StrongKeyDummyValueEntry strongKeyDummyValueEntry = (StrongKeyDummyValueEntry) internalEntry;
                StrongKeyDummyValueEntry strongKeyDummyValueEntry2 = (StrongKeyDummyValueEntry) internalEntry2;
                Object obj = strongKeyDummyValueEntry.d;
                int i = strongKeyDummyValueEntry.e;
                return strongKeyDummyValueEntry2 == null ? new StrongKeyDummyValueEntry(obj, i) : new LinkedStrongKeyDummyValueEntry(obj, i, strongKeyDummyValueEntry2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength e() {
                return Strength.d;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry f(Segment segment, Object obj, int i, InternalEntry internalEntry) {
                StrongKeyDummyValueEntry strongKeyDummyValueEntry = (StrongKeyDummyValueEntry) internalEntry;
                return strongKeyDummyValueEntry == null ? new StrongKeyDummyValueEntry(obj, i) : new LinkedStrongKeyDummyValueEntry(obj, i, strongKeyDummyValueEntry);
            }
        }

        public static final class LinkedStrongKeyDummyValueEntry<K> extends StrongKeyDummyValueEntry<K> {
            public final StrongKeyDummyValueEntry f;

            public LinkedStrongKeyDummyValueEntry(Object obj, int i, StrongKeyDummyValueEntry strongKeyDummyValueEntry) {
                super(obj, i);
                this.f = strongKeyDummyValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final InternalEntry a() {
                return this.f;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final /* bridge */ /* synthetic */ Object getValue() {
                return MapMaker.Dummy.d;
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public /* bridge */ /* synthetic */ Object getValue() {
            return MapMaker.Dummy.d;
        }
    }

    public static final class StrongKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> {
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment k() {
            return this;
        }
    }

    public static class StrongKeyStrongValueEntry<K, V> extends AbstractStrongKeyEntry<K, V, StrongKeyStrongValueEntry<K, V>> implements StrongValueEntry<K, V, StrongKeyStrongValueEntry<K, V>> {
        public volatile Object f;

        public static final class Helper<K, V> implements InternalEntryHelper<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            public static final Helper f14894a = new Helper();

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Segment a(MapMakerInternalMap mapMakerInternalMap, int i) {
                return new StrongKeyStrongValueSegment(mapMakerInternalMap, i);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final void b(Segment segment, InternalEntry internalEntry, Object obj) {
                ((StrongKeyStrongValueEntry) internalEntry).f = obj;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength c() {
                return Strength.d;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry d(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2) {
                StrongKeyStrongValueEntry strongKeyStrongValueEntry = (StrongKeyStrongValueEntry) internalEntry;
                StrongKeyStrongValueEntry strongKeyStrongValueEntry2 = (StrongKeyStrongValueEntry) internalEntry2;
                Object obj = strongKeyStrongValueEntry.d;
                int i = strongKeyStrongValueEntry.e;
                StrongKeyStrongValueEntry strongKeyStrongValueEntry3 = strongKeyStrongValueEntry2 == null ? new StrongKeyStrongValueEntry(obj, i) : new LinkedStrongKeyStrongValueEntry(obj, i, strongKeyStrongValueEntry2);
                strongKeyStrongValueEntry3.f = strongKeyStrongValueEntry.f;
                return strongKeyStrongValueEntry3;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength e() {
                return Strength.d;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry f(Segment segment, Object obj, int i, InternalEntry internalEntry) {
                StrongKeyStrongValueEntry strongKeyStrongValueEntry = (StrongKeyStrongValueEntry) internalEntry;
                return strongKeyStrongValueEntry == null ? new StrongKeyStrongValueEntry(obj, i) : new LinkedStrongKeyStrongValueEntry(obj, i, strongKeyStrongValueEntry);
            }
        }

        public static final class LinkedStrongKeyStrongValueEntry<K, V> extends StrongKeyStrongValueEntry<K, V> {
            public final StrongKeyStrongValueEntry g;

            public LinkedStrongKeyStrongValueEntry(Object obj, int i, StrongKeyStrongValueEntry strongKeyStrongValueEntry) {
                super(obj, i);
                this.g = strongKeyStrongValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final InternalEntry a() {
                return this.g;
            }
        }

        public StrongKeyStrongValueEntry(Object obj, int i) {
            super(obj, i);
            this.f = null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final Object getValue() {
            return this.f;
        }
    }

    public static final class StrongKeyStrongValueSegment<K, V> extends Segment<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> {
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment k() {
            return this;
        }
    }

    public static class StrongKeyWeakValueEntry<K, V> extends AbstractStrongKeyEntry<K, V, StrongKeyWeakValueEntry<K, V>> implements WeakValueEntry<K, V, StrongKeyWeakValueEntry<K, V>> {
        public volatile WeakValueReference f;

        public static final class Helper<K, V> implements InternalEntryHelper<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            public static final Helper f14895a = new Helper();

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Segment a(MapMakerInternalMap mapMakerInternalMap, int i) {
                return new StrongKeyWeakValueSegment(mapMakerInternalMap, i);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final void b(Segment segment, InternalEntry internalEntry, Object obj) {
                StrongKeyWeakValueEntry strongKeyWeakValueEntry = (StrongKeyWeakValueEntry) internalEntry;
                WeakValueReference weakValueReference = strongKeyWeakValueEntry.f;
                strongKeyWeakValueEntry.f = new WeakValueReferenceImpl(((StrongKeyWeakValueSegment) segment).k, obj, strongKeyWeakValueEntry);
                weakValueReference.clear();
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength c() {
                return Strength.d;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry d(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2) {
                StrongKeyWeakValueSegment strongKeyWeakValueSegment = (StrongKeyWeakValueSegment) segment;
                StrongKeyWeakValueEntry strongKeyWeakValueEntry = (StrongKeyWeakValueEntry) internalEntry;
                StrongKeyWeakValueEntry strongKeyWeakValueEntry2 = (StrongKeyWeakValueEntry) internalEntry2;
                int i = Segment.j;
                if (strongKeyWeakValueEntry.getValue() == null) {
                    return null;
                }
                Object obj = strongKeyWeakValueEntry.d;
                int i2 = strongKeyWeakValueEntry.e;
                StrongKeyWeakValueEntry strongKeyWeakValueEntry3 = strongKeyWeakValueEntry2 == null ? new StrongKeyWeakValueEntry(obj, i2) : new LinkedStrongKeyWeakValueEntry(obj, i2, strongKeyWeakValueEntry2);
                strongKeyWeakValueEntry3.f = strongKeyWeakValueEntry.f.a(strongKeyWeakValueSegment.k, strongKeyWeakValueEntry3);
                return strongKeyWeakValueEntry3;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength e() {
                return Strength.e;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry f(Segment segment, Object obj, int i, InternalEntry internalEntry) {
                StrongKeyWeakValueEntry strongKeyWeakValueEntry = (StrongKeyWeakValueEntry) internalEntry;
                return strongKeyWeakValueEntry == null ? new StrongKeyWeakValueEntry(obj, i) : new LinkedStrongKeyWeakValueEntry(obj, i, strongKeyWeakValueEntry);
            }
        }

        public static final class LinkedStrongKeyWeakValueEntry<K, V> extends StrongKeyWeakValueEntry<K, V> {
            public final StrongKeyWeakValueEntry g;

            public LinkedStrongKeyWeakValueEntry(Object obj, int i, StrongKeyWeakValueEntry strongKeyWeakValueEntry) {
                super(obj, i);
                this.g = strongKeyWeakValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final InternalEntry a() {
                return this.g;
            }
        }

        public StrongKeyWeakValueEntry(Object obj, int i) {
            super(obj, i);
            this.f = MapMakerInternalMap.m;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public final WeakValueReference b() {
            return this.f;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final Object getValue() {
            return this.f.get();
        }
    }

    public static final class StrongKeyWeakValueSegment<K, V> extends Segment<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> {
        public final ReferenceQueue k;

        public StrongKeyWeakValueSegment(MapMakerInternalMap mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.k = new ReferenceQueue();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void e() {
            while (this.k.poll() != null) {
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void f() {
            b(this.k);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment k() {
            return this;
        }
    }

    public interface StrongValueEntry<K, V, E extends InternalEntry<K, V, E>> extends InternalEntry<K, V, E> {
    }

    public final class ValueIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<V> {
        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public final Object next() {
            return c().e;
        }
    }

    public final class Values extends AbstractCollection<V> {
        public Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new ValueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    public static class WeakKeyDummyValueEntry<K> extends AbstractWeakKeyEntry<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>> implements StrongValueEntry<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>> {

        public static final class Helper<K> implements InternalEntryHelper<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> {
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Segment a(MapMakerInternalMap mapMakerInternalMap, int i) {
                return new WeakKeyDummyValueSegment(mapMakerInternalMap, i);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final /* bridge */ /* synthetic */ void b(Segment segment, InternalEntry internalEntry, Object obj) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength c() {
                return Strength.e;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry d(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2) {
                WeakKeyDummyValueSegment weakKeyDummyValueSegment = (WeakKeyDummyValueSegment) segment;
                WeakKeyDummyValueEntry weakKeyDummyValueEntry = (WeakKeyDummyValueEntry) internalEntry;
                WeakKeyDummyValueEntry weakKeyDummyValueEntry2 = (WeakKeyDummyValueEntry) internalEntry2;
                K k = weakKeyDummyValueEntry.get();
                if (k == null) {
                    return null;
                }
                int i = weakKeyDummyValueEntry.d;
                return weakKeyDummyValueEntry2 == null ? new WeakKeyDummyValueEntry(weakKeyDummyValueSegment.k, k, i) : new LinkedWeakKeyDummyValueEntry(weakKeyDummyValueSegment.k, k, i, weakKeyDummyValueEntry2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength e() {
                return Strength.d;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry f(Segment segment, Object obj, int i, InternalEntry internalEntry) {
                WeakKeyDummyValueSegment weakKeyDummyValueSegment = (WeakKeyDummyValueSegment) segment;
                WeakKeyDummyValueEntry weakKeyDummyValueEntry = (WeakKeyDummyValueEntry) internalEntry;
                return weakKeyDummyValueEntry == null ? new WeakKeyDummyValueEntry(weakKeyDummyValueSegment.k, obj, i) : new LinkedWeakKeyDummyValueEntry(weakKeyDummyValueSegment.k, obj, i, weakKeyDummyValueEntry);
            }
        }

        public static final class LinkedWeakKeyDummyValueEntry<K> extends WeakKeyDummyValueEntry<K> {
            public final WeakKeyDummyValueEntry e;

            public LinkedWeakKeyDummyValueEntry(ReferenceQueue referenceQueue, Object obj, int i, WeakKeyDummyValueEntry weakKeyDummyValueEntry) {
                super(referenceQueue, obj, i);
                this.e = weakKeyDummyValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final InternalEntry a() {
                return this.e;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final /* bridge */ /* synthetic */ Object getValue() {
                return MapMaker.Dummy.d;
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public /* bridge */ /* synthetic */ Object getValue() {
            return MapMaker.Dummy.d;
        }
    }

    public static final class WeakKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> {
        public final ReferenceQueue k;

        public WeakKeyDummyValueSegment(MapMakerInternalMap mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.k = new ReferenceQueue();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void e() {
            while (this.k.poll() != null) {
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void f() {
            a(this.k);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment k() {
            return this;
        }
    }

    public static class WeakKeyStrongValueEntry<K, V> extends AbstractWeakKeyEntry<K, V, WeakKeyStrongValueEntry<K, V>> implements StrongValueEntry<K, V, WeakKeyStrongValueEntry<K, V>> {
        public volatile Object e;

        public static final class Helper<K, V> implements InternalEntryHelper<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            public static final Helper f14896a = new Helper();

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Segment a(MapMakerInternalMap mapMakerInternalMap, int i) {
                return new WeakKeyStrongValueSegment(mapMakerInternalMap, i);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final void b(Segment segment, InternalEntry internalEntry, Object obj) {
                ((WeakKeyStrongValueEntry) internalEntry).e = obj;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength c() {
                return Strength.e;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry d(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2) {
                WeakKeyStrongValueSegment weakKeyStrongValueSegment = (WeakKeyStrongValueSegment) segment;
                WeakKeyStrongValueEntry weakKeyStrongValueEntry = (WeakKeyStrongValueEntry) internalEntry;
                WeakKeyStrongValueEntry weakKeyStrongValueEntry2 = (WeakKeyStrongValueEntry) internalEntry2;
                K k = weakKeyStrongValueEntry.get();
                if (k == null) {
                    return null;
                }
                int i = weakKeyStrongValueEntry.d;
                WeakKeyStrongValueEntry weakKeyStrongValueEntry3 = weakKeyStrongValueEntry2 == null ? new WeakKeyStrongValueEntry(weakKeyStrongValueSegment.k, k, i) : new LinkedWeakKeyStrongValueEntry(weakKeyStrongValueSegment.k, k, i, weakKeyStrongValueEntry2);
                weakKeyStrongValueEntry3.e = weakKeyStrongValueEntry.e;
                return weakKeyStrongValueEntry3;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength e() {
                return Strength.d;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry f(Segment segment, Object obj, int i, InternalEntry internalEntry) {
                WeakKeyStrongValueSegment weakKeyStrongValueSegment = (WeakKeyStrongValueSegment) segment;
                WeakKeyStrongValueEntry weakKeyStrongValueEntry = (WeakKeyStrongValueEntry) internalEntry;
                return weakKeyStrongValueEntry == null ? new WeakKeyStrongValueEntry(weakKeyStrongValueSegment.k, obj, i) : new LinkedWeakKeyStrongValueEntry(weakKeyStrongValueSegment.k, obj, i, weakKeyStrongValueEntry);
            }
        }

        public static final class LinkedWeakKeyStrongValueEntry<K, V> extends WeakKeyStrongValueEntry<K, V> {
            public final WeakKeyStrongValueEntry f;

            public LinkedWeakKeyStrongValueEntry(ReferenceQueue referenceQueue, Object obj, int i, WeakKeyStrongValueEntry weakKeyStrongValueEntry) {
                super(referenceQueue, obj, i);
                this.f = weakKeyStrongValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final InternalEntry a() {
                return this.f;
            }
        }

        public WeakKeyStrongValueEntry(ReferenceQueue referenceQueue, Object obj, int i) {
            super(referenceQueue, obj, i);
            this.e = null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final Object getValue() {
            return this.e;
        }
    }

    public static final class WeakKeyStrongValueSegment<K, V> extends Segment<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> {
        public final ReferenceQueue k;

        public WeakKeyStrongValueSegment(MapMakerInternalMap mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.k = new ReferenceQueue();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void e() {
            while (this.k.poll() != null) {
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void f() {
            a(this.k);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment k() {
            return this;
        }
    }

    public static class WeakKeyWeakValueEntry<K, V> extends AbstractWeakKeyEntry<K, V, WeakKeyWeakValueEntry<K, V>> implements WeakValueEntry<K, V, WeakKeyWeakValueEntry<K, V>> {
        public volatile WeakValueReference e;

        public static final class Helper<K, V> implements InternalEntryHelper<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            public static final Helper f14897a = new Helper();

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Segment a(MapMakerInternalMap mapMakerInternalMap, int i) {
                return new WeakKeyWeakValueSegment(mapMakerInternalMap, i);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final void b(Segment segment, InternalEntry internalEntry, Object obj) {
                WeakKeyWeakValueEntry weakKeyWeakValueEntry = (WeakKeyWeakValueEntry) internalEntry;
                WeakValueReference weakValueReference = weakKeyWeakValueEntry.e;
                weakKeyWeakValueEntry.e = new WeakValueReferenceImpl(((WeakKeyWeakValueSegment) segment).l, obj, weakKeyWeakValueEntry);
                weakValueReference.clear();
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength c() {
                return Strength.e;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry d(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2) {
                WeakKeyWeakValueSegment weakKeyWeakValueSegment = (WeakKeyWeakValueSegment) segment;
                WeakKeyWeakValueEntry weakKeyWeakValueEntry = (WeakKeyWeakValueEntry) internalEntry;
                WeakKeyWeakValueEntry weakKeyWeakValueEntry2 = (WeakKeyWeakValueEntry) internalEntry2;
                K k = weakKeyWeakValueEntry.get();
                if (k == null) {
                    return null;
                }
                int i = Segment.j;
                if (weakKeyWeakValueEntry.e.get() == null) {
                    return null;
                }
                int i2 = weakKeyWeakValueEntry.d;
                WeakKeyWeakValueEntry weakKeyWeakValueEntry3 = weakKeyWeakValueEntry2 == null ? new WeakKeyWeakValueEntry(weakKeyWeakValueSegment.k, k, i2) : new LinkedWeakKeyWeakValueEntry(weakKeyWeakValueSegment.k, k, i2, weakKeyWeakValueEntry2);
                weakKeyWeakValueEntry3.e = weakKeyWeakValueEntry.e.a(weakKeyWeakValueSegment.l, weakKeyWeakValueEntry3);
                return weakKeyWeakValueEntry3;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength e() {
                return Strength.e;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry f(Segment segment, Object obj, int i, InternalEntry internalEntry) {
                WeakKeyWeakValueSegment weakKeyWeakValueSegment = (WeakKeyWeakValueSegment) segment;
                WeakKeyWeakValueEntry weakKeyWeakValueEntry = (WeakKeyWeakValueEntry) internalEntry;
                return weakKeyWeakValueEntry == null ? new WeakKeyWeakValueEntry(weakKeyWeakValueSegment.k, obj, i) : new LinkedWeakKeyWeakValueEntry(weakKeyWeakValueSegment.k, obj, i, weakKeyWeakValueEntry);
            }
        }

        public static final class LinkedWeakKeyWeakValueEntry<K, V> extends WeakKeyWeakValueEntry<K, V> {
            public final WeakKeyWeakValueEntry f;

            public LinkedWeakKeyWeakValueEntry(ReferenceQueue referenceQueue, Object obj, int i, WeakKeyWeakValueEntry weakKeyWeakValueEntry) {
                super(referenceQueue, obj, i);
                this.f = weakKeyWeakValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final InternalEntry a() {
                return this.f;
            }
        }

        public WeakKeyWeakValueEntry(ReferenceQueue referenceQueue, Object obj, int i) {
            super(referenceQueue, obj, i);
            this.e = MapMakerInternalMap.m;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public final WeakValueReference b() {
            return this.e;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final Object getValue() {
            return this.e.get();
        }
    }

    public static final class WeakKeyWeakValueSegment<K, V> extends Segment<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> {
        public final ReferenceQueue k;
        public final ReferenceQueue l;

        public WeakKeyWeakValueSegment(MapMakerInternalMap mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.k = new ReferenceQueue();
            this.l = new ReferenceQueue();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void e() {
            while (this.k.poll() != null) {
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void f() {
            a(this.k);
            b(this.l);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment k() {
            return this;
        }
    }

    public interface WeakValueEntry<K, V, E extends InternalEntry<K, V, E>> extends InternalEntry<K, V, E> {
        WeakValueReference b();
    }

    public interface WeakValueReference<K, V, E extends InternalEntry<K, V, E>> {
        WeakValueReference a(ReferenceQueue referenceQueue, WeakValueEntry weakValueEntry);

        InternalEntry c();

        void clear();

        Object get();
    }

    public static final class WeakValueReferenceImpl<K, V, E extends InternalEntry<K, V, E>> extends WeakReference<V> implements WeakValueReference<K, V, E> {
        public final InternalEntry d;

        public WeakValueReferenceImpl(ReferenceQueue referenceQueue, Object obj, InternalEntry internalEntry) {
            super(obj, referenceQueue);
            this.d = internalEntry;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public final WeakValueReference a(ReferenceQueue referenceQueue, WeakValueEntry weakValueEntry) {
            return new WeakValueReferenceImpl(referenceQueue, get(), weakValueEntry);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public final InternalEntry c() {
            return this.d;
        }
    }

    public final class WriteThroughEntry extends AbstractMapEntry<K, V> {
        public final Object d;
        public Object e;

        public WriteThroughEntry(Object obj, Object obj2) {
            this.d = obj;
            this.e = obj2;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (this.d.equals(entry.getKey()) && this.e.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.d;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.e;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final int hashCode() {
            return this.d.hashCode() ^ this.e.hashCode();
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final Object setValue(Object obj) {
            Object objPut = MapMakerInternalMap.this.put(this.d, obj);
            this.e = obj;
            return objPut;
        }
    }

    public MapMakerInternalMap(MapMaker mapMaker, InternalEntryHelper internalEntryHelper) {
        int i = mapMaker.c;
        this.g = Math.min(i == -1 ? 4 : i, 65536);
        this.h = (Equivalence) MoreObjects.a(mapMaker.f, ((Strength) MoreObjects.a(mapMaker.d, Strength.d)).a());
        this.i = internalEntryHelper;
        int i2 = mapMaker.b;
        int iMin = Math.min(i2 == -1 ? 16 : i2, 1073741824);
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        int i6 = 1;
        while (i6 < this.g) {
            i5++;
            i6 <<= 1;
        }
        this.e = 32 - i5;
        this.d = i6 - 1;
        this.f = new Segment[i6];
        int i7 = iMin / i6;
        while (i4 < (i6 * i7 < iMin ? i7 + 1 : i7)) {
            i4 <<= 1;
        }
        while (true) {
            Segment[] segmentArr = this.f;
            if (i3 >= segmentArr.length) {
                return;
            }
            segmentArr[i3] = this.i.a(this, i4);
            i3++;
        }
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    public final int a(Object obj) {
        int iB = this.h.b(obj);
        int i = iB + ((iB << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = (i4 << 2) + (i4 << 14) + i4;
        return (i5 >>> 16) ^ i5;
    }

    public final Segment b(int i) {
        return this.f[(i >>> this.e) & this.d];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (Segment segment : this.f) {
            if (segment.e != 0) {
                segment.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = segment.h;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    segment.e();
                    segment.i.set(0);
                    segment.f++;
                    segment.e = 0;
                    segment.unlock();
                } catch (Throwable th) {
                    segment.unlock();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int iA = a(obj);
        Segment segmentB = b(iA);
        segmentB.getClass();
        try {
            if (segmentB.e == 0) {
                return false;
            }
            InternalEntry internalEntryD = segmentB.d(iA, obj);
            if (internalEntryD != null) {
                if (internalEntryD.getValue() != null) {
                    z = true;
                }
            }
            return z;
        } finally {
            segmentB.g();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Object value;
        if (obj != null) {
            Segment[] segmentArr = this.f;
            long j = -1;
            int i = 0;
            while (i < 3) {
                int length = segmentArr.length;
                long j2 = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    Segment segment = segmentArr[i2];
                    int i3 = segment.e;
                    AtomicReferenceArray atomicReferenceArray = segment.h;
                    for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                        for (InternalEntry internalEntryA = (InternalEntry) atomicReferenceArray.get(i4); internalEntryA != null; internalEntryA = internalEntryA.a()) {
                            if (internalEntryA.getKey() == null || (value = internalEntryA.getValue()) == null) {
                                segment.m();
                                value = null;
                            }
                            if (value != null && this.i.e().a().d(obj, value)) {
                                return true;
                            }
                        }
                    }
                    j2 += segment.f;
                }
                if (j2 == j) {
                    return false;
                }
                i++;
                j = j2;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.l;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.l = entrySet;
        return entrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iA = a(obj);
        Segment segmentB = b(iA);
        segmentB.getClass();
        try {
            InternalEntry internalEntryD = segmentB.d(iA, obj);
            if (internalEntryD == null) {
                return null;
            }
            Object value = internalEntryD.getValue();
            if (value == null) {
                segmentB.m();
            }
            return value;
        } finally {
            segmentB.g();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        Segment[] segmentArr = this.f;
        long j = 0;
        for (int i = 0; i < segmentArr.length; i++) {
            if (segmentArr[i].e != 0) {
                return false;
            }
            j += segmentArr[i].f;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < segmentArr.length; i2++) {
            if (segmentArr[i2].e != 0) {
                return false;
            }
            j -= segmentArr[i2].f;
        }
        return j == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.j;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.j = keySet;
        return keySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        return b(iA).h(obj, iA, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        return b(iA).h(obj, iA, obj2, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iA = a(obj);
        Segment segmentB = b(iA);
        segmentB.lock();
        try {
            segmentB.j();
            AtomicReferenceArray atomicReferenceArray = segmentB.h;
            int length = (atomicReferenceArray.length() - 1) & iA;
            InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
            for (InternalEntry internalEntryA = internalEntry; internalEntryA != null; internalEntryA = internalEntryA.a()) {
                Object key = internalEntryA.getKey();
                if (internalEntryA.c() == iA && key != null && segmentB.d.h.d(obj, key)) {
                    Object value = internalEntryA.getValue();
                    if (value == null && internalEntryA.getValue() != null) {
                        return null;
                    }
                    segmentB.f++;
                    InternalEntry internalEntryI = segmentB.i(internalEntry, internalEntryA);
                    int i = segmentB.e - 1;
                    atomicReferenceArray.set(length, internalEntryI);
                    segmentB.e = i;
                    return value;
                }
            }
            return null;
        } finally {
            segmentB.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object replace(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        Segment segmentB = b(iA);
        segmentB.lock();
        try {
            segmentB.j();
            AtomicReferenceArray atomicReferenceArray = segmentB.h;
            int length = (atomicReferenceArray.length() - 1) & iA;
            InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
            for (InternalEntry internalEntryA = internalEntry; internalEntryA != null; internalEntryA = internalEntryA.a()) {
                Object key = internalEntryA.getKey();
                if (internalEntryA.c() == iA && key != null && segmentB.d.h.d(obj, key)) {
                    Object value = internalEntryA.getValue();
                    if (value != null) {
                        segmentB.f++;
                        segmentB.l(internalEntryA, obj2);
                        return value;
                    }
                    if (internalEntryA.getValue() == null) {
                        segmentB.f++;
                        InternalEntry internalEntryI = segmentB.i(internalEntry, internalEntryA);
                        int i = segmentB.e - 1;
                        atomicReferenceArray.set(length, internalEntryI);
                        segmentB.e = i;
                    }
                    return null;
                }
            }
            return null;
        } finally {
            segmentB.unlock();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j = 0;
        for (int i = 0; i < this.f.length; i++) {
            j += r0[i].e;
        }
        return Ints.e(j);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.k;
        if (collection != null) {
            return collection;
        }
        Values values = new Values();
        this.k = values;
        return values;
    }

    public Object writeReplace() {
        InternalEntryHelper internalEntryHelper = this.i;
        return new SerializationProxy(internalEntryHelper.c(), internalEntryHelper.e(), this.h, this.g, this);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        boolean z = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int iA = a(obj);
        Segment segmentB = b(iA);
        segmentB.lock();
        try {
            segmentB.j();
            AtomicReferenceArray atomicReferenceArray = segmentB.h;
            int length = (atomicReferenceArray.length() - 1) & iA;
            InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
            for (InternalEntry internalEntryA = internalEntry; internalEntryA != null; internalEntryA = internalEntryA.a()) {
                Object key = internalEntryA.getKey();
                if (internalEntryA.c() == iA && key != null && segmentB.d.h.d(obj, key)) {
                    if (segmentB.d.i.e().a().d(obj2, internalEntryA.getValue())) {
                        z = true;
                    } else if (internalEntryA.getValue() != null) {
                        return false;
                    }
                    segmentB.f++;
                    InternalEntry internalEntryI = segmentB.i(internalEntry, internalEntryA);
                    int i = segmentB.e - 1;
                    atomicReferenceArray.set(length, internalEntryI);
                    segmentB.e = i;
                    return z;
                }
            }
            return false;
        } finally {
            segmentB.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj3.getClass();
        if (obj2 == null) {
            return false;
        }
        int iA = a(obj);
        Segment segmentB = b(iA);
        segmentB.lock();
        try {
            segmentB.j();
            AtomicReferenceArray atomicReferenceArray = segmentB.h;
            int length = (atomicReferenceArray.length() - 1) & iA;
            InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
            for (InternalEntry internalEntryA = internalEntry; internalEntryA != null; internalEntryA = internalEntryA.a()) {
                Object key = internalEntryA.getKey();
                if (internalEntryA.c() == iA && key != null && segmentB.d.h.d(obj, key)) {
                    Object value = internalEntryA.getValue();
                    if (value == null) {
                        if (internalEntryA.getValue() == null) {
                            segmentB.f++;
                            InternalEntry internalEntryI = segmentB.i(internalEntry, internalEntryA);
                            int i = segmentB.e - 1;
                            atomicReferenceArray.set(length, internalEntryI);
                            segmentB.e = i;
                        }
                        return false;
                    }
                    if (!segmentB.d.i.e().a().d(obj2, value)) {
                        return false;
                    }
                    segmentB.f++;
                    segmentB.l(internalEntryA, obj3);
                    return true;
                }
            }
            return false;
        } finally {
            segmentB.unlock();
        }
    }
}
