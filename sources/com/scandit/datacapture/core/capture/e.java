package com.scandit.datacapture.core.capture;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DataCaptureContext f18435a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DataCaptureContext dataCaptureContext) {
        super(0);
        this.f18435a = dataCaptureContext;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f18435a.getF18429a().onActivityStopped();
        return Unit.f24250a;
    }
}
