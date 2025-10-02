package com.scandit.datacapture.barcode.count.capture.list;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureListSession;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\tR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureListSession;", "Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureListSessionProxy;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountCaptureListSession;", "_impl", "", "toJson", "", "Lcom/scandit/datacapture/barcode/count/capture/list/TargetBarcode;", "getMissingBarcodes", "()Ljava/util/List;", "missingBarcodes", "Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;", "getCorrectBarcodes", "correctBarcodes", "getWrongBarcodes", "wrongBarcodes", "Lcom/scandit/datacapture/barcode/data/Barcode;", "getAdditionalBarcodes", "additionalBarcodes", "Lkotlin/Function0;", "getImpl", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@Mockable
/* loaded from: classes6.dex */
public final class BarcodeCountCaptureListSession implements BarcodeCountCaptureListSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f17493a;
    private final Lazy b;

    public BarcodeCountCaptureListSession(@NotNull Function0<? extends NativeBarcodeCountCaptureListSession> getImpl) {
        Intrinsics.h(getImpl, "getImpl");
        this.f17493a = getImpl;
        this.b = LazyKt.b(new h(this));
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeCountCaptureListSession getF17494a() {
        return (NativeBarcodeCountCaptureListSession) this.f17493a.invoke();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    @NotNull
    public List<Barcode> getAdditionalBarcodes() {
        return ((BarcodeCountCaptureListSessionProxyAdapter) this.b.getD()).getAdditionalBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    @NotNull
    public List<TrackedBarcode> getCorrectBarcodes() {
        return ((BarcodeCountCaptureListSessionProxyAdapter) this.b.getD()).getCorrectBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    @NotNull
    public List<TargetBarcode> getMissingBarcodes() {
        return ((BarcodeCountCaptureListSessionProxyAdapter) this.b.getD()).getMissingBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    @NotNull
    public List<TrackedBarcode> getWrongBarcodes() {
        return ((BarcodeCountCaptureListSessionProxyAdapter) this.b.getD()).getWrongBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    @NotNull
    public String toJson() {
        return ((BarcodeCountCaptureListSessionProxyAdapter) this.b.getD()).toJson();
    }
}
