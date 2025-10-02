package com.scandit.datacapture.barcode.pick.data;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeProductProviderCallback;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016R\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProviderCallbackProxyAdapter;", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProviderCallbackProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeProductProviderCallback;", "_impl", "", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProviderCallbackItem;", "data", "", "onData", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "_NativeProductProviderCallback", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeProductProviderCallback;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodePickProductProviderCallbackProxyAdapter implements BarcodePickProductProviderCallbackProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeProductProviderCallback f17916a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodePickProductProviderCallbackProxyAdapter(@NotNull NativeProductProviderCallback _NativeProductProviderCallback, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeProductProviderCallback, "_NativeProductProviderCallback");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17916a = _NativeProductProviderCallback;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.data.BarcodePickProductProviderCallbackProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeProductProviderCallback getF17916a() {
        return this.f17916a;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.data.BarcodePickProductProviderCallbackProxy
    public void onData(@NotNull List<BarcodePickProductProviderCallbackItem> data) {
        Intrinsics.h(data, "data");
        this.f17916a.onData(BarcodeNativeTypeFactory.INSTANCE.convertProductProviderCallbackItemToNativeImpl(data));
    }

    public /* synthetic */ BarcodePickProductProviderCallbackProxyAdapter(NativeProductProviderCallback nativeProductProviderCallback, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeProductProviderCallback, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
