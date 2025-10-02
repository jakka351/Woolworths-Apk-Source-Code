package com.scandit.datacapture.core.internal.module.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DataCaptureTextureView f18631a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DataCaptureTextureView dataCaptureTextureView) {
        super(0);
        this.f18631a = dataCaptureTextureView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f18631a.f18591a._setNeedsRedraw();
        this.f18631a.g.set(true);
        return Unit.f24250a;
    }
}
