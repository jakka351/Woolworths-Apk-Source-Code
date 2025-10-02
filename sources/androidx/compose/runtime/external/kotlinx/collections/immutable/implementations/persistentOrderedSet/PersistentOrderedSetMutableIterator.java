package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetMutableIterator;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetIterator;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PersistentOrderedSetMutableIterator<E> extends PersistentOrderedSetIterator<E> implements Iterator<E>, KMutableIterator {
    public final PersistentOrderedSetBuilder g;
    public Object h;
    public boolean i;
    public int j;

    /* JADX WARN: Illegal instructions before constructor call */
    public PersistentOrderedSetMutableIterator(PersistentOrderedSetBuilder persistentOrderedSetBuilder) {
        Object obj = persistentOrderedSetBuilder.e;
        PersistentHashMapBuilder persistentHashMapBuilder = persistentOrderedSetBuilder.g;
        super(obj, persistentHashMapBuilder);
        this.g = persistentOrderedSetBuilder;
        this.j = persistentHashMapBuilder.h;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetIterator, java.util.Iterator
    public final Object next() {
        if (this.g.g.h != this.j) {
            throw new ConcurrentModificationException();
        }
        Object next = super.next();
        this.h = next;
        this.i = true;
        return next;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetIterator, java.util.Iterator
    public final void remove() {
        if (!this.i) {
            throw new IllegalStateException();
        }
        Object obj = this.h;
        PersistentOrderedSetBuilder persistentOrderedSetBuilder = this.g;
        TypeIntrinsics.a(persistentOrderedSetBuilder).remove(obj);
        this.h = null;
        this.i = false;
        this.j = persistentOrderedSetBuilder.g.h;
        this.f--;
    }
}
