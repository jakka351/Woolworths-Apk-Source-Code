package com.scandit.datacapture.core.ui.viewfinder.serialization;

import com.scandit.datacapture.core.internal.module.serialization.NativeViewfinderDeserializerHelper;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeAimerViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeCombinedViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeLaserlineViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeLaserlineViewfinderStyle;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeNoViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderLineStyle;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderStyle;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeSpotlightViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeTargetAimerViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NoViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.AimerViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.CombinedViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.SpotlightViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.TargetAimerViewfinder;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u001a\u0010\u001a\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializerHelperReversedAdapter;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeViewfinderDeserializerHelper;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeNoViewfinder;", "createNoViewfinder", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeLaserlineViewfinderStyle;", "style", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeLaserlineViewfinder;", "createLaserlineViewfinder", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinderStyle;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinderLineStyle;", "lineStyle", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinder;", "createRectangularViewfinder", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeSpotlightViewfinder;", "createSpotlightViewfinder", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeAimerViewfinder;", "createAimerViewfinder", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeCombinedViewfinder;", "createCombinedViewfinder", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeTargetAimerViewfinder;", "createTargetAimerViewfinder", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializerHelper;", "_ViewfinderDeserializerHelper", "<init>", "(Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializerHelper;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class ViewfinderDeserializerHelperReversedAdapter extends NativeViewfinderDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    private final ViewfinderDeserializerHelper f18974a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public ViewfinderDeserializerHelperReversedAdapter(@NotNull ViewfinderDeserializerHelper _ViewfinderDeserializerHelper, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_ViewfinderDeserializerHelper, "_ViewfinderDeserializerHelper");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18974a = _ViewfinderDeserializerHelper;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeViewfinderDeserializerHelper
    @NotNull
    public NativeAimerViewfinder createAimerViewfinder() {
        AimerViewfinder aimerViewfinderCreateAimerViewfinder = this.f18974a.createAimerViewfinder();
        NativeAimerViewfinder f18955a = aimerViewfinderCreateAimerViewfinder.getF18955a();
        this.proxyCache.put(Reflection.f24268a.b(NativeAimerViewfinder.class), null, f18955a, aimerViewfinderCreateAimerViewfinder);
        return f18955a;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeViewfinderDeserializerHelper
    @NotNull
    public NativeCombinedViewfinder createCombinedViewfinder() {
        CombinedViewfinder combinedViewfinderCreateCombinedViewfinder = this.f18974a.createCombinedViewfinder();
        NativeCombinedViewfinder f18957a = combinedViewfinderCreateCombinedViewfinder.getF18957a();
        this.proxyCache.put(Reflection.f24268a.b(NativeCombinedViewfinder.class), null, f18957a, combinedViewfinderCreateCombinedViewfinder);
        return f18957a;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeViewfinderDeserializerHelper
    @NotNull
    public NativeLaserlineViewfinder createLaserlineViewfinder(@NotNull NativeLaserlineViewfinderStyle style) {
        Intrinsics.h(style, "style");
        LaserlineViewfinder laserlineViewfinderCreateLaserlineViewfinder = this.f18974a.createLaserlineViewfinder(CoreNativeTypeFactory.INSTANCE.convert(style));
        NativeLaserlineViewfinder nativeLaserlineViewfinder_impl = laserlineViewfinderCreateLaserlineViewfinder._impl();
        this.proxyCache.put(Reflection.f24268a.b(NativeLaserlineViewfinder.class), null, nativeLaserlineViewfinder_impl, laserlineViewfinderCreateLaserlineViewfinder);
        return nativeLaserlineViewfinder_impl;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeViewfinderDeserializerHelper
    @NotNull
    public NativeNoViewfinder createNoViewfinder() {
        NoViewfinder noViewfinderCreateNoViewfinder = this.f18974a.createNoViewfinder();
        NativeNoViewfinder f18770a = noViewfinderCreateNoViewfinder.getF18770a();
        this.proxyCache.put(Reflection.f24268a.b(NativeNoViewfinder.class), null, f18770a, noViewfinderCreateNoViewfinder);
        return f18770a;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeViewfinderDeserializerHelper
    @NotNull
    public NativeRectangularViewfinder createRectangularViewfinder(@NotNull NativeRectangularViewfinderStyle style, @NotNull NativeRectangularViewfinderLineStyle lineStyle) {
        Intrinsics.h(style, "style");
        Intrinsics.h(lineStyle, "lineStyle");
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        RectangularViewfinder rectangularViewfinderCreateRectangularViewfinder = this.f18974a.createRectangularViewfinder(coreNativeTypeFactory.convert(style), coreNativeTypeFactory.convert(lineStyle));
        NativeRectangularViewfinder nativeRectangularViewfinder_impl = rectangularViewfinderCreateRectangularViewfinder._impl();
        this.proxyCache.put(Reflection.f24268a.b(NativeRectangularViewfinder.class), null, nativeRectangularViewfinder_impl, rectangularViewfinderCreateRectangularViewfinder);
        return nativeRectangularViewfinder_impl;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeViewfinderDeserializerHelper
    @NotNull
    public NativeSpotlightViewfinder createSpotlightViewfinder() {
        SpotlightViewfinder spotlightViewfinderCreateSpotlightViewfinder = this.f18974a.createSpotlightViewfinder();
        NativeSpotlightViewfinder nativeSpotlightViewfinder_impl = spotlightViewfinderCreateSpotlightViewfinder._impl();
        this.proxyCache.put(Reflection.f24268a.b(NativeSpotlightViewfinder.class), null, nativeSpotlightViewfinder_impl, spotlightViewfinderCreateSpotlightViewfinder);
        return nativeSpotlightViewfinder_impl;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeViewfinderDeserializerHelper
    @NotNull
    public NativeTargetAimerViewfinder createTargetAimerViewfinder() {
        TargetAimerViewfinder targetAimerViewfinderCreateTargetAimerViewfinder = this.f18974a.createTargetAimerViewfinder();
        NativeTargetAimerViewfinder f18970a = targetAimerViewfinderCreateTargetAimerViewfinder.getF18970a();
        this.proxyCache.put(Reflection.f24268a.b(NativeTargetAimerViewfinder.class), null, f18970a, targetAimerViewfinderCreateTargetAimerViewfinder);
        return f18970a;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    public /* synthetic */ ViewfinderDeserializerHelperReversedAdapter(ViewfinderDeserializerHelper viewfinderDeserializerHelper, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewfinderDeserializerHelper, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
