package com.scandit.datacapture.core.internal.module.ui;

import android.graphics.SurfaceTexture;
import com.scandit.datacapture.core.A2;
import com.scandit.datacapture.core.internal.sdk.data.Subscription;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class j extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SurfaceTexture f18636a;
    final /* synthetic */ DataCaptureTextureView b;
    final /* synthetic */ Subscription c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(SurfaceTexture surfaceTexture, DataCaptureTextureView dataCaptureTextureView, Subscription subscription) {
        super(1);
        this.f18636a = surfaceTexture;
        this.b = dataCaptureTextureView;
        this.c = subscription;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        A2 use = (A2) obj;
        Intrinsics.h(use, "$this$use");
        SurfaceTexture surfaceTexture = this.f18636a;
        use.a(surfaceTexture, new i(surfaceTexture, this.b, this.c));
        return Unit.f24250a;
    }
}
