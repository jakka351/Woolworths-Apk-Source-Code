package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeAimerViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeViewfinder;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/AimerViewfinderProxyAdapter;", "Lcom/scandit/datacapture/core/ui/viewfinder/AimerViewfinderProxy;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeAimerViewfinder;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeViewfinder;", "_viewfinderImpl", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "p0", "getFrameColor", "()I", "setFrameColor", "(I)V", "frameColor", "getDotColor", "setDotColor", "dotColor", "_NativeAimerViewfinder", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeAimerViewfinder;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class AimerViewfinderProxyAdapter implements AimerViewfinderProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeAimerViewfinder f18955a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeViewfinder c;

    public AimerViewfinderProxyAdapter(@NotNull NativeAimerViewfinder _NativeAimerViewfinder, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeAimerViewfinder, "_NativeAimerViewfinder");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18955a = _NativeAimerViewfinder;
        this.proxyCache = proxyCache;
        NativeViewfinder nativeViewfinderAsViewfinder = _NativeAimerViewfinder.asViewfinder();
        Intrinsics.g(nativeViewfinderAsViewfinder, "_NativeAimerViewfinder.asViewfinder()");
        this.c = nativeViewfinderAsViewfinder;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.AimerViewfinderProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeAimerViewfinder getF18955a() {
        return this.f18955a;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.AimerViewfinderProxy, com.scandit.datacapture.core.ui.viewfinder.Viewfinder
    @NotNull
    /* renamed from: _viewfinderImpl, reason: from getter */
    public NativeViewfinder getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.AimerViewfinderProxy
    public int getDotColor() {
        NativeColor _0 = this.f18955a.getDotColor();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return coreNativeTypeFactory.convert(_0);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.AimerViewfinderProxy
    public int getFrameColor() {
        NativeColor _0 = this.f18955a.getFrameColor();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return coreNativeTypeFactory.convert(_0);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.AimerViewfinderProxy
    public void setDotColor(int i) {
        this.f18955a.setDotColor(CoreNativeTypeFactory.INSTANCE.convert(i));
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.AimerViewfinderProxy
    public void setFrameColor(int i) {
        this.f18955a.setFrameColor(CoreNativeTypeFactory.INSTANCE.convert(i));
    }

    public /* synthetic */ AimerViewfinderProxyAdapter(NativeAimerViewfinder nativeAimerViewfinder, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeAimerViewfinder, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
