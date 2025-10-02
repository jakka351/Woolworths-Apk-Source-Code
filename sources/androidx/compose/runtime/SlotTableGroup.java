package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/SlotTableGroup;", "Landroidx/compose/runtime/tooling/CompositionGroup;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class SlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, KMappedMarker {
    public final SlotTable d;
    public final int e;
    public final int f;

    public SlotTableGroup(SlotTable slotTable, int i, int i2) {
        this.d = slotTable;
        this.e = i;
        this.f = i2;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public final String b() {
        SlotTable slotTable = this.d;
        int[] iArr = slotTable.d;
        int i = this.e;
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) == 0) {
            slotTable.o(i);
            return null;
        }
        Object obj = slotTable.f[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(i3 >> 29)];
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public final Object d() {
        SlotTable slotTable = this.d;
        if (slotTable.k != this.f) {
            SlotTableKt.g();
        }
        SlotReader slotReaderL = slotTable.l();
        try {
            return slotReaderL.a(this.e);
        } finally {
            slotReaderL.c();
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public final Iterable g() {
        return this;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public final Iterable getData() {
        SlotTable slotTable = this.d;
        int i = this.e;
        GroupSourceInformation groupSourceInformationO = slotTable.o(i);
        return groupSourceInformationO != null ? new SourceInformationGroupDataIterator(slotTable, i, groupSourceInformationO) : new DataIterator(slotTable, i);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public final Object getKey() {
        SlotTable slotTable = this.d;
        int[] iArr = slotTable.d;
        int i = this.e;
        if ((iArr[(i * 5) + 1] & 536870912) == 0) {
            return Integer.valueOf(iArr[i * 5]);
        }
        Object obj = slotTable.f[SlotTableKt.c(i, iArr)];
        Intrinsics.e(obj);
        return obj;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public final Object i() {
        SlotTable slotTable = this.d;
        int[] iArr = slotTable.d;
        int i = this.e;
        if ((iArr[(i * 5) + 1] & 1073741824) != 0) {
            return slotTable.f[iArr[(i * 5) + 4]];
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<CompositionGroup> iterator() {
        SlotTable slotTable = this.d;
        if (slotTable.k != this.f) {
            SlotTableKt.g();
        }
        int i = this.e;
        GroupSourceInformation groupSourceInformationO = slotTable.o(i);
        return groupSourceInformationO != null ? new SourceInformationGroupIterator(slotTable, i, groupSourceInformationO, new AnchoredGroupPath(i)) : new GroupIterator(slotTable, i + 1, slotTable.d[(i * 5) + 3] + i);
    }
}
