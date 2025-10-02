package com.scandit.datacapture.core.framesave;

import com.scandit.datacapture.core.internal.module.framesave.NativeFrameSaveSession;
import com.scandit.datacapture.core.internal.module.framesave.NativeFrameSaveSessionListener;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J \u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016R\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/scandit/datacapture/core/framesave/FrameSaveSessionListenerReversedAdapter;", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeFrameSaveSessionListener;", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeFrameSaveSession;", "session", "", "onObservationStarted", "onObservationStopped", "", "message", "", "remainingQueueSize", "onFrameSaveSuccess", "onFrameSaveFailure", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/core/framesave/FrameSaveSessionListener;", "_FrameSaveSessionListener", "Lcom/scandit/datacapture/core/framesave/FrameSaveSession;", "_FrameSaveSession", "<init>", "(Lcom/scandit/datacapture/core/framesave/FrameSaveSessionListener;Lcom/scandit/datacapture/core/framesave/FrameSaveSession;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class FrameSaveSessionListenerReversedAdapter extends NativeFrameSaveSessionListener {

    /* renamed from: a, reason: collision with root package name */
    private final FrameSaveSessionListener f18509a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final WeakReference c;

    public /* synthetic */ FrameSaveSessionListenerReversedAdapter(FrameSaveSessionListener frameSaveSessionListener, FrameSaveSession frameSaveSession, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(frameSaveSessionListener, frameSaveSession, (i & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.module.framesave.NativeFrameSaveSessionListener
    public void onFrameSaveFailure(@NotNull NativeFrameSaveSession session, @NotNull String message, long remainingQueueSize) {
        Intrinsics.h(session, "session");
        Intrinsics.h(message, "message");
        FrameSaveSession frameSaveSession = (FrameSaveSession) this.c.get();
        if (frameSaveSession != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeFrameSaveSession.class), null, session, new f(frameSaveSession));
            Intrinsics.g(orPut, "{\n            val _0 = p…iningQueueSize)\n        }");
            this.f18509a.onFrameSaveFailure((FrameSaveSession) orPut, message, remainingQueueSize);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.framesave.NativeFrameSaveSessionListener
    public void onFrameSaveSuccess(@NotNull NativeFrameSaveSession session, @NotNull String message, long remainingQueueSize) {
        Intrinsics.h(session, "session");
        Intrinsics.h(message, "message");
        FrameSaveSession frameSaveSession = (FrameSaveSession) this.c.get();
        if (frameSaveSession != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeFrameSaveSession.class), null, session, new g(frameSaveSession));
            Intrinsics.g(orPut, "{\n            val _0 = p…iningQueueSize)\n        }");
            this.f18509a.onFrameSaveSuccess((FrameSaveSession) orPut, message, remainingQueueSize);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.framesave.NativeFrameSaveSessionListener
    public void onObservationStarted(@NotNull NativeFrameSaveSession session) {
        Intrinsics.h(session, "session");
        FrameSaveSession frameSaveSession = (FrameSaveSession) this.c.get();
        if (frameSaveSession != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeFrameSaveSession.class), null, session, new h(frameSaveSession));
            Intrinsics.g(orPut, "{\n            val _0 = p…tionStarted(_0)\n        }");
            this.f18509a.onObservationStarted((FrameSaveSession) orPut);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.framesave.NativeFrameSaveSessionListener
    public void onObservationStopped(@NotNull NativeFrameSaveSession session) {
        Intrinsics.h(session, "session");
        FrameSaveSession frameSaveSession = (FrameSaveSession) this.c.get();
        if (frameSaveSession != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeFrameSaveSession.class), null, session, new i(frameSaveSession));
            Intrinsics.g(orPut, "{\n            val _0 = p…tionStopped(_0)\n        }");
            this.f18509a.onObservationStopped((FrameSaveSession) orPut);
        }
    }

    public FrameSaveSessionListenerReversedAdapter(@NotNull FrameSaveSessionListener _FrameSaveSessionListener, @NotNull FrameSaveSession _FrameSaveSession, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_FrameSaveSessionListener, "_FrameSaveSessionListener");
        Intrinsics.h(_FrameSaveSession, "_FrameSaveSession");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18509a = _FrameSaveSessionListener;
        this.proxyCache = proxyCache;
        this.c = new WeakReference(_FrameSaveSession);
    }
}
