package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class I extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeBarcodeCaptureSettings f17424a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(NativeBarcodeCaptureSettings nativeBarcodeCaptureSettings) {
        super(0);
        this.f17424a = nativeBarcodeCaptureSettings;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        NativeBarcodeCaptureSettings _2 = this.f17424a;
        Intrinsics.g(_2, "_2");
        return barcodeNativeTypeFactory.convert(_2);
    }
}
