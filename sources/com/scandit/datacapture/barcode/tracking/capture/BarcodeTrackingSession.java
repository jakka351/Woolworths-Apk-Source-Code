package com.scandit.datacapture.barcode.tracking.capture;

import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.capture.NativeBarcodeTrackingSession;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000bR \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000bR\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingSession;", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingSessionProxy;", "Lcom/scandit/datacapture/barcode/tracking/internal/module/capture/NativeBarcodeTrackingSession;", "_impl", "", "reset", "", "toJson", "", "Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;", "getAddedTrackedBarcodes", "()Ljava/util/List;", "addedTrackedBarcodes", "getUpdatedTrackedBarcodes", "updatedTrackedBarcodes", "", "getRemovedTrackedBarcodes", "removedTrackedBarcodes", "", "getTrackedBarcodes", "()Ljava/util/Map;", "trackedBarcodes", "getUnscannedTrackedBarcodes", "unscannedTrackedBarcodes", "", "getFrameSequenceId", "()J", "frameSequenceId", "Lkotlin/Function0;", "getImpl", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@Mockable
/* loaded from: classes6.dex */
public final class BarcodeTrackingSession implements BarcodeTrackingSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f18155a;
    private final Lazy b;

    public BarcodeTrackingSession(@NotNull Function0<? extends NativeBarcodeTrackingSession> getImpl) {
        Intrinsics.h(getImpl, "getImpl");
        this.f18155a = getImpl;
        this.b = LazyKt.b(new G(this));
    }

    private final BarcodeTrackingSessionProxyAdapter a() {
        return (BarcodeTrackingSessionProxyAdapter) this.b.getD();
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSessionProxy
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeTrackingSession getF18156a() {
        return (NativeBarcodeTrackingSession) this.f18155a.invoke();
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSessionProxy
    @NotNull
    public List<TrackedBarcode> getAddedTrackedBarcodes() {
        return a().getAddedTrackedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSessionProxy
    public long getFrameSequenceId() {
        return a().getFrameSequenceId();
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSessionProxy
    @NotNull
    public List<Integer> getRemovedTrackedBarcodes() {
        return a().getRemovedTrackedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSessionProxy
    @NotNull
    public Map<Integer, TrackedBarcode> getTrackedBarcodes() {
        return a().getTrackedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSessionProxy
    @NotNull
    public List<TrackedBarcode> getUnscannedTrackedBarcodes() {
        return a().getUnscannedTrackedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSessionProxy
    @NotNull
    public List<TrackedBarcode> getUpdatedTrackedBarcodes() {
        return a().getUpdatedTrackedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSessionProxy
    public void reset() {
        a().reset();
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSessionProxy
    @NotNull
    public String toJson() {
        return a().toJson();
    }
}
