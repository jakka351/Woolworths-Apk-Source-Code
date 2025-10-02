package com.scandit.datacapture.barcode.spark.capture;

import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSession;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u000e\u001a\u00020\u000fH'J\b\u0010\u0010\u001a\u00020\u0011H'R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/capture/SparkScanSessionProxy;", "", "frameSequenceId", "", "getFrameSequenceId", "()J", "newlyRecognizedBarcode", "Lcom/scandit/datacapture/barcode/data/Barcode;", "getNewlyRecognizedBarcode", "()Lcom/scandit/datacapture/barcode/data/Barcode;", "newlyRecognizedBarcodes", "", "getNewlyRecognizedBarcodes", "()Ljava/util/List;", "reset", "", "toJson", "", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeSparkScanSession.class)
/* loaded from: classes6.dex */
public interface SparkScanSessionProxy {
    @ProxyFunction(nativeName = "getFrameSeqIdAndroid", property = "frameSequenceId")
    long getFrameSequenceId();

    @ProxyFunction(property = "newlyRecognizedBarcode")
    @Nullable
    Barcode getNewlyRecognizedBarcode();

    @ProxyFunction(property = "newlyRecognizedBarcodes")
    @NotNull
    List<Barcode> getNewlyRecognizedBarcodes();

    @ProxyFunction(nativeName = "clear")
    void reset();

    @ProxyFunction(nativeName = "toJson")
    @NotNull
    String toJson();
}
