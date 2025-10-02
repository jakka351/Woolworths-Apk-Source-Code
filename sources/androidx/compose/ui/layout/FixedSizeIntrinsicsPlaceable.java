package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/FixedSizeIntrinsicsPlaceable;", "Landroidx/compose/ui/layout/Placeable;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class FixedSizeIntrinsicsPlaceable extends Placeable {
    public FixedSizeIntrinsicsPlaceable(int i, int i2) {
        u0((i2 & 4294967295L) | (i << 32));
    }

    @Override // androidx.compose.ui.layout.Measured
    public final int d0(AlignmentLine alignmentLine) {
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.layout.Placeable
    public final void s0(long j, float f, Function1 function1) {
    }
}
