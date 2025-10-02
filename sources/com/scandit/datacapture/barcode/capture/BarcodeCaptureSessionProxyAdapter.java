package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.data.LocalizedOnlyBarcode;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSession;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeLocalizedOnlyBarcode;
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

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSessionProxyAdapter;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSessionProxy;", "", "reset", "", "toJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "Lcom/scandit/datacapture/barcode/data/Barcode;", "getNewlyRecognizedBarcodes", "()Ljava/util/List;", "newlyRecognizedBarcodes", "getNewlyRecognizedBarcode", "()Lcom/scandit/datacapture/barcode/data/Barcode;", "newlyRecognizedBarcode", "Lcom/scandit/datacapture/barcode/data/LocalizedOnlyBarcode;", "getNewlyLocalizedBarcodes", "newlyLocalizedBarcodes", "", "getFrameSequenceId", "()J", "frameSequenceId", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureSession;", "_NativeBarcodeCaptureSession", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureSession;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCaptureSessionProxyAdapter implements BarcodeCaptureSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeCaptureSession f17415a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeCaptureSessionProxyAdapter(@NotNull NativeBarcodeCaptureSession _NativeBarcodeCaptureSession, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeCaptureSession, "_NativeBarcodeCaptureSession");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17415a = _NativeBarcodeCaptureSession;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSessionProxy
    public long getFrameSequenceId() {
        return this.f17415a.getFrameSeqIdAndroid();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSessionProxy
    @NotNull
    public List<LocalizedOnlyBarcode> getNewlyLocalizedBarcodes() {
        ArrayList<NativeLocalizedOnlyBarcode> _0 = this.f17415a.getNewlyLocalizedBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convertNativeLocalizedOnlyBarcode(_0);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSessionProxy
    @Nullable
    public Barcode getNewlyRecognizedBarcode() {
        NativeBarcode newlyRecognizedBarcode = this.f17415a.getNewlyRecognizedBarcode();
        if (newlyRecognizedBarcode != null) {
            return (Barcode) this.proxyCache.getOrPut(Reflection.f24268a.b(NativeBarcode.class), null, newlyRecognizedBarcode, new T(newlyRecognizedBarcode));
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSessionProxy
    @NotNull
    public List<Barcode> getNewlyRecognizedBarcodes() {
        ArrayList<NativeBarcode> _0 = this.f17415a.getNewlyRecognizedBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convertNativeBarcodeList(_0);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSessionProxy
    public void reset() {
        this.f17415a.clear();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSessionProxy
    @NotNull
    public String toJson() {
        String _0 = this.f17415a.toJson();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ BarcodeCaptureSessionProxyAdapter(NativeBarcodeCaptureSession nativeBarcodeCaptureSession, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeCaptureSession, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
