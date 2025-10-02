package com.scandit.datacapture.core.ui;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.core.C1109r2;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.MarginsWithUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.module.ui.GestureRecognizer;
import com.scandit.datacapture.core.internal.module.ui.NativeDataCaptureView;
import com.scandit.datacapture.core.internal.sdk.ui.NeedsRedrawListener;
import com.scandit.datacapture.core.internal.sdk.ui.NeedsRedrawListenerReversedAdapter;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u00104\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016R\u001a\u0010\u0017\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010*\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020%8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010-\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R$\u00103\u001a\u00020.2\u0006\u0010\u0019\u001a\u00020.8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00067"}, d2 = {"Lcom/scandit/datacapture/core/ui/DataCaptureViewProxyAdapter;", "Lcom/scandit/datacapture/core/ui/DataCaptureViewProxy;", "Lcom/scandit/datacapture/core/internal/module/ui/NativeDataCaptureView;", "_impl", "Lcom/scandit/datacapture/core/ui/overlay/DataCaptureOverlay;", "overlay", "", "_addOverlay", "_removeOverlay", "_setNeedsRedraw", "Lcom/scandit/datacapture/core/internal/sdk/ui/NeedsRedrawListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "_setNeedsRedrawListener", "Lcom/scandit/datacapture/core/internal/module/ui/GestureRecognizer;", "recognizer", "_setGestureRecognizer", "_performUiTriggeredZoomIn", "_performUiTriggeredZoomOut", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/core/common/geometry/MarginsWithUnit;", "p0", "getScanAreaMargins", "()Lcom/scandit/datacapture/core/common/geometry/MarginsWithUnit;", "setScanAreaMargins", "(Lcom/scandit/datacapture/core/common/geometry/MarginsWithUnit;)V", "scanAreaMargins", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "getPointOfInterest", "()Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "setPointOfInterest", "(Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;)V", "pointOfInterest", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "getLogoAnchor", "()Lcom/scandit/datacapture/core/common/geometry/Anchor;", "setLogoAnchor", "(Lcom/scandit/datacapture/core/common/geometry/Anchor;)V", "logoAnchor", "getLogoOffset", "setLogoOffset", "logoOffset", "Lcom/scandit/datacapture/core/ui/LogoStyle;", "getLogoStyle", "()Lcom/scandit/datacapture/core/ui/LogoStyle;", "setLogoStyle", "(Lcom/scandit/datacapture/core/ui/LogoStyle;)V", "logoStyle", "_NativeDataCaptureView", "<init>", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeDataCaptureView;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class DataCaptureViewProxyAdapter implements DataCaptureViewProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeDataCaptureView f18883a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public DataCaptureViewProxyAdapter(@NotNull NativeDataCaptureView _NativeDataCaptureView, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeDataCaptureView, "_NativeDataCaptureView");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18883a = _NativeDataCaptureView;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    public void _addOverlay(@NotNull DataCaptureOverlay overlay) {
        Intrinsics.h(overlay, "overlay");
        NativeDataCaptureOverlay d = overlay.getC();
        this.proxyCache.put(Reflection.f24268a.b(NativeDataCaptureOverlay.class), null, d, overlay);
        this.f18883a.addOverlay(d);
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeDataCaptureView getF18883a() {
        return this.f18883a;
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    public void _performUiTriggeredZoomIn() {
        this.f18883a.performUiTriggeredZoomIn();
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    public void _performUiTriggeredZoomOut() {
        this.f18883a.performUiTriggeredZoomOut();
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    public void _removeOverlay(@NotNull DataCaptureOverlay overlay) {
        Intrinsics.h(overlay, "overlay");
        NativeDataCaptureOverlay d = overlay.getC();
        this.proxyCache.put(Reflection.f24268a.b(NativeDataCaptureOverlay.class), null, d, overlay);
        this.f18883a.removeOverlay(d);
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    public void _setGestureRecognizer(@NotNull GestureRecognizer recognizer) {
        Intrinsics.h(recognizer, "recognizer");
        this.f18883a.setGestureRecognizer((C1109r2) this.proxyCache.getOrPut(Reflection.f24268a.b(GestureRecognizer.class), null, recognizer, new c(recognizer)));
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    public void _setNeedsRedraw() {
        this.f18883a.setNeedsRedraw();
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    public void _setNeedsRedrawListener(@NotNull NeedsRedrawListener listener) {
        Intrinsics.h(listener, "listener");
        this.f18883a.setNeedsRedrawDelegate((NeedsRedrawListenerReversedAdapter) this.proxyCache.getOrPut(Reflection.f24268a.b(NeedsRedrawListener.class), null, listener, new d(listener)));
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @NotNull
    public Anchor getLogoAnchor() {
        Anchor _0 = this.f18883a.getLogoAnchor();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @NotNull
    public PointWithUnit getLogoOffset() {
        PointWithUnit _0 = this.f18883a.getLogoOffset();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @NotNull
    public LogoStyle getLogoStyle() {
        LogoStyle _0 = this.f18883a.getLogoStyle();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @NotNull
    public PointWithUnit getPointOfInterest() {
        PointWithUnit _0 = this.f18883a.getPointOfInterest();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @NotNull
    public MarginsWithUnit getScanAreaMargins() {
        MarginsWithUnit _0 = this.f18883a.getScanAreaMargins();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    public void setLogoAnchor(@NotNull Anchor p0) {
        Intrinsics.h(p0, "p0");
        this.f18883a.setLogoAnchor(p0);
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    public void setLogoOffset(@NotNull PointWithUnit p0) {
        Intrinsics.h(p0, "p0");
        this.f18883a.setLogoOffset(p0);
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    public void setLogoStyle(@NotNull LogoStyle p0) {
        Intrinsics.h(p0, "p0");
        this.f18883a.setLogoStyle(p0);
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    public void setPointOfInterest(@NotNull PointWithUnit p0) {
        Intrinsics.h(p0, "p0");
        this.f18883a.setPointOfInterest(p0);
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    public void setScanAreaMargins(@NotNull MarginsWithUnit p0) {
        Intrinsics.h(p0, "p0");
        this.f18883a.setScanAreaMargins(p0);
    }

    public /* synthetic */ DataCaptureViewProxyAdapter(NativeDataCaptureView nativeDataCaptureView, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeDataCaptureView, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
