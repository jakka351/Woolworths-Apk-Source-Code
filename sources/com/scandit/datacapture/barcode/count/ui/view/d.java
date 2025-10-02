package com.scandit.datacapture.barcode.count.ui.view;

import com.scandit.datacapture.barcode.count.capture.BarcodeCountFeedbackChangeListener;
import com.scandit.datacapture.barcode.count.feedback.BarcodeCountFeedback;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiHandler;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class d implements BarcodeCountFeedbackChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17577a;

    public d(BarcodeCountView owner) {
        Intrinsics.h(owner, "owner");
        this.f17577a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountFeedbackChangeListener
    public final void feedbackChanged(BarcodeCountFeedback feedback) {
        BarcodeCountUiHandler barcodeCountUiHandler;
        Intrinsics.h(feedback, "feedback");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f17577a.get();
        if (barcodeCountView == null || (barcodeCountUiHandler = barcodeCountView.f) == null) {
            return;
        }
        barcodeCountUiHandler.a(feedback);
    }
}
