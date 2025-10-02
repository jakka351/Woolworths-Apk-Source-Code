package com.scandit.datacapture.barcode.filter.ui.overlay;

import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterOverlaySettingsBrushProxyAdapter;", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterOverlaySettingsBrushProxy;", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterOverlaySettingsBrush;", "_impl", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "_NativeBarcodeFilterOverlaySettingsBrush", "<init>", "(Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterOverlaySettingsBrush;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeFilterOverlaySettingsBrushProxyAdapter implements BarcodeFilterOverlaySettingsBrushProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeFilterOverlaySettingsBrush f17650a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeFilterOverlaySettingsBrushProxyAdapter(@NotNull NativeBarcodeFilterOverlaySettingsBrush _NativeBarcodeFilterOverlaySettingsBrush, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeFilterOverlaySettingsBrush, "_NativeBarcodeFilterOverlaySettingsBrush");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17650a = _NativeBarcodeFilterOverlaySettingsBrush;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterOverlaySettingsBrushProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeFilterOverlaySettingsBrush getF17650a() {
        return this.f17650a;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    public /* synthetic */ BarcodeFilterOverlaySettingsBrushProxyAdapter(NativeBarcodeFilterOverlaySettingsBrush nativeBarcodeFilterOverlaySettingsBrush, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeFilterOverlaySettingsBrush, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
