package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickScanningSession;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickScanningSession;", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickScanningSessionProxy;", "", "toJson", "", "getPickedItems", "()Ljava/util/Set;", "pickedItems", "getScannedItems", "scannedItems", "Lkotlin/Function0;", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickScanningSession;", "getImpl", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodePickScanningSession implements BarcodePickScanningSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f17893a;
    private final Lazy b;

    public BarcodePickScanningSession(@NotNull Function0<? extends NativeBarcodePickScanningSession> getImpl) {
        Intrinsics.h(getImpl, "getImpl");
        this.f17893a = getImpl;
        this.b = LazyKt.b(new e(this));
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningSessionProxy
    @NotNull
    public Set<String> getPickedItems() {
        return ((BarcodePickScanningSessionProxyAdapter) this.b.getD()).getPickedItems();
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningSessionProxy
    @NotNull
    public Set<String> getScannedItems() {
        return ((BarcodePickScanningSessionProxyAdapter) this.b.getD()).getScannedItems();
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningSessionProxy
    @NotNull
    public String toJson() {
        return ((BarcodePickScanningSessionProxyAdapter) this.b.getD()).toJson();
    }
}
