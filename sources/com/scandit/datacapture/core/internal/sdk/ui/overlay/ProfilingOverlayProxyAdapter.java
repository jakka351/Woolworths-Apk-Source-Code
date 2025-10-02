package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlayProxyAdapter;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlayProxy;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeProfilingOverlay;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_dataCaptureOverlayImpl", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "_NativeProfilingOverlay", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeProfilingOverlay;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class ProfilingOverlayProxyAdapter implements ProfilingOverlayProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeProfilingOverlay f18746a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeDataCaptureOverlay c;

    public ProfilingOverlayProxyAdapter(@NotNull NativeProfilingOverlay _NativeProfilingOverlay, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeProfilingOverlay, "_NativeProfilingOverlay");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18746a = _NativeProfilingOverlay;
        this.proxyCache = proxyCache;
        NativeDataCaptureOverlay nativeDataCaptureOverlayAsDataCaptureOverlay = _NativeProfilingOverlay.asDataCaptureOverlay();
        Intrinsics.g(nativeDataCaptureOverlayAsDataCaptureOverlay, "_NativeProfilingOverlay.asDataCaptureOverlay()");
        this.c = nativeDataCaptureOverlayAsDataCaptureOverlay;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.ProfilingOverlayProxy, com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay
    @NotNull
    /* renamed from: _dataCaptureOverlayImpl, reason: from getter */
    public NativeDataCaptureOverlay getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.ProfilingOverlayProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeProfilingOverlay getF18746a() {
        return this.f18746a;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    public /* synthetic */ ProfilingOverlayProxyAdapter(NativeProfilingOverlay nativeProfilingOverlay, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeProfilingOverlay, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
