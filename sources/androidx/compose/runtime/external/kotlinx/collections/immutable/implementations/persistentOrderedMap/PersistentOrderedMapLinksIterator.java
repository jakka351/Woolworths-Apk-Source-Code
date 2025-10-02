package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapLinksIterator;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class PersistentOrderedMapLinksIterator<K, V> implements Iterator<LinkedValue<V>>, KMappedMarker {
    public Object d;
    public final Map e;
    public int f;

    public PersistentOrderedMapLinksIterator(Object obj, Map map) {
        this.d = obj;
        this.e = map;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final LinkedValue next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.e.get(this.d);
        if (obj == null) {
            throw new ConcurrentModificationException(a.o(this.d, ") has changed after it was added to the persistent map.", new StringBuilder("Hash code of a key (")));
        }
        LinkedValue linkedValue = (LinkedValue) obj;
        this.f++;
        this.d = linkedValue.c;
        return linkedValue;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f < this.e.size();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
