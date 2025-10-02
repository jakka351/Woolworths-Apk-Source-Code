package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickStatusIconSettings;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconSettingsProxyAdapter;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconSettingsProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickStatusIconSettings;", "_impl", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "p0", "getRatioToHighlightSize", "()F", "setRatioToHighlightSize", "(F)V", "ratioToHighlightSize", "", "getMinSize", "()I", "setMinSize", "(I)V", "minSize", "getMaxSize", "setMaxSize", "maxSize", "_NativeBarcodePickStatusIconSettings", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickStatusIconSettings;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodePickStatusIconSettingsProxyAdapter implements BarcodePickStatusIconSettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodePickStatusIconSettings f17937a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodePickStatusIconSettingsProxyAdapter(@NotNull NativeBarcodePickStatusIconSettings _NativeBarcodePickStatusIconSettings, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodePickStatusIconSettings, "_NativeBarcodePickStatusIconSettings");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17937a = _NativeBarcodePickStatusIconSettings;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconSettingsProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodePickStatusIconSettings getF17937a() {
        return this.f17937a;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconSettingsProxy
    public int getMaxSize() {
        return this.f17937a.getMaxSize();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconSettingsProxy
    public int getMinSize() {
        return this.f17937a.getMinSize();
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconSettingsProxy
    public float getRatioToHighlightSize() {
        return this.f17937a.getSizeToHighlightSizeRatio();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconSettingsProxy
    public void setMaxSize(int i) {
        this.f17937a.setMaxSize(i);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconSettingsProxy
    public void setMinSize(int i) {
        this.f17937a.setMinSize(i);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconSettingsProxy
    public void setRatioToHighlightSize(float f) {
        this.f17937a.setSizeToHighlightSizeRatio(f);
    }

    public /* synthetic */ BarcodePickStatusIconSettingsProxyAdapter(NativeBarcodePickStatusIconSettings nativeBarcodePickStatusIconSettings, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodePickStatusIconSettings, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
