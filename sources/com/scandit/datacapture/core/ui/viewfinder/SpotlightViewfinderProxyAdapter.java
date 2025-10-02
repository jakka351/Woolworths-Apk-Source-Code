package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeSpotlightViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeViewfinder;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bH\u0016R\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR$\u0010!\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001a¨\u0006%"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/SpotlightViewfinderProxyAdapter;", "Lcom/scandit/datacapture/core/ui/viewfinder/SpotlightViewfinderProxy;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeSpotlightViewfinder;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeViewfinder;", "_viewfinderImpl", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "width", "", "heightToWidthAspect", "", "setWidthAndAspectRatio", "height", "widthToHeightAspect", "setHeightAndAspectRatio", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "p0", "getEnabledBorderColor", "()I", "setEnabledBorderColor", "(I)V", "enabledBorderColor", "getDisabledBorderColor", "setDisabledBorderColor", "disabledBorderColor", "getBackgroundColor", "setBackgroundColor", "backgroundColor", "_NativeSpotlightViewfinder", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeSpotlightViewfinder;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SpotlightViewfinderProxyAdapter implements SpotlightViewfinderProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeSpotlightViewfinder f18968a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeViewfinder c;

    public SpotlightViewfinderProxyAdapter(@NotNull NativeSpotlightViewfinder _NativeSpotlightViewfinder, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeSpotlightViewfinder, "_NativeSpotlightViewfinder");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18968a = _NativeSpotlightViewfinder;
        this.proxyCache = proxyCache;
        NativeViewfinder nativeViewfinderAsViewfinder = _NativeSpotlightViewfinder.asViewfinder();
        Intrinsics.g(nativeViewfinderAsViewfinder, "_NativeSpotlightViewfinder.asViewfinder()");
        this.c = nativeViewfinderAsViewfinder;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.SpotlightViewfinderProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeSpotlightViewfinder getF18968a() {
        return this.f18968a;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.SpotlightViewfinderProxy, com.scandit.datacapture.core.ui.viewfinder.Viewfinder
    @NotNull
    /* renamed from: _viewfinderImpl, reason: from getter */
    public NativeViewfinder getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.SpotlightViewfinderProxy
    public int getBackgroundColor() {
        NativeColor _0 = this.f18968a.getBackgroundColor();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return coreNativeTypeFactory.convert(_0);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.SpotlightViewfinderProxy
    public int getDisabledBorderColor() {
        NativeColor _0 = this.f18968a.getDisabledBorderColor();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return coreNativeTypeFactory.convert(_0);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.SpotlightViewfinderProxy
    public int getEnabledBorderColor() {
        NativeColor _0 = this.f18968a.getEnabledBorderColor();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return coreNativeTypeFactory.convert(_0);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.SpotlightViewfinderProxy
    public void setBackgroundColor(int i) {
        this.f18968a.setBackgroundColor(CoreNativeTypeFactory.INSTANCE.convert(i));
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.SpotlightViewfinderProxy
    public void setDisabledBorderColor(int i) {
        this.f18968a.setDisabledBorderColor(CoreNativeTypeFactory.INSTANCE.convert(i));
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.SpotlightViewfinderProxy
    public void setEnabledBorderColor(int i) {
        this.f18968a.setEnabledBorderColor(CoreNativeTypeFactory.INSTANCE.convert(i));
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.SpotlightViewfinderProxy
    public void setHeightAndAspectRatio(@NotNull FloatWithUnit height, float widthToHeightAspect) {
        Intrinsics.h(height, "height");
        this.f18968a.setHeightAndAspectRatio(height, widthToHeightAspect);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.SpotlightViewfinderProxy
    public void setWidthAndAspectRatio(@NotNull FloatWithUnit width, float heightToWidthAspect) {
        Intrinsics.h(width, "width");
        this.f18968a.setWidthAndAspectRatio(width, heightToWidthAspect);
    }

    public /* synthetic */ SpotlightViewfinderProxyAdapter(NativeSpotlightViewfinder nativeSpotlightViewfinder, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeSpotlightViewfinder, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
