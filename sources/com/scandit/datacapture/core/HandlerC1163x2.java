package com.scandit.datacapture.core;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Message;
import android.view.Choreographer;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.x2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class HandlerC1163x2 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f18987a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1163x2(A2 parent) {
        super(parent.getLooper());
        Intrinsics.h(parent, "parent");
        this.f18987a = new WeakReference(parent);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.h(msg, "msg");
        A2 a2 = (A2) this.f18987a.get();
        if (a2 == null) {
            return;
        }
        switch (msg.what) {
            case 1:
                Object obj = msg.obj;
                Intrinsics.f(obj, "null cannot be cast to non-null type com.scandit.datacapture.core.internal.module.gl.GlRenderThread.SurfaceTextureData");
                A2.a(a2, (C1181z2) obj);
                break;
            case 2:
                A2.a(a2);
                break;
            case 3:
                Choreographer choreographer = a2.k;
                if (choreographer != null) {
                    choreographer.postFrameCallback(a2);
                    break;
                }
                break;
            case 4:
                Choreographer choreographer2 = a2.k;
                if (choreographer2 != null) {
                    Object obj2 = msg.obj;
                    Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.Long");
                    choreographer2.postFrameCallbackDelayed(a2, ((Long) obj2).longValue());
                    break;
                }
                break;
            case 5:
                A2.d(a2);
                break;
            case 6:
                Object obj3 = msg.obj;
                Intrinsics.f(obj3, "null cannot be cast to non-null type android.graphics.SurfaceTexture");
                A2.b(a2, (SurfaceTexture) obj3);
                break;
        }
    }
}
