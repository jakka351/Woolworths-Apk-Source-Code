package com.scandit.datacapture.barcode.pick.data;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeAsyncMapperProductProvider;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeProductProvider;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeProductProviderCallback;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016R\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/data/BarcodePickAsyncMapperProductProviderProxyAdapter;", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickAsyncMapperProductProviderProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeAsyncMapperProductProvider;", "_impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeProductProvider;", "_productProviderImpl", "Ljava/util/ArrayList;", "", "itemsData", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProviderCallback;", "callback", "", "_productIdentifierForItems", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "_NativeAsyncMapperProductProvider", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeAsyncMapperProductProvider;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodePickAsyncMapperProductProviderProxyAdapter implements BarcodePickAsyncMapperProductProviderProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeAsyncMapperProductProvider f17911a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeProductProvider c;

    public BarcodePickAsyncMapperProductProviderProxyAdapter(@NotNull NativeAsyncMapperProductProvider _NativeAsyncMapperProductProvider, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeAsyncMapperProductProvider, "_NativeAsyncMapperProductProvider");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17911a = _NativeAsyncMapperProductProvider;
        this.proxyCache = proxyCache;
        NativeProductProvider nativeProductProviderAsProductProvider = _NativeAsyncMapperProductProvider.asProductProvider();
        Intrinsics.g(nativeProductProviderAsProductProvider, "_NativeAsyncMapperProduc…vider.asProductProvider()");
        this.c = nativeProductProviderAsProductProvider;
    }

    @Override // com.scandit.datacapture.barcode.pick.data.BarcodePickAsyncMapperProductProviderProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeAsyncMapperProductProvider getF17911a() {
        return this.f17911a;
    }

    @Override // com.scandit.datacapture.barcode.pick.data.BarcodePickAsyncMapperProductProviderProxy
    public void _productIdentifierForItems(@NotNull ArrayList<String> itemsData, @NotNull BarcodePickProductProviderCallback callback) {
        Intrinsics.h(itemsData, "itemsData");
        Intrinsics.h(callback, "callback");
        NativeProductProviderCallback f17916a = callback.getF17916a();
        this.proxyCache.put(Reflection.f24268a.b(NativeProductProviderCallback.class), null, f17916a, callback);
        this.f17911a.productIdentifierForItems(itemsData, f17916a);
    }

    @Override // com.scandit.datacapture.barcode.pick.data.BarcodePickAsyncMapperProductProviderProxy
    @NotNull
    /* renamed from: _productProviderImpl, reason: from getter */
    public NativeProductProvider getC() {
        return this.c;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    public /* synthetic */ BarcodePickAsyncMapperProductProviderProxyAdapter(NativeAsyncMapperProductProvider nativeAsyncMapperProductProvider, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeAsyncMapperProductProvider, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
