package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import com.scandit.datacapture.core.source.Camera;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Vb extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0540bc f17328a;
    final /* synthetic */ SparkScanScanningMode b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vb(C0540bc c0540bc, SparkScanScanningMode sparkScanScanningMode) {
        super(1);
        this.f17328a = c0540bc;
        this.b = sparkScanScanningMode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Boolean) obj).getClass();
        Camera cameraG = this.f17328a.g();
        if (cameraG != null) {
            cameraG._applySettings(this.f17328a.a(this.b, cameraG.getPosition()));
        }
        return Unit.f24250a;
    }
}
