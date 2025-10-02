package com.scandit.datacapture.core;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class HandlerC1097q extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f18817a;

    public HandlerC1097q(C1115s pool) {
        Intrinsics.h(pool, "pool");
        this.f18817a = new WeakReference(pool);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.h(msg, "msg");
        C1115s c1115s = (C1115s) this.f18817a.get();
        if (c1115s == null) {
            return;
        }
        Object obj = msg.obj;
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.ByteArray");
        C1115s.a(c1115s, (byte[]) obj);
    }
}
