package com.scandit.datacapture.core.capture.serialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class n extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DataCaptureContextDeserializerHelper f18467a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(DataCaptureContextDeserializerHelper dataCaptureContextDeserializerHelper) {
        super(0);
        this.f18467a = dataCaptureContextDeserializerHelper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new DataCaptureContextDeserializerHelperReversedAdapter(this.f18467a, null, 2, null);
    }
}
