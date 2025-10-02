package androidx.compose.ui.layout;

import androidx.collection.MutableOrderedScatterSet;
import androidx.collection.OrderedScatterSetKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "", "SlotIdsSet", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SubcomposeSlotReusePolicy {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class SlotIdsSet implements Collection<Object>, KMappedMarker {
        public final MutableOrderedScatterSet d;

        public SlotIdsSet() {
            int i = OrderedScatterSetKt.f697a;
            this.d = new MutableOrderedScatterSet(6);
        }

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            return this.d.b(obj);
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.d.d();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return this.d.a(obj);
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!this.d.a(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return this.d.g == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return this.d.c().iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.d.h(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection collection) {
            return this.d.h(collection);
        }

        @Override // java.util.Collection
        public final boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection collection) {
            return this.d.j(collection);
        }

        @Override // java.util.Collection
        public final int size() {
            return this.d.g;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            return CollectionToArray.a(this);
        }

        @Override // java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            return CollectionToArray.b(this, objArr);
        }
    }

    void a(SlotIdsSet slotIdsSet);

    boolean b(Object obj, Object obj2);
}
