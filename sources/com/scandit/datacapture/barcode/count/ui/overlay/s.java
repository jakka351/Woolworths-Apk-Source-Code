package com.scandit.datacapture.barcode.count.ui.overlay;

import com.scandit.datacapture.barcode.filter.ui.overlay.NativeBarcodeFilterOverlaySettings;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class s extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeBarcodeFilterOverlaySettings f17566a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(NativeBarcodeFilterOverlaySettings nativeBarcodeFilterOverlaySettings) {
        super(0);
        this.f17566a = nativeBarcodeFilterOverlaySettings;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        NativeBarcodeFilterOverlaySettings _0 = this.f17566a;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convert(_0);
    }
}
