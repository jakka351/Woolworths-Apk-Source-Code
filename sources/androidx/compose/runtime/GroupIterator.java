package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/GroupIterator;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class GroupIterator implements Iterator<CompositionGroup>, KMappedMarker {
    public final SlotTable d;
    public final int e;
    public int f;
    public final int g;

    public GroupIterator(SlotTable slotTable, int i, int i2) {
        this.d = slotTable;
        this.e = i2;
        this.f = i;
        this.g = slotTable.k;
        if (slotTable.j) {
            SlotTableKt.g();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f < this.e;
    }

    @Override // java.util.Iterator
    public final CompositionGroup next() {
        SlotTable slotTable = this.d;
        int i = slotTable.k;
        int i2 = this.g;
        if (i != i2) {
            SlotTableKt.g();
        }
        int i3 = this.f;
        this.f = SlotTableKt.a(i3, slotTable.d) + i3;
        return new SlotTableGroup(slotTable, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
