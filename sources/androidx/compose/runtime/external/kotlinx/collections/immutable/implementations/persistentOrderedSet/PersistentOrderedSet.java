package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "E", "Lkotlin/collections/AbstractSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class PersistentOrderedSet<E> extends AbstractSet<E> implements PersistentSet<E> {
    public static final PersistentOrderedSet g;
    public final Object d;
    public final Object e;
    public final PersistentHashMap f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet$Companion;", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        EndOfChain endOfChain = EndOfChain.f1687a;
        g = new PersistentOrderedSet(endOfChain, endOfChain, PersistentHashMap.h);
    }

    public PersistentOrderedSet(Object obj, Object obj2, PersistentHashMap persistentHashMap) {
        this.d = obj;
        this.e = obj2;
        this.f = persistentHashMap;
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public final PersistentSet add(Object obj) {
        PersistentHashMap persistentHashMap = this.f;
        if (persistentHashMap.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new PersistentOrderedSet(obj, obj, persistentHashMap.h(obj, new Links()));
        }
        Object obj2 = this.e;
        Object obj3 = persistentHashMap.get(obj2);
        Intrinsics.e(obj3);
        return new PersistentOrderedSet(this.d, obj, persistentHashMap.h(obj2, new Links(((Links) obj3).f1685a, obj)).h(obj, new Links(obj2)));
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public final PersistentSet addAll(Collection collection) {
        PersistentOrderedSetBuilder persistentOrderedSetBuilder = new PersistentOrderedSetBuilder(this);
        persistentOrderedSetBuilder.addAll(collection);
        return persistentOrderedSetBuilder.build();
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: b */
    public final int getG() {
        return this.f.getG();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public final PersistentSet.Builder builder() {
        return new PersistentOrderedSetBuilder(this);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractSet, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new PersistentOrderedSetIterator(this.d, this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public final PersistentSet remove(Object obj) {
        PersistentHashMap persistentHashMapH = this.f;
        Links links = (Links) persistentHashMapH.get(obj);
        if (links == null) {
            return this;
        }
        Object obj2 = links.f1685a;
        Object obj3 = links.b;
        TrieNode trieNode = persistentHashMapH.f;
        TrieNode trieNodeV = trieNode.v(obj != null ? obj.hashCode() : 0, 0, obj);
        if (trieNode != trieNodeV) {
            persistentHashMapH = trieNodeV == null ? PersistentHashMap.h : new PersistentHashMap(trieNodeV, persistentHashMapH.g - 1);
        }
        EndOfChain endOfChain = EndOfChain.f1687a;
        if (obj2 != endOfChain) {
            V v = persistentHashMapH.get(obj2);
            Intrinsics.e(v);
            persistentHashMapH = persistentHashMapH.h(obj2, new Links(((Links) v).f1685a, obj3));
        }
        if (obj3 != endOfChain) {
            V v2 = persistentHashMapH.get(obj3);
            Intrinsics.e(v2);
            persistentHashMapH = persistentHashMapH.h(obj3, new Links(obj2, ((Links) v2).b));
        }
        Object obj4 = obj2 != endOfChain ? this.d : obj3;
        if (obj3 != endOfChain) {
            obj2 = this.e;
        }
        return new PersistentOrderedSet(obj4, obj2, persistentHashMapH);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public final PersistentSet removeAll(Collection collection) {
        PersistentOrderedSetBuilder persistentOrderedSetBuilder = new PersistentOrderedSetBuilder(this);
        persistentOrderedSetBuilder.removeAll(collection);
        return persistentOrderedSetBuilder.build();
    }
}
