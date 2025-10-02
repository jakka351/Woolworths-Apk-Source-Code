package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener;
import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountSession;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.core.data.FrameData;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class Q implements InternalBarcodeCountListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17273a;

    public Q(C0544c0 owner) {
        Intrinsics.h(owner, "owner");
        this.f17273a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener
    public final void a(InternalBarcodeCountSession session, TrackedBarcode trackedBarcode) {
        Intrinsics.h(session, "session");
        Intrinsics.h(trackedBarcode, "trackedBarcode");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener
    public final void b(BarcodeCount mode, InternalBarcodeCountSession session, FrameData data) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(session, "session");
        Intrinsics.h(data, "data");
        C0544c0 c0544c0 = (C0544c0) this.f17273a.get();
        if (c0544c0 != null) {
            c0544c0.w = false;
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener
    public final void onObservationStarted(BarcodeCount mode) {
        Intrinsics.h(mode, "mode");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener
    public final void onObservationStopped(BarcodeCount mode) {
        Intrinsics.h(mode, "mode");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener
    public final void a(BarcodeCount mode, InternalBarcodeCountSession session, FrameData data) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(session, "session");
        Intrinsics.h(data, "data");
        C0544c0 c0544c0 = (C0544c0) this.f17273a.get();
        if (c0544c0 == null || session.d()) {
            return;
        }
        if (!c0544c0.k()) {
            ((C0536b8) c0544c0.b).a(session, V7.f17326a);
        }
        if (c0544c0.u.t() && !c0544c0.w) {
            ((Gd) c0544c0.f).a(!session.e().isEmpty(), C0937yd.f18277a);
        }
        O oJ = c0544c0.j();
        if (oJ != null) {
            oJ.a(session);
        }
    }
}
