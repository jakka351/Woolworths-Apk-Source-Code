package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeAbstractStructuredAppendData;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/barcode/data/BarcodeProxyAdapter;", "Lcom/scandit/datacapture/barcode/data/BarcodeProxy;", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeBarcode;", "_impl", "", "toJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/data/StructuredAppendData;", "getStructuredAppendData", "()Lcom/scandit/datacapture/barcode/data/StructuredAppendData;", "structuredAppendData", "_NativeBarcode", "<init>", "(Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeBarcode;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeProxyAdapter implements BarcodeProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcode f17604a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeProxyAdapter(@NotNull NativeBarcode _NativeBarcode, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcode, "_NativeBarcode");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17604a = _NativeBarcode;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.data.BarcodeProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcode getF17604a() {
        return this.f17604a;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.data.BarcodeProxy
    @Nullable
    public StructuredAppendData getStructuredAppendData() {
        NativeAbstractStructuredAppendData structuredAppendData = this.f17604a.getStructuredAppendData();
        if (structuredAppendData != null) {
            return (StructuredAppendData) this.proxyCache.getOrPut(Reflection.f24268a.b(NativeAbstractStructuredAppendData.class), null, structuredAppendData, new b(structuredAppendData));
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.data.BarcodeProxy
    @NotNull
    public String toJson() {
        String _0 = this.f17604a.toJson();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ BarcodeProxyAdapter(NativeBarcode nativeBarcode, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcode, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
