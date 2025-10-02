package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeLaserlineViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeViewfinder;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0017¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u001c\u001a\u00020\bH\u0097\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u0097\u0001R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00058WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u00168W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/LaserlineViewfinder;", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "Lcom/scandit/datacapture/core/ui/viewfinder/LaserlineViewfinderProxy;", "()V", "style", "Lcom/scandit/datacapture/core/ui/viewfinder/LaserlineViewfinderStyle;", "(Lcom/scandit/datacapture/core/ui/viewfinder/LaserlineViewfinderStyle;)V", "impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeLaserlineViewfinder;", "(Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeLaserlineViewfinder;)V", "<set-?>", "", "disabledColor", "getDisabledColor", "()I", "setDisabledColor", "(I)V", "enabledColor", "getEnabledColor", "setEnabledColor", "getStyle", "()Lcom/scandit/datacapture/core/ui/viewfinder/LaserlineViewfinderStyle;", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "width", "getWidth", "()Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "setWidth", "(Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;)V", "_impl", "_viewfinderImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeViewfinder;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LaserlineViewfinder implements Viewfinder, LaserlineViewfinderProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ LaserlineViewfinderProxyAdapter f18958a;

    public LaserlineViewfinder(@NotNull NativeLaserlineViewfinder impl) {
        Intrinsics.h(impl, "impl");
        this.f18958a = new LaserlineViewfinderProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinderProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeLaserlineViewfinder getF18959a() {
        return this.f18958a.getF18959a();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.Viewfinder
    @NativeImpl
    @NotNull
    /* renamed from: _viewfinderImpl */
    public NativeViewfinder getC() {
        return this.f18958a.getC();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinderProxy
    @ProxyFunction(property = "disabledColor")
    public int getDisabledColor() {
        return this.f18958a.getDisabledColor();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinderProxy
    @ProxyFunction(property = "enabledColor")
    public int getEnabledColor() {
        return this.f18958a.getEnabledColor();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinderProxy
    @ProxyFunction(property = "style")
    @NotNull
    public LaserlineViewfinderStyle getStyle() {
        return this.f18958a.getStyle();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinderProxy
    @ProxyFunction(property = "width")
    @NotNull
    public FloatWithUnit getWidth() {
        return this.f18958a.getWidth();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinderProxy
    @ProxyFunction(property = "disabledColor")
    public void setDisabledColor(int i) {
        this.f18958a.setDisabledColor(i);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinderProxy
    @ProxyFunction(property = "enabledColor")
    public void setEnabledColor(int i) {
        this.f18958a.setEnabledColor(i);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinderProxy
    @ProxyFunction(property = "width")
    public void setWidth(@NotNull FloatWithUnit floatWithUnit) {
        Intrinsics.h(floatWithUnit, "<set-?>");
        this.f18958a.setWidth(floatWithUnit);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public LaserlineViewfinder() {
        NativeLaserlineViewfinder nativeLaserlineViewfinderCreate = NativeLaserlineViewfinder.create();
        Intrinsics.g(nativeLaserlineViewfinderCreate, "create()");
        this(nativeLaserlineViewfinderCreate);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LaserlineViewfinder(@NotNull LaserlineViewfinderStyle style) {
        Intrinsics.h(style, "style");
        NativeLaserlineViewfinder nativeLaserlineViewfinderCreateForStyle = NativeLaserlineViewfinder.createForStyle(LaserlineViewfinderStyleKt.toNative(style));
        Intrinsics.g(nativeLaserlineViewfinderCreateForStyle, "createForStyle(style.toNative())");
        this(nativeLaserlineViewfinderCreateForStyle);
    }
}
