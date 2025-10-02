package com.scandit.datacapture.barcode.tracking.capture;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.tracking.capture.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0861g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeDataCaptureContext f18170a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0861g(NativeDataCaptureContext nativeDataCaptureContext) {
        super(0);
        this.f18170a = nativeDataCaptureContext;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoreNativeTypeFactory.INSTANCE.convert(this.f18170a);
    }
}
