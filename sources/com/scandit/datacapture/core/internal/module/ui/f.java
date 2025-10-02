package com.scandit.datacapture.core.internal.module.ui;

import com.scandit.datacapture.core.internal.sdk.ui.NeedsRedrawListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DataCaptureTextureView f18632a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(DataCaptureTextureView dataCaptureTextureView) {
        super(1);
        this.f18632a = dataCaptureTextureView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NeedsRedrawListener listener = (NeedsRedrawListener) obj;
        Intrinsics.h(listener, "listener");
        this.f18632a.f18591a._setNeedsRedrawListener(listener);
        return Unit.f24250a;
    }
}
