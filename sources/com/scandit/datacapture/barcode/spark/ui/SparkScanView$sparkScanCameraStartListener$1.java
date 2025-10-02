package com.scandit.datacapture.barcode.spark.ui;

import com.scandit.datacapture.barcode.InterfaceC0799qa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"com/scandit/datacapture/barcode/spark/ui/SparkScanView$sparkScanCameraStartListener$1", "Lcom/scandit/datacapture/barcode/qa;", "", "onCameraOnStart", "onCameraOnEnd", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SparkScanView$sparkScanCameraStartListener$1 implements InterfaceC0799qa {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SparkScanView f18129a;

    public SparkScanView$sparkScanCameraStartListener$1(SparkScanView sparkScanView) {
        this.f18129a = sparkScanView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(SparkScanView this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.h.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(SparkScanView this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.h.k();
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0799qa
    public void onCameraOnEnd() {
        SparkScanView sparkScanView = this.f18129a;
        sparkScanView.post(new b(sparkScanView, 2));
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0799qa
    public void onCameraOnStart() {
        SparkScanView sparkScanView = this.f18129a;
        sparkScanView.post(new b(sparkScanView, 1));
    }
}
