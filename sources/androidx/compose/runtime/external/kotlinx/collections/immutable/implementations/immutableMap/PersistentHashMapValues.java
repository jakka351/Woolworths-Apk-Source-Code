package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractCollection;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapValues;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "Lkotlin/collections/AbstractCollection;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PersistentHashMapValues<K, V> extends AbstractCollection<V> implements ImmutableCollection<V> {
    public final PersistentHashMap d;

    public PersistentHashMapValues(PersistentHashMap persistentHashMap) {
        this.d = persistentHashMap;
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: b */
    public final int getG() {
        return this.d.getG();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.d.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        TrieNode trieNode = this.d.f;
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = new TrieNodeBaseIterator[8];
        for (int i = 0; i < 8; i++) {
            trieNodeBaseIteratorArr[i] = new TrieNodeValuesIterator();
        }
        return new PersistentHashMapValuesIterator(trieNode, trieNodeBaseIteratorArr);
    }
}
