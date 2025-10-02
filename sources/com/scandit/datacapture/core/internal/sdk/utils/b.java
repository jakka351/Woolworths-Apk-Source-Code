package com.scandit.datacapture.core.internal.sdk.utils;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.capture.NativeFeatureAvailability;
import com.scandit.datacapture.core.internal.sdk.capture.NativeLicensedFeature;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DataCaptureMode f18773a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DataCaptureMode dataCaptureMode) {
        super(0);
        this.f18773a = dataCaptureMode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NativeDataCaptureContext nativeDataCaptureContext_impl;
        DataCaptureContext c = this.f18773a.getC();
        NativeFeatureAvailability featureAvailability = (c == null || (nativeDataCaptureContext_impl = c.getF18429a()) == null) ? null : nativeDataCaptureContext_impl.getFeatureAvailability(NativeLicensedFeature.BARCODE_AR_FULL);
        return featureAvailability == null ? NativeFeatureAvailability.UNKNOWN : featureAvailability;
    }
}
