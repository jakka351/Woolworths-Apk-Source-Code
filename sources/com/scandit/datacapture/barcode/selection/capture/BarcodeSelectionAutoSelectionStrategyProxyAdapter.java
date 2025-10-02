package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeAutoSelectionStrategy;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeSelectionStrategy;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionAutoSelectionStrategyProxyAdapter;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionAutoSelectionStrategyProxy;", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeAutoSelectionStrategy;", "_impl", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeSelectionStrategy;", "_selectionStrategyImpl", "", "toJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "_NativeAutoSelectionStrategy", "<init>", "(Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeAutoSelectionStrategy;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeSelectionAutoSelectionStrategyProxyAdapter implements BarcodeSelectionAutoSelectionStrategyProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeAutoSelectionStrategy f18017a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeSelectionStrategy c;

    public BarcodeSelectionAutoSelectionStrategyProxyAdapter(@NotNull NativeAutoSelectionStrategy _NativeAutoSelectionStrategy, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeAutoSelectionStrategy, "_NativeAutoSelectionStrategy");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18017a = _NativeAutoSelectionStrategy;
        this.proxyCache = proxyCache;
        NativeSelectionStrategy nativeSelectionStrategyAsSelectionStrategy = _NativeAutoSelectionStrategy.asSelectionStrategy();
        Intrinsics.g(nativeSelectionStrategyAsSelectionStrategy, "_NativeAutoSelectionStrategy.asSelectionStrategy()");
        this.c = nativeSelectionStrategyAsSelectionStrategy;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionAutoSelectionStrategyProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeAutoSelectionStrategy getF18017a() {
        return this.f18017a;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionAutoSelectionStrategyProxy
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

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionAutoSelectionStrategyProxy
    @NotNull
    public String toJson() {
        String _0 = this.f18017a.toJson();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ BarcodeSelectionAutoSelectionStrategyProxyAdapter(NativeAutoSelectionStrategy nativeAutoSelectionStrategy, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeAutoSelectionStrategy, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
