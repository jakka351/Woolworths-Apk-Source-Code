package com.scandit.datacapture.core.ui.serialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class j extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DataCaptureViewDeserializerHelper f18951a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(DataCaptureViewDeserializerHelper dataCaptureViewDeserializerHelper) {
        super(0);
        this.f18951a = dataCaptureViewDeserializerHelper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new DataCaptureViewDeserializerHelperReversedAdapter(this.f18951a, null, 2, null);
    }
}
