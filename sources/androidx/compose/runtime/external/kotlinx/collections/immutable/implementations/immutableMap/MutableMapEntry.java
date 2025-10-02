package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableMap;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/MutableMapEntry;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/MapEntry;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MutableMapEntry<K, V> extends MapEntry<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {
    public final PersistentHashMapBuilderEntriesIterator f;
    public Object g;

    public MutableMapEntry(PersistentHashMapBuilderEntriesIterator persistentHashMapBuilderEntriesIterator, Object obj, Object obj2) {
        super(obj, obj2);
        this.f = persistentHashMapBuilderEntriesIterator;
        this.g = obj2;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    /* renamed from: getValue */
    public final Object getE() {
        return this.g;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.g;
        this.g = obj;
        PersistentHashMapBuilderBaseIterator persistentHashMapBuilderBaseIterator = this.f.d;
        PersistentHashMapBuilder persistentHashMapBuilder = persistentHashMapBuilderBaseIterator.g;
        Object obj3 = this.d;
        if (!persistentHashMapBuilder.containsKey(obj3)) {
            return obj2;
        }
        boolean z = persistentHashMapBuilderBaseIterator.f;
        if (!z) {
            persistentHashMapBuilder.put(obj3, obj);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            TrieNodeBaseIterator trieNodeBaseIterator = persistentHashMapBuilderBaseIterator.d[persistentHashMapBuilderBaseIterator.e];
            Object obj4 = trieNodeBaseIterator.d[trieNodeBaseIterator.f];
            persistentHashMapBuilder.put(obj3, obj);
            persistentHashMapBuilderBaseIterator.c(obj4 != null ? obj4.hashCode() : 0, persistentHashMapBuilder.f, obj4, 0);
        }
        persistentHashMapBuilderBaseIterator.j = persistentHashMapBuilder.h;
        return obj2;
    }
}
