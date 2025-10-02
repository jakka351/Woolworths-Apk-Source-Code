package com.scandit.datacapture.barcode.count.ui.view.status;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusProviderCallback;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0097\u0001¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusProviderCallback;", "Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusProviderCallbackProxy;", "impl", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusProviderCallback;", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusProviderCallback;)V", "_impl", "onStatusReady", "", "statusResult", "Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusResult;", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BarcodeCountStatusProviderCallback implements BarcodeCountStatusProviderCallbackProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeCountStatusProviderCallbackProxyAdapter f17584a;

    public BarcodeCountStatusProviderCallback(@NotNull NativeBarcodeCountStatusProviderCallback impl) {
        Intrinsics.h(impl, "impl");
        this.f17584a = new BarcodeCountStatusProviderCallbackProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.view.status.BarcodeCountStatusProviderCallbackProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeCountStatusProviderCallback getF17585a() {
        return this.f17584a.getF17585a();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.view.status.BarcodeCountStatusProviderCallbackProxy
    @ProxyFunction
    public void onStatusReady(@NotNull BarcodeCountStatusResult statusResult) {
        Intrinsics.h(statusResult, "statusResult");
        this.f17584a.onStatusReady(statusResult);
    }
}
