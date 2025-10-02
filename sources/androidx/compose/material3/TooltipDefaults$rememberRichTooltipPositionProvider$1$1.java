package androidx.compose.material3;

import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/material3/TooltipDefaults$rememberRichTooltipPositionProvider$1$1", "Landroidx/compose/ui/window/PopupPositionProvider;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TooltipDefaults$rememberRichTooltipPositionProvider$1$1 implements PopupPositionProvider {
    @Override // androidx.compose.ui.window.PopupPositionProvider
    public final long a(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        int iD = intRect.f2201a;
        int i = (int) (j2 >> 32);
        if (iD + i > ((int) (j >> 32))) {
            int i2 = intRect.c - i;
            iD = i2 < 0 ? iD + ((intRect.d() - i) / 2) : i2;
        }
        int i3 = intRect.b - ((int) (j2 & 4294967295L));
        if (i3 < 0) {
            i3 = intRect.d;
        }
        return IntOffsetKt.a(iD, i3);
    }
}
