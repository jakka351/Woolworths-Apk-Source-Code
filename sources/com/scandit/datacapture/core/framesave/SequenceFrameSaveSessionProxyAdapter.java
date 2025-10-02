package com.scandit.datacapture.core.framesave;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.framesave.NativeFrameSaveSession;
import com.scandit.datacapture.core.internal.module.framesave.NativeSequenceFrameSaveSession;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016R\u001a\u0010\u0016\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/scandit/datacapture/core/framesave/SequenceFrameSaveSessionProxyAdapter;", "Lcom/scandit/datacapture/core/framesave/SequenceFrameSaveSessionProxy;", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeSequenceFrameSaveSession;", "_impl", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeFrameSaveSession;", "_frameSaveSessionImpl", "Lcom/scandit/datacapture/core/framesave/FrameSaveSession;", "frameSaveSession", "", "_setFrameSaveSession", "_getFrameSaveSession", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "addToContext", "removeFromContext", "start", "stop", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "_NativeSequenceFrameSaveSession", "<init>", "(Lcom/scandit/datacapture/core/internal/module/framesave/NativeSequenceFrameSaveSession;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SequenceFrameSaveSessionProxyAdapter implements SequenceFrameSaveSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeSequenceFrameSaveSession f18510a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeFrameSaveSession c;
    private FrameSaveSession d;

    public SequenceFrameSaveSessionProxyAdapter(@NotNull NativeSequenceFrameSaveSession _NativeSequenceFrameSaveSession, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeSequenceFrameSaveSession, "_NativeSequenceFrameSaveSession");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18510a = _NativeSequenceFrameSaveSession;
        this.proxyCache = proxyCache;
        NativeFrameSaveSession nativeFrameSaveSessionAsFrameSaveSession = _NativeSequenceFrameSaveSession.asFrameSaveSession();
        Intrinsics.g(nativeFrameSaveSessionAsFrameSaveSession, "_NativeSequenceFrameSave…sion.asFrameSaveSession()");
        this.c = nativeFrameSaveSessionAsFrameSaveSession;
    }

    @Override // com.scandit.datacapture.core.framesave.SequenceFrameSaveSessionProxy, com.scandit.datacapture.core.framesave.FrameSaveSession, com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    @NotNull
    /* renamed from: _frameSaveSessionImpl, reason: from getter */
    public NativeFrameSaveSession getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.core.framesave.SequenceFrameSaveSessionProxy
    @NotNull
    public FrameSaveSession _getFrameSaveSession() {
        FrameSaveSession frameSaveSession = this.d;
        if (frameSaveSession != null) {
            return frameSaveSession;
        }
        Intrinsics.p("_setFrameSaveSession_backing_field");
        throw null;
    }

    @Override // com.scandit.datacapture.core.framesave.SequenceFrameSaveSessionProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeSequenceFrameSaveSession getF18510a() {
        return this.f18510a;
    }

    @Override // com.scandit.datacapture.core.framesave.SequenceFrameSaveSessionProxy
    public void _setFrameSaveSession(@NotNull FrameSaveSession frameSaveSession) {
        Intrinsics.h(frameSaveSession, "frameSaveSession");
        this.d = frameSaveSession;
    }

    @Override // com.scandit.datacapture.core.framesave.SequenceFrameSaveSessionProxy, com.scandit.datacapture.core.framesave.FrameSaveSession, com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    public void addToContext(@NotNull DataCaptureContext dataCaptureContext) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        NativeDataCaptureContext nativeDataCaptureContext_impl = dataCaptureContext.getF18429a();
        this.proxyCache.put(Reflection.f24268a.b(NativeDataCaptureContext.class), null, nativeDataCaptureContext_impl, dataCaptureContext);
        this.f18510a.addToContext(nativeDataCaptureContext_impl);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.framesave.SequenceFrameSaveSessionProxy, com.scandit.datacapture.core.framesave.FrameSaveSession, com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    public void removeFromContext(@NotNull DataCaptureContext dataCaptureContext) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        NativeDataCaptureContext nativeDataCaptureContext_impl = dataCaptureContext.getF18429a();
        this.proxyCache.put(Reflection.f24268a.b(NativeDataCaptureContext.class), null, nativeDataCaptureContext_impl, dataCaptureContext);
        this.f18510a.removeFromContext(nativeDataCaptureContext_impl);
    }

    @Override // com.scandit.datacapture.core.framesave.SequenceFrameSaveSessionProxy
    public void start() {
        this.f18510a.start();
    }

    @Override // com.scandit.datacapture.core.framesave.SequenceFrameSaveSessionProxy
    public void stop() {
        this.f18510a.stop();
    }

    public /* synthetic */ SequenceFrameSaveSessionProxyAdapter(NativeSequenceFrameSaveSession nativeSequenceFrameSaveSession, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeSequenceFrameSaveSession, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
