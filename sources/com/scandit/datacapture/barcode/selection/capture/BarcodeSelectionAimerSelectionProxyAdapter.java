package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeAimerSelection;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeSelectionType;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionAimerSelectionProxyAdapter;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionAimerSelectionProxy;", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeAimerSelection;", "_impl", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeSelectionType;", "_selectionTypeImpl", "", "toJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionAimerBehavior;", "p0", "getAimerBehavior", "()Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionAimerBehavior;", "setAimerBehavior", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionAimerBehavior;)V", "aimerBehavior", "_NativeAimerSelection", "<init>", "(Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeAimerSelection;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeSelectionAimerSelectionProxyAdapter implements BarcodeSelectionAimerSelectionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeAimerSelection f18015a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeSelectionType c;

    public BarcodeSelectionAimerSelectionProxyAdapter(@NotNull NativeAimerSelection _NativeAimerSelection, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeAimerSelection, "_NativeAimerSelection");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18015a = _NativeAimerSelection;
        this.proxyCache = proxyCache;
        NativeSelectionType nativeSelectionTypeAsSelectionType = _NativeAimerSelection.asSelectionType();
        Intrinsics.g(nativeSelectionTypeAsSelectionType, "_NativeAimerSelection.asSelectionType()");
        this.c = nativeSelectionTypeAsSelectionType;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionAimerSelectionProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeAimerSelection getF18015a() {
        return this.f18015a;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionAimerSelectionProxy
    @NotNull
    /* renamed from: _selectionTypeImpl, reason: from getter */
    public NativeSelectionType getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionAimerSelectionProxy
    @NotNull
    public BarcodeSelectionAimerBehavior getAimerBehavior() {
        BarcodeSelectionAimerBehavior _0 = this.f18015a.getAimerBehavior();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionAimerSelectionProxy
    public void setAimerBehavior(@NotNull BarcodeSelectionAimerBehavior p0) {
        Intrinsics.h(p0, "p0");
        this.f18015a.setAimerBehavior(p0);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionAimerSelectionProxy
    @NotNull
    public String toJson() {
        String _0 = this.f18015a.toJson();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ BarcodeSelectionAimerSelectionProxyAdapter(NativeAimerSelection nativeAimerSelection, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeAimerSelection, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
