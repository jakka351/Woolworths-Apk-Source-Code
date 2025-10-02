package com.otaliastudios.zoom;

import com.otaliastudios.zoom.internal.movement.ZoomManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/otaliastudios/zoom/OverZoomRangeProvider$Companion$DEFAULT$1", "Lcom/otaliastudios/zoom/OverZoomRangeProvider;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class OverZoomRangeProvider$Companion$DEFAULT$1 implements OverZoomRangeProvider {
    @Override // com.otaliastudios.zoom.OverZoomRangeProvider
    public final float a(ZoomEngine engine) {
        Intrinsics.h(engine, "engine");
        ZoomManager zoomManager = engine.k;
        return (zoomManager.f - zoomManager.d) * 0.1f;
    }
}
