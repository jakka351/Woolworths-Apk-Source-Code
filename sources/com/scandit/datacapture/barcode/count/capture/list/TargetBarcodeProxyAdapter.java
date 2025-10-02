package com.scandit.datacapture.barcode.count.capture.list;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeTargetBarcode;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/list/TargetBarcodeProxyAdapter;", "Lcom/scandit/datacapture/barcode/count/capture/list/TargetBarcodeProxy;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeTargetBarcode;", "_impl", "", "getData", "", "getQuantity", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "_NativeTargetBarcode", "<init>", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeTargetBarcode;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class TargetBarcodeProxyAdapter implements TargetBarcodeProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeTargetBarcode f17496a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public TargetBarcodeProxyAdapter(@NotNull NativeTargetBarcode _NativeTargetBarcode, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeTargetBarcode, "_NativeTargetBarcode");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17496a = _NativeTargetBarcode;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.TargetBarcodeProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeTargetBarcode getF17496a() {
        return this.f17496a;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.TargetBarcodeProxy
    @NotNull
    public String getData() {
        String _0 = this.f17496a.getData();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.TargetBarcodeProxy
    public int getQuantity() {
        return this.f17496a.getQuantity();
    }

    public /* synthetic */ TargetBarcodeProxyAdapter(NativeTargetBarcode nativeTargetBarcode, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeTargetBarcode, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
