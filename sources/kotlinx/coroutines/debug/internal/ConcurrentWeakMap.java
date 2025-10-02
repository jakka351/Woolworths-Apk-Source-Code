package kotlinx.coroutines.debug.internal;

import com.salesforce.marketingcloud.storage.db.i;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0003\n\u000b\fR\u000b\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004R!\u0010\t\u001a\u0018\u0012\u0014\u0012\u00120\bR\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\u00078\u0002X\u0082\u0004¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "", "K", "V", "Lkotlin/collections/AbstractMutableMap;", "Lkotlinx/atomicfu/AtomicInt;", "_size", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;", "core", "Core", "Entry", "KeyValueSet", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ConcurrentWeakMap<K, V> extends AbstractMutableMap<K, V> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(ConcurrentWeakMap.class, "_size$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(ConcurrentWeakMap.class, Object.class, "core$volatile");
    private volatile /* synthetic */ int _size$volatile;
    private volatile /* synthetic */ Object core$volatile = new Core(16);
    public final ReferenceQueue d;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0001\bR\u000b\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004R\u0019\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u00048\u0002X\u0082\u0004R\u0013\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0082\u0004¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;", "", "Lkotlinx/atomicfu/AtomicInt;", "load", "Lkotlinx/atomicfu/AtomicArray;", "Lkotlinx/coroutines/debug/internal/HashedWeakRef;", i.a.n, "values", "KeyValueIterator", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Core {
        public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(Core.class, "load$volatile");

        /* renamed from: a, reason: collision with root package name */
        public final int f24702a;
        public final int b;
        public final int c;
        public final /* synthetic */ AtomicReferenceArray d;
        public final /* synthetic */ AtomicReferenceArray e;
        private volatile /* synthetic */ int load$volatile;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core$KeyValueIterator;", "E", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public final class KeyValueIterator<E> implements Iterator<E>, KMutableIterator {
            public final Function2 d;
            public int e = -1;
            public Object f;
            public Object g;

            public KeyValueIterator(Function2 function2) {
                this.d = function2;
                a();
            }

            public final void a() {
                T t;
                while (true) {
                    int i = this.e + 1;
                    this.e = i;
                    Core core = Core.this;
                    if (i >= core.f24702a) {
                        return;
                    }
                    HashedWeakRef hashedWeakRef = (HashedWeakRef) core.d.get(i);
                    if (hashedWeakRef != null && (t = hashedWeakRef.get()) != 0) {
                        this.f = t;
                        Object obj = core.e.get(this.e);
                        if (obj instanceof Marked) {
                            obj = ((Marked) obj).f24705a;
                        }
                        if (obj != null) {
                            this.g = obj;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.e < Core.this.f24702a;
            }

            @Override // java.util.Iterator
            public final Object next() {
                if (this.e >= Core.this.f24702a) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f;
                if (obj == null) {
                    Intrinsics.p("key");
                    throw null;
                }
                Object obj2 = this.g;
                if (obj2 == null) {
                    Intrinsics.p("value");
                    throw null;
                }
                Object objInvoke = this.d.invoke(obj, obj2);
                a();
                return objInvoke;
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("not implemented");
            }
        }

        public Core(int i) {
            this.f24702a = i;
            this.b = Integer.numberOfLeadingZeros(i) + 1;
            this.c = (i * 2) / 3;
            this.d = new AtomicReferenceArray(i);
            this.e = new AtomicReferenceArray(i);
        }

        public final Object a(Object obj, Object obj2, HashedWeakRef hashedWeakRef) {
            int i;
            int iHashCode = (obj.hashCode() * (-1640531527)) >>> this.b;
            boolean z = false;
            loop0: while (true) {
                AtomicReferenceArray atomicReferenceArray = this.d;
                HashedWeakRef hashedWeakRef2 = (HashedWeakRef) atomicReferenceArray.get(iHashCode);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
                if (hashedWeakRef2 == null) {
                    if (obj2 != null) {
                        if (!z) {
                            do {
                                i = atomicIntegerFieldUpdater.get(this);
                                if (i >= this.c) {
                                    break loop0;
                                }
                            } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1));
                            z = true;
                        }
                        boolean z2 = z;
                        if (hashedWeakRef == null) {
                            hashedWeakRef = new HashedWeakRef(obj, ConcurrentWeakMap.this.d);
                            obj.hashCode();
                        }
                        HashedWeakRef hashedWeakRef3 = hashedWeakRef;
                        while (!atomicReferenceArray.compareAndSet(iHashCode, null, hashedWeakRef3)) {
                            if (atomicReferenceArray.get(iHashCode) != null) {
                                z = z2;
                                hashedWeakRef = hashedWeakRef3;
                            }
                        }
                        break loop0;
                    }
                    return null;
                }
                Object obj3 = hashedWeakRef2.get();
                if (!obj.equals(obj3)) {
                    if (obj3 == null) {
                        c(iHashCode);
                    }
                    if (iHashCode == 0) {
                        iHashCode = this.f24702a;
                    }
                    iHashCode--;
                } else if (z) {
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                }
            }
            while (true) {
                AtomicReferenceArray atomicReferenceArray2 = this.e;
                Object obj4 = atomicReferenceArray2.get(iHashCode);
                if (obj4 instanceof Marked) {
                    break;
                }
                while (!atomicReferenceArray2.compareAndSet(iHashCode, obj4, obj2)) {
                    if (atomicReferenceArray2.get(iHashCode) != obj4) {
                        break;
                    }
                }
                return obj4;
            }
            return ConcurrentWeakMapKt.f24703a;
        }

        public final Core b() {
            int i;
            Object obj;
            while (true) {
                ConcurrentWeakMap concurrentWeakMap = ConcurrentWeakMap.this;
                int i2 = concurrentWeakMap.getI();
                if (i2 < 4) {
                    i2 = 4;
                }
                Core core = new Core(Integer.highestOneBit(i2) * 4);
                while (i < this.f24702a) {
                    HashedWeakRef hashedWeakRef = (HashedWeakRef) this.d.get(i);
                    Object obj2 = hashedWeakRef != null ? hashedWeakRef.get() : null;
                    if (hashedWeakRef != null && obj2 == null) {
                        c(i);
                    }
                    while (true) {
                        AtomicReferenceArray atomicReferenceArray = this.e;
                        obj = atomicReferenceArray.get(i);
                        if (!(obj instanceof Marked)) {
                            Marked marked = obj == null ? ConcurrentWeakMapKt.b : obj.equals(Boolean.TRUE) ? ConcurrentWeakMapKt.c : new Marked(obj);
                            while (!atomicReferenceArray.compareAndSet(i, obj, marked)) {
                                if (atomicReferenceArray.get(i) != obj) {
                                    break;
                                }
                            }
                            break;
                        }
                        obj = ((Marked) obj).f24705a;
                        break;
                    }
                    i = (obj2 == null || obj == null || core.a(obj2, obj, hashedWeakRef) != ConcurrentWeakMapKt.f24703a) ? i + 1 : 0;
                }
                return core;
            }
        }

        public final void c(int i) {
            while (true) {
                AtomicReferenceArray atomicReferenceArray = this.e;
                Object obj = atomicReferenceArray.get(i);
                if (obj == null || (obj instanceof Marked)) {
                    return;
                }
                while (!atomicReferenceArray.compareAndSet(i, obj, null)) {
                    if (atomicReferenceArray.get(i) != obj) {
                        break;
                    }
                }
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ConcurrentWeakMap.e;
                ConcurrentWeakMap concurrentWeakMap = ConcurrentWeakMap.this;
                concurrentWeakMap.getClass();
                ConcurrentWeakMap.e.decrementAndGet(concurrentWeakMap);
                return;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Entry;", "K", "V", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Entry<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {
        public final Object d;
        public final Object e;

        public Entry(Object obj, Object obj2) {
            this.d = obj;
            this.e = obj2;
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
        public final Object setValue(Object obj) {
            throw new UnsupportedOperationException("not implemented");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$KeyValueSet;", "E", "Lkotlin/collections/AbstractMutableSet;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class KeyValueSet<E> extends AbstractMutableSet<E> {
        public final Function2 d;

        public KeyValueSet(Function2 function2) {
            this.d = function2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException("not implemented");
        }

        @Override // kotlin.collections.AbstractMutableSet
        /* renamed from: b */
        public final int getH() {
            return ConcurrentWeakMap.this.getI();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            Core core = (Core) ConcurrentWeakMap.f.get(ConcurrentWeakMap.this);
            core.getClass();
            return core.new KeyValueIterator(this.d);
        }
    }

    public ConcurrentWeakMap(boolean z) {
        this.d = z ? new ReferenceQueue() : null;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final Set a() {
        return new KeyValueSet(new a(0));
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final Set b() {
        return new KeyValueSet(new a(1));
    }

    @Override // kotlin.collections.AbstractMutableMap
    /* renamed from: c */
    public final int getI() {
        return e.get(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Iterator it = ((KeyValueSet) b()).iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final synchronized Object e(Object obj, Object obj2) {
        Object objA;
        Core coreB = (Core) f.get(this);
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Core.g;
            objA = coreB.a(obj, obj2, null);
            if (objA == ConcurrentWeakMapKt.f24703a) {
                coreB = coreB.b();
                f.set(this, coreB);
            }
        }
        return objA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        Core core = (Core) f.get(this);
        core.getClass();
        int iHashCode = (obj.hashCode() * (-1640531527)) >>> core.b;
        while (true) {
            HashedWeakRef hashedWeakRef = (HashedWeakRef) core.d.get(iHashCode);
            if (hashedWeakRef == null) {
                return null;
            }
            Object obj2 = hashedWeakRef.get();
            if (obj.equals(obj2)) {
                Object obj3 = core.e.get(iHashCode);
                return obj3 instanceof Marked ? ((Marked) obj3).f24705a : obj3;
            }
            if (obj2 == null) {
                core.c(iHashCode);
            }
            if (iHashCode == 0) {
                iHashCode = core.f24702a;
            }
            iHashCode--;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        Core core = (Core) f.get(this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Core.g;
        Object objA = core.a(obj, obj2, null);
        if (objA == ConcurrentWeakMapKt.f24703a) {
            objA = e(obj, obj2);
        }
        if (objA == null) {
            e.incrementAndGet(this);
        }
        return objA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        Core core = (Core) f.get(this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Core.g;
        Object objA = core.a(obj, null, null);
        if (objA == ConcurrentWeakMapKt.f24703a) {
            objA = e(obj, null);
        }
        if (objA != null) {
            e.decrementAndGet(this);
        }
        return objA;
    }
}
