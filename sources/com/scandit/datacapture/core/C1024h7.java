package com.scandit.datacapture.core;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.scandit.datacapture.core.internal.sdk.data.Subscription;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* renamed from: com.scandit.datacapture.core.h7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1024h7 implements InterfaceC0979c7 {

    /* renamed from: a, reason: collision with root package name */
    private final Subscription f18530a;
    private final SurfaceTexture b;
    private final Lazy c;

    public C1024h7(Subscription subscription, SurfaceTexture surfaceTexture) {
        Intrinsics.h(subscription, "subscription");
        Intrinsics.h(surfaceTexture, "surfaceTexture");
        this.f18530a = subscription;
        this.b = surfaceTexture;
        this.c = LazyKt.b(new C1015g7(this));
    }

    public final Surface b() {
        return (Surface) this.c.getD();
    }

    public final void a(boolean z) {
        this.f18530a.use(new C1006f7(z));
    }

    public final long b(long j) {
        Ref.LongRef longRef = new Ref.LongRef();
        this.f18530a.use(new C0997e7(longRef, j));
        return longRef.d;
    }

    public final void a(int i, int i2) {
        this.b.setDefaultBufferSize(i, i2);
    }

    public final void a() {
        this.f18530a.dispose();
        b().release();
    }

    public final void a(long j) {
        this.f18530a.use(new C0988d7(j));
    }
}
