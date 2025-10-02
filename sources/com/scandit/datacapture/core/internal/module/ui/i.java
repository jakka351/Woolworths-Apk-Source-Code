package com.scandit.datacapture.core.internal.module.ui;

import android.graphics.SurfaceTexture;
import com.scandit.datacapture.core.internal.sdk.data.Subscription;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class i extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DataCaptureTextureView f18635a;
    final /* synthetic */ Subscription b;
    final /* synthetic */ SurfaceTexture c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SurfaceTexture surfaceTexture, DataCaptureTextureView dataCaptureTextureView, Subscription subscription) {
        super(0);
        this.f18635a = dataCaptureTextureView;
        this.b = subscription;
        this.c = surfaceTexture;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f18635a.d.set(false);
        this.f18635a.f18591a._impl().releaseGlResources();
        this.f18635a.b.releaseGlResources();
        this.b.dispose();
        this.c.release();
        return Unit.f24250a;
    }
}
