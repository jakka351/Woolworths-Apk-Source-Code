package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/RelativeGroupPath;", "Landroidx/compose/runtime/SourceInformationGroupPath;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RelativeGroupPath extends SourceInformationGroupPath {

    /* renamed from: a, reason: collision with root package name */
    public final SourceInformationGroupPath f1661a;
    public final int b;

    public RelativeGroupPath(SourceInformationGroupPath sourceInformationGroupPath, int i) {
        this.f1661a = sourceInformationGroupPath;
        this.b = i;
    }

    @Override // androidx.compose.runtime.SourceInformationGroupPath
    public final Object a(SlotTable slotTable) {
        return new SourceInformationSlotTableGroupIdentity(this.f1661a.a(slotTable), this.b);
    }
}
