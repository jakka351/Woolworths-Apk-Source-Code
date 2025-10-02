package com.scandit.datacapture.barcode.count.capture.list;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureListSession;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeTargetBarcode;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000fR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureListSessionProxyAdapter;", "Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureListSessionProxy;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountCaptureListSession;", "_impl", "", "toJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;", "getCorrectBarcodes", "()Ljava/util/List;", "correctBarcodes", "getWrongBarcodes", "wrongBarcodes", "Lcom/scandit/datacapture/barcode/count/capture/list/TargetBarcode;", "getMissingBarcodes", "missingBarcodes", "Lcom/scandit/datacapture/barcode/data/Barcode;", "getAdditionalBarcodes", "additionalBarcodes", "_NativeBarcodeCountCaptureListSession", "<init>", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountCaptureListSession;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCountCaptureListSessionProxyAdapter implements BarcodeCountCaptureListSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeCountCaptureListSession f17494a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeCountCaptureListSessionProxyAdapter(@NotNull NativeBarcodeCountCaptureListSession _NativeBarcodeCountCaptureListSession, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeCountCaptureListSession, "_NativeBarcodeCountCaptureListSession");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17494a = _NativeBarcodeCountCaptureListSession;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeCountCaptureListSession getF17494a() {
        return this.f17494a;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    @NotNull
    public List<Barcode> getAdditionalBarcodes() {
        ArrayList<NativeBarcode> _0 = this.f17494a.getAdditionalBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convertNativeBarcodeList(_0);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    @NotNull
    public List<TrackedBarcode> getCorrectBarcodes() {
        ArrayList<NativeTrackedBarcode> _0 = this.f17494a.getCorrectBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convertNativeTrackedBarcodeList(_0);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    @NotNull
    public List<TargetBarcode> getMissingBarcodes() {
        ArrayList<NativeTargetBarcode> _0 = this.f17494a.getMissingBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convert(_0);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    @NotNull
    public List<TrackedBarcode> getWrongBarcodes() {
        ArrayList<NativeTrackedBarcode> _0 = this.f17494a.getWrongBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convertNativeTrackedBarcodeList(_0);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    @NotNull
    public String toJson() {
        String _0 = this.f17494a.toJson();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ BarcodeCountCaptureListSessionProxyAdapter(NativeBarcodeCountCaptureListSession nativeBarcodeCountCaptureListSession, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeCountCaptureListSession, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
