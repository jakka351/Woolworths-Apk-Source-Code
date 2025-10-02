package com.scandit.datacapture.core.internal.module.ui;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DataCaptureTextureView f18618a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DataCaptureTextureView dataCaptureTextureView) {
        super(0);
        this.f18618a = dataCaptureTextureView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Float.valueOf(this.f18618a.getResources().getDisplayMetrics().density);
    }
}
