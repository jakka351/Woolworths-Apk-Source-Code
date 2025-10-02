package au.com.woolworths.compose.utils.graphics;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/compose/utils/graphics/ForwardingPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "compose-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ForwardingPainter extends Painter {
    public final Painter i;
    public float j;
    public ColorFilter k;
    public final Function2 l;
    public ForwardingDrawInfo m;

    public ForwardingPainter(Painter painter, ColorFilter colorFilter, Function2 function2) {
        Intrinsics.h(painter, "painter");
        this.i = painter;
        this.j = 1.0f;
        this.k = colorFilter;
        this.l = function2;
        this.m = new ForwardingDrawInfo(painter, 1.0f, colorFilter);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean a(float f) {
        if (f != 1.0f) {
            return true;
        }
        this.j = f;
        this.m = new ForwardingDrawInfo(this.i, f, this.k);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean b(ColorFilter colorFilter) {
        if (colorFilter != null) {
            return true;
        }
        this.k = colorFilter;
        this.m = new ForwardingDrawInfo(this.i, this.j, colorFilter);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: f */
    public final long getJ() {
        return this.i.getJ();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void h(DrawScope drawScope) {
        Intrinsics.h(drawScope, "<this>");
        this.l.invoke(drawScope, this.m);
    }
}
