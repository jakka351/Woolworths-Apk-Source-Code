package androidx.compose.runtime;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u0000\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/DataIterator;", "", "", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class DataIterator implements Iterable<Object>, Iterator<Object>, KMappedMarker {
    public final SlotTable d;
    public final int e;
    public int f;

    public DataIterator(SlotTable slotTable, int i) {
        this.d = slotTable;
        int[] iArr = slotTable.d;
        int i2 = iArr[(i * 5) + 4];
        int i3 = i + 1;
        this.e = i3 < slotTable.e ? iArr[(i3 * 5) + 4] : slotTable.g;
        this.f = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f < this.e;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object next() {
        /*
            r3 = this;
            int r0 = r3.f
            if (r0 < 0) goto Le
            androidx.compose.runtime.SlotTable r1 = r3.d
            java.lang.Object[] r1 = r1.f
            int r2 = r1.length
            if (r0 >= r2) goto Le
            r1 = r1[r0]
            goto Lf
        Le:
            r1 = 0
        Lf:
            int r0 = r0 + 1
            r3.f = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.DataIterator.next():java.lang.Object");
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
