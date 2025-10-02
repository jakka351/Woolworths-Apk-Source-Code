package com.scandit.datacapture.barcode.count.capture.map;

import com.scandit.datacapture.barcode.count.capture.Coordinate2d;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGrid;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003H\u0097\u0001J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0097\u0001J\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b2\u0006\u0010\f\u001a\u00020\tJ\t\u0010\r\u001a\u00020\tH\u0097\u0001J\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\u0010\u001a\u00020\u0007H\u0097\u0001J\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b2\u0006\u0010\f\u001a\u00020\tJ\t\u0010\u0011\u001a\u00020\tH\u0097\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u0097\u0001¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGrid;", "Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridProxy;", "impl", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeSpatialGrid;", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeSpatialGrid;)V", "_impl", "barcodeAt", "Lcom/scandit/datacapture/barcode/data/Barcode;", "row", "", "column", "", "index", "columns", "coordinatesForBarcode", "Lcom/scandit/datacapture/barcode/count/capture/Coordinate2d;", "barcode", "rows", "toJson", "", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Mockable
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BarcodeSpatialGrid implements BarcodeSpatialGridProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeSpatialGridProxyAdapter f17506a;

    public BarcodeSpatialGrid(@NotNull NativeBarcodeSpatialGrid impl) {
        Intrinsics.h(impl, "impl");
        this.f17506a = new BarcodeSpatialGridProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeSpatialGrid getF17507a() {
        return this.f17506a.getF17507a();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridProxy
    @ProxyFunction
    @Nullable
    public Barcode barcodeAt(int row, int column) {
        return this.f17506a.barcodeAt(row, column);
    }

    @NotNull
    public final List<Barcode> column(int index) {
        ArrayList<NativeBarcode> arrayListColumn = getF17507a().column(index);
        Intrinsics.f(arrayListColumn, "null cannot be cast to non-null type java.util.ArrayList<com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode?>{ kotlin.collections.TypeAliasesKt.ArrayList<com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode?> }");
        ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListColumn, 10));
        for (NativeBarcode nativeBarcode : arrayListColumn) {
            arrayList.add(nativeBarcode != null ? new Barcode(nativeBarcode) : null);
        }
        return arrayList;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridProxy
    @ProxyFunction
    public int columns() {
        return this.f17506a.columns();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridProxy
    @ProxyFunction
    @NotNull
    public List<Coordinate2d> coordinatesForBarcode(@NotNull Barcode barcode) {
        Intrinsics.h(barcode, "barcode");
        return this.f17506a.coordinatesForBarcode(barcode);
    }

    @NotNull
    public final List<Barcode> row(int index) {
        ArrayList<NativeBarcode> arrayListRow = getF17507a().row(index);
        Intrinsics.f(arrayListRow, "null cannot be cast to non-null type java.util.ArrayList<com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode?>{ kotlin.collections.TypeAliasesKt.ArrayList<com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode?> }");
        ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListRow, 10));
        for (NativeBarcode nativeBarcode : arrayListRow) {
            arrayList.add(nativeBarcode != null ? new Barcode(nativeBarcode) : null);
        }
        return arrayList;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridProxy
    @ProxyFunction
    public int rows() {
        return this.f17506a.rows();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridProxy
    @ProxyFunction
    @NotNull
    public String toJson() {
        return this.f17506a.toJson();
    }
}
