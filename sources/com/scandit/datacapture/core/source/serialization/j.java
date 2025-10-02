package com.scandit.datacapture.core.source.serialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class j extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FrameSourceDeserializerHelper f18870a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(FrameSourceDeserializerHelper frameSourceDeserializerHelper) {
        super(0);
        this.f18870a = frameSourceDeserializerHelper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new FrameSourceDeserializerHelperReversedAdapter(this.f18870a, null, 2, null);
    }
}
