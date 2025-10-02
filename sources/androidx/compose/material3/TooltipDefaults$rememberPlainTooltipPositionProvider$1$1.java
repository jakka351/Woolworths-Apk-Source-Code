package androidx.compose.material3;

import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/material3/TooltipDefaults$rememberPlainTooltipPositionProvider$1$1", "Landroidx/compose/ui/window/PopupPositionProvider;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TooltipDefaults$rememberPlainTooltipPositionProvider$1$1 implements PopupPositionProvider {
    @Override // androidx.compose.ui.window.PopupPositionProvider
    public final long a(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        int iD = YU.a.D(intRect.d(), (int) (j2 >> 32), 2, intRect.f2201a);
        int i = (intRect.b - ((int) (j2 & 4294967295L))) + 0;
        if (i < 0) {
            i = intRect.d + 0;
        }
        return IntOffsetKt.a(iD, i);
    }
}
