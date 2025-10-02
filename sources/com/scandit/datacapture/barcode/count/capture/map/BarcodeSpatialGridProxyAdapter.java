package com.scandit.datacapture.barcode.count.capture.map;

import com.scandit.datacapture.barcode.count.capture.Coordinate2d;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGrid;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u001a\u0010\u0016\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridProxyAdapter;", "Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridProxy;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeSpatialGrid;", "_impl", "", "rows", "columns", "row", "column", "Lcom/scandit/datacapture/barcode/data/Barcode;", "barcodeAt", "barcode", "", "Lcom/scandit/datacapture/barcode/count/capture/Coordinate2d;", "coordinatesForBarcode", "", "toJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "_NativeBarcodeSpatialGrid", "<init>", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeSpatialGrid;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeSpatialGridProxyAdapter implements BarcodeSpatialGridProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeSpatialGrid f17507a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeSpatialGridProxyAdapter(@NotNull NativeBarcodeSpatialGrid _NativeBarcodeSpatialGrid, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeSpatialGrid, "_NativeBarcodeSpatialGrid");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17507a = _NativeBarcodeSpatialGrid;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeSpatialGrid getF17507a() {
        return this.f17507a;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridProxy
    @Nullable
    public Barcode barcodeAt(int row, int column) {
        NativeBarcode nativeBarcodeBarcodeAt = this.f17507a.barcodeAt(row, column);
        if (nativeBarcodeBarcodeAt != null) {
            return (Barcode) this.proxyCache.getOrPut(Reflection.f24268a.b(NativeBarcode.class), null, nativeBarcodeBarcodeAt, new a(nativeBarcodeBarcodeAt));
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridProxy
    public int columns() {
        return this.f17507a.columns();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridProxy
    @NotNull
    public List<Coordinate2d> coordinatesForBarcode(@NotNull Barcode barcode) {
        Intrinsics.h(barcode, "barcode");
        NativeBarcode nativeBarcode_impl = barcode.getF17604a();
        this.proxyCache.put(Reflection.f24268a.b(NativeBarcode.class), null, nativeBarcode_impl, barcode);
        ArrayList<Coordinate2d> _1 = this.f17507a.coordinatesForBarcode(nativeBarcode_impl);
        Intrinsics.g(_1, "_1");
        return _1;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridProxy
    public int rows() {
        return this.f17507a.rows();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridProxy
    @NotNull
    public String toJson() {
        String _0 = this.f17507a.toJson();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ BarcodeSpatialGridProxyAdapter(NativeBarcodeSpatialGrid nativeBarcodeSpatialGrid, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeSpatialGrid, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
