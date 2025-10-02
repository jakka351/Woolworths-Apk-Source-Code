package com.scandit.datacapture.core.source.serialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class k extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FrameSourceDeserializerListener f18871a;
    final /* synthetic */ FrameSourceDeserializerProxyAdapter b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(FrameSourceDeserializerListener frameSourceDeserializerListener, FrameSourceDeserializerProxyAdapter frameSourceDeserializerProxyAdapter) {
        super(0);
        this.f18871a = frameSourceDeserializerListener;
        this.b = frameSourceDeserializerProxyAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new FrameSourceDeserializerListenerReversedAdapter(this.f18871a, this.b._deserializer(), null, 4, null);
    }
}
