package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/SourceInformationSlotTableGroup;", "Landroidx/compose/runtime/tooling/CompositionGroup;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SourceInformationSlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, KMappedMarker {
    public final SlotTable d;
    public final int e;
    public final GroupSourceInformation f;
    public final RelativeGroupPath g;
    public final Integer h = 0;
    public final Iterable i = this;

    public SourceInformationSlotTableGroup(SlotTable slotTable, int i, GroupSourceInformation groupSourceInformation, RelativeGroupPath relativeGroupPath) {
        this.d = slotTable;
        this.e = i;
        this.f = groupSourceInformation;
        this.g = relativeGroupPath;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public final String b() {
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public final Object d() {
        return this.g.a(this.d);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    /* renamed from: g, reason: from getter */
    public final Iterable getI() {
        return this.i;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public final Iterable getData() {
        return new SourceInformationGroupDataIterator(this.d, this.e, this.f);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public final Object getKey() {
        return this.h;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public final Object i() {
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<CompositionGroup> iterator() {
        return new SourceInformationGroupIterator(this.d, this.e, this.f, this.g);
    }
}
