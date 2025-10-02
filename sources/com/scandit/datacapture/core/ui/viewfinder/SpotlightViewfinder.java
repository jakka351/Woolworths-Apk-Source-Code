package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.SizeWithUnit;
import com.scandit.datacapture.core.common.geometry.SizeWithUnitAndAspect;
import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeSizeWithUnitAndAspect;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeSpotlightViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeViewfinder;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Deprecated
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0018\u001a\u00020\u0005H\u0097\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u0097\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0097\u0001J\u000e\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#J\u0019\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020 H\u0097\u0001R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR$\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/SpotlightViewfinder;", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "Lcom/scandit/datacapture/core/ui/viewfinder/SpotlightViewfinderProxy;", "()V", "impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeSpotlightViewfinder;", "(Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeSpotlightViewfinder;)V", "<set-?>", "", "backgroundColor", "getBackgroundColor", "()I", "setBackgroundColor", "(I)V", "disabledBorderColor", "getDisabledBorderColor", "setDisabledBorderColor", "enabledBorderColor", "getEnabledBorderColor", "setEnabledBorderColor", "sizeWithUnitAndAspect", "Lcom/scandit/datacapture/core/common/geometry/SizeWithUnitAndAspect;", "getSizeWithUnitAndAspect", "()Lcom/scandit/datacapture/core/common/geometry/SizeWithUnitAndAspect;", "_impl", "_viewfinderImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeViewfinder;", "setHeightAndAspectRatio", "", "height", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "widthToHeightAspect", "", "setSize", "size", "Lcom/scandit/datacapture/core/common/geometry/SizeWithUnit;", "setWidthAndAspectRatio", "width", "heightToWidthAspect", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SpotlightViewfinder implements Viewfinder, SpotlightViewfinderProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SpotlightViewfinderProxyAdapter f18967a;

    public SpotlightViewfinder(@NotNull NativeSpotlightViewfinder impl) {
        Intrinsics.h(impl, "impl");
        this.f18967a = new SpotlightViewfinderProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.SpotlightViewfinderProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeSpotlightViewfinder getF18968a() {
        return this.f18967a.getF18968a();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.Viewfinder
    @NativeImpl
    @NotNull
    /* renamed from: _viewfinderImpl */
    public NativeViewfinder getC() {
        return this.f18967a.getC();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.SpotlightViewfinderProxy
    @ProxyFunction(property = "backgroundColor")
    public int getBackgroundColor() {
        return this.f18967a.getBackgroundColor();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.SpotlightViewfinderProxy
    @ProxyFunction(property = "disabledBorderColor")
    public int getDisabledBorderColor() {
        return this.f18967a.getDisabledBorderColor();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.SpotlightViewfinderProxy
    @ProxyFunction(property = "enabledBorderColor")
    public int getEnabledBorderColor() {
        return this.f18967a.getEnabledBorderColor();
    }

    @NotNull
    public final SizeWithUnitAndAspect getSizeWithUnitAndAspect() {
        NativeSizeWithUnitAndAspect sizeWithUnitAndAspect = getF18968a().getSizeWithUnitAndAspect();
        Intrinsics.g(sizeWithUnitAndAspect, "_impl().sizeWithUnitAndAspect");
        return new SizeWithUnitAndAspect(sizeWithUnitAndAspect);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.SpotlightViewfinderProxy
    @ProxyFunction(property = "backgroundColor")
    public void setBackgroundColor(int i) {
        this.f18967a.setBackgroundColor(i);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.SpotlightViewfinderProxy
    @ProxyFunction(property = "disabledBorderColor")
    public void setDisabledBorderColor(int i) {
        this.f18967a.setDisabledBorderColor(i);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.SpotlightViewfinderProxy
    @ProxyFunction(property = "enabledBorderColor")
    public void setEnabledBorderColor(int i) {
        this.f18967a.setEnabledBorderColor(i);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.SpotlightViewfinderProxy
    @ProxyFunction
    public void setHeightAndAspectRatio(@NotNull FloatWithUnit height, float widthToHeightAspect) {
        Intrinsics.h(height, "height");
        this.f18967a.setHeightAndAspectRatio(height, widthToHeightAspect);
    }

    public final void setSize(@NotNull SizeWithUnit size) {
        Intrinsics.h(size, "size");
        getF18968a().setWidthAndHeight(size.getWidth(), size.getHeight());
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.SpotlightViewfinderProxy
    @ProxyFunction
    public void setWidthAndAspectRatio(@NotNull FloatWithUnit width, float heightToWidthAspect) {
        Intrinsics.h(width, "width");
        this.f18967a.setWidthAndAspectRatio(width, heightToWidthAspect);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SpotlightViewfinder() {
        NativeSpotlightViewfinder nativeSpotlightViewfinderCreate = NativeSpotlightViewfinder.create();
        Intrinsics.g(nativeSpotlightViewfinderCreate, "create()");
        this(nativeSpotlightViewfinderCreate);
    }
}
