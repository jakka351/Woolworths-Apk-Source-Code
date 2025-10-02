package com.scandit.datacapture.core;

import android.os.Handler;
import com.scandit.datacapture.core.internal.sdk.data.DisposableResource;
import com.scandit.datacapture.core.internal.sdk.data.Subscription;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.m7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1069m7 implements InterfaceC1042j7 {

    /* renamed from: a, reason: collision with root package name */
    private DisposableResource f18807a = C1145v2.b();

    public final void a(Handler handler, C1037j2 frameSize, int i, E callback) {
        Intrinsics.h(handler, "handler");
        Intrinsics.h(frameSize, "frameSize");
        Intrinsics.h(callback, "callback");
        Subscription subscriptionStart = this.f18807a.start();
        subscriptionStart.use(new C1060l7(frameSize, i, handler, callback, subscriptionStart));
    }
}
