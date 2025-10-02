package com.scandit.datacapture.barcode.count.capture.list;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureList;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureListSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeBarcodeCountCaptureList f17497a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NativeBarcodeCountCaptureList nativeBarcodeCountCaptureList) {
        super(0);
        this.f17497a = nativeBarcodeCountCaptureList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NativeBarcodeCountCaptureListSession session = this.f17497a.getSession();
        Intrinsics.g(session, "impl.session");
        return session;
    }
}
