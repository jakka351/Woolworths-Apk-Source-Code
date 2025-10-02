package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/SourceInformationGroupIterator;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class SourceInformationGroupIterator implements Iterator<CompositionGroup>, KMappedMarker {
    public final SlotTable d;
    public final int e;
    public final GroupSourceInformation f;
    public final SourceInformationGroupPath g;
    public final int h;
    public int i;

    public SourceInformationGroupIterator(SlotTable slotTable, int i, GroupSourceInformation groupSourceInformation, SourceInformationGroupPath sourceInformationGroupPath) {
        this.d = slotTable;
        this.e = i;
        this.f = groupSourceInformation;
        this.g = sourceInformationGroupPath;
        this.h = slotTable.k;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        ArrayList arrayList = this.f.f1638a;
        return arrayList != null && this.i < arrayList.size();
    }

    @Override // java.util.Iterator
    public final CompositionGroup next() {
        Object obj;
        ArrayList arrayList = this.f.f1638a;
        if (arrayList != null) {
            int i = this.i;
            this.i = i + 1;
            obj = arrayList.get(i);
        } else {
            obj = null;
        }
        boolean z = obj instanceof Anchor;
        SlotTable slotTable = this.d;
        if (z) {
            return new SlotTableGroup(slotTable, ((Anchor) obj).f1619a, this.h);
        }
        if (!(obj instanceof GroupSourceInformation)) {
            ComposerKt.d("Unexpected group information structure");
            throw new KotlinNothingValueException();
        }
        return new SourceInformationSlotTableGroup(slotTable, this.e, (GroupSourceInformation) obj, new RelativeGroupPath(this.g, this.i - 1));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
