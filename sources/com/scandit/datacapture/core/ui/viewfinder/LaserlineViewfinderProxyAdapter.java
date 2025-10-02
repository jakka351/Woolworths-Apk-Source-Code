package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeLaserlineViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeLaserlineViewfinderStyle;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeViewfinder;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001b\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/LaserlineViewfinderProxyAdapter;", "Lcom/scandit/datacapture/core/ui/viewfinder/LaserlineViewfinderProxy;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeLaserlineViewfinder;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeViewfinder;", "_viewfinderImpl", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "p0", "getWidth", "()Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "setWidth", "(Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;)V", "width", "", "getEnabledColor", "()I", "setEnabledColor", "(I)V", "enabledColor", "getDisabledColor", "setDisabledColor", "disabledColor", "Lcom/scandit/datacapture/core/ui/viewfinder/LaserlineViewfinderStyle;", "getStyle", "()Lcom/scandit/datacapture/core/ui/viewfinder/LaserlineViewfinderStyle;", "style", "_NativeLaserlineViewfinder", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeLaserlineViewfinder;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class LaserlineViewfinderProxyAdapter implements LaserlineViewfinderProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeLaserlineViewfinder f18959a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeViewfinder c;

    public LaserlineViewfinderProxyAdapter(@NotNull NativeLaserlineViewfinder _NativeLaserlineViewfinder, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeLaserlineViewfinder, "_NativeLaserlineViewfinder");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18959a = _NativeLaserlineViewfinder;
        this.proxyCache = proxyCache;
        NativeViewfinder nativeViewfinderAsViewfinder = _NativeLaserlineViewfinder.asViewfinder();
        Intrinsics.g(nativeViewfinderAsViewfinder, "_NativeLaserlineViewfinder.asViewfinder()");
        this.c = nativeViewfinderAsViewfinder;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinderProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeLaserlineViewfinder getF18959a() {
        return this.f18959a;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinderProxy, com.scandit.datacapture.core.ui.viewfinder.Viewfinder
    @NotNull
    /* renamed from: _viewfinderImpl, reason: from getter */
    public NativeViewfinder getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinderProxy
    public int getDisabledColor() {
        NativeColor _0 = this.f18959a.getDisabledColor();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return coreNativeTypeFactory.convert(_0);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinderProxy
    public int getEnabledColor() {
        NativeColor _0 = this.f18959a.getEnabledColor();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return coreNativeTypeFactory.convert(_0);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinderProxy
    @NotNull
    public LaserlineViewfinderStyle getStyle() {
        NativeLaserlineViewfinderStyle _0 = this.f18959a.getStyle();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return coreNativeTypeFactory.convert(_0);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinderProxy
    @NotNull
    public FloatWithUnit getWidth() {
        FloatWithUnit _0 = this.f18959a.getWidth();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinderProxy
    public void setDisabledColor(int i) {
        this.f18959a.setDisabledColor(CoreNativeTypeFactory.INSTANCE.convert(i));
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinderProxy
    public void setEnabledColor(int i) {
        this.f18959a.setEnabledColor(CoreNativeTypeFactory.INSTANCE.convert(i));
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinderProxy
    public void setWidth(@NotNull FloatWithUnit p0) {
        Intrinsics.h(p0, "p0");
        this.f18959a.setWidth(p0);
    }

    public /* synthetic */ LaserlineViewfinderProxyAdapter(NativeLaserlineViewfinder nativeLaserlineViewfinder, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeLaserlineViewfinder, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
