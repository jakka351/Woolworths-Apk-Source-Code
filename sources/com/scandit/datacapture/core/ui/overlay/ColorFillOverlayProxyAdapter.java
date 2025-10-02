package com.scandit.datacapture.core.ui.overlay;

import com.scandit.datacapture.core.internal.module.ui.NativeColorFillOverlay;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/scandit/datacapture/core/ui/overlay/ColorFillOverlayProxyAdapter;", "Lcom/scandit/datacapture/core/ui/overlay/ColorFillOverlayProxy;", "Lcom/scandit/datacapture/core/internal/module/ui/NativeColorFillOverlay;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_dataCaptureOverlayImpl", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "p0", "getColor", "()I", "setColor", "(I)V", "color", "_NativeColorFillOverlay", "<init>", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeColorFillOverlay;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class ColorFillOverlayProxyAdapter implements ColorFillOverlayProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeColorFillOverlay f18936a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeDataCaptureOverlay c;

    public ColorFillOverlayProxyAdapter(@NotNull NativeColorFillOverlay _NativeColorFillOverlay, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeColorFillOverlay, "_NativeColorFillOverlay");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18936a = _NativeColorFillOverlay;
        this.proxyCache = proxyCache;
        NativeDataCaptureOverlay nativeDataCaptureOverlayAsDataCaptureOverlay = _NativeColorFillOverlay.asDataCaptureOverlay();
        Intrinsics.g(nativeDataCaptureOverlayAsDataCaptureOverlay, "_NativeColorFillOverlay.asDataCaptureOverlay()");
        this.c = nativeDataCaptureOverlayAsDataCaptureOverlay;
    }

    @Override // com.scandit.datacapture.core.ui.overlay.ColorFillOverlayProxy, com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay
    @NotNull
    /* renamed from: _dataCaptureOverlayImpl, reason: from getter */
    public NativeDataCaptureOverlay getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.core.ui.overlay.ColorFillOverlayProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeColorFillOverlay getF18936a() {
        return this.f18936a;
    }

    @Override // com.scandit.datacapture.core.ui.overlay.ColorFillOverlayProxy
    public int getColor() {
        NativeColor _0 = this.f18936a.getColor();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return coreNativeTypeFactory.convert(_0);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.ui.overlay.ColorFillOverlayProxy
    public void setColor(int i) {
        this.f18936a.setColor(CoreNativeTypeFactory.INSTANCE.convert(i));
    }

    public /* synthetic */ ColorFillOverlayProxyAdapter(NativeColorFillOverlay nativeColorFillOverlay, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeColorFillOverlay, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
