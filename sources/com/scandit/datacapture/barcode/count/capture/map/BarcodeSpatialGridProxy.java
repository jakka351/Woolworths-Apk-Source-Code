package com.scandit.datacapture.barcode.count.capture.map;

import com.scandit.datacapture.barcode.count.capture.Coordinate2d;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGrid;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H'J\b\u0010\t\u001a\u00020\u0007H'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u0005H'J\b\u0010\u000e\u001a\u00020\u0007H'J\b\u0010\u000f\u001a\u00020\u0010H'¨\u0006\u0011"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridProxy;", "", "_impl", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeSpatialGrid;", "barcodeAt", "Lcom/scandit/datacapture/barcode/data/Barcode;", "row", "", "column", "columns", "coordinatesForBarcode", "", "Lcom/scandit/datacapture/barcode/count/capture/Coordinate2d;", "barcode", "rows", "toJson", "", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeSpatialGrid.class)
/* loaded from: classes6.dex */
public interface BarcodeSpatialGridProxy {
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    NativeBarcodeSpatialGrid getF17507a();

    @ProxyFunction
    @Nullable
    Barcode barcodeAt(int row, int column);

    @ProxyFunction
    int columns();

    @ProxyFunction
    @NotNull
    List<Coordinate2d> coordinatesForBarcode(@NotNull Barcode barcode);

    @ProxyFunction
    int rows();

    @ProxyFunction
    @NotNull
    String toJson();
}
