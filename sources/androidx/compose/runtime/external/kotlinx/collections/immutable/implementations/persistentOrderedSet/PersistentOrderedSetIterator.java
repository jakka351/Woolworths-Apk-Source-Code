package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetIterator;", "E", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class PersistentOrderedSetIterator<E> implements Iterator<E>, KMappedMarker {
    public Object d;
    public final Map e;
    public int f;

    public PersistentOrderedSetIterator(Object obj, Map map) {
        this.d = obj;
        this.e = map;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f < this.e.size();
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.d;
        this.f++;
        Object obj2 = this.e.get(obj);
        if (obj2 == null) {
            throw new ConcurrentModificationException(b.n(obj, "Hash code of an element (", ") has changed after it was added to the persistent set."));
        }
        this.d = ((Links) obj2).b;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
