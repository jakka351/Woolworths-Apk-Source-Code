package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickIconStyle;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyle;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010%\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020 8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010(\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020 8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$¨\u0006,"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleRectangularWithIconsProxyAdapter;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleRectangularWithIconsProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleRectangularWithIcons;", "_impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyle;", "_highlightStyleImpl", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "state", "Lcom/scandit/datacapture/core/ui/style/Brush;", "getBrushForState", "brush", "", "setBrushForState", "getSelectedBrushForState", "setSelectedBrushForState", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickIconStyle;", "getIconStyle", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickIconStyle;", "iconStyle", "", "p0", "getStyleResponseCacheEnabled", "()Z", "setStyleResponseCacheEnabled", "(Z)V", "styleResponseCacheEnabled", "", "getMinimumHighlightWidth", "()I", "setMinimumHighlightWidth", "(I)V", "minimumHighlightWidth", "getMinimumHighlightHeight", "setMinimumHighlightHeight", "minimumHighlightHeight", "_NativeBarcodePickViewHighlightStyleRectangularWithIcons", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleRectangularWithIcons;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodePickViewHighlightStyleRectangularWithIconsProxyAdapter implements BarcodePickViewHighlightStyleRectangularWithIconsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodePickViewHighlightStyleRectangularWithIcons f17950a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeBarcodePickViewHighlightStyle c;

    public BarcodePickViewHighlightStyleRectangularWithIconsProxyAdapter(@NotNull NativeBarcodePickViewHighlightStyleRectangularWithIcons _NativeBarcodePickViewHighlightStyleRectangularWithIcons, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodePickViewHighlightStyleRectangularWithIcons, "_NativeBarcodePickViewHighlightStyleRectangularWithIcons");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17950a = _NativeBarcodePickViewHighlightStyleRectangularWithIcons;
        this.proxyCache = proxyCache;
        NativeBarcodePickViewHighlightStyle nativeBarcodePickViewHighlightStyleAsHighlightStyle = _NativeBarcodePickViewHighlightStyleRectangularWithIcons.asHighlightStyle();
        Intrinsics.g(nativeBarcodePickViewHighlightStyleAsHighlightStyle, "_NativeBarcodePickViewHi…hIcons.asHighlightStyle()");
        this.c = nativeBarcodePickViewHighlightStyleAsHighlightStyle;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
    @NotNull
    /* renamed from: _highlightStyleImpl, reason: from getter */
    public NativeBarcodePickViewHighlightStyle getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodePickViewHighlightStyleRectangularWithIcons getF17950a() {
        return this.f17950a;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
    @NotNull
    public Brush getBrushForState(@NotNull BarcodePickState state) {
        Intrinsics.h(state, "state");
        NativeBrush _1 = this.f17950a.brushForState(BarcodeNativeTypeFactory.INSTANCE.convert(state));
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_1, "_1");
        return coreNativeTypeFactory.convert(_1);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
    @NotNull
    public BarcodePickIconStyle getIconStyle() {
        NativeBarcodePickIconStyle _0 = this.f17950a.getIconStyle();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convert(_0);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
    public int getMinimumHighlightHeight() {
        return this.f17950a.getMinimumHighlightHeight();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
    public int getMinimumHighlightWidth() {
        return this.f17950a.getMinimumHighlightWidth();
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
    @Nullable
    public Brush getSelectedBrushForState(@NotNull BarcodePickState state) {
        Intrinsics.h(state, "state");
        NativeBrush nativeBrushSelectedBrushForState = this.f17950a.selectedBrushForState(BarcodeNativeTypeFactory.INSTANCE.convert(state));
        if (nativeBrushSelectedBrushForState != null) {
            return CoreNativeTypeFactory.INSTANCE.convert(nativeBrushSelectedBrushForState);
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
    public boolean getStyleResponseCacheEnabled() {
        return this.f17950a.getStyleResponseCacheEnabled();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
    public void setBrushForState(@NotNull Brush brush, @NotNull BarcodePickState state) {
        Intrinsics.h(brush, "brush");
        Intrinsics.h(state, "state");
        this.f17950a.setBrushForState(CoreNativeTypeFactory.INSTANCE.convert(brush), BarcodeNativeTypeFactory.INSTANCE.convert(state));
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
    public void setMinimumHighlightHeight(int i) {
        this.f17950a.setMinimumHighlightHeight(i);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
    public void setMinimumHighlightWidth(int i) {
        this.f17950a.setMinimumHighlightWidth(i);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
    public void setSelectedBrushForState(@Nullable Brush brush, @NotNull BarcodePickState state) {
        Intrinsics.h(state, "state");
        this.f17950a.setSelectedBrushForState(brush != null ? CoreNativeTypeFactory.INSTANCE.convert(brush) : null, BarcodeNativeTypeFactory.INSTANCE.convert(state));
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
    public void setStyleResponseCacheEnabled(boolean z) {
        this.f17950a.setStyleResponseCacheEnabled(z);
    }

    public /* synthetic */ BarcodePickViewHighlightStyleRectangularWithIconsProxyAdapter(NativeBarcodePickViewHighlightStyleRectangularWithIcons nativeBarcodePickViewHighlightStyleRectangularWithIcons, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodePickViewHighlightStyleRectangularWithIcons, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
