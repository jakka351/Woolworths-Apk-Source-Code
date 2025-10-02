package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelection;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.selection.capture.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0833a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeBarcodeSelection f18041a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0833a(NativeBarcodeSelection nativeBarcodeSelection) {
        super(0);
        this.f18041a = nativeBarcodeSelection;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NativeBarcodeSelectionSession session = this.f18041a.getSession();
        Intrinsics.g(session, "impl.session");
        return session;
    }
}
