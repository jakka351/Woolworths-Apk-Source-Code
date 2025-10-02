package com.scandit.datacapture.barcode.count.ui.view.status;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusResult;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003H\u0097\u0001¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusResult;", "Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusResultProxy;", "impl", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusResult;", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusResult;)V", "_impl", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BarcodeCountStatusResult implements BarcodeCountStatusResultProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeCountStatusResultProxyAdapter f17586a;

    public BarcodeCountStatusResult(@NotNull NativeBarcodeCountStatusResult impl) {
        Intrinsics.h(impl, "impl");
        this.f17586a = new BarcodeCountStatusResultProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.view.status.BarcodeCountStatusResultProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeCountStatusResult getF17587a() {
        return this.f17586a.getF17587a();
    }
}
