package com.scandit.datacapture.barcode.filter.ui.overlay;

import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
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

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterOverlaySettingsProxyAdapter;", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterOverlaySettingsProxy;", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterOverlaySettings;", "_impl", "Lcom/scandit/datacapture/core/ui/style/Brush;", "brush", "", "_setBrush", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightType;", "type", "_setHighlightType", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "getBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "getHighlightType", "()Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightType;", "highlightType", "_NativeBarcodeFilterOverlaySettings", "<init>", "(Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterOverlaySettings;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeFilterOverlaySettingsProxyAdapter implements BarcodeFilterOverlaySettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeFilterOverlaySettings f17651a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeFilterOverlaySettingsProxyAdapter(@NotNull NativeBarcodeFilterOverlaySettings _NativeBarcodeFilterOverlaySettings, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeFilterOverlaySettings, "_NativeBarcodeFilterOverlaySettings");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17651a = _NativeBarcodeFilterOverlaySettings;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterOverlaySettingsProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeFilterOverlaySettings getF17651a() {
        return this.f17651a;
    }

    @Override // com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterOverlaySettingsProxy
    public void _setBrush(@Nullable Brush brush) {
        this.f17651a.setBrush(brush != null ? CoreNativeTypeFactory.INSTANCE.convert(brush) : null);
    }

    @Override // com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterOverlaySettingsProxy
    public void _setHighlightType(@NotNull BarcodeFilterHighlightType type) {
        Intrinsics.h(type, "type");
        this.f17651a.setBarcodeFilterHighlightType(BarcodeNativeTypeFactory.INSTANCE.convert(type));
    }

    @Override // com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterOverlaySettingsProxy
    @Nullable
    public Brush getBrush() {
        NativeBrush brush = this.f17651a.getBrush();
        if (brush != null) {
            return CoreNativeTypeFactory.INSTANCE.convert(brush);
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterOverlaySettingsProxy
    @NotNull
    public BarcodeFilterHighlightType getHighlightType() {
        NativeBarcodeFilterHighlightType _0 = this.f17651a.getOverlayType();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convert(_0);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    public /* synthetic */ BarcodeFilterOverlaySettingsProxyAdapter(NativeBarcodeFilterOverlaySettings nativeBarcodeFilterOverlaySettings, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeFilterOverlaySettings, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
