package com.scandit.datacapture.core.source.serialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FrameSourceDeserializer f18868a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(FrameSourceDeserializer frameSourceDeserializer) {
        super(0);
        this.f18868a = frameSourceDeserializer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f18868a;
    }
}
