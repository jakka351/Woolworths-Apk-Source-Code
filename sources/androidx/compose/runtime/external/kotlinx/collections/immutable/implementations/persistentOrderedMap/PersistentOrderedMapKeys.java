package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapKeys;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "Lkotlin/collections/AbstractSet;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PersistentOrderedMapKeys<K, V> extends AbstractSet<K> implements ImmutableSet<K> {
    public final PersistentOrderedMap d;

    public PersistentOrderedMapKeys(PersistentOrderedMap persistentOrderedMap) {
        this.d = persistentOrderedMap;
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: b */
    public final int getF() {
        return this.d.getG();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.d.h.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractSet, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new PersistentOrderedMapKeysIterator(this.d);
    }
}
