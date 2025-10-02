package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.spark.internal.SparkScanInternal;
import com.scandit.datacapture.barcode.spark.internal.module.ui.NativeSparkScanOverlay;
import com.scandit.datacapture.barcode.spark.internal.module.ui.NativeSparkScanOverlayStyle;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.core.ui.style.Brush;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Wa implements DataCaptureOverlay {
    private final /* synthetic */ Xa b;

    public /* synthetic */ Wa(SparkScanInternal sparkScanInternal, NativeSparkScanOverlayStyle nativeSparkScanOverlayStyle, int i) {
        this(sparkScanInternal, nativeSparkScanOverlayStyle);
    }

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay
    public final NativeDataCaptureOverlay _dataCaptureOverlayImpl() {
        return this.b._dataCaptureOverlayImpl();
    }

    public final void a() {
        this.b.a();
    }

    public final void b(boolean z) {
        this.b.b(z);
    }

    public final void c(boolean z) {
        this.b.c(z);
    }

    public final boolean getShouldShowScanAreaGuides() {
        return this.b.getShouldShowScanAreaGuides();
    }

    public final void setBrush(Brush brush) {
        Intrinsics.h(brush, "<set-?>");
        this.b.setBrush(brush);
    }

    public final void setShouldShowScanAreaGuides(boolean z) {
        this.b.setShouldShowScanAreaGuides(z);
    }

    public Wa(NativeSparkScanOverlay impl) {
        Intrinsics.h(impl, "impl");
        this.b = new Xa(impl);
        new HashMap();
    }

    public final void a(boolean z) {
        this.b.a(z);
    }

    public final void a(Brush brush) {
        Intrinsics.h(brush, "brush");
        this.b.a(brush);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private Wa(SparkScanInternal sparkScanInternal, NativeSparkScanOverlayStyle nativeSparkScanOverlayStyle) {
        NativeSparkScanOverlay nativeSparkScanOverlayCreate = NativeSparkScanOverlay.create(sparkScanInternal.a(), nativeSparkScanOverlayStyle);
        Intrinsics.g(nativeSparkScanOverlayCreate, "create(sparkScan._impl(), style)");
        this(nativeSparkScanOverlayCreate);
    }
}
