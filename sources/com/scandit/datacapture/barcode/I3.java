package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterHighlightSettings;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickBrush;
import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class I3 implements H3 {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f17191a;
    private final L3 b;

    public I3(Function1 quadrilateralMapper, L3 drawSettings) {
        Intrinsics.h(quadrilateralMapper, "quadrilateralMapper");
        Intrinsics.h(drawSettings, "drawSettings");
        this.f17191a = quadrilateralMapper;
        this.b = drawSettings;
    }

    public final G3 a(TrackedObject track) {
        Intrinsics.h(track, "track");
        BarcodeFilterHighlightSettings barcodeFilterHighlightSettingsA = this.b.a();
        BarcodePickBrush barcodePickBrushA = C0742n2.a(barcodeFilterHighlightSettingsA != null ? barcodeFilterHighlightSettingsA.getBrush() : null);
        Quadrilateral quadrilateralA = E2.a((Quadrilateral) this.f17191a.invoke(track.d()), this.b.b());
        Intrinsics.h(barcodePickBrushA, "<this>");
        return new G3(I2.a(barcodePickBrushA, EmptyList.d), new C0551c7(quadrilateralA));
    }
}
