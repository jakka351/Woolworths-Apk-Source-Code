package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.capture.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0563i extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeDataCaptureContext f17446a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0563i(NativeDataCaptureContext nativeDataCaptureContext) {
        super(0);
        this.f17446a = nativeDataCaptureContext;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoreNativeTypeFactory.INSTANCE.convert(this.f17446a);
    }
}
