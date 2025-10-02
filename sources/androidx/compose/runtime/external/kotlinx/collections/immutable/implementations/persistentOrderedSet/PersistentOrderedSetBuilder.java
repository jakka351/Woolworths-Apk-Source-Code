package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;", "E", "Lkotlin/collections/AbstractMutableSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PersistentOrderedSetBuilder<E> extends AbstractMutableSet<E> implements PersistentSet.Builder<E> {
    public PersistentOrderedSet d;
    public Object e;
    public Object f;
    public final PersistentHashMapBuilder g;

    public PersistentOrderedSetBuilder(PersistentOrderedSet persistentOrderedSet) {
        this.d = persistentOrderedSet;
        this.e = persistentOrderedSet.d;
        this.f = persistentOrderedSet.e;
        this.g = persistentOrderedSet.f.builder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        PersistentHashMapBuilder persistentHashMapBuilder = this.g;
        if (persistentHashMapBuilder.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.e = obj;
            this.f = obj;
            persistentHashMapBuilder.put(obj, new Links());
            return true;
        }
        V v = persistentHashMapBuilder.get(this.f);
        Intrinsics.e(v);
        persistentHashMapBuilder.put(this.f, new Links(((Links) v).f1685a, obj));
        persistentHashMapBuilder.put(obj, new Links(this.f));
        this.f = obj;
        return true;
    }

    @Override // kotlin.collections.AbstractMutableSet
    /* renamed from: b */
    public final int getH() {
        return this.g.getI();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder
    public final PersistentSet build() {
        PersistentHashMap persistentHashMapE = this.g.e();
        PersistentOrderedSet persistentOrderedSet = this.d;
        if (persistentHashMapE != persistentOrderedSet.f) {
            persistentOrderedSet = new PersistentOrderedSet(this.e, this.f, persistentHashMapE);
        }
        this.d = persistentOrderedSet;
        return persistentOrderedSet;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.g.clear();
        EndOfChain endOfChain = EndOfChain.f1687a;
        this.e = endOfChain;
        this.f = endOfChain;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.g.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new PersistentOrderedSetMutableIterator(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        PersistentHashMapBuilder persistentHashMapBuilder = this.g;
        Links links = (Links) persistentHashMapBuilder.remove(obj);
        if (links == null) {
            return false;
        }
        Object obj2 = links.b;
        Object obj3 = links.f1685a;
        EndOfChain endOfChain = EndOfChain.f1687a;
        if (obj3 != endOfChain) {
            V v = persistentHashMapBuilder.get(obj3);
            Intrinsics.e(v);
            persistentHashMapBuilder.put(obj3, new Links(((Links) v).f1685a, obj2));
        } else {
            this.e = obj2;
        }
        if (obj2 == endOfChain) {
            this.f = obj3;
            return true;
        }
        V v2 = persistentHashMapBuilder.get(obj2);
        Intrinsics.e(v2);
        persistentHashMapBuilder.put(obj2, new Links(obj3, ((Links) v2).b));
        return true;
    }
}
