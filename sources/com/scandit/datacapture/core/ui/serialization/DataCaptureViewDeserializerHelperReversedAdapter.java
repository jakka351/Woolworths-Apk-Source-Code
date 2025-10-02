package com.scandit.datacapture.core.ui.serialization;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureViewDeserializerHelper;
import com.scandit.datacapture.core.internal.module.ui.NativeDataCaptureView;
import com.scandit.datacapture.core.internal.module.ui.NativeSwipeToZoom;
import com.scandit.datacapture.core.internal.module.ui.NativeTapToFocus;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.gesture.SwipeToZoom;
import com.scandit.datacapture.core.ui.gesture.TapToFocus;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u001a\u0010\u0018\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerHelperReversedAdapter;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureViewDeserializerHelper;", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;", "context", "Lcom/scandit/datacapture/core/internal/module/ui/NativeDataCaptureView;", "createView", "", "createdNullFocusGesture", "", "showUiIndicator", "Lcom/scandit/datacapture/core/internal/module/ui/NativeTapToFocus;", "createTapToFocus", "createdNullZoomGesture", "Lcom/scandit/datacapture/core/internal/module/ui/NativeSwipeToZoom;", "createSwipeToZoom", "view", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "json", "updateViewFromJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerHelper;", "_DataCaptureViewDeserializerHelper", "<init>", "(Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerHelper;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class DataCaptureViewDeserializerHelperReversedAdapter extends NativeDataCaptureViewDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    private final DataCaptureViewDeserializerHelper f18939a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public DataCaptureViewDeserializerHelperReversedAdapter(@NotNull DataCaptureViewDeserializerHelper _DataCaptureViewDeserializerHelper, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_DataCaptureViewDeserializerHelper, "_DataCaptureViewDeserializerHelper");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18939a = _DataCaptureViewDeserializerHelper;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureViewDeserializerHelper
    @NotNull
    public NativeSwipeToZoom createSwipeToZoom() {
        SwipeToZoom swipeToZoomCreateSwipeToZoom = this.f18939a.createSwipeToZoom();
        NativeSwipeToZoom f18925a = swipeToZoomCreateSwipeToZoom.getF18925a();
        this.proxyCache.put(Reflection.f24268a.b(NativeSwipeToZoom.class), null, f18925a, swipeToZoomCreateSwipeToZoom);
        return f18925a;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureViewDeserializerHelper
    @NotNull
    public NativeTapToFocus createTapToFocus(boolean showUiIndicator) {
        TapToFocus tapToFocusCreateTapToFocus = this.f18939a.createTapToFocus(showUiIndicator);
        NativeTapToFocus f18927a = tapToFocusCreateTapToFocus.getF18927a();
        this.proxyCache.put(Reflection.f24268a.b(NativeTapToFocus.class), null, f18927a, tapToFocusCreateTapToFocus);
        return f18927a;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureViewDeserializerHelper
    @NotNull
    public NativeDataCaptureView createView(@NotNull NativeDataCaptureContext context) {
        Intrinsics.h(context, "context");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        DataCaptureView dataCaptureViewCreateView = this.f18939a.createView((DataCaptureContext) proxyCache.getOrPut(reflectionFactory.b(NativeDataCaptureContext.class), null, context, new d(context)));
        this.proxyCache.put(reflectionFactory.b(DataCaptureView.class), null, dataCaptureViewCreateView, dataCaptureViewCreateView._impl());
        NativeDataCaptureView nativeDataCaptureView_impl = dataCaptureViewCreateView._impl();
        this.proxyCache.put(reflectionFactory.b(NativeDataCaptureView.class), null, nativeDataCaptureView_impl, dataCaptureViewCreateView);
        return nativeDataCaptureView_impl;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureViewDeserializerHelper
    public void createdNullFocusGesture() {
        this.f18939a.createdNullFocusGesture();
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureViewDeserializerHelper
    public void createdNullZoomGesture() {
        this.f18939a.createdNullZoomGesture();
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureViewDeserializerHelper
    public void updateViewFromJson(@NotNull NativeDataCaptureView view, @NotNull NativeJsonValue json) {
        Intrinsics.h(view, "view");
        Intrinsics.h(json, "json");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f18939a.updateViewFromJson((DataCaptureView) proxyCache.require(reflectionFactory.b(NativeDataCaptureView.class), null, view), (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new e(json)));
    }

    public /* synthetic */ DataCaptureViewDeserializerHelperReversedAdapter(DataCaptureViewDeserializerHelper dataCaptureViewDeserializerHelper, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataCaptureViewDeserializerHelper, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
