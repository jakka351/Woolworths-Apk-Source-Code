package com.scandit.datacapture.barcode.tracking.capture;

import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.capture.NativeBarcodeTrackingSession;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingSessionProxyAdapter;", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingSessionProxy;", "Lcom/scandit/datacapture/barcode/tracking/internal/module/capture/NativeBarcodeTrackingSession;", "_impl", "", "reset", "", "toJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;", "getAddedTrackedBarcodes", "()Ljava/util/List;", "addedTrackedBarcodes", "getUpdatedTrackedBarcodes", "updatedTrackedBarcodes", "", "getRemovedTrackedBarcodes", "removedTrackedBarcodes", "", "getTrackedBarcodes", "()Ljava/util/Map;", "trackedBarcodes", "getUnscannedTrackedBarcodes", "unscannedTrackedBarcodes", "", "getFrameSequenceId", "()J", "frameSequenceId", "_NativeBarcodeTrackingSession", "<init>", "(Lcom/scandit/datacapture/barcode/tracking/internal/module/capture/NativeBarcodeTrackingSession;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeTrackingSessionProxyAdapter implements BarcodeTrackingSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeTrackingSession f18156a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeTrackingSessionProxyAdapter(@NotNull NativeBarcodeTrackingSession _NativeBarcodeTrackingSession, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeTrackingSession, "_NativeBarcodeTrackingSession");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18156a = _NativeBarcodeTrackingSession;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSessionProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeTrackingSession getF18156a() {
        return this.f18156a;
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSessionProxy
    @NotNull
    public List<TrackedBarcode> getAddedTrackedBarcodes() {
        ArrayList<NativeTrackedBarcode> _0 = this.f18156a.getAddedTrackedBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convertNativeTrackedBarcodeList(_0);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSessionProxy
    public long getFrameSequenceId() {
        return this.f18156a.getFrameSeqIdAndroid();
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSessionProxy
    @NotNull
    public List<Integer> getRemovedTrackedBarcodes() {
        ArrayList<Integer> _0 = this.f18156a.getRemovedTrackedBarcodes();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSessionProxy
    @NotNull
    public Map<Integer, TrackedBarcode> getTrackedBarcodes() {
        HashMap<Integer, NativeTrackedBarcode> _0 = this.f18156a.getTrackedBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convert(_0);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSessionProxy
    @NotNull
    public List<TrackedBarcode> getUnscannedTrackedBarcodes() {
        ArrayList<NativeTrackedBarcode> _0 = this.f18156a.getUnscannedTrackedBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convertNativeTrackedBarcodeList(_0);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSessionProxy
    @NotNull
    public List<TrackedBarcode> getUpdatedTrackedBarcodes() {
        ArrayList<NativeTrackedBarcode> _0 = this.f18156a.getUpdatedTrackedBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convertNativeTrackedBarcodeList(_0);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSessionProxy
    public void reset() {
        this.f18156a.reset();
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSessionProxy
    @NotNull
    public String toJson() {
        String _0 = this.f18156a.toJson();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ BarcodeTrackingSessionProxyAdapter(NativeBarcodeTrackingSession nativeBarcodeTrackingSession, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeTrackingSession, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
