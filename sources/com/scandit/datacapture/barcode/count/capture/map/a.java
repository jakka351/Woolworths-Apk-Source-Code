package com.scandit.datacapture.barcode.count.capture.map;

import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeBarcode f17508a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NativeBarcode nativeBarcode) {
        super(0);
        this.f17508a = nativeBarcode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        NativeBarcode _0 = this.f17508a;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convert(_0);
    }
}
