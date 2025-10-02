package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickInternal;
import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener;
import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickSession;
import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import com.scandit.datacapture.core.data.FrameData;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class C implements BarcodePickListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17955a;

    public C(BarcodePickView owner) {
        Intrinsics.h(owner, "owner");
        this.f17955a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void a(TrackedObject trackedObject) {
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void b(BarcodePickInternal mode) {
        Intrinsics.h(mode, "mode");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void a(BarcodePickInternal mode, String id, boolean z) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(id, "id");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void b(BarcodePickInternal mode, BarcodePickSession session, FrameData data) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(session, "session");
        Intrinsics.h(data, "data");
        BarcodePickView barcodePickView = (BarcodePickView) this.f17955a.get();
        if (barcodePickView != null) {
            barcodePickView.onSessionUpdated$scandit_barcode_capture(session);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void a(BarcodePickInternal mode) {
        Intrinsics.h(mode, "mode");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void a(BarcodePickInternal mode, Map requestedData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(requestedData, "requestedData");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void a(BarcodePickInternal mode, BarcodePickSession session, FrameData frameData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(session, "session");
        BarcodePickView barcodePickView = (BarcodePickView) this.f17955a.get();
        if (barcodePickView != null) {
            barcodePickView.onPickUpdated$scandit_barcode_capture(session);
        }
    }
}
