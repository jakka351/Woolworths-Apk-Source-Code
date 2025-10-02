package com.scandit.datacapture.core.internal.module.source;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes6.dex */
final class a extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f18576a;

    public a(m delegate) {
        Intrinsics.h(delegate, "delegate");
        this.f18576a = new WeakReference(delegate);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.h(msg, "msg");
        m mVar = (m) this.f18576a.get();
        if (mVar == null) {
            return;
        }
        int i = msg.what;
        if (i == 1) {
            Object obj = msg.obj;
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.Pair<android.graphics.SurfaceTexture, kotlin.Function1<kotlin.Boolean, kotlin.Unit>>");
            Pair pair = (Pair) obj;
            m.a(mVar, (SurfaceTexture) pair.d, (Function1) pair.e);
            return;
        }
        if (i == 2) {
            m.a(mVar, true);
            Object obj2 = msg.obj;
            Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            TypeIntrinsics.d(1, obj2);
            m.c(mVar, (Function1) obj2);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            m.a(mVar);
        } else {
            m.a(mVar, false);
            Object obj3 = msg.obj;
            Intrinsics.f(obj3, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            TypeIntrinsics.d(1, obj3);
            m.c(mVar, (Function1) obj3);
            m.b(mVar);
        }
    }
}
