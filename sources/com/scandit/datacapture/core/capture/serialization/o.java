package com.scandit.datacapture.core.capture.serialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class o extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DataCaptureContextDeserializerListener f18468a;
    final /* synthetic */ DataCaptureContextDeserializerProxyAdapter b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(DataCaptureContextDeserializerListener dataCaptureContextDeserializerListener, DataCaptureContextDeserializerProxyAdapter dataCaptureContextDeserializerProxyAdapter) {
        super(0);
        this.f18468a = dataCaptureContextDeserializerListener;
        this.b = dataCaptureContextDeserializerProxyAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new DataCaptureContextDeserializerListenerReversedAdapter(this.f18468a, this.b._deserializer(), null, 4, null);
    }
}
