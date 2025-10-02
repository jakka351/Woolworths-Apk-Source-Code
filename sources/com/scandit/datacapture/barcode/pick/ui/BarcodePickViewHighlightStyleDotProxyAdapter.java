package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyle;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleDot;
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

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleDotProxyAdapter;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleDotProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleDot;", "_impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyle;", "_highlightStyleImpl", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "state", "Lcom/scandit/datacapture/core/ui/style/Brush;", "getBrushForState", "brush", "", "setBrushForState", "getSelectedBrushForState", "setSelectedBrushForState", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "_NativeBarcodePickViewHighlightStyleDot", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleDot;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodePickViewHighlightStyleDotProxyAdapter implements BarcodePickViewHighlightStyleDotProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodePickViewHighlightStyleDot f17947a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeBarcodePickViewHighlightStyle c;

    public BarcodePickViewHighlightStyleDotProxyAdapter(@NotNull NativeBarcodePickViewHighlightStyleDot _NativeBarcodePickViewHighlightStyleDot, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodePickViewHighlightStyleDot, "_NativeBarcodePickViewHighlightStyleDot");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17947a = _NativeBarcodePickViewHighlightStyleDot;
        this.proxyCache = proxyCache;
        NativeBarcodePickViewHighlightStyle nativeBarcodePickViewHighlightStyleAsHighlightStyle = _NativeBarcodePickViewHighlightStyleDot.asHighlightStyle();
        Intrinsics.g(nativeBarcodePickViewHighlightStyleAsHighlightStyle, "_NativeBarcodePickViewHi…yleDot.asHighlightStyle()");
        this.c = nativeBarcodePickViewHighlightStyleAsHighlightStyle;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotProxy
    @NotNull
    /* renamed from: _highlightStyleImpl, reason: from getter */
    public NativeBarcodePickViewHighlightStyle getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodePickViewHighlightStyleDot getF17947a() {
        return this.f17947a;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotProxy
    @NotNull
    public Brush getBrushForState(@NotNull BarcodePickState state) {
        Intrinsics.h(state, "state");
        NativeBrush _1 = this.f17947a.brushForState(BarcodeNativeTypeFactory.INSTANCE.convert(state));
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_1, "_1");
        return coreNativeTypeFactory.convert(_1);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotProxy
    @Nullable
    public Brush getSelectedBrushForState(@NotNull BarcodePickState state) {
        Intrinsics.h(state, "state");
        NativeBrush nativeBrushSelectedBrushForState = this.f17947a.selectedBrushForState(BarcodeNativeTypeFactory.INSTANCE.convert(state));
        if (nativeBrushSelectedBrushForState != null) {
            return CoreNativeTypeFactory.INSTANCE.convert(nativeBrushSelectedBrushForState);
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotProxy
    public void setBrushForState(@NotNull Brush brush, @NotNull BarcodePickState state) {
        Intrinsics.h(brush, "brush");
        Intrinsics.h(state, "state");
        this.f17947a.setBrushForState(CoreNativeTypeFactory.INSTANCE.convert(brush), BarcodeNativeTypeFactory.INSTANCE.convert(state));
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotProxy
    public void setSelectedBrushForState(@Nullable Brush brush, @NotNull BarcodePickState state) {
        Intrinsics.h(state, "state");
        this.f17947a.setSelectedBrushForState(brush != null ? CoreNativeTypeFactory.INSTANCE.convert(brush) : null, BarcodeNativeTypeFactory.INSTANCE.convert(state));
    }

    public /* synthetic */ BarcodePickViewHighlightStyleDotProxyAdapter(NativeBarcodePickViewHighlightStyleDot nativeBarcodePickViewHighlightStyleDot, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodePickViewHighlightStyleDot, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
