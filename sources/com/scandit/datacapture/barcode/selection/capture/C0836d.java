package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.selection.capture.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0836d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeBarcode f18044a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0836d(NativeBarcode nativeBarcode) {
        super(0);
        this.f18044a = nativeBarcode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return BarcodeNativeTypeFactory.INSTANCE.convert(this.f18044a);
    }
}
