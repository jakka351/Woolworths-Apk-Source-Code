package com.scandit.datacapture.core.internal.module.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class h implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DataCaptureTextureView f18634a;

    public h(DataCaptureTextureView dataCaptureTextureView) {
        this.f18634a = dataCaptureTextureView;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i, int i2) {
        Intrinsics.h(surface, "surface");
        DataCaptureTextureView.e(this.f18634a);
        this.f18634a.f18591a.onSurfaceTextureAvailable$scandit_capture_core();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        Intrinsics.h(surface, "surface");
        DataCaptureTextureView.b(this.f18634a, surface);
        this.f18634a.f18591a.onSurfaceTextureDestroyed$scandit_capture_core();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i, int i2) {
        Intrinsics.h(surface, "surface");
        DataCaptureTextureView.a(this.f18634a, surface);
        this.f18634a.f18591a._setNeedsRedraw();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        Intrinsics.h(surface, "surface");
        this.f18634a.f18591a.onSurfaceTextureUpdated$scandit_capture_core();
    }
}
