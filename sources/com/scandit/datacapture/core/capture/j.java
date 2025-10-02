package com.scandit.datacapture.core.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class j extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DataCaptureContext f18440a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(DataCaptureContext dataCaptureContext) {
        super(0);
        this.f18440a = dataCaptureContext;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f18440a;
    }
}
