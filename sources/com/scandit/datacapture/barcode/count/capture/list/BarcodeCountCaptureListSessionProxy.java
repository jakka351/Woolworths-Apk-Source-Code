package com.scandit.datacapture.barcode.count.capture.list;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureListSession;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u000f\u001a\u00020\u0010H'J\b\u0010\u0011\u001a\u00020\u0012H'R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureListSessionProxy;", "", "additionalBarcodes", "", "Lcom/scandit/datacapture/barcode/data/Barcode;", "getAdditionalBarcodes", "()Ljava/util/List;", "correctBarcodes", "Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;", "getCorrectBarcodes", "missingBarcodes", "Lcom/scandit/datacapture/barcode/count/capture/list/TargetBarcode;", "getMissingBarcodes", "wrongBarcodes", "getWrongBarcodes", "_impl", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountCaptureListSession;", "toJson", "", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeCountCaptureListSession.class)
/* loaded from: classes6.dex */
public interface BarcodeCountCaptureListSessionProxy {
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    NativeBarcodeCountCaptureListSession getF17494a();

    @ProxyFunction(nativeName = "getAdditionalBarcodes", property = "additionalBarcodes")
    @NotNull
    List<Barcode> getAdditionalBarcodes();

    @ProxyFunction(nativeName = "getCorrectBarcodes", property = "correctBarcodes")
    @NotNull
    List<TrackedBarcode> getCorrectBarcodes();

    @ProxyFunction(nativeName = "getMissingBarcodes", property = "missingBarcodes")
    @NotNull
    List<TargetBarcode> getMissingBarcodes();

    @ProxyFunction(nativeName = "getWrongBarcodes", property = "wrongBarcodes")
    @NotNull
    List<TrackedBarcode> getWrongBarcodes();

    @ProxyFunction
    @NotNull
    String toJson();
}
