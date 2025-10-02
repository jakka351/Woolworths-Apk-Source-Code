package androidx.collection;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/collection/MapEntry;", "K", "V", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MapEntry<K, V> implements Map.Entry<K, V>, KMappedMarker {
    public final Object d;
    public final Object e;

    public MapEntry(Object obj, Object obj2) {
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
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
