package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGrid;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountSessionCallback;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BI\b\u0000\u0012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010$\u001a\u00020\u0019\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\b\u0010\n\u001a\u0004\u0018\u00010\tR#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017¨\u0006*"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSession;", "", "", "reset", "", "toJson", "", "expectedNumberOfRows", "expectedNumberOfColumns", "Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGrid;", "getSpatialMap", "", "Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;", "b", "Ljava/util/Map;", "getRecognizedBarcodes", "()Ljava/util/Map;", "recognizedBarcodes", "", "Lcom/scandit/datacapture/barcode/data/Barcode;", "c", "Ljava/util/List;", "getAdditionalBarcodes", "()Ljava/util/List;", "additionalBarcodes", "", "d", "J", "getFrameSequenceId", "()J", "frameSequenceId", "e", "get_removedRecognizedBarcodes", "_removedRecognizedBarcodes", "recognizedBarcodesParam", "additionalBarcodesParam", "frameSequenceIdParam", "removedRecognizedBarcodes", "Lcom/scandit/datacapture/barcode/internal/module/count/capture/InternalBarcodeCountSessionCallback;", "callbacks", "<init>", "(Ljava/util/Map;Ljava/util/List;JLjava/util/List;Lcom/scandit/datacapture/barcode/internal/module/count/capture/InternalBarcodeCountSessionCallback;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCountSession {

    /* renamed from: a, reason: collision with root package name */
    private final InternalBarcodeCountSessionCallback f17473a;

    /* renamed from: b, reason: from kotlin metadata */
    private final Map recognizedBarcodes;

    /* renamed from: c, reason: from kotlin metadata */
    private final List additionalBarcodes;

    /* renamed from: d, reason: from kotlin metadata */
    private final long frameSequenceId;

    /* renamed from: e, reason: from kotlin metadata */
    private final List _removedRecognizedBarcodes;

    public BarcodeCountSession(@NotNull Map<Integer, TrackedBarcode> recognizedBarcodesParam, @NotNull List<Barcode> additionalBarcodesParam, long j, @NotNull List<Integer> removedRecognizedBarcodes, @NotNull InternalBarcodeCountSessionCallback callbacks) {
        Intrinsics.h(recognizedBarcodesParam, "recognizedBarcodesParam");
        Intrinsics.h(additionalBarcodesParam, "additionalBarcodesParam");
        Intrinsics.h(removedRecognizedBarcodes, "removedRecognizedBarcodes");
        Intrinsics.h(callbacks, "callbacks");
        this.f17473a = callbacks;
        this.recognizedBarcodes = recognizedBarcodesParam;
        this.additionalBarcodes = additionalBarcodesParam;
        this.frameSequenceId = j;
        this._removedRecognizedBarcodes = removedRecognizedBarcodes;
    }

    @NotNull
    public final List<Barcode> getAdditionalBarcodes() {
        return this.additionalBarcodes;
    }

    public final long getFrameSequenceId() {
        return this.frameSequenceId;
    }

    @NotNull
    public final Map<Integer, TrackedBarcode> getRecognizedBarcodes() {
        return this.recognizedBarcodes;
    }

    @Nullable
    public final BarcodeSpatialGrid getSpatialMap(int expectedNumberOfRows, int expectedNumberOfColumns) {
        return (BarcodeSpatialGrid) this.f17473a.a().invoke(Integer.valueOf(expectedNumberOfRows), Integer.valueOf(expectedNumberOfColumns));
    }

    @NotNull
    public final List<Integer> get_removedRecognizedBarcodes() {
        return this._removedRecognizedBarcodes;
    }

    public final void reset() {
        this.f17473a.b().invoke();
    }

    @NotNull
    public final String toJson() {
        return (String) this.f17473a.c().invoke();
    }

    @Nullable
    public final BarcodeSpatialGrid getSpatialMap() {
        return (BarcodeSpatialGrid) this.f17473a.a().invoke(null, null);
    }
}
