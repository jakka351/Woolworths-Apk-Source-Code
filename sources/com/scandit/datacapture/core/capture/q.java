package com.scandit.datacapture.core.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class q extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DataCaptureContext f18447a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(DataCaptureContext dataCaptureContext) {
        super(0);
        this.f18447a = dataCaptureContext;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f18447a;
    }
}
