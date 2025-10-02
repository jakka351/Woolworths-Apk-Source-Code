package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeDataCaptureContext f18048a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(NativeDataCaptureContext nativeDataCaptureContext) {
        super(0);
        this.f18048a = nativeDataCaptureContext;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoreNativeTypeFactory.INSTANCE.convert(this.f18048a);
    }
}
