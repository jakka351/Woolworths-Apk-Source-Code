package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeManualSelectionStrategy;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeSelectionStrategy;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionManualSelectionStrategyProxyAdapter;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionManualSelectionStrategyProxy;", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeManualSelectionStrategy;", "_impl", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeSelectionStrategy;", "_selectionStrategyImpl", "", "toJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "_NativeManualSelectionStrategy", "<init>", "(Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeManualSelectionStrategy;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeSelectionManualSelectionStrategyProxyAdapter implements BarcodeSelectionManualSelectionStrategyProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeManualSelectionStrategy f18027a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeSelectionStrategy c;

    public BarcodeSelectionManualSelectionStrategyProxyAdapter(@NotNull NativeManualSelectionStrategy _NativeManualSelectionStrategy, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeManualSelectionStrategy, "_NativeManualSelectionStrategy");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18027a = _NativeManualSelectionStrategy;
        this.proxyCache = proxyCache;
        NativeSelectionStrategy nativeSelectionStrategyAsSelectionStrategy = _NativeManualSelectionStrategy.asSelectionStrategy();
        Intrinsics.g(nativeSelectionStrategyAsSelectionStrategy, "_NativeManualSelectionSt…egy.asSelectionStrategy()");
        this.c = nativeSelectionStrategyAsSelectionStrategy;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionManualSelectionStrategyProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeManualSelectionStrategy getF18027a() {
        return this.f18027a;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionManualSelectionStrategyProxy
    @NotNull
    /* renamed from: _selectionStrategyImpl, reason: from getter */
    public NativeSelectionStrategy getC() {
        return this.c;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionManualSelectionStrategyProxy
    @NotNull
    public String toJson() {
        String _0 = this.f18027a.toJson();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ BarcodeSelectionManualSelectionStrategyProxyAdapter(NativeManualSelectionStrategy nativeManualSelectionStrategy, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeManualSelectionStrategy, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
