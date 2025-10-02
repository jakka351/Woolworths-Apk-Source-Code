package com.scandit.datacapture.barcode;

import android.os.Handler;
import android.os.Looper;
import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountCameraHandler;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.FrameSource;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class C implements BarcodeCountCameraHandler {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeCount f17113a;
    private final Handler b;

    public C(BarcodeCount barcodeCount, Handler handler) {
        Intrinsics.h(barcodeCount, "barcodeCount");
        Intrinsics.h(handler, "handler");
        this.f17113a = barcodeCount;
        this.b = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function0 tmp0) {
        Intrinsics.h(tmp0, "$tmp0");
        tmp0.invoke();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountCameraHandler
    public final void a(Function0 onFocus) {
        Intrinsics.h(onFocus, "onFocus");
        if (!this.f17113a.getTriggerAutoFocusOnShutter$scandit_barcode_capture()) {
            onFocus.invoke();
            return;
        }
        DataCaptureContext c = this.f17113a.getC();
        FrameSource frameSource = c != null ? c.get_frameSource() : null;
        Camera camera = frameSource instanceof Camera ? (Camera) frameSource : null;
        if (camera == null) {
            onFocus.invoke();
        } else {
            camera.getF18831a().triggerAutoFocus();
            this.b.postDelayed(new af(0, onFocus), this.f17113a.getTriggerAutoFocusDelay$scandit_barcode_capture());
        }
    }

    public /* synthetic */ C(BarcodeCount barcodeCount) {
        this(barcodeCount, new Handler(Looper.getMainLooper()));
    }
}
