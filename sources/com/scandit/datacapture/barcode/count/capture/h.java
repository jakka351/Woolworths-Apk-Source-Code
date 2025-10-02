package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.barcode.filter.capture.NativeBarcodeFilterSettings;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeBarcodeFilterSettings f17485a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(NativeBarcodeFilterSettings nativeBarcodeFilterSettings) {
        super(0);
        this.f17485a = nativeBarcodeFilterSettings;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        NativeBarcodeFilterSettings _0 = this.f17485a;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convert(_0);
    }
}
