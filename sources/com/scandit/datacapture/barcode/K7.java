package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class K7 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeTrackedBarcode f17216a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K7(NativeTrackedBarcode nativeTrackedBarcode) {
        super(0);
        this.f17216a = nativeTrackedBarcode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return BarcodeNativeTypeFactory.INSTANCE.convert(this.f17216a);
    }
}
