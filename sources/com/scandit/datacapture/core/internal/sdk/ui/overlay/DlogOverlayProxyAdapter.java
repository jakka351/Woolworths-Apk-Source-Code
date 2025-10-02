package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/DlogOverlayProxyAdapter;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/DlogOverlayProxy;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDlogOverlay;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_dataCaptureOverlayImpl", "", "globFilter", "", "setGlobFilter", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "_NativeDlogOverlay", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDlogOverlay;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class DlogOverlayProxyAdapter implements DlogOverlayProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeDlogOverlay f18742a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeDataCaptureOverlay c;

    public DlogOverlayProxyAdapter(@NotNull NativeDlogOverlay _NativeDlogOverlay, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeDlogOverlay, "_NativeDlogOverlay");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18742a = _NativeDlogOverlay;
        this.proxyCache = proxyCache;
        NativeDataCaptureOverlay nativeDataCaptureOverlayAsDataCaptureOverlay = _NativeDlogOverlay.asDataCaptureOverlay();
        Intrinsics.g(nativeDataCaptureOverlayAsDataCaptureOverlay, "_NativeDlogOverlay.asDataCaptureOverlay()");
        this.c = nativeDataCaptureOverlayAsDataCaptureOverlay;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.DlogOverlayProxy, com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay
    @NotNull
    /* renamed from: _dataCaptureOverlayImpl, reason: from getter */
    public NativeDataCaptureOverlay getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.DlogOverlayProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeDlogOverlay getF18742a() {
        return this.f18742a;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.DlogOverlayProxy
    public void setGlobFilter(@NotNull String globFilter) {
        Intrinsics.h(globFilter, "globFilter");
        this.f18742a.setGlobFilter(globFilter);
    }

    public /* synthetic */ DlogOverlayProxyAdapter(NativeDlogOverlay nativeDlogOverlay, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeDlogOverlay, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
