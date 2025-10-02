package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.https.NativeHttpsSession;
import com.scandit.datacapture.core.internal.module.https.NativeHttpsSessionDelegate;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class K4 implements A7 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f18337a;

    public K4(WeakReference session) {
        Intrinsics.h(session, "session");
        this.f18337a = session;
    }

    @Override // com.scandit.datacapture.core.A7
    public final void a(InterfaceC1186z7 event) {
        NativeHttpsSessionDelegate delegate;
        Intrinsics.h(event, "event");
        NativeHttpsSession nativeHttpsSession = (NativeHttpsSession) this.f18337a.get();
        if (nativeHttpsSession == null) {
            return;
        }
        C1168x7 c1168x7 = event instanceof C1168x7 ? (C1168x7) event : null;
        if (c1168x7 == null) {
            return;
        }
        if (((c1168x7.a() instanceof L7) || (c1168x7.a() instanceof I7)) && (delegate = nativeHttpsSession.getDelegate()) != null) {
            delegate.didComplete(nativeHttpsSession, c1168x7.b());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public K4(NativeHttpsSession session) {
        this(new WeakReference(session));
        Intrinsics.h(session, "session");
    }
}
