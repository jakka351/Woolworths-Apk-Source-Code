package com.google.accompanist.drawablepainter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/accompanist/drawablepainter/EmptyPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "drawablepainter_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EmptyPainter extends Painter {
    static {
        new EmptyPainter();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final long f() {
        return 9205357640488583168L;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void h(DrawScope drawScope) {
        Intrinsics.h(drawScope, "<this>");
    }
}
