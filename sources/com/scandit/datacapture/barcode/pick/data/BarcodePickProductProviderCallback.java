package com.scandit.datacapture.barcode.pick.data;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeProductProviderCallback;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003H\u0097\u0001J\u0017\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0097\u0001¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProviderCallback;", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProviderCallbackProxy;", "impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeProductProviderCallback;", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeProductProviderCallback;)V", "_impl", "onData", "", "data", "", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProviderCallbackItem;", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Mockable
/* loaded from: classes6.dex */
public final class BarcodePickProductProviderCallback implements BarcodePickProductProviderCallbackProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodePickProductProviderCallbackProxyAdapter f17913a;

    public BarcodePickProductProviderCallback(@NotNull NativeProductProviderCallback impl) {
        Intrinsics.h(impl, "impl");
        this.f17913a = new BarcodePickProductProviderCallbackProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.scandit.datacapture.barcode.pick.data.BarcodePickProductProviderCallbackProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeProductProviderCallback getF17916a() {
        return this.f17913a.getF17916a();
    }

    @Override // com.scandit.datacapture.barcode.pick.data.BarcodePickProductProviderCallbackProxy
    @ProxyFunction
    public void onData(@NotNull List<BarcodePickProductProviderCallbackItem> data) {
        Intrinsics.h(data, "data");
        this.f17913a.onData(data);
    }
}
