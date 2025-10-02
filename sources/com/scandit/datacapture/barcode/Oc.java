package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewUISettings;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Oc extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Pc f17261a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oc(SparkScanViewUISettings sparkScanViewUISettings, Pc pc) {
        super(1);
        this.f17261a = pc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.h(it, "it");
        if (it.equals("startCapturingText") ? true : it.equals("stopCapturingText") ? true : it.equals("resumeCapturingText") ? true : it.equals("captureButtonBackgroundColor") ? true : it.equals("captureButtonActiveBackgroundColor") ? true : it.equals("captureButtonTintColor") ? true : it.equals("scanningCapturingText")) {
            Pc pc = this.f17261a;
            NativeSparkScanViewState nativeSparkScanViewState = pc.l;
            if (nativeSparkScanViewState == null) {
                Intrinsics.p("latestViewState");
                throw null;
            }
            pc.b(nativeSparkScanViewState);
        } else {
            if (it.equals("targetModeButtonVisible") ? true : it.equals("handModeButtonVisible") ? true : it.equals("scanningBehaviorButtonVisible") ? true : it.equals("hapticModeButtonVisible") ? true : it.equals("soundModeButtonVisible") ? true : it.equals("barcodeCountButtonVisible") ? true : it.equals("barcodeFindButtonVisible")) {
                Pc.c(this.f17261a);
            }
        }
        return Unit.f24250a;
    }
}
