package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u0000\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/SourceInformationGroupDataIterator;", "", "", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class SourceInformationGroupDataIterator implements Iterable<Object>, Iterator<Object>, KMappedMarker {
    public final SlotTable d;
    public final int e;
    public final int f;
    public final int g;
    public final BitVector h;
    public int i;

    public SourceInformationGroupDataIterator(SlotTable slotTable, int i, GroupSourceInformation groupSourceInformation) {
        this.d = slotTable;
        int[] iArr = slotTable.d;
        int i2 = iArr[(i * 5) + 4];
        this.e = i2;
        groupSourceInformation.getClass();
        this.f = 0;
        int i3 = i + 1;
        this.g = (i3 < slotTable.e ? iArr[(i3 * 5) + 4] : slotTable.g) - i2;
        BitVector bitVector = new BitVector();
        bitVector.c = SlotTableKt.f1666a;
        ArrayList arrayList = groupSourceInformation.f1638a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (arrayList.get(i4) instanceof GroupSourceInformation) {
                    bitVector.f1621a = (((0 * 1) >>> (64 - (Math.min(64, 0) - 0))) << 0) | bitVector.f1621a;
                }
            }
        }
        this.h = bitVector;
        this.i = bitVector.a(this.f);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.i < this.g;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.i;
        Object obj = (i < 0 || i >= this.g) ? null : this.d.f[this.e + i];
        this.i = this.h.a(i + 1);
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
