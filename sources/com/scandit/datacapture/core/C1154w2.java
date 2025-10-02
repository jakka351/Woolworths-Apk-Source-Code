package com.scandit.datacapture.core;

import android.graphics.SurfaceTexture;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.w2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C1154w2 implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    private final A2 f18982a;

    public C1154w2(A2 parent) {
        Intrinsics.h(parent, "parent");
        this.f18982a = parent;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Intrinsics.h(surfaceTexture, "surfaceTexture");
        A2.a(this.f18982a, surfaceTexture);
        Function0 function0 = this.f18982a.u;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
