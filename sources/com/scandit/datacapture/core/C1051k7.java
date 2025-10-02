package com.scandit.datacapture.core;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import com.scandit.datacapture.core.internal.sdk.data.Subscription;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.k7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C1051k7 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Handler f18792a;
    final /* synthetic */ InterfaceC1033i7 b;
    final /* synthetic */ Subscription c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1051k7(Handler handler, InterfaceC1033i7 interfaceC1033i7, Subscription subscription) {
        super(1);
        this.f18792a = handler;
        this.b = interfaceC1033i7;
        this.c = subscription;
    }

    public final void a(SurfaceTexture surfaceTexture) {
        Intrinsics.h(surfaceTexture, "surfaceTexture");
        this.f18792a.post(new t8(0, this.b, this.c, surfaceTexture));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((SurfaceTexture) obj);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC1033i7 callback, Subscription renderSubscription, SurfaceTexture surfaceTexture) {
        Intrinsics.h(callback, "$callback");
        Intrinsics.h(renderSubscription, "$renderSubscription");
        Intrinsics.h(surfaceTexture, "$surfaceTexture");
        E e = (E) callback;
        e.f18309a.j = new C1024h7(renderSubscription, surfaceTexture);
        N.a(e.f18309a, e.b, e.c);
    }
}
