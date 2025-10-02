package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Strings;
import com.google.common.base.Supplier;
import com.google.common.base.Ticker;
import com.google.common.cache.AbstractCache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.collect.AbstractSequentialIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Ints;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.common.util.concurrent.Uninterruptibles;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

@GwtCompatible
/* loaded from: classes6.dex */
class LocalCache<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    public final int d;
    public final int e;
    public final Segment[] f;
    public final int g;
    public final Equivalence h;
    public final Equivalence i;
    public final Strength j;
    public final Strength k;
    public final long l;
    public final Weigher m;
    public final long n;
    public final long o;
    public final AbstractQueue p;
    public final RemovalListener q;
    public final Ticker r;
    public final EntryFactory s;
    public final AbstractCache.StatsCounter t;
    public final CacheLoader u;
    public Set v;
    public Collection w;
    public Set x;
    public static final Logger y = Logger.getLogger(LocalCache.class.getName());
    public static final AnonymousClass1 z = new AnonymousClass1();
    public static final Queue A = new AbstractQueue<Object>() { // from class: com.google.common.cache.LocalCache.2
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return ImmutableSet.w().iterator();
        }

        @Override // java.util.Queue
        public final boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public final Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public final Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return 0;
        }
    };

    /* renamed from: com.google.common.cache.LocalCache$1, reason: invalid class name */
    public class AnonymousClass1 implements ValueReference<Object, Object> {
        @Override // com.google.common.cache.LocalCache.ValueReference
        public final int a() {
            return 0;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean b() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final ReferenceEntry c() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final void d(Object obj) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final Object e() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final ValueReference f(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final Object get() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean isActive() {
            return false;
        }
    }

    public abstract class AbstractCacheSet<T> extends AbstractSet<T> {
        public AbstractCacheSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LocalCache.this.size();
        }
    }

    public static abstract class AbstractReferenceEntry<K, V> implements ReferenceEntry<K, V> {
        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry a() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ValueReference b() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int c() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void d(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry e() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void f(ValueReference valueReference) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public Object getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long l() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void m(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void n(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry o() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry p() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry q() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long r() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void s(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void t(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void u(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }
    }

    public static final class AccessQueue<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {
        public final AnonymousClass1 d;

        /* renamed from: com.google.common.cache.LocalCache$AccessQueue$1, reason: invalid class name */
        public class AnonymousClass1 extends AbstractReferenceEntry<K, V> {
            public ReferenceEntry d;
            public ReferenceEntry e;

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final void d(ReferenceEntry referenceEntry) {
                this.e = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final void m(long j) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final ReferenceEntry o() {
                return this.e;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final ReferenceEntry q() {
                return this.d;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final long r() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final void s(ReferenceEntry referenceEntry) {
                this.d = referenceEntry;
            }
        }

        public AccessQueue() {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            anonymousClass1.d = anonymousClass1;
            anonymousClass1.e = anonymousClass1;
            this.d = anonymousClass1;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            AnonymousClass1 anonymousClass1 = this.d;
            ReferenceEntry referenceEntry = anonymousClass1.d;
            while (referenceEntry != anonymousClass1) {
                ReferenceEntry referenceEntryQ = referenceEntry.q();
                Logger logger = LocalCache.y;
                NullEntry nullEntry = NullEntry.d;
                referenceEntry.s(nullEntry);
                referenceEntry.d(nullEntry);
                referenceEntry = referenceEntryQ;
            }
            anonymousClass1.d = anonymousClass1;
            anonymousClass1.e = anonymousClass1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return ((ReferenceEntry) obj).q() != NullEntry.d;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            AnonymousClass1 anonymousClass1 = this.d;
            return anonymousClass1.d == anonymousClass1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            AnonymousClass1 anonymousClass1 = this.d;
            ReferenceEntry referenceEntry = anonymousClass1.d;
            if (referenceEntry == anonymousClass1) {
                referenceEntry = null;
            }
            return new AbstractSequentialIterator<ReferenceEntry<Object, Object>>(referenceEntry) { // from class: com.google.common.cache.LocalCache.AccessQueue.2
                @Override // com.google.common.collect.AbstractSequentialIterator
                public final Object a(Object obj) {
                    ReferenceEntry referenceEntryQ = ((ReferenceEntry) obj).q();
                    if (referenceEntryQ == AccessQueue.this.d) {
                        return null;
                    }
                    return referenceEntryQ;
                }
            };
        }

        @Override // java.util.Queue
        public final boolean offer(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry referenceEntryO = referenceEntry.o();
            ReferenceEntry referenceEntryQ = referenceEntry.q();
            Logger logger = LocalCache.y;
            referenceEntryO.s(referenceEntryQ);
            referenceEntryQ.d(referenceEntryO);
            AnonymousClass1 anonymousClass1 = this.d;
            ReferenceEntry referenceEntry2 = anonymousClass1.e;
            referenceEntry2.s(referenceEntry);
            referenceEntry.d(referenceEntry2);
            referenceEntry.s(anonymousClass1);
            anonymousClass1.e = referenceEntry;
            return true;
        }

        @Override // java.util.Queue
        public final Object peek() {
            AnonymousClass1 anonymousClass1 = this.d;
            ReferenceEntry referenceEntry = anonymousClass1.d;
            if (referenceEntry == anonymousClass1) {
                return null;
            }
            return referenceEntry;
        }

        @Override // java.util.Queue
        public final Object poll() {
            AnonymousClass1 anonymousClass1 = this.d;
            ReferenceEntry referenceEntry = anonymousClass1.d;
            if (referenceEntry == anonymousClass1) {
                return null;
            }
            remove(referenceEntry);
            return referenceEntry;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry referenceEntryO = referenceEntry.o();
            ReferenceEntry referenceEntryQ = referenceEntry.q();
            Logger logger = LocalCache.y;
            referenceEntryO.s(referenceEntryQ);
            referenceEntryQ.d(referenceEntryO);
            NullEntry nullEntry = NullEntry.d;
            referenceEntry.s(nullEntry);
            referenceEntry.d(nullEntry);
            return referenceEntryQ != nullEntry;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            AnonymousClass1 anonymousClass1 = this.d;
            int i = 0;
            for (ReferenceEntry referenceEntryQ = anonymousClass1.d; referenceEntryQ != anonymousClass1; referenceEntryQ = referenceEntryQ.q()) {
                i++;
            }
            return i;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class EntryFactory {
        public static final EntryFactory[] d;
        public static final /* synthetic */ EntryFactory[] e;

        /* JADX INFO: Fake field, exist only in values array */
        EntryFactory EF0;

        static {
            EntryFactory entryFactory = new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.1
                @Override // com.google.common.cache.LocalCache.EntryFactory
                public final ReferenceEntry d(int i, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                    return new StrongEntry(obj, i, referenceEntry);
                }
            };
            EntryFactory entryFactory2 = new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.2
                @Override // com.google.common.cache.LocalCache.EntryFactory
                public final ReferenceEntry b(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                    ReferenceEntry referenceEntryB = super.b(segment, referenceEntry, referenceEntry2, obj);
                    EntryFactory.a(referenceEntry, referenceEntryB);
                    return referenceEntryB;
                }

                @Override // com.google.common.cache.LocalCache.EntryFactory
                public final ReferenceEntry d(int i, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                    StrongAccessEntry strongAccessEntry = new StrongAccessEntry(obj, i, referenceEntry);
                    strongAccessEntry.h = Long.MAX_VALUE;
                    Logger logger = LocalCache.y;
                    NullEntry nullEntry = NullEntry.d;
                    strongAccessEntry.i = nullEntry;
                    strongAccessEntry.j = nullEntry;
                    return strongAccessEntry;
                }
            };
            EntryFactory entryFactory3 = new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.3
                @Override // com.google.common.cache.LocalCache.EntryFactory
                public final ReferenceEntry b(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                    ReferenceEntry referenceEntryB = super.b(segment, referenceEntry, referenceEntry2, obj);
                    EntryFactory.c(referenceEntry, referenceEntryB);
                    return referenceEntryB;
                }

                @Override // com.google.common.cache.LocalCache.EntryFactory
                public final ReferenceEntry d(int i, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                    StrongWriteEntry strongWriteEntry = new StrongWriteEntry(obj, i, referenceEntry);
                    strongWriteEntry.h = Long.MAX_VALUE;
                    Logger logger = LocalCache.y;
                    NullEntry nullEntry = NullEntry.d;
                    strongWriteEntry.i = nullEntry;
                    strongWriteEntry.j = nullEntry;
                    return strongWriteEntry;
                }
            };
            EntryFactory entryFactory4 = new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.4
                @Override // com.google.common.cache.LocalCache.EntryFactory
                public final ReferenceEntry b(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                    ReferenceEntry referenceEntryB = super.b(segment, referenceEntry, referenceEntry2, obj);
                    EntryFactory.a(referenceEntry, referenceEntryB);
                    EntryFactory.c(referenceEntry, referenceEntryB);
                    return referenceEntryB;
                }

                @Override // com.google.common.cache.LocalCache.EntryFactory
                public final ReferenceEntry d(int i, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                    StrongAccessWriteEntry strongAccessWriteEntry = new StrongAccessWriteEntry(obj, i, referenceEntry);
                    strongAccessWriteEntry.h = Long.MAX_VALUE;
                    Logger logger = LocalCache.y;
                    NullEntry nullEntry = NullEntry.d;
                    strongAccessWriteEntry.i = nullEntry;
                    strongAccessWriteEntry.j = nullEntry;
                    strongAccessWriteEntry.k = Long.MAX_VALUE;
                    strongAccessWriteEntry.l = nullEntry;
                    strongAccessWriteEntry.m = nullEntry;
                    return strongAccessWriteEntry;
                }
            };
            EntryFactory entryFactory5 = new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.5
                @Override // com.google.common.cache.LocalCache.EntryFactory
                public final ReferenceEntry d(int i, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                    return new WeakEntry(i, referenceEntry, obj, segment.k);
                }
            };
            EntryFactory entryFactory6 = new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.6
                @Override // com.google.common.cache.LocalCache.EntryFactory
                public final ReferenceEntry b(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                    ReferenceEntry referenceEntryB = super.b(segment, referenceEntry, referenceEntry2, obj);
                    EntryFactory.a(referenceEntry, referenceEntryB);
                    return referenceEntryB;
                }

                @Override // com.google.common.cache.LocalCache.EntryFactory
                public final ReferenceEntry d(int i, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                    WeakAccessEntry weakAccessEntry = new WeakAccessEntry(i, referenceEntry, obj, segment.k);
                    weakAccessEntry.g = Long.MAX_VALUE;
                    Logger logger = LocalCache.y;
                    NullEntry nullEntry = NullEntry.d;
                    weakAccessEntry.h = nullEntry;
                    weakAccessEntry.i = nullEntry;
                    return weakAccessEntry;
                }
            };
            EntryFactory entryFactory7 = new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.7
                @Override // com.google.common.cache.LocalCache.EntryFactory
                public final ReferenceEntry b(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                    ReferenceEntry referenceEntryB = super.b(segment, referenceEntry, referenceEntry2, obj);
                    EntryFactory.c(referenceEntry, referenceEntryB);
                    return referenceEntryB;
                }

                @Override // com.google.common.cache.LocalCache.EntryFactory
                public final ReferenceEntry d(int i, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                    WeakWriteEntry weakWriteEntry = new WeakWriteEntry(i, referenceEntry, obj, segment.k);
                    weakWriteEntry.g = Long.MAX_VALUE;
                    Logger logger = LocalCache.y;
                    NullEntry nullEntry = NullEntry.d;
                    weakWriteEntry.h = nullEntry;
                    weakWriteEntry.i = nullEntry;
                    return weakWriteEntry;
                }
            };
            EntryFactory entryFactory8 = new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.8
                @Override // com.google.common.cache.LocalCache.EntryFactory
                public final ReferenceEntry b(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                    ReferenceEntry referenceEntryB = super.b(segment, referenceEntry, referenceEntry2, obj);
                    EntryFactory.a(referenceEntry, referenceEntryB);
                    EntryFactory.c(referenceEntry, referenceEntryB);
                    return referenceEntryB;
                }

                @Override // com.google.common.cache.LocalCache.EntryFactory
                public final ReferenceEntry d(int i, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                    WeakAccessWriteEntry weakAccessWriteEntry = new WeakAccessWriteEntry(i, referenceEntry, obj, segment.k);
                    weakAccessWriteEntry.g = Long.MAX_VALUE;
                    Logger logger = LocalCache.y;
                    NullEntry nullEntry = NullEntry.d;
                    weakAccessWriteEntry.h = nullEntry;
                    weakAccessWriteEntry.i = nullEntry;
                    weakAccessWriteEntry.j = Long.MAX_VALUE;
                    weakAccessWriteEntry.k = nullEntry;
                    weakAccessWriteEntry.l = nullEntry;
                    return weakAccessWriteEntry;
                }
            };
            e = new EntryFactory[]{entryFactory, entryFactory2, entryFactory3, entryFactory4, entryFactory5, entryFactory6, entryFactory7, entryFactory8};
            d = new EntryFactory[]{entryFactory, entryFactory2, entryFactory3, entryFactory4, entryFactory5, entryFactory6, entryFactory7, entryFactory8};
        }

        public static void a(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
            referenceEntry2.m(referenceEntry.r());
            ReferenceEntry referenceEntryO = referenceEntry.o();
            Logger logger = LocalCache.y;
            referenceEntryO.s(referenceEntry2);
            referenceEntry2.d(referenceEntryO);
            ReferenceEntry referenceEntryQ = referenceEntry.q();
            referenceEntry2.s(referenceEntryQ);
            referenceEntryQ.d(referenceEntry2);
            NullEntry nullEntry = NullEntry.d;
            referenceEntry.s(nullEntry);
            referenceEntry.d(nullEntry);
        }

        public static void c(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
            referenceEntry2.n(referenceEntry.l());
            ReferenceEntry referenceEntryE = referenceEntry.e();
            Logger logger = LocalCache.y;
            referenceEntryE.t(referenceEntry2);
            referenceEntry2.u(referenceEntryE);
            ReferenceEntry referenceEntryP = referenceEntry.p();
            referenceEntry2.t(referenceEntryP);
            referenceEntryP.u(referenceEntry2);
            NullEntry nullEntry = NullEntry.d;
            referenceEntry.t(nullEntry);
            referenceEntry.u(nullEntry);
        }

        public static EntryFactory valueOf(String str) {
            return (EntryFactory) Enum.valueOf(EntryFactory.class, str);
        }

        public static EntryFactory[] values() {
            return (EntryFactory[]) e.clone();
        }

        public ReferenceEntry b(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
            return d(referenceEntry.c(), segment, referenceEntry2, obj);
        }

        public abstract ReferenceEntry d(int i, Segment segment, ReferenceEntry referenceEntry, Object obj);
    }

    public final class EntryIterator extends LocalCache<K, V>.HashIterator<Map.Entry<K, V>> {
    }

    public final class EntrySet extends LocalCache<K, V>.AbstractCacheSet<Map.Entry<K, V>> {
        public EntrySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            LocalCache localCache;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = (localCache = LocalCache.this).get(key)) != null && localCache.i.d(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && LocalCache.this.remove(key, entry.getValue());
        }
    }

    public abstract class HashIterator<T> implements Iterator<T> {
        public int d;
        public int e = -1;
        public Segment f;
        public AtomicReferenceArray g;
        public ReferenceEntry h;
        public WriteThroughEntry i;
        public WriteThroughEntry j;

        public HashIterator() {
            this.d = LocalCache.this.f.length - 1;
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
                Segment[] segmentArr = LocalCache.this.f;
                this.d = i - 1;
                Segment segment = segmentArr[i];
                this.f = segment;
                if (segment.e != 0) {
                    this.g = this.f.i;
                    this.e = r0.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        public final boolean b(ReferenceEntry referenceEntry) {
            Object obj;
            LocalCache localCache = LocalCache.this;
            try {
                long jA = localCache.r.a();
                Object key = referenceEntry.getKey();
                Object obj2 = null;
                if (referenceEntry.getKey() != null && (obj = referenceEntry.b().get()) != null && !localCache.e(referenceEntry, jA)) {
                    obj2 = obj;
                }
                if (obj2 == null) {
                    this.f.l();
                    return false;
                }
                this.i = new WriteThroughEntry(key, obj2);
                this.f.l();
                return true;
            } catch (Throwable th) {
                this.f.l();
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
            ReferenceEntry referenceEntry = this.h;
            if (referenceEntry == null) {
                return false;
            }
            while (true) {
                this.h = referenceEntry.a();
                ReferenceEntry referenceEntry2 = this.h;
                if (referenceEntry2 == null) {
                    return false;
                }
                if (b(referenceEntry2)) {
                    return true;
                }
                referenceEntry = this.h;
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
                ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(i);
                this.h = referenceEntry;
                if (referenceEntry != null && (b(referenceEntry) || d())) {
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
            Preconditions.r(this.j != null);
            LocalCache.this.remove(this.j.d);
            this.j = null;
        }
    }

    public final class KeyIterator extends LocalCache<K, V>.HashIterator<K> {
        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public final Object next() {
            return c().d;
        }
    }

    public final class KeySet extends LocalCache<K, V>.AbstractCacheSet<K> {
        public KeySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return LocalCache.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new KeyIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return LocalCache.this.remove(obj) != null;
        }
    }

    public static final class LoadingSerializationProxy<K, V> extends ManualSerializationProxy<K, V> implements LoadingCache<K, V>, Serializable {
        public transient LoadingCache q;

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.q = U1().a(this.o);
        }

        private Object readResolve() {
            return this.q;
        }

        @Override // com.google.common.base.Function
        public final Object apply(Object obj) {
            return ((LocalLoadingCache) this.q).apply(obj);
        }
    }

    public static class LoadingValueReference<K, V> implements ValueReference<K, V> {
        public volatile ValueReference d;
        public final SettableFuture e;
        public final Stopwatch f;

        public LoadingValueReference() {
            AnonymousClass1 anonymousClass1 = LocalCache.z;
            this.e = new SettableFuture();
            this.f = new Stopwatch();
            this.d = anonymousClass1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final int a() {
            return this.d.a();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean b() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final ReferenceEntry c() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final void d(Object obj) {
            if (obj != null) {
                this.e.m(obj);
            } else {
                this.d = LocalCache.z;
            }
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final Object e() {
            return Uninterruptibles.a(this.e);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final ValueReference f(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return this;
        }

        /* JADX WARN: Type inference failed for: r3v6, types: [com.google.common.cache.a] */
        public final ListenableFuture g(Object obj, CacheLoader cacheLoader) {
            try {
                this.f.b();
                Object obj2 = this.d.get();
                if (obj2 == null) {
                    Object objA = cacheLoader.a(obj);
                    return this.e.m(objA) ? this.e : Futures.d(objA);
                }
                ListenableFuture listenableFutureB = cacheLoader.b(obj, obj2);
                return listenableFutureB == null ? Futures.d(null) : Futures.e(listenableFutureB, new Function() { // from class: com.google.common.cache.a
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj3) {
                        this.d.e.m(obj3);
                        return obj3;
                    }
                });
            } catch (Throwable th) {
                ListenableFuture listenableFutureC = this.e.n(th) ? this.e : Futures.c(th);
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return listenableFutureC;
            }
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final Object get() {
            return this.d.get();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean isActive() {
            return this.d.isActive();
        }
    }

    public static class LocalLoadingCache<K, V> extends LocalManualCache<K, V> implements LoadingCache<K, V> {
        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use LoadingSerializationProxy");
        }

        @Override // com.google.common.base.Function
        public final Object apply(Object obj) {
            try {
                return get(obj);
            } catch (ExecutionException e) {
                throw new UncheckedExecutionException(e.getCause());
            }
        }

        @Override // com.google.common.cache.LoadingCache
        public final Object get(Object obj) {
            ReferenceEntry referenceEntryI;
            LocalCache localCache = this.d;
            CacheLoader cacheLoader = localCache.u;
            obj.getClass();
            int iD = localCache.d(obj);
            Segment segmentF = localCache.f(iD);
            segmentF.getClass();
            cacheLoader.getClass();
            try {
                try {
                    if (segmentF.e != 0 && (referenceEntryI = segmentF.i(iD, obj)) != null) {
                        long jA = segmentF.d.r.a();
                        Object objJ = segmentF.j(referenceEntryI, jA);
                        if (objJ != null) {
                            segmentF.o(referenceEntryI, jA);
                            segmentF.q.e();
                            segmentF.d.getClass();
                            return objJ;
                        }
                        ValueReference valueReferenceB = referenceEntryI.b();
                        if (valueReferenceB.b()) {
                            return segmentF.z(referenceEntryI, obj, valueReferenceB);
                        }
                    }
                    return segmentF.k(obj, iD, cacheLoader);
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof Error) {
                        throw new ExecutionError((Error) cause);
                    }
                    if (cause instanceof RuntimeException) {
                        throw new UncheckedExecutionException(cause);
                    }
                    throw e;
                }
            } finally {
                segmentF.l();
            }
        }

        @Override // com.google.common.cache.LocalCache.LocalManualCache
        public Object writeReplace() {
            return new LoadingSerializationProxy(this.d);
        }
    }

    public static class LocalManualCache<K, V> implements Cache<K, V>, Serializable {
        public final LocalCache d;

        /* renamed from: com.google.common.cache.LocalCache$LocalManualCache$1, reason: invalid class name */
        class AnonymousClass1 extends CacheLoader<Object, Object> {
            @Override // com.google.common.cache.CacheLoader
            public final Object a(Object obj) {
                throw null;
            }
        }

        public LocalManualCache(LocalCache localCache) {
            this.d = localCache;
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use ManualSerializationProxy");
        }

        public Object writeReplace() {
            return new ManualSerializationProxy(this.d);
        }
    }

    public static class ManualSerializationProxy<K, V> extends ForwardingCache<K, V> implements Serializable {
        public final Strength d;
        public final Strength e;
        public final Equivalence f;
        public final Equivalence g;
        public final long h;
        public final long i;
        public final long j;
        public final Weigher k;
        public final int l;
        public final RemovalListener m;
        public final Ticker n;
        public final CacheLoader o;
        public transient Cache p;

        public ManualSerializationProxy(LocalCache localCache) {
            Strength strength = localCache.j;
            Strength strength2 = localCache.k;
            Equivalence equivalence = localCache.h;
            Equivalence equivalence2 = localCache.i;
            long j = localCache.o;
            long j2 = localCache.n;
            long j3 = localCache.l;
            Weigher weigher = localCache.m;
            int i = localCache.g;
            RemovalListener removalListener = localCache.q;
            Ticker ticker = localCache.r;
            CacheLoader cacheLoader = localCache.u;
            this.d = strength;
            this.e = strength2;
            this.f = equivalence;
            this.g = equivalence2;
            this.h = j;
            this.i = j2;
            this.j = j3;
            this.k = weigher;
            this.l = i;
            this.m = removalListener;
            this.n = (ticker == Ticker.f14871a || ticker == CacheBuilder.p) ? null : ticker;
            this.o = cacheLoader;
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            CacheBuilder cacheBuilderU1 = U1();
            cacheBuilderU1.b();
            this.p = new LocalManualCache(new LocalCache(cacheBuilderU1, null));
        }

        private Object readResolve() {
            return this.p;
        }

        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public final Object P1() {
            return this.p;
        }

        @Override // com.google.common.cache.ForwardingCache
        /* renamed from: R1 */
        public final Cache P1() {
            return this.p;
        }

        public final CacheBuilder U1() {
            CacheBuilder cacheBuilderC = CacheBuilder.c();
            Strength strength = cacheBuilderC.f;
            Preconditions.p("Key strength was already set to %s", strength, strength == null);
            Strength strength2 = this.d;
            strength2.getClass();
            cacheBuilderC.f = strength2;
            Strength strength3 = cacheBuilderC.g;
            Preconditions.p("Value strength was already set to %s", strength3, strength3 == null);
            Strength strength4 = this.e;
            strength4.getClass();
            cacheBuilderC.g = strength4;
            Equivalence equivalence = cacheBuilderC.j;
            Preconditions.p("key equivalence was already set to %s", equivalence, equivalence == null);
            Equivalence equivalence2 = this.f;
            equivalence2.getClass();
            cacheBuilderC.j = equivalence2;
            Equivalence equivalence3 = cacheBuilderC.k;
            Preconditions.p("value equivalence was already set to %s", equivalence3, equivalence3 == null);
            Equivalence equivalence4 = this.g;
            equivalence4.getClass();
            cacheBuilderC.k = equivalence4;
            int i = cacheBuilderC.b;
            Preconditions.n(i, "concurrency level was already set to %s", i == -1);
            int i2 = this.l;
            Preconditions.g(i2 > 0);
            cacheBuilderC.b = i2;
            Preconditions.r(cacheBuilderC.l == null);
            RemovalListener removalListener = this.m;
            removalListener.getClass();
            cacheBuilderC.l = removalListener;
            cacheBuilderC.f14873a = false;
            long j = this.h;
            if (j > 0) {
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long j2 = cacheBuilderC.h;
                Preconditions.o(j2, "expireAfterWrite was already set to %s ns", j2 == -1);
                if (!(j >= 0)) {
                    throw new IllegalArgumentException(Strings.b("duration cannot be negative: %s %s", Long.valueOf(j), timeUnit));
                }
                cacheBuilderC.h = timeUnit.toNanos(j);
            }
            long j3 = this.i;
            if (j3 > 0) {
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                long j4 = cacheBuilderC.i;
                Preconditions.o(j4, "expireAfterAccess was already set to %s ns", j4 == -1);
                if (!(j3 >= 0)) {
                    throw new IllegalArgumentException(Strings.b("duration cannot be negative: %s %s", Long.valueOf(j3), timeUnit2));
                }
                cacheBuilderC.i = timeUnit2.toNanos(j3);
            }
            CacheBuilder.OneWeigher oneWeigher = CacheBuilder.OneWeigher.d;
            long j5 = this.j;
            Weigher weigher = this.k;
            if (weigher != oneWeigher) {
                Preconditions.r(cacheBuilderC.e == null);
                if (cacheBuilderC.f14873a) {
                    long j6 = cacheBuilderC.c;
                    Preconditions.o(j6, "weigher can not be combined with maximum size (%s provided)", j6 == -1);
                }
                weigher.getClass();
                cacheBuilderC.e = weigher;
                if (j5 != -1) {
                    long j7 = cacheBuilderC.d;
                    Preconditions.o(j7, "maximum weight was already set to %s", j7 == -1);
                    long j8 = cacheBuilderC.c;
                    Preconditions.o(j8, "maximum size was already set to %s", j8 == -1);
                    Preconditions.f("maximum weight must not be negative", j5 >= 0);
                    cacheBuilderC.d = j5;
                }
            } else if (j5 != -1) {
                long j9 = cacheBuilderC.c;
                Preconditions.o(j9, "maximum size was already set to %s", j9 == -1);
                long j10 = cacheBuilderC.d;
                Preconditions.o(j10, "maximum weight was already set to %s", j10 == -1);
                Preconditions.q("maximum size can not be combined with weigher", cacheBuilderC.e == null);
                Preconditions.f("maximum size must not be negative", j5 >= 0);
                cacheBuilderC.c = j5;
            }
            Ticker ticker = this.n;
            if (ticker != null) {
                Preconditions.r(cacheBuilderC.m == null);
                cacheBuilderC.m = ticker;
            }
            return cacheBuilderC;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NullEntry implements ReferenceEntry<Object, Object> {
        public static final NullEntry d;
        public static final /* synthetic */ NullEntry[] e;

        static {
            NullEntry nullEntry = new NullEntry("INSTANCE", 0);
            d = nullEntry;
            e = new NullEntry[]{nullEntry};
        }

        public static NullEntry valueOf(String str) {
            return (NullEntry) Enum.valueOf(NullEntry.class, str);
        }

        public static NullEntry[] values() {
            return (NullEntry[]) e.clone();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final ReferenceEntry a() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final ValueReference b() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final int c() {
            return 0;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void d(ReferenceEntry referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final ReferenceEntry e() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void f(ValueReference valueReference) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final Object getKey() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final long l() {
            return 0L;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void m(long j) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void n(long j) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final ReferenceEntry o() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final ReferenceEntry p() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final ReferenceEntry q() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final long r() {
            return 0L;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void s(ReferenceEntry referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void t(ReferenceEntry referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void u(ReferenceEntry referenceEntry) {
        }
    }

    public static class Segment<K, V> extends ReentrantLock {
        public final LocalCache d;
        public volatile int e;
        public long f;
        public int g;
        public int h;
        public volatile AtomicReferenceArray i;
        public final long j;
        public final ReferenceQueue k;
        public final ReferenceQueue l;
        public final AbstractQueue m;
        public final AtomicInteger n = new AtomicInteger();
        public final AbstractQueue o;
        public final AbstractQueue p;
        public final AbstractCache.StatsCounter q;

        public Segment(LocalCache localCache, int i, long j, AbstractCache.StatsCounter statsCounter) {
            this.d = localCache;
            this.j = j;
            statsCounter.getClass();
            this.q = statsCounter;
            AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.h = length;
            if (localCache.m == CacheBuilder.OneWeigher.d && length == j) {
                this.h = length + 1;
            }
            this.i = atomicReferenceArray;
            Strength strength = localCache.j;
            Strength.AnonymousClass1 anonymousClass1 = Strength.d;
            this.k = strength != anonymousClass1 ? new ReferenceQueue() : null;
            this.l = localCache.k != anonymousClass1 ? new ReferenceQueue() : null;
            this.m = (AbstractQueue) ((localCache.b() || localCache.a()) ? new ConcurrentLinkedQueue() : LocalCache.A);
            this.o = (AbstractQueue) (localCache.c() ? new WriteQueue() : LocalCache.A);
            this.p = (AbstractQueue) ((localCache.b() || localCache.a()) ? new AccessQueue() : LocalCache.A);
        }

        public final ReferenceEntry a(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
            Object key = referenceEntry.getKey();
            if (key == null) {
                return null;
            }
            ValueReference valueReferenceB = referenceEntry.b();
            Object obj = valueReferenceB.get();
            if (obj == null && valueReferenceB.isActive()) {
                return null;
            }
            ReferenceEntry referenceEntryB = this.d.s.b(this, referenceEntry, referenceEntry2, key);
            referenceEntryB.f(valueReferenceB.f(this.l, obj, referenceEntryB));
            return referenceEntryB;
        }

        public final void b() {
            while (true) {
                ReferenceEntry referenceEntry = (ReferenceEntry) this.m.poll();
                if (referenceEntry == null) {
                    return;
                }
                AbstractQueue abstractQueue = this.p;
                if (abstractQueue.contains(referenceEntry)) {
                    abstractQueue.add(referenceEntry);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        
            r1.g++;
            r2 = r1.s(r3, r3, r3.getKey(), r3.b().get(), r3.b(), r7);
            r3 = r1.e - 1;
            r11.set(r12, r2);
            r1.e = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00fa, code lost:
        
            r1.u();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c() throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 303
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.c():void");
        }

        public final void d(Object obj, Object obj2, int i, RemovalCause removalCause) {
            this.f -= i;
            if (removalCause.a()) {
                this.q.a();
            }
            LocalCache localCache = this.d;
            if (localCache.p != LocalCache.A) {
                localCache.p.offer(new RemovalNotification(obj, obj2));
            }
        }

        public final void e(ReferenceEntry referenceEntry) {
            if (this.d.a()) {
                b();
                long jA = referenceEntry.b().a();
                long j = this.j;
                RemovalCause removalCause = RemovalCause.h;
                if (jA > j && !q(referenceEntry, referenceEntry.c(), removalCause)) {
                    throw new AssertionError();
                }
                while (this.f > j) {
                    for (ReferenceEntry referenceEntry2 : this.p) {
                        if (referenceEntry2.b().a() > 0) {
                            if (!q(referenceEntry2, referenceEntry2.c(), removalCause)) {
                                throw new AssertionError();
                            }
                        }
                    }
                    throw new AssertionError();
                }
            }
        }

        public final void f() {
            AtomicReferenceArray atomicReferenceArray = this.i;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.e;
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
            this.h = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                ReferenceEntry referenceEntryA = (ReferenceEntry) atomicReferenceArray.get(i2);
                if (referenceEntryA != null) {
                    ReferenceEntry referenceEntryA2 = referenceEntryA.a();
                    int iC = referenceEntryA.c() & length2;
                    if (referenceEntryA2 == null) {
                        atomicReferenceArray2.set(iC, referenceEntryA);
                    } else {
                        ReferenceEntry referenceEntry = referenceEntryA;
                        while (referenceEntryA2 != null) {
                            int iC2 = referenceEntryA2.c() & length2;
                            if (iC2 != iC) {
                                referenceEntry = referenceEntryA2;
                                iC = iC2;
                            }
                            referenceEntryA2 = referenceEntryA2.a();
                        }
                        atomicReferenceArray2.set(iC, referenceEntry);
                        while (referenceEntryA != referenceEntry) {
                            int iC3 = referenceEntryA.c() & length2;
                            ReferenceEntry referenceEntryA3 = a(referenceEntryA, (ReferenceEntry) atomicReferenceArray2.get(iC3));
                            if (referenceEntryA3 != null) {
                                atomicReferenceArray2.set(iC3, referenceEntryA3);
                            } else {
                                p(referenceEntryA);
                                i--;
                            }
                            referenceEntryA = referenceEntryA.a();
                        }
                    }
                }
            }
            this.i = atomicReferenceArray2;
            this.e = i;
        }

        public final void g(long j) {
            ReferenceEntry referenceEntry;
            RemovalCause removalCause;
            ReferenceEntry referenceEntry2;
            b();
            do {
                referenceEntry = (ReferenceEntry) this.o.peek();
                removalCause = RemovalCause.g;
                LocalCache localCache = this.d;
                if (referenceEntry == null || !localCache.e(referenceEntry, j)) {
                    do {
                        referenceEntry2 = (ReferenceEntry) this.p.peek();
                        if (referenceEntry2 == null || !localCache.e(referenceEntry2, j)) {
                            return;
                        }
                    } while (q(referenceEntry2, referenceEntry2.c(), removalCause));
                    throw new AssertionError();
                }
            } while (q(referenceEntry, referenceEntry.c(), removalCause));
            throw new AssertionError();
        }

        public final Object h(Object obj, int i, LoadingValueReference loadingValueReference, ListenableFuture listenableFuture) throws Throwable {
            Object objA;
            AbstractCache.StatsCounter statsCounter = this.q;
            try {
                objA = Uninterruptibles.a(listenableFuture);
                try {
                    if (objA == null) {
                        throw new CacheLoader.InvalidCacheLoadException("CacheLoader returned null for key " + obj + ".");
                    }
                    Stopwatch stopwatch = loadingValueReference.f;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    statsCounter.b(stopwatch.a());
                    x(obj, i, loadingValueReference, objA);
                    return objA;
                } catch (Throwable th) {
                    th = th;
                    if (objA == null) {
                        Stopwatch stopwatch2 = loadingValueReference.f;
                        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                        statsCounter.d(stopwatch2.a());
                        lock();
                        try {
                            AtomicReferenceArray atomicReferenceArray = this.i;
                            int length = (atomicReferenceArray.length() - 1) & i;
                            ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
                            ReferenceEntry referenceEntryA = referenceEntry;
                            while (true) {
                                if (referenceEntryA == null) {
                                    break;
                                }
                                Object key = referenceEntryA.getKey();
                                if (referenceEntryA.c() != i || key == null || !this.d.h.d(obj, key)) {
                                    referenceEntryA = referenceEntryA.a();
                                } else if (referenceEntryA.b() == loadingValueReference) {
                                    if (loadingValueReference.d.isActive()) {
                                        referenceEntryA.f(loadingValueReference.d);
                                    } else {
                                        atomicReferenceArray.set(length, r(referenceEntry, referenceEntryA));
                                    }
                                }
                            }
                            unlock();
                            u();
                        } catch (Throwable th2) {
                            unlock();
                            u();
                            throw th2;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                objA = null;
            }
        }

        public final ReferenceEntry i(int i, Object obj) {
            for (ReferenceEntry referenceEntryA = (ReferenceEntry) this.i.get((r0.length() - 1) & i); referenceEntryA != null; referenceEntryA = referenceEntryA.a()) {
                if (referenceEntryA.c() == i) {
                    Object key = referenceEntryA.getKey();
                    if (key == null) {
                        y();
                    } else if (this.d.h.d(obj, key)) {
                        return referenceEntryA;
                    }
                }
            }
            return null;
        }

        public final Object j(ReferenceEntry referenceEntry, long j) {
            if (referenceEntry.getKey() == null) {
                y();
                return null;
            }
            Object obj = referenceEntry.b().get();
            if (obj == null) {
                y();
                return null;
            }
            if (!this.d.e(referenceEntry, j)) {
                return obj;
            }
            if (!tryLock()) {
                return null;
            }
            try {
                g(j);
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
        
            if (r6 == false) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
        
            r11 = new com.google.common.cache.LocalCache.LoadingValueReference();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
        
            if (r10 != null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x009b, code lost:
        
            r3 = r16.d.s;
            r17.getClass();
            r10 = r3.d(r18, r16, r9, r17);
            r10.f(r11);
            r7.set(r8, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
        
            r10.f(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00b0, code lost:
        
            unlock();
            u();
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b6, code lost:
        
            if (r6 == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
        
            monitor-enter(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00bb, code lost:
        
            r0 = h(r17, r18, r11, r11.g(r17, r19));
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00c3, code lost:
        
            monitor-exit(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00c9, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00cd, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00ce, code lost:
        
            r16.q.c();
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00d3, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00d8, code lost:
        
            return z(r10, r17, r13);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object k(java.lang.Object r17, int r18, com.google.common.cache.CacheLoader r19) {
            /*
                r16 = this;
                r1 = r16
                r0 = r17
                r2 = r18
                r1.lock()
                com.google.common.cache.LocalCache r3 = r1.d     // Catch: java.lang.Throwable -> L5c
                com.google.common.base.Ticker r3 = r3.r     // Catch: java.lang.Throwable -> L5c
                long r3 = r3.a()     // Catch: java.lang.Throwable -> L5c
                r1.t(r3)     // Catch: java.lang.Throwable -> L5c
                int r5 = r1.e     // Catch: java.lang.Throwable -> L5c
                r6 = 1
                int r5 = r5 - r6
                java.util.concurrent.atomic.AtomicReferenceArray r7 = r1.i     // Catch: java.lang.Throwable -> L5c
                int r8 = r7.length()     // Catch: java.lang.Throwable -> L5c
                int r8 = r8 - r6
                r8 = r8 & r2
                java.lang.Object r9 = r7.get(r8)     // Catch: java.lang.Throwable -> L5c
                com.google.common.cache.ReferenceEntry r9 = (com.google.common.cache.ReferenceEntry) r9     // Catch: java.lang.Throwable -> L5c
                r10 = r9
            L27:
                r11 = 0
                if (r10 == 0) goto L91
                java.lang.Object r12 = r10.getKey()     // Catch: java.lang.Throwable -> L5c
                int r13 = r10.c()     // Catch: java.lang.Throwable -> L5c
                if (r13 != r2) goto L8c
                if (r12 == 0) goto L8c
                com.google.common.cache.LocalCache r13 = r1.d     // Catch: java.lang.Throwable -> L5c
                com.google.common.base.Equivalence r13 = r13.h     // Catch: java.lang.Throwable -> L5c
                boolean r13 = r13.d(r0, r12)     // Catch: java.lang.Throwable -> L5c
                if (r13 == 0) goto L8c
                com.google.common.cache.LocalCache$ValueReference r13 = r10.b()     // Catch: java.lang.Throwable -> L5c
                boolean r14 = r13.b()     // Catch: java.lang.Throwable -> L5c
                if (r14 == 0) goto L4c
                r6 = 0
                goto L92
            L4c:
                java.lang.Object r14 = r13.get()     // Catch: java.lang.Throwable -> L5c
                if (r14 != 0) goto L5f
                int r3 = r13.a()     // Catch: java.lang.Throwable -> L5c
                com.google.common.cache.RemovalCause r4 = com.google.common.cache.RemovalCause.f     // Catch: java.lang.Throwable -> L5c
                r1.d(r12, r14, r3, r4)     // Catch: java.lang.Throwable -> L5c
                goto L70
            L5c:
                r0 = move-exception
                goto Ld9
            L5f:
                com.google.common.cache.LocalCache r15 = r1.d     // Catch: java.lang.Throwable -> L5c
                boolean r15 = r15.e(r10, r3)     // Catch: java.lang.Throwable -> L5c
                if (r15 == 0) goto L7d
                int r3 = r13.a()     // Catch: java.lang.Throwable -> L5c
                com.google.common.cache.RemovalCause r4 = com.google.common.cache.RemovalCause.g     // Catch: java.lang.Throwable -> L5c
                r1.d(r12, r14, r3, r4)     // Catch: java.lang.Throwable -> L5c
            L70:
                java.util.AbstractQueue r3 = r1.o     // Catch: java.lang.Throwable -> L5c
                r3.remove(r10)     // Catch: java.lang.Throwable -> L5c
                java.util.AbstractQueue r3 = r1.p     // Catch: java.lang.Throwable -> L5c
                r3.remove(r10)     // Catch: java.lang.Throwable -> L5c
                r1.e = r5     // Catch: java.lang.Throwable -> L5c
                goto L92
            L7d:
                r1.n(r10, r3)     // Catch: java.lang.Throwable -> L5c
                com.google.common.cache.AbstractCache$StatsCounter r0 = r1.q     // Catch: java.lang.Throwable -> L5c
                r0.e()     // Catch: java.lang.Throwable -> L5c
                r1.unlock()
                r1.u()
                return r14
            L8c:
                com.google.common.cache.ReferenceEntry r10 = r10.a()     // Catch: java.lang.Throwable -> L5c
                goto L27
            L91:
                r13 = r11
            L92:
                if (r6 == 0) goto Lb0
                com.google.common.cache.LocalCache$LoadingValueReference r11 = new com.google.common.cache.LocalCache$LoadingValueReference     // Catch: java.lang.Throwable -> L5c
                r11.<init>()     // Catch: java.lang.Throwable -> L5c
                if (r10 != 0) goto Lad
                com.google.common.cache.LocalCache r3 = r1.d     // Catch: java.lang.Throwable -> L5c
                com.google.common.cache.LocalCache$EntryFactory r3 = r3.s     // Catch: java.lang.Throwable -> L5c
                r0.getClass()     // Catch: java.lang.Throwable -> L5c
                com.google.common.cache.ReferenceEntry r10 = r3.d(r2, r1, r9, r0)     // Catch: java.lang.Throwable -> L5c
                r10.f(r11)     // Catch: java.lang.Throwable -> L5c
                r7.set(r8, r10)     // Catch: java.lang.Throwable -> L5c
                goto Lb0
            Lad:
                r10.f(r11)     // Catch: java.lang.Throwable -> L5c
            Lb0:
                r1.unlock()
                r1.u()
                if (r6 == 0) goto Ld4
                monitor-enter(r10)     // Catch: java.lang.Throwable -> Lcd
                r3 = r19
                com.google.common.util.concurrent.ListenableFuture r3 = r11.g(r0, r3)     // Catch: java.lang.Throwable -> Lca
                java.lang.Object r0 = r1.h(r0, r2, r11, r3)     // Catch: java.lang.Throwable -> Lca
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lca
                com.google.common.cache.AbstractCache$StatsCounter r2 = r1.q
                r2.c()
                return r0
            Lca:
                r0 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lca
                throw r0     // Catch: java.lang.Throwable -> Lcd
            Lcd:
                r0 = move-exception
                com.google.common.cache.AbstractCache$StatsCounter r2 = r1.q
                r2.c()
                throw r0
            Ld4:
                java.lang.Object r0 = r1.z(r10, r0, r13)
                return r0
            Ld9:
                r1.unlock()
                r1.u()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.k(java.lang.Object, int, com.google.common.cache.CacheLoader):java.lang.Object");
        }

        public final void l() {
            if ((this.n.incrementAndGet() & 63) == 0) {
                t(this.d.r.a());
                u();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
        
            r11 = r2.b();
            r0 = r11.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
        
            if (r0 != null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        
            r9.g++;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        
            if (r11.isActive() == false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
        
            d(r10, r0, r11.a(), com.google.common.cache.RemovalCause.f);
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
        
            r1 = r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
        
            r1.w(r2, r10, r12, r5);
            r10 = r1.e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
        
            r10 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
        
            r1 = r9;
            r1.w(r2, r10, r12, r5);
            r10 = r1.e + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
        
            r1.e = r10;
            e(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
        
            unlock();
            u();
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
        
            r3 = r10;
            r4 = r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
        
            if (r13 == false) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
        
            n(r2, r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0096, code lost:
        
            unlock();
            u();
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
        
            r9.g++;
            d(r3, r0, r11.a(), com.google.common.cache.RemovalCause.e);
            w(r2, r3, r4, r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00af, code lost:
        
            r10 = r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
        
            e(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00b3, code lost:
        
            unlock();
            u();
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00b9, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00bf, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00c0, code lost:
        
            r11 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00d1, code lost:
        
            r3 = r10;
            r4 = r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00d4, code lost:
        
            r9.g++;
            r2 = r9.d.s.d(r11, r9, r1, r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00e3, code lost:
        
            w(r2, r3, r4, r5);
            r0.set(r7, r2);
            r9.e++;
            e(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00f3, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00d1 A[EDGE_INSN: B:75:0x00d1->B:53:0x00d1 BREAK  A[LOOP:0: B:11:0x0030->B:52:0x00cd], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object m(java.lang.Object r10, int r11, java.lang.Object r12, boolean r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 254
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.m(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object");
        }

        public final void n(ReferenceEntry referenceEntry, long j) {
            if (this.d.b()) {
                referenceEntry.m(j);
            }
            this.p.add(referenceEntry);
        }

        public final void o(ReferenceEntry referenceEntry, long j) {
            if (this.d.b()) {
                referenceEntry.m(j);
            }
            this.m.add(referenceEntry);
        }

        public final void p(ReferenceEntry referenceEntry) {
            Object key = referenceEntry.getKey();
            referenceEntry.c();
            d(key, referenceEntry.b().get(), referenceEntry.b().a(), RemovalCause.f);
            this.o.remove(referenceEntry);
            this.p.remove(referenceEntry);
        }

        public final boolean q(ReferenceEntry referenceEntry, int i, RemovalCause removalCause) {
            AtomicReferenceArray atomicReferenceArray = this.i;
            int length = i & (atomicReferenceArray.length() - 1);
            ReferenceEntry referenceEntry2 = (ReferenceEntry) atomicReferenceArray.get(length);
            for (ReferenceEntry referenceEntryA = referenceEntry2; referenceEntryA != null; referenceEntryA = referenceEntryA.a()) {
                if (referenceEntryA == referenceEntry) {
                    this.g++;
                    ReferenceEntry referenceEntryS = s(referenceEntry2, referenceEntryA, referenceEntryA.getKey(), referenceEntryA.b().get(), referenceEntryA.b(), removalCause);
                    int i2 = this.e - 1;
                    atomicReferenceArray.set(length, referenceEntryS);
                    this.e = i2;
                    return true;
                }
            }
            return false;
        }

        public final ReferenceEntry r(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
            int i = this.e;
            ReferenceEntry referenceEntryA = referenceEntry2.a();
            while (referenceEntry != referenceEntry2) {
                ReferenceEntry referenceEntryA2 = a(referenceEntry, referenceEntryA);
                if (referenceEntryA2 != null) {
                    referenceEntryA = referenceEntryA2;
                } else {
                    p(referenceEntry);
                    i--;
                }
                referenceEntry = referenceEntry.a();
            }
            this.e = i;
            return referenceEntryA;
        }

        public final ReferenceEntry s(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj, Object obj2, ValueReference valueReference, RemovalCause removalCause) {
            d(obj, obj2, valueReference.a(), removalCause);
            this.o.remove(referenceEntry2);
            this.p.remove(referenceEntry2);
            if (!valueReference.b()) {
                return r(referenceEntry, referenceEntry2);
            }
            valueReference.d(null);
            return referenceEntry;
        }

        public final void t(long j) {
            if (tryLock()) {
                try {
                    c();
                    g(j);
                    this.n.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public final void u() {
            if (isHeldByCurrentThread()) {
                return;
            }
            while (true) {
                LocalCache localCache = this.d;
                if (((RemovalNotification) localCache.p.poll()) == null) {
                    return;
                }
                try {
                    localCache.q.getClass();
                } catch (Throwable th) {
                    LocalCache.y.log(Level.WARNING, "Exception thrown by removal listener", th);
                }
            }
        }

        public final void w(ReferenceEntry referenceEntry, Object obj, Object obj2, long j) {
            ValueReference valueReferenceB = referenceEntry.b();
            LocalCache localCache = this.d;
            localCache.m.getClass();
            referenceEntry.f(localCache.k.b(1, this, referenceEntry, obj2));
            b();
            this.f++;
            if (localCache.b()) {
                referenceEntry.m(j);
            }
            if (localCache.c()) {
                referenceEntry.n(j);
            }
            this.p.add(referenceEntry);
            this.o.add(referenceEntry);
            valueReferenceB.d(obj2);
        }

        /* JADX WARN: Removed duplicated region for block: B:70:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void x(java.lang.Object r11, int r12, com.google.common.cache.LocalCache.LoadingValueReference r13, java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 234
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.x(java.lang.Object, int, com.google.common.cache.LocalCache$LoadingValueReference, java.lang.Object):void");
        }

        public final void y() {
            if (tryLock()) {
                try {
                    c();
                } finally {
                    unlock();
                }
            }
        }

        public final Object z(ReferenceEntry referenceEntry, Object obj, ValueReference valueReference) {
            AbstractCache.StatsCounter statsCounter = this.q;
            if (!valueReference.b()) {
                throw new AssertionError();
            }
            Preconditions.p("Recursive load of: %s", obj, !Thread.holdsLock(referenceEntry));
            try {
                Object objE = valueReference.e();
                if (objE != null) {
                    o(referenceEntry, this.d.r.a());
                    return objE;
                }
                throw new CacheLoader.InvalidCacheLoadException("CacheLoader returned null for key " + obj + ".");
            } finally {
                statsCounter.c();
            }
        }
    }

    public static class SoftValueReference<K, V> extends SoftReference<V> implements ValueReference<K, V> {
        public final ReferenceEntry d;

        public SoftValueReference(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            super(obj, referenceQueue);
            this.d = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int a() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean b() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final ReferenceEntry c() {
            return this.d;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final void d(Object obj) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final Object e() {
            return get();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference f(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return new SoftValueReference(referenceQueue, obj, referenceEntry);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean isActive() {
            return true;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class Strength {
        public static final AnonymousClass1 d;
        public static final AnonymousClass3 e;
        public static final /* synthetic */ Strength[] f;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.cache.LocalCache$Strength$1] */
        /* JADX WARN: Type inference failed for: r2v0, types: [com.google.common.cache.LocalCache$Strength$3] */
        static {
            ?? r0 = new Strength() { // from class: com.google.common.cache.LocalCache.Strength.1
                @Override // com.google.common.cache.LocalCache.Strength
                public final Equivalence a() {
                    return Equivalence.c();
                }

                @Override // com.google.common.cache.LocalCache.Strength
                public final ValueReference b(int i, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                    return i == 1 ? new StrongValueReference(obj) : new WeightedStrongValueReference(obj, i);
                }
            };
            d = r0;
            Strength strength = new Strength() { // from class: com.google.common.cache.LocalCache.Strength.2
                @Override // com.google.common.cache.LocalCache.Strength
                public final Equivalence a() {
                    return Equivalence.e();
                }

                @Override // com.google.common.cache.LocalCache.Strength
                public final ValueReference b(int i, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                    ReferenceQueue referenceQueue = segment.l;
                    return i == 1 ? new SoftValueReference(referenceQueue, obj, referenceEntry) : new WeightedSoftValueReference(i, referenceEntry, obj, referenceQueue);
                }
            };
            ?? r2 = new Strength() { // from class: com.google.common.cache.LocalCache.Strength.3
                @Override // com.google.common.cache.LocalCache.Strength
                public final Equivalence a() {
                    return Equivalence.e();
                }

                @Override // com.google.common.cache.LocalCache.Strength
                public final ValueReference b(int i, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                    ReferenceQueue referenceQueue = segment.l;
                    return i == 1 ? new WeakValueReference(referenceQueue, obj, referenceEntry) : new WeightedWeakValueReference(i, referenceEntry, obj, referenceQueue);
                }
            };
            e = r2;
            f = new Strength[]{r0, strength, r2};
        }

        public static Strength valueOf(String str) {
            return (Strength) Enum.valueOf(Strength.class, str);
        }

        public static Strength[] values() {
            return (Strength[]) f.clone();
        }

        public abstract Equivalence a();

        public abstract ValueReference b(int i, Segment segment, ReferenceEntry referenceEntry, Object obj);
    }

    public static final class StrongAccessEntry<K, V> extends StrongEntry<K, V> {
        public volatile long h;
        public ReferenceEntry i;
        public ReferenceEntry j;

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void d(ReferenceEntry referenceEntry) {
            this.j = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void m(long j) {
            this.h = j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry o() {
            return this.j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry q() {
            return this.i;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final long r() {
            return this.h;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void s(ReferenceEntry referenceEntry) {
            this.i = referenceEntry;
        }
    }

    public static final class StrongAccessWriteEntry<K, V> extends StrongEntry<K, V> {
        public volatile long h;
        public ReferenceEntry i;
        public ReferenceEntry j;
        public volatile long k;
        public ReferenceEntry l;
        public ReferenceEntry m;

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void d(ReferenceEntry referenceEntry) {
            this.j = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry e() {
            return this.m;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final long l() {
            return this.k;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void m(long j) {
            this.h = j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void n(long j) {
            this.k = j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry o() {
            return this.j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry p() {
            return this.l;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry q() {
            return this.i;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final long r() {
            return this.h;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void s(ReferenceEntry referenceEntry) {
            this.i = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void t(ReferenceEntry referenceEntry) {
            this.l = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void u(ReferenceEntry referenceEntry) {
            this.m = referenceEntry;
        }
    }

    public static class StrongEntry<K, V> extends AbstractReferenceEntry<K, V> {
        public final Object d;
        public final int e;
        public final ReferenceEntry f;
        public volatile ValueReference g = LocalCache.z;

        public StrongEntry(Object obj, int i, ReferenceEntry referenceEntry) {
            this.d = obj;
            this.e = i;
            this.f = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry a() {
            return this.f;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ValueReference b() {
            return this.g;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final int c() {
            return this.e;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void f(ValueReference valueReference) {
            this.g = valueReference;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final Object getKey() {
            return this.d;
        }
    }

    public static class StrongValueReference<K, V> implements ValueReference<K, V> {
        public final Object d;

        public StrongValueReference(Object obj) {
            this.d = obj;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int a() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean b() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final ReferenceEntry c() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final void d(Object obj) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final Object e() {
            return this.d;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final ValueReference f(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final Object get() {
            return this.d;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean isActive() {
            return true;
        }
    }

    public static final class StrongWriteEntry<K, V> extends StrongEntry<K, V> {
        public volatile long h;
        public ReferenceEntry i;
        public ReferenceEntry j;

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry e() {
            return this.j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final long l() {
            return this.h;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void n(long j) {
            this.h = j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry p() {
            return this.i;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void t(ReferenceEntry referenceEntry) {
            this.i = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void u(ReferenceEntry referenceEntry) {
            this.j = referenceEntry;
        }
    }

    public final class ValueIterator extends LocalCache<K, V>.HashIterator<V> {
        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public final Object next() {
            return c().e;
        }
    }

    public interface ValueReference<K, V> {
        int a();

        boolean b();

        ReferenceEntry c();

        void d(Object obj);

        Object e();

        ValueReference f(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry);

        Object get();

        boolean isActive();
    }

    public final class Values extends AbstractCollection<V> {
        public Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return LocalCache.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new ValueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return LocalCache.this.size();
        }
    }

    public static final class WeakAccessEntry<K, V> extends WeakEntry<K, V> {
        public volatile long g;
        public ReferenceEntry h;
        public ReferenceEntry i;

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void d(ReferenceEntry referenceEntry) {
            this.i = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void m(long j) {
            this.g = j;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry o() {
            return this.i;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry q() {
            return this.h;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final long r() {
            return this.g;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void s(ReferenceEntry referenceEntry) {
            this.h = referenceEntry;
        }
    }

    public static final class WeakAccessWriteEntry<K, V> extends WeakEntry<K, V> {
        public volatile long g;
        public ReferenceEntry h;
        public ReferenceEntry i;
        public volatile long j;
        public ReferenceEntry k;
        public ReferenceEntry l;

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void d(ReferenceEntry referenceEntry) {
            this.i = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry e() {
            return this.l;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final long l() {
            return this.j;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void m(long j) {
            this.g = j;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void n(long j) {
            this.j = j;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry o() {
            return this.i;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry p() {
            return this.k;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry q() {
            return this.h;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final long r() {
            return this.g;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void s(ReferenceEntry referenceEntry) {
            this.h = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void t(ReferenceEntry referenceEntry) {
            this.k = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void u(ReferenceEntry referenceEntry) {
            this.l = referenceEntry;
        }
    }

    public static class WeakEntry<K, V> extends WeakReference<K> implements ReferenceEntry<K, V> {
        public final int d;
        public final ReferenceEntry e;
        public volatile ValueReference f;

        public WeakEntry(int i, ReferenceEntry referenceEntry, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.f = LocalCache.z;
            this.d = i;
            this.e = referenceEntry;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final ReferenceEntry a() {
            return this.e;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final ValueReference b() {
            return this.f;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final int c() {
            return this.d;
        }

        public void d(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry e() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void f(ValueReference valueReference) {
            this.f = valueReference;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final Object getKey() {
            return get();
        }

        public long l() {
            throw new UnsupportedOperationException();
        }

        public void m(long j) {
            throw new UnsupportedOperationException();
        }

        public void n(long j) {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry o() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry p() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry q() {
            throw new UnsupportedOperationException();
        }

        public long r() {
            throw new UnsupportedOperationException();
        }

        public void s(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void t(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void u(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }
    }

    public static class WeakValueReference<K, V> extends WeakReference<V> implements ValueReference<K, V> {
        public final ReferenceEntry d;

        public WeakValueReference(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            super(obj, referenceQueue);
            this.d = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int a() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean b() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final ReferenceEntry c() {
            return this.d;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final void d(Object obj) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final Object e() {
            return get();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference f(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return new WeakValueReference(referenceQueue, obj, referenceEntry);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean isActive() {
            return true;
        }
    }

    public static final class WeakWriteEntry<K, V> extends WeakEntry<K, V> {
        public volatile long g;
        public ReferenceEntry h;
        public ReferenceEntry i;

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry e() {
            return this.i;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final long l() {
            return this.g;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void n(long j) {
            this.g = j;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry p() {
            return this.h;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void t(ReferenceEntry referenceEntry) {
            this.h = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void u(ReferenceEntry referenceEntry) {
            this.i = referenceEntry;
        }
    }

    public static final class WeightedSoftValueReference<K, V> extends SoftValueReference<K, V> {
        public final int e;

        public WeightedSoftValueReference(int i, ReferenceEntry referenceEntry, Object obj, ReferenceQueue referenceQueue) {
            super(referenceQueue, obj, referenceEntry);
            this.e = i;
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        public final int a() {
            return this.e;
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        public final ValueReference f(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return new WeightedSoftValueReference(this.e, referenceEntry, obj, referenceQueue);
        }
    }

    public static final class WeightedStrongValueReference<K, V> extends StrongValueReference<K, V> {
        public final int e;

        public WeightedStrongValueReference(Object obj, int i) {
            super(obj);
            this.e = i;
        }

        @Override // com.google.common.cache.LocalCache.StrongValueReference, com.google.common.cache.LocalCache.ValueReference
        public final int a() {
            return this.e;
        }
    }

    public static final class WeightedWeakValueReference<K, V> extends WeakValueReference<K, V> {
        public final int e;

        public WeightedWeakValueReference(int i, ReferenceEntry referenceEntry, Object obj, ReferenceQueue referenceQueue) {
            super(referenceQueue, obj, referenceEntry);
            this.e = i;
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        public final int a() {
            return this.e;
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        public final ValueReference f(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return new WeightedWeakValueReference(this.e, referenceEntry, obj, referenceQueue);
        }
    }

    public static final class WriteQueue<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {
        public final AnonymousClass1 d;

        /* renamed from: com.google.common.cache.LocalCache$WriteQueue$1, reason: invalid class name */
        public class AnonymousClass1 extends AbstractReferenceEntry<K, V> {
            public ReferenceEntry d;
            public ReferenceEntry e;

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final ReferenceEntry e() {
                return this.e;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final long l() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final void n(long j) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final ReferenceEntry p() {
                return this.d;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final void t(ReferenceEntry referenceEntry) {
                this.d = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final void u(ReferenceEntry referenceEntry) {
                this.e = referenceEntry;
            }
        }

        public WriteQueue() {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            anonymousClass1.d = anonymousClass1;
            anonymousClass1.e = anonymousClass1;
            this.d = anonymousClass1;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            AnonymousClass1 anonymousClass1 = this.d;
            ReferenceEntry referenceEntry = anonymousClass1.d;
            while (referenceEntry != anonymousClass1) {
                ReferenceEntry referenceEntryP = referenceEntry.p();
                Logger logger = LocalCache.y;
                NullEntry nullEntry = NullEntry.d;
                referenceEntry.t(nullEntry);
                referenceEntry.u(nullEntry);
                referenceEntry = referenceEntryP;
            }
            anonymousClass1.d = anonymousClass1;
            anonymousClass1.e = anonymousClass1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return ((ReferenceEntry) obj).p() != NullEntry.d;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            AnonymousClass1 anonymousClass1 = this.d;
            return anonymousClass1.d == anonymousClass1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            AnonymousClass1 anonymousClass1 = this.d;
            ReferenceEntry referenceEntry = anonymousClass1.d;
            if (referenceEntry == anonymousClass1) {
                referenceEntry = null;
            }
            return new AbstractSequentialIterator<ReferenceEntry<Object, Object>>(referenceEntry) { // from class: com.google.common.cache.LocalCache.WriteQueue.2
                @Override // com.google.common.collect.AbstractSequentialIterator
                public final Object a(Object obj) {
                    ReferenceEntry referenceEntryP = ((ReferenceEntry) obj).p();
                    if (referenceEntryP == WriteQueue.this.d) {
                        return null;
                    }
                    return referenceEntryP;
                }
            };
        }

        @Override // java.util.Queue
        public final boolean offer(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry referenceEntryE = referenceEntry.e();
            ReferenceEntry referenceEntryP = referenceEntry.p();
            Logger logger = LocalCache.y;
            referenceEntryE.t(referenceEntryP);
            referenceEntryP.u(referenceEntryE);
            AnonymousClass1 anonymousClass1 = this.d;
            ReferenceEntry referenceEntry2 = anonymousClass1.e;
            referenceEntry2.t(referenceEntry);
            referenceEntry.u(referenceEntry2);
            referenceEntry.t(anonymousClass1);
            anonymousClass1.e = referenceEntry;
            return true;
        }

        @Override // java.util.Queue
        public final Object peek() {
            AnonymousClass1 anonymousClass1 = this.d;
            ReferenceEntry referenceEntry = anonymousClass1.d;
            if (referenceEntry == anonymousClass1) {
                return null;
            }
            return referenceEntry;
        }

        @Override // java.util.Queue
        public final Object poll() {
            AnonymousClass1 anonymousClass1 = this.d;
            ReferenceEntry referenceEntry = anonymousClass1.d;
            if (referenceEntry == anonymousClass1) {
                return null;
            }
            remove(referenceEntry);
            return referenceEntry;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry referenceEntryE = referenceEntry.e();
            ReferenceEntry referenceEntryP = referenceEntry.p();
            Logger logger = LocalCache.y;
            referenceEntryE.t(referenceEntryP);
            referenceEntryP.u(referenceEntryE);
            NullEntry nullEntry = NullEntry.d;
            referenceEntry.t(nullEntry);
            referenceEntry.u(nullEntry);
            return referenceEntryP != nullEntry;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            AnonymousClass1 anonymousClass1 = this.d;
            int i = 0;
            for (ReferenceEntry referenceEntryP = anonymousClass1.d; referenceEntryP != anonymousClass1; referenceEntryP = referenceEntryP.p()) {
                i++;
            }
            return i;
        }
    }

    public final class WriteThroughEntry implements Map.Entry<K, V> {
        public final Object d;
        public Object e;

        public WriteThroughEntry(Object obj, Object obj2) {
            this.d = obj;
            this.e = obj2;
        }

        @Override // java.util.Map.Entry
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

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.d.hashCode() ^ this.e.hashCode();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            Object objPut = LocalCache.this.put(this.d, obj);
            this.e = obj;
            return objPut;
        }

        public final String toString() {
            return this.d + "=" + this.e;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.common.cache.LocalCache, java.util.AbstractMap] */
    public LocalCache(CacheBuilder cacheBuilder, CacheLoader cacheLoader) {
        ?? abstractMap = new AbstractMap();
        int i = cacheBuilder.b;
        Supplier supplier = cacheBuilder.n;
        abstractMap.g = Math.min(i == -1 ? 4 : i, 65536);
        Strength strength = cacheBuilder.f;
        Strength.AnonymousClass1 anonymousClass1 = Strength.d;
        Strength strength2 = (Strength) MoreObjects.a(strength, anonymousClass1);
        abstractMap.j = strength2;
        abstractMap.k = (Strength) MoreObjects.a(cacheBuilder.g, anonymousClass1);
        abstractMap.h = (Equivalence) MoreObjects.a(cacheBuilder.j, ((Strength) MoreObjects.a(cacheBuilder.f, anonymousClass1)).a());
        abstractMap.i = (Equivalence) MoreObjects.a(cacheBuilder.k, ((Strength) MoreObjects.a(cacheBuilder.g, anonymousClass1)).a());
        long j = (cacheBuilder.h == 0 || cacheBuilder.i == 0) ? 0L : cacheBuilder.e == null ? cacheBuilder.c : cacheBuilder.d;
        abstractMap.l = j;
        Weigher weigher = cacheBuilder.e;
        CacheBuilder.OneWeigher oneWeigher = CacheBuilder.OneWeigher.d;
        Weigher weigher2 = (Weigher) MoreObjects.a(weigher, oneWeigher);
        abstractMap.m = weigher2;
        long j2 = cacheBuilder.i;
        abstractMap.n = j2 == -1 ? 0L : j2;
        long j3 = cacheBuilder.h;
        abstractMap.o = j3 != -1 ? j3 : 0L;
        RemovalListener removalListener = cacheBuilder.l;
        CacheBuilder.NullListener nullListener = CacheBuilder.NullListener.d;
        RemovalListener removalListener2 = (RemovalListener) MoreObjects.a(removalListener, nullListener);
        abstractMap.q = removalListener2;
        abstractMap.p = (AbstractQueue) (removalListener2 == nullListener ? A : new ConcurrentLinkedQueue());
        int i2 = 0;
        int i3 = 1;
        boolean z2 = abstractMap.c() || abstractMap.b();
        Ticker ticker = cacheBuilder.m;
        abstractMap.r = ticker == null ? z2 ? Ticker.f14871a : CacheBuilder.p : ticker;
        abstractMap.s = EntryFactory.d[((abstractMap.b() || abstractMap.a() || abstractMap.b()) ? (char) 1 : (char) 0) | (strength2 != Strength.e ? (char) 0 : (char) 4) | (abstractMap.c() || abstractMap.c() ? 2 : 0)];
        abstractMap.t = (AbstractCache.StatsCounter) supplier.get();
        abstractMap.u = cacheLoader;
        int iMin = Math.min(16, 1073741824);
        if (abstractMap.a() && weigher2 == oneWeigher) {
            iMin = (int) Math.min(iMin, j);
        }
        int i4 = 0;
        int i5 = 1;
        while (i5 < abstractMap.g && (!abstractMap.a() || i5 * 20 <= abstractMap.l)) {
            i4++;
            i5 <<= 1;
        }
        abstractMap.e = 32 - i4;
        abstractMap.d = i5 - 1;
        abstractMap.f = new Segment[i5];
        int i6 = iMin / i5;
        while (i3 < (i6 * i5 < iMin ? i6 + 1 : i6)) {
            i3 <<= 1;
        }
        if (abstractMap.a()) {
            long j4 = abstractMap.l;
            long j5 = i5;
            long j6 = (j4 / j5) + 1;
            long j7 = j4 % j5;
            while (true) {
                Segment[] segmentArr = abstractMap.f;
                if (i2 >= segmentArr.length) {
                    return;
                }
                if (i2 == j7) {
                    j6--;
                }
                long j8 = j6;
                segmentArr[i2] = new Segment(abstractMap, i3, j8, (AbstractCache.StatsCounter) supplier.get());
                i2++;
                j6 = j8;
            }
        } else {
            int i7 = i3;
            LocalCache<K, V> localCache = abstractMap;
            while (true) {
                Segment[] segmentArr2 = localCache.f;
                if (i2 >= segmentArr2.length) {
                    return;
                }
                segmentArr2[i2] = new Segment(localCache, i7, -1L, (AbstractCache.StatsCounter) supplier.get());
                i2++;
                localCache = this;
            }
        }
    }

    public final boolean a() {
        return this.l >= 0;
    }

    public final boolean b() {
        return this.n > 0;
    }

    public final boolean c() {
        return this.o > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Strength.AnonymousClass1 anonymousClass1 = Strength.d;
        for (Segment segment : this.f) {
            if (segment.e != 0) {
                segment.lock();
                try {
                    segment.t(segment.d.r.a());
                    AtomicReferenceArray atomicReferenceArray = segment.i;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        for (ReferenceEntry referenceEntryA = (ReferenceEntry) atomicReferenceArray.get(i); referenceEntryA != null; referenceEntryA = referenceEntryA.a()) {
                            if (referenceEntryA.b().isActive()) {
                                Object key = referenceEntryA.getKey();
                                Object obj = referenceEntryA.b().get();
                                RemovalCause removalCause = (key == null || obj == null) ? RemovalCause.f : RemovalCause.d;
                                referenceEntryA.c();
                                segment.d(key, obj, referenceEntryA.b().a(), removalCause);
                            }
                        }
                    }
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    LocalCache localCache = segment.d;
                    if (localCache.j != anonymousClass1) {
                        while (segment.k.poll() != null) {
                        }
                    }
                    if (localCache.k != anonymousClass1) {
                        while (segment.l.poll() != null) {
                        }
                    }
                    segment.o.clear();
                    segment.p.clear();
                    segment.n.set(0);
                    segment.g++;
                    segment.e = 0;
                    segment.unlock();
                    segment.u();
                } catch (Throwable th) {
                    segment.unlock();
                    segment.u();
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044 A[Catch: all -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:6:0x000f, B:8:0x0013, B:24:0x0044, B:11:0x0023, B:13:0x002b, B:16:0x0034, B:19:0x003a, B:20:0x003d, B:15:0x0031), top: B:35:0x000f, inners: #1 }] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsKey(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            int r1 = r6.d(r7)
            com.google.common.cache.LocalCache$Segment r2 = r6.f(r1)
            r2.getClass()
            int r3 = r2.e     // Catch: java.lang.Throwable -> L53
            if (r3 == 0) goto L55
            com.google.common.cache.LocalCache r3 = r2.d     // Catch: java.lang.Throwable -> L53
            com.google.common.base.Ticker r3 = r3.r     // Catch: java.lang.Throwable -> L53
            long r3 = r3.a()     // Catch: java.lang.Throwable -> L53
            com.google.common.cache.ReferenceEntry r7 = r2.i(r1, r7)     // Catch: java.lang.Throwable -> L53
            r1 = 0
            if (r7 != 0) goto L23
            goto L37
        L23:
            com.google.common.cache.LocalCache r5 = r2.d     // Catch: java.lang.Throwable -> L53
            boolean r5 = r5.e(r7, r3)     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L3e
            boolean r7 = r2.tryLock()     // Catch: java.lang.Throwable -> L53
            if (r7 == 0) goto L37
            r2.g(r3)     // Catch: java.lang.Throwable -> L39
            r2.unlock()     // Catch: java.lang.Throwable -> L53
        L37:
            r7 = r1
            goto L3e
        L39:
            r7 = move-exception
            r2.unlock()     // Catch: java.lang.Throwable -> L53
            throw r7     // Catch: java.lang.Throwable -> L53
        L3e:
            if (r7 != 0) goto L44
            r2.l()
            return r0
        L44:
            com.google.common.cache.LocalCache$ValueReference r7 = r7.b()     // Catch: java.lang.Throwable -> L53
            java.lang.Object r7 = r7.get()     // Catch: java.lang.Throwable -> L53
            if (r7 == 0) goto L4f
            r0 = 1
        L4f:
            r2.l()
            return r0
        L53:
            r7 = move-exception
            goto L59
        L55:
            r2.l()
            return r0
        L59:
            r2.l()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.containsKey(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.concurrent.atomic.AtomicReferenceArray] */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        boolean z2 = false;
        if (obj == null) {
            return false;
        }
        long jA = this.r.a();
        Segment[] segmentArr = this.f;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = segmentArr.length;
            long j2 = 0;
            for (?? r12 = z2; r12 < length; r12++) {
                Segment segment = segmentArr[r12];
                int i2 = segment.e;
                ?? r14 = segment.i;
                boolean z3 = z2;
                for (?? r15 = z3; r15 < r14.length(); r15++) {
                    ReferenceEntry referenceEntryA = (ReferenceEntry) r14.get(r15);
                    while (referenceEntryA != null) {
                        Segment[] segmentArr2 = segmentArr;
                        Object objJ = segment.j(referenceEntryA, jA);
                        ReferenceEntry referenceEntry = referenceEntryA;
                        if (objJ != null && this.i.d(obj, objJ)) {
                            return true;
                        }
                        referenceEntryA = referenceEntry.a();
                        segmentArr = segmentArr2;
                    }
                }
                j2 += segment.g;
                z2 = z3;
            }
            boolean z4 = z2;
            Segment[] segmentArr3 = segmentArr;
            if (j2 == j) {
                return z4;
            }
            i++;
            j = j2;
            z2 = z4;
            segmentArr = segmentArr3;
        }
        return z2;
    }

    public final int d(Object obj) {
        int iB;
        Equivalence equivalence = this.h;
        if (obj == null) {
            equivalence.getClass();
            iB = 0;
        } else {
            iB = equivalence.b(obj);
        }
        int i = iB + ((iB << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = (i4 << 2) + (i4 << 14) + i4;
        return (i5 >>> 16) ^ i5;
    }

    public final boolean e(ReferenceEntry referenceEntry, long j) {
        referenceEntry.getClass();
        if (!b() || j - referenceEntry.r() < this.n) {
            return c() && j - referenceEntry.l() >= this.o;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.x;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.x = entrySet;
        return entrySet;
    }

    public final Segment f(int i) {
        return this.f[(i >>> this.e) & this.d];
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043 A[Catch: all -> 0x005e, TRY_ENTER, TryCatch #1 {all -> 0x005e, blocks: (B:6:0x000f, B:8:0x0013, B:24:0x0043, B:26:0x004d, B:31:0x0060, B:11:0x0022, B:13:0x002a, B:16:0x0033, B:19:0x0039, B:20:0x003c, B:15:0x0030), top: B:38:0x000f, inners: #0 }] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            int r1 = r5.d(r6)
            com.google.common.cache.LocalCache$Segment r2 = r5.f(r1)
            r2.getClass()
            int r3 = r2.e     // Catch: java.lang.Throwable -> L5e
            if (r3 == 0) goto L63
            com.google.common.cache.LocalCache r3 = r2.d     // Catch: java.lang.Throwable -> L5e
            com.google.common.base.Ticker r3 = r3.r     // Catch: java.lang.Throwable -> L5e
            long r3 = r3.a()     // Catch: java.lang.Throwable -> L5e
            com.google.common.cache.ReferenceEntry r6 = r2.i(r1, r6)     // Catch: java.lang.Throwable -> L5e
            if (r6 != 0) goto L22
            goto L36
        L22:
            com.google.common.cache.LocalCache r1 = r2.d     // Catch: java.lang.Throwable -> L5e
            boolean r1 = r1.e(r6, r3)     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto L3d
            boolean r6 = r2.tryLock()     // Catch: java.lang.Throwable -> L5e
            if (r6 == 0) goto L36
            r2.g(r3)     // Catch: java.lang.Throwable -> L38
            r2.unlock()     // Catch: java.lang.Throwable -> L5e
        L36:
            r6 = r0
            goto L3d
        L38:
            r6 = move-exception
            r2.unlock()     // Catch: java.lang.Throwable -> L5e
            throw r6     // Catch: java.lang.Throwable -> L5e
        L3d:
            if (r6 != 0) goto L43
            r2.l()
            return r0
        L43:
            com.google.common.cache.LocalCache$ValueReference r1 = r6.b()     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto L60
            r2.o(r6, r3)     // Catch: java.lang.Throwable -> L5e
            r6.getKey()     // Catch: java.lang.Throwable -> L5e
            com.google.common.cache.LocalCache r6 = r2.d     // Catch: java.lang.Throwable -> L5e
            com.google.common.cache.CacheLoader r0 = r6.u     // Catch: java.lang.Throwable -> L5e
            r6.getClass()     // Catch: java.lang.Throwable -> L5e
            r2.l()
            return r1
        L5e:
            r6 = move-exception
            goto L67
        L60:
            r2.y()     // Catch: java.lang.Throwable -> L5e
        L63:
            r2.l()
            return r0
        L67:
            r2.l()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        Segment[] segmentArr = this.f;
        long j = 0;
        for (Segment segment : segmentArr) {
            if (segment.e != 0) {
                return false;
            }
            j += r8.g;
        }
        if (j == 0) {
            return true;
        }
        for (Segment segment2 : segmentArr) {
            if (segment2.e != 0) {
                return false;
            }
            j -= r9.g;
        }
        return j == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.v;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.v = keySet;
        return keySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iD = d(obj);
        return f(iD).m(obj, iD, obj2, false);
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
        int iD = d(obj);
        return f(iD).m(obj, iD, obj2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        r7 = r4.b();
        r6 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r6 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        r12 = com.google.common.cache.RemovalCause.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r7.isActive() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        r12 = com.google.common.cache.RemovalCause.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        r2.g++;
        r12 = r2.s(r3, r4, r5, r6, r7, r8);
        r0 = r2.e - 1;
        r9.set(r10, r12);
        r2.e = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r2.unlock();
        r2.u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        return r6;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object remove(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 0
            if (r12 != 0) goto L4
            return r0
        L4:
            int r1 = r11.d(r12)
            com.google.common.cache.LocalCache$Segment r2 = r11.f(r1)
            r2.lock()
            com.google.common.cache.LocalCache r3 = r2.d     // Catch: java.lang.Throwable -> L51
            com.google.common.base.Ticker r3 = r3.r     // Catch: java.lang.Throwable -> L51
            long r3 = r3.a()     // Catch: java.lang.Throwable -> L51
            r2.t(r3)     // Catch: java.lang.Throwable -> L51
            java.util.concurrent.atomic.AtomicReferenceArray r9 = r2.i     // Catch: java.lang.Throwable -> L51
            int r3 = r9.length()     // Catch: java.lang.Throwable -> L51
            int r3 = r3 + (-1)
            r10 = r1 & r3
            java.lang.Object r3 = r9.get(r10)     // Catch: java.lang.Throwable -> L51
            com.google.common.cache.ReferenceEntry r3 = (com.google.common.cache.ReferenceEntry) r3     // Catch: java.lang.Throwable -> L51
            r4 = r3
        L2b:
            if (r4 == 0) goto L77
            java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Throwable -> L51
            int r6 = r4.c()     // Catch: java.lang.Throwable -> L51
            if (r6 != r1) goto L7e
            if (r5 == 0) goto L7e
            com.google.common.cache.LocalCache r6 = r2.d     // Catch: java.lang.Throwable -> L51
            com.google.common.base.Equivalence r6 = r6.h     // Catch: java.lang.Throwable -> L51
            boolean r6 = r6.d(r12, r5)     // Catch: java.lang.Throwable -> L51
            if (r6 == 0) goto L7e
            com.google.common.cache.LocalCache$ValueReference r7 = r4.b()     // Catch: java.lang.Throwable -> L51
            java.lang.Object r6 = r7.get()     // Catch: java.lang.Throwable -> L51
            if (r6 == 0) goto L54
            com.google.common.cache.RemovalCause r12 = com.google.common.cache.RemovalCause.d     // Catch: java.lang.Throwable -> L51
        L4f:
            r8 = r12
            goto L5d
        L51:
            r0 = move-exception
            r12 = r0
            goto L83
        L54:
            boolean r12 = r7.isActive()     // Catch: java.lang.Throwable -> L51
            if (r12 == 0) goto L77
            com.google.common.cache.RemovalCause r12 = com.google.common.cache.RemovalCause.f     // Catch: java.lang.Throwable -> L51
            goto L4f
        L5d:
            int r12 = r2.g     // Catch: java.lang.Throwable -> L51
            int r12 = r12 + 1
            r2.g = r12     // Catch: java.lang.Throwable -> L51
            com.google.common.cache.ReferenceEntry r12 = r2.s(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L51
            int r0 = r2.e     // Catch: java.lang.Throwable -> L51
            int r0 = r0 + (-1)
            r9.set(r10, r12)     // Catch: java.lang.Throwable -> L51
            r2.e = r0     // Catch: java.lang.Throwable -> L51
            r2.unlock()
            r2.u()
            return r6
        L77:
            r2.unlock()
            r2.u()
            return r0
        L7e:
            com.google.common.cache.ReferenceEntry r4 = r4.a()     // Catch: java.lang.Throwable -> L51
            goto L2b
        L83:
            r2.unlock()
            r2.u()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.remove(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        return null;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object replace(java.lang.Object r14, java.lang.Object r15) {
        /*
            r13 = this;
            r14.getClass()
            r15.getClass()
            int r0 = r13.d(r14)
            com.google.common.cache.LocalCache$Segment r1 = r13.f(r0)
            r1.lock()
            com.google.common.cache.LocalCache r2 = r1.d     // Catch: java.lang.Throwable -> L6d
            com.google.common.base.Ticker r2 = r2.r     // Catch: java.lang.Throwable -> L6d
            long r5 = r2.a()     // Catch: java.lang.Throwable -> L6d
            r1.t(r5)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r1.i     // Catch: java.lang.Throwable -> L6d
            int r2 = r8.length()     // Catch: java.lang.Throwable -> L6d
            int r2 = r2 + (-1)
            r9 = r0 & r2
            java.lang.Object r2 = r8.get(r9)     // Catch: java.lang.Throwable -> L6d
            com.google.common.cache.ReferenceEntry r2 = (com.google.common.cache.ReferenceEntry) r2     // Catch: java.lang.Throwable -> L6d
            r3 = r2
        L2d:
            r10 = 0
            if (r3 == 0) goto L70
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L6d
            int r7 = r3.c()     // Catch: java.lang.Throwable -> L6d
            if (r7 != r0) goto L98
            if (r4 == 0) goto L98
            com.google.common.cache.LocalCache r7 = r1.d     // Catch: java.lang.Throwable -> L6d
            com.google.common.base.Equivalence r7 = r7.h     // Catch: java.lang.Throwable -> L6d
            boolean r7 = r7.d(r14, r4)     // Catch: java.lang.Throwable -> L6d
            if (r7 == 0) goto L98
            r11 = r5
            com.google.common.cache.LocalCache$ValueReference r6 = r3.b()     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r5 = r6.get()     // Catch: java.lang.Throwable -> L6d
            if (r5 != 0) goto L77
            boolean r14 = r6.isActive()     // Catch: java.lang.Throwable -> L6d
            if (r14 == 0) goto L70
            int r14 = r1.g     // Catch: java.lang.Throwable -> L6d
            int r14 = r14 + 1
            r1.g = r14     // Catch: java.lang.Throwable -> L6d
            com.google.common.cache.RemovalCause r7 = com.google.common.cache.RemovalCause.f     // Catch: java.lang.Throwable -> L6d
            com.google.common.cache.ReferenceEntry r14 = r1.s(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L6d
            int r15 = r1.e     // Catch: java.lang.Throwable -> L6d
            int r15 = r15 + (-1)
            r8.set(r9, r14)     // Catch: java.lang.Throwable -> L6d
            r1.e = r15     // Catch: java.lang.Throwable -> L6d
            goto L70
        L6d:
            r0 = move-exception
            r14 = r0
            goto La6
        L70:
            r1.unlock()
            r1.u()
            return r10
        L77:
            r2 = r3
            r0 = r5
            int r3 = r1.g     // Catch: java.lang.Throwable -> L6d
            int r3 = r3 + 1
            r1.g = r3     // Catch: java.lang.Throwable -> L6d
            int r3 = r6.a()     // Catch: java.lang.Throwable -> L6d
            com.google.common.cache.RemovalCause r4 = com.google.common.cache.RemovalCause.e     // Catch: java.lang.Throwable -> L6d
            r1.d(r14, r0, r3, r4)     // Catch: java.lang.Throwable -> L6d
            r3 = r14
            r4 = r15
            r5 = r11
            r1.w(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L6d
            r1.e(r2)     // Catch: java.lang.Throwable -> L6d
            r1.unlock()
            r1.u()
            return r0
        L98:
            r4 = r3
            r3 = r14
            r14 = r2
            r2 = r4
            r4 = r15
            com.google.common.cache.ReferenceEntry r15 = r2.a()     // Catch: java.lang.Throwable -> L6d
            r2 = r14
            r14 = r3
            r3 = r15
            r15 = r4
            goto L2d
        La6:
            r1.unlock()
            r1.u()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.replace(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long jMax = 0;
        for (int i = 0; i < this.f.length; i++) {
            jMax += Math.max(0, r0[i].e);
        }
        return Ints.e(jMax);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.w;
        if (collection != null) {
            return collection;
        }
        Values values = new Values();
        this.w = values;
        return values;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        r7 = r4.b();
        r6 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (r2.d.i.d(r15, r6) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (r6 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r7.isActive() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        r8 = com.google.common.cache.RemovalCause.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        r2.g++;
        r14 = r2.s(r3, r4, r5, r6, r7, r8);
        r15 = r2.e - 1;
        r10.set(r12, r14);
        r2.e = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r8 != r9) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        r0 = true;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(java.lang.Object r14, java.lang.Object r15) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L91
            if (r15 != 0) goto L7
            goto L91
        L7:
            int r1 = r13.d(r14)
            com.google.common.cache.LocalCache$Segment r2 = r13.f(r1)
            com.google.common.cache.RemovalCause r9 = com.google.common.cache.RemovalCause.d
            r2.lock()
            com.google.common.cache.LocalCache r3 = r2.d     // Catch: java.lang.Throwable -> L82
            com.google.common.base.Ticker r3 = r3.r     // Catch: java.lang.Throwable -> L82
            long r3 = r3.a()     // Catch: java.lang.Throwable -> L82
            r2.t(r3)     // Catch: java.lang.Throwable -> L82
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r2.i     // Catch: java.lang.Throwable -> L82
            int r3 = r10.length()     // Catch: java.lang.Throwable -> L82
            r11 = 1
            int r3 = r3 - r11
            r12 = r1 & r3
            java.lang.Object r3 = r10.get(r12)     // Catch: java.lang.Throwable -> L82
            com.google.common.cache.ReferenceEntry r3 = (com.google.common.cache.ReferenceEntry) r3     // Catch: java.lang.Throwable -> L82
            r4 = r3
        L30:
            if (r4 == 0) goto L7b
            java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Throwable -> L82
            int r6 = r4.c()     // Catch: java.lang.Throwable -> L82
            if (r6 != r1) goto L85
            if (r5 == 0) goto L85
            com.google.common.cache.LocalCache r6 = r2.d     // Catch: java.lang.Throwable -> L82
            com.google.common.base.Equivalence r6 = r6.h     // Catch: java.lang.Throwable -> L82
            boolean r6 = r6.d(r14, r5)     // Catch: java.lang.Throwable -> L82
            if (r6 == 0) goto L85
            com.google.common.cache.LocalCache$ValueReference r7 = r4.b()     // Catch: java.lang.Throwable -> L82
            java.lang.Object r6 = r7.get()     // Catch: java.lang.Throwable -> L82
            com.google.common.cache.LocalCache r14 = r2.d     // Catch: java.lang.Throwable -> L82
            com.google.common.base.Equivalence r14 = r14.i     // Catch: java.lang.Throwable -> L82
            boolean r14 = r14.d(r15, r6)     // Catch: java.lang.Throwable -> L82
            if (r14 == 0) goto L5c
            r8 = r9
            goto L67
        L5c:
            if (r6 != 0) goto L7b
            boolean r14 = r7.isActive()     // Catch: java.lang.Throwable -> L82
            if (r14 == 0) goto L7b
            com.google.common.cache.RemovalCause r14 = com.google.common.cache.RemovalCause.f     // Catch: java.lang.Throwable -> L82
            r8 = r14
        L67:
            int r14 = r2.g     // Catch: java.lang.Throwable -> L82
            int r14 = r14 + r11
            r2.g = r14     // Catch: java.lang.Throwable -> L82
            com.google.common.cache.ReferenceEntry r14 = r2.s(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L82
            int r15 = r2.e     // Catch: java.lang.Throwable -> L82
            int r15 = r15 - r11
            r10.set(r12, r14)     // Catch: java.lang.Throwable -> L82
            r2.e = r15     // Catch: java.lang.Throwable -> L82
            if (r8 != r9) goto L7b
            r0 = r11
        L7b:
            r2.unlock()
            r2.u()
            return r0
        L82:
            r0 = move-exception
            r14 = r0
            goto L8a
        L85:
            com.google.common.cache.ReferenceEntry r4 = r4.a()     // Catch: java.lang.Throwable -> L82
            goto L30
        L8a:
            r2.unlock()
            r2.u()
            throw r14
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.remove(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        r13 = r10.b();
        r12 = r13.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        if (r12 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        if (r13.isActive() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        r8.g++;
        r0 = r8.s(r10, r10, r11, r12, r13, com.google.common.cache.RemovalCause.f);
        r2 = r8.e - 1;
        r4.set(r12, r0);
        r8.e = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        if (r8.d.i.d(r18, r12) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        r8.g++;
        r8.d(r3, r12, r13.a(), com.google.common.cache.RemovalCause.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
    
        r8.w(r2, r3, r19, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        r8.e(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        r8.unlock();
        r8.u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ab, code lost:
    
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ae, code lost:
    
        r8.n(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
    
        r8.unlock();
        r8.u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c2, code lost:
    
        throw r0;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean replace(java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) throws java.lang.Throwable {
        /*
            r16 = this;
            r3 = r17
            r0 = r18
            r3.getClass()
            r19.getClass()
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            int r2 = r16.d(r17)
            r7 = r16
            com.google.common.cache.LocalCache$Segment r8 = r7.f(r2)
            r8.lock()
            com.google.common.cache.LocalCache r4 = r8.d     // Catch: java.lang.Throwable -> L76
            com.google.common.base.Ticker r4 = r4.r     // Catch: java.lang.Throwable -> L76
            long r5 = r4.a()     // Catch: java.lang.Throwable -> L76
            r8.t(r5)     // Catch: java.lang.Throwable -> L76
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r8.i     // Catch: java.lang.Throwable -> L76
            int r9 = r4.length()     // Catch: java.lang.Throwable -> L76
            r15 = 1
            int r9 = r9 - r15
            r9 = r9 & r2
            java.lang.Object r10 = r4.get(r9)     // Catch: java.lang.Throwable -> L76
            com.google.common.cache.ReferenceEntry r10 = (com.google.common.cache.ReferenceEntry) r10     // Catch: java.lang.Throwable -> L76
            r11 = r9
            r9 = r10
        L37:
            if (r10 == 0) goto L78
            r12 = r11
            java.lang.Object r11 = r10.getKey()     // Catch: java.lang.Throwable -> L76
            int r13 = r10.c()     // Catch: java.lang.Throwable -> L76
            if (r13 != r2) goto Lb2
            if (r11 == 0) goto Lb2
            com.google.common.cache.LocalCache r13 = r8.d     // Catch: java.lang.Throwable -> L76
            com.google.common.base.Equivalence r13 = r13.h     // Catch: java.lang.Throwable -> L76
            boolean r13 = r13.d(r3, r11)     // Catch: java.lang.Throwable -> L76
            if (r13 == 0) goto Lb2
            com.google.common.cache.LocalCache$ValueReference r13 = r10.b()     // Catch: java.lang.Throwable -> L76
            r2 = r12
            java.lang.Object r12 = r13.get()     // Catch: java.lang.Throwable -> L76
            if (r12 != 0) goto L7f
            boolean r0 = r13.isActive()     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L78
            int r0 = r8.g     // Catch: java.lang.Throwable -> L76
            int r0 = r0 + r15
            r8.g = r0     // Catch: java.lang.Throwable -> L76
            com.google.common.cache.RemovalCause r14 = com.google.common.cache.RemovalCause.f     // Catch: java.lang.Throwable -> L76
            r3 = r2
            com.google.common.cache.ReferenceEntry r0 = r8.s(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L76
            int r2 = r8.e     // Catch: java.lang.Throwable -> L76
            int r2 = r2 - r15
            r4.set(r3, r0)     // Catch: java.lang.Throwable -> L76
            r8.e = r2     // Catch: java.lang.Throwable -> L76
            goto L78
        L76:
            r0 = move-exception
            goto Lbc
        L78:
            r8.unlock()
            r8.u()
            return r1
        L7f:
            r2 = r10
            com.google.common.cache.LocalCache r4 = r8.d     // Catch: java.lang.Throwable -> L76
            com.google.common.base.Equivalence r4 = r4.i     // Catch: java.lang.Throwable -> L76
            boolean r0 = r4.d(r0, r12)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto Lad
            int r0 = r8.g     // Catch: java.lang.Throwable -> L76
            int r0 = r0 + r15
            r8.g = r0     // Catch: java.lang.Throwable -> L76
            int r0 = r13.a()     // Catch: java.lang.Throwable -> L76
            com.google.common.cache.RemovalCause r1 = com.google.common.cache.RemovalCause.e     // Catch: java.lang.Throwable -> L76
            r8.d(r3, r12, r0, r1)     // Catch: java.lang.Throwable -> L76
            r4 = r19
            r1 = r8
            r1.w(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Laa
            r8 = r1
            r10 = r2
            r8.e(r10)     // Catch: java.lang.Throwable -> L76
            r8.unlock()
            r8.u()
            return r15
        Laa:
            r0 = move-exception
            r8 = r1
            goto Lbc
        Lad:
            r10 = r2
            r8.n(r10, r5)     // Catch: java.lang.Throwable -> L76
            goto L78
        Lb2:
            r3 = r12
            com.google.common.cache.ReferenceEntry r10 = r10.a()     // Catch: java.lang.Throwable -> L76
            r11 = r3
            r3 = r17
            goto L37
        Lbc:
            r8.unlock()
            r8.u()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.replace(java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }
}
