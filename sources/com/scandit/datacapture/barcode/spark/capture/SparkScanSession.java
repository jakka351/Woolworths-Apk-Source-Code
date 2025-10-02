package com.scandit.datacapture.barcode.spark.capture;

import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSession;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068VX\u0097\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/capture/SparkScanSession;", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScanSessionProxy;", "", "reset", "", "toJson", "", "Lcom/scandit/datacapture/barcode/data/Barcode;", "getNewlyRecognizedBarcodes", "()Ljava/util/List;", "getNewlyRecognizedBarcodes$annotations", "()V", "newlyRecognizedBarcodes", "getNewlyRecognizedBarcode", "()Lcom/scandit/datacapture/barcode/data/Barcode;", "newlyRecognizedBarcode", "", "getFrameSequenceId", "()J", "frameSequenceId", "Lkotlin/Function0;", "Lcom/scandit/datacapture/barcode/spark/internal/module/capture/NativeSparkScanSession;", "getImpl", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@Mockable
/* loaded from: classes6.dex */
public final class SparkScanSession implements SparkScanSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f18086a;

    public SparkScanSession(@NotNull Function0<? extends NativeSparkScanSession> getImpl) {
        Intrinsics.h(getImpl, "getImpl");
        this.f18086a = LazyKt.b(new a(getImpl));
    }

    @Deprecated
    public static /* synthetic */ void getNewlyRecognizedBarcodes$annotations() {
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSessionProxy
    public long getFrameSequenceId() {
        return ((SparkScanSessionProxyAdapter) this.f18086a.getD()).getFrameSequenceId();
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSessionProxy
    @Nullable
    public Barcode getNewlyRecognizedBarcode() {
        return ((SparkScanSessionProxyAdapter) this.f18086a.getD()).getNewlyRecognizedBarcode();
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSessionProxy
    @NotNull
    public List<Barcode> getNewlyRecognizedBarcodes() {
        return ((SparkScanSessionProxyAdapter) this.f18086a.getD()).getNewlyRecognizedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSessionProxy
    public void reset() {
        ((SparkScanSessionProxyAdapter) this.f18086a.getD()).reset();
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSessionProxy
    @NotNull
    public String toJson() {
        return ((SparkScanSessionProxyAdapter) this.f18086a.getD()).toJson();
    }
}
