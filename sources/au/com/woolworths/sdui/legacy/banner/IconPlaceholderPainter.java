package au.com.woolworths.sdui.legacy.banner;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import au.com.woolworths.design.wx.foundation.ToneColors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/legacy/banner/IconPlaceholderPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class IconPlaceholderPainter extends Painter {
    public final float i;
    public final long j;

    public IconPlaceholderPainter(float f) {
        this.i = f;
        float f2 = 2 * f;
        this.j = (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: f, reason: from getter */
    public final long getJ() {
        return this.j;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void h(DrawScope drawScope) {
        Intrinsics.h(drawScope, "<this>");
        DrawScope.j0(drawScope, ToneColors.i, this.i, 0L, null, 0, 124);
    }
}
