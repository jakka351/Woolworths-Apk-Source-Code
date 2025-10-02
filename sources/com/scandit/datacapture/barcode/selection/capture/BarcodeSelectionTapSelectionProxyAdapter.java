package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeSelectionType;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeTapSelection;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010 \u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionTapSelectionProxyAdapter;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionTapSelectionProxy;", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeTapSelection;", "_impl", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeSelectionType;", "_selectionTypeImpl", "", "toJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionFreezeBehavior;", "p0", "getFreezeBehavior", "()Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionFreezeBehavior;", "setFreezeBehavior", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionFreezeBehavior;)V", "freezeBehavior", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionTapBehavior;", "getTapBehavior", "()Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionTapBehavior;", "setTapBehavior", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionTapBehavior;)V", "tapBehavior", "", "getShouldFreezeOnDoubleTap", "()Z", "setShouldFreezeOnDoubleTap", "(Z)V", "shouldFreezeOnDoubleTap", "_NativeTapSelection", "<init>", "(Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeTapSelection;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeSelectionTapSelectionProxyAdapter implements BarcodeSelectionTapSelectionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeTapSelection f18035a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeSelectionType c;

    public BarcodeSelectionTapSelectionProxyAdapter(@NotNull NativeTapSelection _NativeTapSelection, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeTapSelection, "_NativeTapSelection");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18035a = _NativeTapSelection;
        this.proxyCache = proxyCache;
        NativeSelectionType nativeSelectionTypeAsSelectionType = _NativeTapSelection.asSelectionType();
        Intrinsics.g(nativeSelectionTypeAsSelectionType, "_NativeTapSelection.asSelectionType()");
        this.c = nativeSelectionTypeAsSelectionType;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionTapSelectionProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeTapSelection getF18035a() {
        return this.f18035a;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionTapSelectionProxy
    @NotNull
    /* renamed from: _selectionTypeImpl, reason: from getter */
    public NativeSelectionType getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionTapSelectionProxy
    @NotNull
    public BarcodeSelectionFreezeBehavior getFreezeBehavior() {
        BarcodeSelectionFreezeBehavior _0 = this.f18035a.getFreezeBehavior();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionTapSelectionProxy
    public boolean getShouldFreezeOnDoubleTap() {
        return this.f18035a.getShouldFreezeOnDoubleTap();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionTapSelectionProxy
    @NotNull
    public BarcodeSelectionTapBehavior getTapBehavior() {
        BarcodeSelectionTapBehavior _0 = this.f18035a.getTapBehavior();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionTapSelectionProxy
    public void setFreezeBehavior(@NotNull BarcodeSelectionFreezeBehavior p0) {
        Intrinsics.h(p0, "p0");
        this.f18035a.setFreezeBehavior(p0);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionTapSelectionProxy
    public void setShouldFreezeOnDoubleTap(boolean z) {
        this.f18035a.setShouldFreezeOnDoubleTap(z);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionTapSelectionProxy
    public void setTapBehavior(@NotNull BarcodeSelectionTapBehavior p0) {
        Intrinsics.h(p0, "p0");
        this.f18035a.setTapBehavior(p0);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionTapSelectionProxy
    @NotNull
    public String toJson() {
        String _0 = this.f18035a.toJson();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ BarcodeSelectionTapSelectionProxyAdapter(NativeTapSelection nativeTapSelection, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeTapSelection, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
