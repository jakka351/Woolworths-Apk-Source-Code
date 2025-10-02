package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import android.support.v4.media.session.a;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderLinksIterator;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class PersistentOrderedMapBuilderLinksIterator<K, V> implements Iterator<LinkedValue<V>>, KMutableIterator {
    public Object d;
    public final PersistentOrderedMapBuilder e;
    public Object f = EndOfChain.f1687a;
    public boolean g;
    public int h;
    public int i;

    public PersistentOrderedMapBuilderLinksIterator(Object obj, PersistentOrderedMapBuilder persistentOrderedMapBuilder) {
        this.d = obj;
        this.e = persistentOrderedMapBuilder;
        this.h = persistentOrderedMapBuilder.g.h;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final LinkedValue next() {
        PersistentOrderedMapBuilder persistentOrderedMapBuilder = this.e;
        if (persistentOrderedMapBuilder.g.h != this.h) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.d;
        this.f = obj;
        this.g = true;
        this.i++;
        V v = persistentOrderedMapBuilder.g.get(obj);
        if (v == null) {
            throw new ConcurrentModificationException(a.o(this.d, ") has changed after it was added to the persistent map.", new StringBuilder("Hash code of a key (")));
        }
        LinkedValue linkedValue = (LinkedValue) v;
        this.d = linkedValue.c;
        return linkedValue;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.i < this.e.g.getI();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.g) {
            throw new IllegalStateException();
        }
        Object obj = this.f;
        PersistentOrderedMapBuilder persistentOrderedMapBuilder = this.e;
        TypeIntrinsics.b(persistentOrderedMapBuilder).remove(obj);
        this.f = null;
        this.g = false;
        this.h = persistentOrderedMapBuilder.g.h;
        this.i--;
    }
}
