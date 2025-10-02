package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyle;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleCustomView;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001b\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleCustomViewProxyAdapter;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleCustomViewProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleCustomView;", "_impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyle;", "_highlightStyleImpl", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "p0", "getFitViewsToBarcode", "()Z", "setFitViewsToBarcode", "(Z)V", "fitViewsToBarcode", "", "getMinimumHighlightWidth", "()I", "setMinimumHighlightWidth", "(I)V", "minimumHighlightWidth", "getMinimumHighlightHeight", "setMinimumHighlightHeight", "minimumHighlightHeight", "_NativeBarcodePickViewHighlightStyleCustomView", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleCustomView;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodePickViewHighlightStyleCustomViewProxyAdapter implements BarcodePickViewHighlightStyleCustomViewProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodePickViewHighlightStyleCustomView f17945a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeBarcodePickViewHighlightStyle c;

    public BarcodePickViewHighlightStyleCustomViewProxyAdapter(@NotNull NativeBarcodePickViewHighlightStyleCustomView _NativeBarcodePickViewHighlightStyleCustomView, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodePickViewHighlightStyleCustomView, "_NativeBarcodePickViewHighlightStyleCustomView");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17945a = _NativeBarcodePickViewHighlightStyleCustomView;
        this.proxyCache = proxyCache;
        NativeBarcodePickViewHighlightStyle nativeBarcodePickViewHighlightStyleAsHighlightStyle = _NativeBarcodePickViewHighlightStyleCustomView.asHighlightStyle();
        Intrinsics.g(nativeBarcodePickViewHighlightStyleAsHighlightStyle, "_NativeBarcodePickViewHi…omView.asHighlightStyle()");
        this.c = nativeBarcodePickViewHighlightStyleAsHighlightStyle;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
    @NotNull
    /* renamed from: _highlightStyleImpl, reason: from getter */
    public NativeBarcodePickViewHighlightStyle getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodePickViewHighlightStyleCustomView getF17945a() {
        return this.f17945a;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
    public boolean getFitViewsToBarcode() {
        return this.f17945a.getFitViewsToBarcode();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
    public int getMinimumHighlightHeight() {
        return this.f17945a.getMinimumHighlightHeight();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
    public int getMinimumHighlightWidth() {
        return this.f17945a.getMinimumHighlightWidth();
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
    public void setFitViewsToBarcode(boolean z) {
        this.f17945a.setFitViewsToBarcode(z);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
    public void setMinimumHighlightHeight(int i) {
        this.f17945a.setMinimumHighlightHeight(i);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
    public void setMinimumHighlightWidth(int i) {
        this.f17945a.setMinimumHighlightWidth(i);
    }

    public /* synthetic */ BarcodePickViewHighlightStyleCustomViewProxyAdapter(NativeBarcodePickViewHighlightStyleCustomView nativeBarcodePickViewHighlightStyleCustomView, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodePickViewHighlightStyleCustomView, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
