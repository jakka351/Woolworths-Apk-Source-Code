package com.scandit.datacapture.barcode.pick.data;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeProductProviderCallbackItem;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProviderCallbackItemProxyAdapter;", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProviderCallbackItemProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeProductProviderCallbackItem;", "_impl", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "getItemData", "()Ljava/lang/String;", "itemData", "getProductIdentifier", "productIdentifier", "_NativeProductProviderCallbackItem", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeProductProviderCallbackItem;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodePickProductProviderCallbackItemProxyAdapter implements BarcodePickProductProviderCallbackItemProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeProductProviderCallbackItem f17915a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodePickProductProviderCallbackItemProxyAdapter(@NotNull NativeProductProviderCallbackItem _NativeProductProviderCallbackItem, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeProductProviderCallbackItem, "_NativeProductProviderCallbackItem");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17915a = _NativeProductProviderCallbackItem;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.data.BarcodePickProductProviderCallbackItemProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeProductProviderCallbackItem getF17915a() {
        return this.f17915a;
    }

    @Override // com.scandit.datacapture.barcode.pick.data.BarcodePickProductProviderCallbackItemProxy
    @NotNull
    public String getItemData() {
        String _0 = this.f17915a.getToBeTransformedData();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.pick.data.BarcodePickProductProviderCallbackItemProxy
    @Nullable
    public String getProductIdentifier() {
        return this.f17915a.getTransformationResult();
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    public /* synthetic */ BarcodePickProductProviderCallbackItemProxyAdapter(NativeProductProviderCallbackItem nativeProductProviderCallbackItem, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeProductProviderCallbackItem, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
