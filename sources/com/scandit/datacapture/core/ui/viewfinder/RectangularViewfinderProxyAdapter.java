package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderAnimation;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderLineStyle;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderStyle;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeViewfinder;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u00108\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b9\u0010:J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bH\u0016J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u001a\u0010\u0017\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010!\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R(\u0010+\u001a\u0004\u0018\u00010&2\b\u0010\u0019\u001a\u0004\u0018\u00010&8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R$\u00104\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00107\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b5\u00101\"\u0004\b6\u00103¨\u0006;"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderProxyAdapter;", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderProxy;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinder;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeViewfinder;", "_viewfinderImpl", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "width", "", "heightToWidthAspect", "", "setWidthAndAspectRatio", "height", "widthToHeightAspect", "setHeightAndAspectRatio", "shorterDimension", "aspect", "setShorterDimensionAndAspectRatio", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "p0", "getColor", "()I", "setColor", "(I)V", "color", "getDisabledColor", "setDisabledColor", "disabledColor", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderStyle;", "getStyle", "()Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderStyle;", "style", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderAnimation;", "getAnimation", "()Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderAnimation;", "setAnimation", "(Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderAnimation;)V", "animation", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderLineStyle;", "getLineStyle", "()Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderLineStyle;", "lineStyle", "getDimming", "()F", "setDimming", "(F)V", "dimming", "getDisabledDimming", "setDisabledDimming", "disabledDimming", "_NativeRectangularViewfinder", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinder;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class RectangularViewfinderProxyAdapter implements RectangularViewfinderProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeRectangularViewfinder f18965a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeViewfinder c;

    public RectangularViewfinderProxyAdapter(@NotNull NativeRectangularViewfinder _NativeRectangularViewfinder, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeRectangularViewfinder, "_NativeRectangularViewfinder");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18965a = _NativeRectangularViewfinder;
        this.proxyCache = proxyCache;
        NativeViewfinder nativeViewfinderAsViewfinder = _NativeRectangularViewfinder.asViewfinder();
        Intrinsics.g(nativeViewfinderAsViewfinder, "_NativeRectangularViewfinder.asViewfinder()");
        this.c = nativeViewfinderAsViewfinder;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeRectangularViewfinder getF18965a() {
        return this.f18965a;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy, com.scandit.datacapture.core.ui.viewfinder.Viewfinder
    @NotNull
    /* renamed from: _viewfinderImpl, reason: from getter */
    public NativeViewfinder getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @Nullable
    public RectangularViewfinderAnimation getAnimation() {
        NativeRectangularViewfinderAnimation animation = this.f18965a.getAnimation();
        if (animation != null) {
            return (RectangularViewfinderAnimation) this.proxyCache.getOrPut(Reflection.f24268a.b(NativeRectangularViewfinderAnimation.class), null, animation, new a(animation));
        }
        return null;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    public int getColor() {
        NativeColor _0 = this.f18965a.getColor();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return coreNativeTypeFactory.convert(_0);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    public float getDimming() {
        return this.f18965a.getDimming();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    public int getDisabledColor() {
        NativeColor _0 = this.f18965a.getDisabledColor();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return coreNativeTypeFactory.convert(_0);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    public float getDisabledDimming() {
        return this.f18965a.getDisabledDimming();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @NotNull
    public RectangularViewfinderLineStyle getLineStyle() {
        NativeRectangularViewfinderLineStyle _0 = this.f18965a.getLineStyle();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return coreNativeTypeFactory.convert(_0);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @NotNull
    public RectangularViewfinderStyle getStyle() {
        NativeRectangularViewfinderStyle _0 = this.f18965a.getStyle();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return coreNativeTypeFactory.convert(_0);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    public void setAnimation(@Nullable RectangularViewfinderAnimation rectangularViewfinderAnimation) {
        NativeRectangularViewfinderAnimation nativeRectangularViewfinderAnimation = null;
        if (rectangularViewfinderAnimation != null) {
            NativeRectangularViewfinderAnimation f18963a = rectangularViewfinderAnimation.getF18963a();
            this.proxyCache.put(Reflection.f24268a.b(NativeRectangularViewfinderAnimation.class), null, f18963a, rectangularViewfinderAnimation);
            nativeRectangularViewfinderAnimation = f18963a;
        }
        this.f18965a.setAnimation(nativeRectangularViewfinderAnimation);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    public void setColor(int i) {
        this.f18965a.setColor(CoreNativeTypeFactory.INSTANCE.convert(i));
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    public void setDimming(float f) {
        this.f18965a.setDimming(f);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    public void setDisabledColor(int i) {
        this.f18965a.setDisabledColor(CoreNativeTypeFactory.INSTANCE.convert(i));
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    public void setDisabledDimming(float f) {
        this.f18965a.setDisabledDimming(f);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    public void setHeightAndAspectRatio(@NotNull FloatWithUnit height, float widthToHeightAspect) {
        Intrinsics.h(height, "height");
        this.f18965a.setHeightAndAspectRatio(height, widthToHeightAspect);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    public void setShorterDimensionAndAspectRatio(float shorterDimension, float aspect) {
        this.f18965a.setShorterDimensionAndAspectRatio(shorterDimension, aspect);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    public void setWidthAndAspectRatio(@NotNull FloatWithUnit width, float heightToWidthAspect) {
        Intrinsics.h(width, "width");
        this.f18965a.setWidthAndAspectRatio(width, heightToWidthAspect);
    }

    public /* synthetic */ RectangularViewfinderProxyAdapter(NativeRectangularViewfinder nativeRectangularViewfinder, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeRectangularViewfinder, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
