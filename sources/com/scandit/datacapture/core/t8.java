package com.scandit.datacapture.core;

import android.graphics.SurfaceTexture;
import com.scandit.datacapture.core.internal.sdk.data.Subscription;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class t8 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ t8(int i, Object obj, Object obj2, Object obj3) {
        this.d = i;
        this.f = obj;
        this.g = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                C1051k7.a((InterfaceC1033i7) this.f, (Subscription) this.g, (SurfaceTexture) this.e);
                break;
            case 1:
                A2.a((A2) this.f, (SurfaceTexture) this.e, (Function0) this.g);
                break;
            case 2:
                C0993e3.a((V2) this.f, (Z2) this.g, (C0993e3) this.e);
                break;
            default:
                C0993e3.a((V2) this.f, (C0957a3) this.g, (C0993e3) this.e);
                break;
        }
    }

    public /* synthetic */ t8(A2 a2, SurfaceTexture surfaceTexture, Function0 function0) {
        this.d = 1;
        this.f = a2;
        this.e = surfaceTexture;
        this.g = function0;
    }
}
