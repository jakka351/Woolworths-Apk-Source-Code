package com.otaliastudios.zoom;

import com.otaliastudios.zoom.internal.matrix.MatrixController;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/otaliastudios/zoom/OverPanRangeProvider$Companion$DEFAULT$1", "Lcom/otaliastudios/zoom/OverPanRangeProvider;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class OverPanRangeProvider$Companion$DEFAULT$1 implements OverPanRangeProvider {
    @Override // com.otaliastudios.zoom.OverPanRangeProvider
    public final float a(ZoomEngine engine, boolean z) {
        float f;
        Intrinsics.h(engine, "engine");
        MatrixController matrixController = engine.l;
        if (z) {
            f = matrixController.j;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            f = matrixController.k;
        }
        return f * 0.1f;
    }
}
