package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class A4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeDataCaptureContext f17090a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A4(NativeDataCaptureContext nativeDataCaptureContext) {
        super(0);
        this.f17090a = nativeDataCaptureContext;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        NativeDataCaptureContext _0 = this.f17090a;
        Intrinsics.g(_0, "_0");
        return coreNativeTypeFactory.convert(_0);
    }
}
