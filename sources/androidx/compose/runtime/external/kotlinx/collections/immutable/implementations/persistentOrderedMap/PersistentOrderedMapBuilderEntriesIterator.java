package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderEntriesIterator;", "K", "V", "", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PersistentOrderedMapBuilderEntriesIterator<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {
    public final PersistentOrderedMapBuilderLinksIterator d;

    public PersistentOrderedMapBuilderEntriesIterator(PersistentOrderedMapBuilder persistentOrderedMapBuilder) {
        this.d = new PersistentOrderedMapBuilderLinksIterator(persistentOrderedMapBuilder.e, persistentOrderedMapBuilder);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        PersistentOrderedMapBuilderLinksIterator persistentOrderedMapBuilderLinksIterator = this.d;
        return new MutableMapEntry(persistentOrderedMapBuilderLinksIterator.e.g, persistentOrderedMapBuilderLinksIterator.f, persistentOrderedMapBuilderLinksIterator.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.d.remove();
    }
}
