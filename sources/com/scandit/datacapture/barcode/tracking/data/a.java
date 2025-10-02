package com.scandit.datacapture.barcode.tracking.data;

import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeTrackedBarcode f18192a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NativeTrackedBarcode nativeTrackedBarcode) {
        super(0);
        this.f18192a = nativeTrackedBarcode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NativeBarcode barcode = this.f18192a.getBarcode();
        Intrinsics.g(barcode, "impl.barcode");
        return new Barcode(barcode);
    }
}
