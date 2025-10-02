package com.scandit.datacapture.core.internal.module.ui;

import android.graphics.SurfaceTexture;
import com.scandit.datacapture.core.A2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class g extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DataCaptureTextureView f18633a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DataCaptureTextureView dataCaptureTextureView) {
        super(1);
        this.f18633a = dataCaptureTextureView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        A2 use = (A2) obj;
        Intrinsics.h(use, "$this$use");
        SurfaceTexture surfaceTexture = this.f18633a.getSurfaceTexture();
        if (surfaceTexture == null) {
            throw new IllegalStateException("Required value was null.");
        }
        use.a(surfaceTexture, new d(this.f18633a), new e(this.f18633a), this.f18633a.f18591a.get_optimizesRendering(), new f(this.f18633a));
        return Unit.f24250a;
    }
}
