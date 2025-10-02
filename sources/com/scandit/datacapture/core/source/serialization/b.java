package com.scandit.datacapture.core.source.serialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FrameSourceDeserializer f18862a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FrameSourceDeserializer frameSourceDeserializer) {
        super(0);
        this.f18862a = frameSourceDeserializer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f18862a;
    }
}
