package com.scandit.datacapture.core.ui.serialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class k extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DataCaptureViewDeserializerListener f18952a;
    final /* synthetic */ DataCaptureViewDeserializerProxyAdapter b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(DataCaptureViewDeserializerListener dataCaptureViewDeserializerListener, DataCaptureViewDeserializerProxyAdapter dataCaptureViewDeserializerProxyAdapter) {
        super(0);
        this.f18952a = dataCaptureViewDeserializerListener;
        this.b = dataCaptureViewDeserializerProxyAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new DataCaptureViewDeserializerListenerReversedAdapter(this.f18952a, this.b._deserializer(), null, 4, null);
    }
}
