package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.SizeWithUnit;
import com.scandit.datacapture.core.common.geometry.SizeWithUnitAndAspect;
import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeSizeWithUnitAndAspect;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeViewfinder;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0017¢\u0006\u0002\u0010\u0003B\u0019\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u000f\b\u0000\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010-\u001a\u00020\nH\u0097\u0001J\t\u0010.\u001a\u00020/H\u0097\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0019H\u0097\u0001J\u0019\u00105\u001a\u0002012\u0006\u00106\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u0019H\u0097\u0001J\u000e\u00108\u001a\u0002012\u0006\u00109\u001a\u00020:J\u0019\u0010;\u001a\u0002012\u0006\u0010<\u001a\u0002032\u0006\u0010=\u001a\u00020\u0019H\u0097\u0001R(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00138W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u00198W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00138W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R$\u0010\"\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u00198W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00078WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00058WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006>"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinder;", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderProxy;", "()V", "style", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderStyle;", "lineStyle", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderLineStyle;", "(Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderStyle;Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderLineStyle;)V", "impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinder;", "(Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinder;)V", "<set-?>", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderAnimation;", "animation", "getAnimation", "()Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderAnimation;", "setAnimation", "(Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderAnimation;)V", "", "color", "getColor", "()I", "setColor", "(I)V", "", "dimming", "getDimming", "()F", "setDimming", "(F)V", "disabledColor", "getDisabledColor", "setDisabledColor", "disabledDimming", "getDisabledDimming", "setDisabledDimming", "getLineStyle", "()Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderLineStyle;", "sizeWithUnitAndAspect", "Lcom/scandit/datacapture/core/common/geometry/SizeWithUnitAndAspect;", "getSizeWithUnitAndAspect", "()Lcom/scandit/datacapture/core/common/geometry/SizeWithUnitAndAspect;", "getStyle", "()Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderStyle;", "_impl", "_viewfinderImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeViewfinder;", "setHeightAndAspectRatio", "", "height", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "widthToHeightAspect", "setShorterDimensionAndAspectRatio", "shorterDimension", "aspect", "setSize", "size", "Lcom/scandit/datacapture/core/common/geometry/SizeWithUnit;", "setWidthAndAspectRatio", "width", "heightToWidthAspect", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RectangularViewfinder implements Viewfinder, RectangularViewfinderProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ RectangularViewfinderProxyAdapter f18961a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RectangularViewfinder(@NotNull RectangularViewfinderStyle style) {
        this(style, null, 2, 0 == true ? 1 : 0);
        Intrinsics.h(style, "style");
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeRectangularViewfinder getF18965a() {
        return this.f18961a.getF18965a();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.Viewfinder
    @NativeImpl
    @NotNull
    /* renamed from: _viewfinderImpl */
    public NativeViewfinder getC() {
        return this.f18961a.getC();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction(property = "animation")
    @Nullable
    public RectangularViewfinderAnimation getAnimation() {
        return this.f18961a.getAnimation();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction(property = "color")
    public int getColor() {
        return this.f18961a.getColor();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction(property = "dimming")
    public float getDimming() {
        return this.f18961a.getDimming();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction(property = "disabledColor")
    public int getDisabledColor() {
        return this.f18961a.getDisabledColor();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction(property = "disabledDimming")
    public float getDisabledDimming() {
        return this.f18961a.getDisabledDimming();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction(property = "lineStyle")
    @NotNull
    public RectangularViewfinderLineStyle getLineStyle() {
        return this.f18961a.getLineStyle();
    }

    @NotNull
    public final SizeWithUnitAndAspect getSizeWithUnitAndAspect() {
        NativeSizeWithUnitAndAspect sizeWithUnitAndAspect = getF18965a().getSizeWithUnitAndAspect();
        Intrinsics.g(sizeWithUnitAndAspect, "_impl().sizeWithUnitAndAspect");
        return new SizeWithUnitAndAspect(sizeWithUnitAndAspect);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction(property = "style")
    @NotNull
    public RectangularViewfinderStyle getStyle() {
        return this.f18961a.getStyle();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction(property = "animation")
    public void setAnimation(@Nullable RectangularViewfinderAnimation rectangularViewfinderAnimation) {
        this.f18961a.setAnimation(rectangularViewfinderAnimation);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction(property = "color")
    public void setColor(int i) {
        this.f18961a.setColor(i);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction(property = "dimming")
    public void setDimming(float f) {
        this.f18961a.setDimming(f);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction(property = "disabledColor")
    public void setDisabledColor(int i) {
        this.f18961a.setDisabledColor(i);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction(property = "disabledDimming")
    public void setDisabledDimming(float f) {
        this.f18961a.setDisabledDimming(f);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction
    public void setHeightAndAspectRatio(@NotNull FloatWithUnit height, float widthToHeightAspect) {
        Intrinsics.h(height, "height");
        this.f18961a.setHeightAndAspectRatio(height, widthToHeightAspect);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction
    public void setShorterDimensionAndAspectRatio(float shorterDimension, float aspect) {
        this.f18961a.setShorterDimensionAndAspectRatio(shorterDimension, aspect);
    }

    public final void setSize(@NotNull SizeWithUnit size) {
        Intrinsics.h(size, "size");
        getF18965a().setWidthAndHeight(size.getWidth(), size.getHeight());
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction
    public void setWidthAndAspectRatio(@NotNull FloatWithUnit width, float heightToWidthAspect) {
        Intrinsics.h(width, "width");
        this.f18961a.setWidthAndAspectRatio(width, heightToWidthAspect);
    }

    public RectangularViewfinder(@NotNull NativeRectangularViewfinder impl) {
        Intrinsics.h(impl, "impl");
        this.f18961a = new RectangularViewfinderProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public RectangularViewfinder() {
        NativeRectangularViewfinder nativeRectangularViewfinderCreate = NativeRectangularViewfinder.create();
        Intrinsics.g(nativeRectangularViewfinderCreate, "create()");
        this(nativeRectangularViewfinderCreate);
    }

    public /* synthetic */ RectangularViewfinder(RectangularViewfinderStyle rectangularViewfinderStyle, RectangularViewfinderLineStyle rectangularViewfinderLineStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rectangularViewfinderStyle, (i & 2) != 0 ? RectangularViewfinderLineStyle.LIGHT : rectangularViewfinderLineStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public RectangularViewfinder(@NotNull RectangularViewfinderStyle style, @NotNull RectangularViewfinderLineStyle lineStyle) {
        Intrinsics.h(style, "style");
        Intrinsics.h(lineStyle, "lineStyle");
        NativeRectangularViewfinder nativeRectangularViewfinderCreateForStyles = NativeRectangularViewfinder.createForStyles(RectangularViewfinderStyleKt.toNative(style), RectangularViewfinderLineStyleKt.toNative(lineStyle));
        Intrinsics.g(nativeRectangularViewfinderCreateForStyles, "createForStyles(style.to…(), lineStyle.toNative())");
        this(nativeRectangularViewfinderCreateForStyles);
    }
}
