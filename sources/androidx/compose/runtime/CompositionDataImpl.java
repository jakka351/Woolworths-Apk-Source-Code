package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionInstance;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/CompositionDataImpl;", "Landroidx/compose/runtime/tooling/CompositionData;", "Landroidx/compose/runtime/tooling/CompositionInstance;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CompositionDataImpl implements CompositionData, CompositionInstance {
    public final CompositionImpl d;

    public CompositionDataImpl(CompositionImpl compositionImpl) {
        this.d = compositionImpl;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CompositionDataImpl) {
            return this.d.equals(((CompositionDataImpl) obj).d);
        }
        return false;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    /* renamed from: g */
    public final Iterable getI() {
        SlotTable slotTable = this.d.i;
        slotTable.getClass();
        return slotTable;
    }

    public final int hashCode() {
        return this.d.hashCode() * 31;
    }
}
