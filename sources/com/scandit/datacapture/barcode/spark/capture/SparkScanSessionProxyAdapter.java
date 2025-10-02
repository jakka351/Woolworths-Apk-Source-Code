package com.scandit.datacapture.barcode.spark.capture;

import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSession;
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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/capture/SparkScanSessionProxyAdapter;", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScanSessionProxy;", "", "reset", "", "toJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "Lcom/scandit/datacapture/barcode/data/Barcode;", "getNewlyRecognizedBarcodes", "()Ljava/util/List;", "newlyRecognizedBarcodes", "getNewlyRecognizedBarcode", "()Lcom/scandit/datacapture/barcode/data/Barcode;", "newlyRecognizedBarcode", "", "getFrameSequenceId", "()J", "frameSequenceId", "Lcom/scandit/datacapture/barcode/spark/internal/module/capture/NativeSparkScanSession;", "_NativeSparkScanSession", "<init>", "(Lcom/scandit/datacapture/barcode/spark/internal/module/capture/NativeSparkScanSession;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SparkScanSessionProxyAdapter implements SparkScanSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeSparkScanSession f18087a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public SparkScanSessionProxyAdapter(@NotNull NativeSparkScanSession _NativeSparkScanSession, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeSparkScanSession, "_NativeSparkScanSession");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18087a = _NativeSparkScanSession;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSessionProxy
    public long getFrameSequenceId() {
        return this.f18087a.getFrameSeqIdAndroid();
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSessionProxy
    @Nullable
    public Barcode getNewlyRecognizedBarcode() {
        NativeBarcode newlyRecognizedBarcode = this.f18087a.getNewlyRecognizedBarcode();
        if (newlyRecognizedBarcode != null) {
            return (Barcode) this.proxyCache.getOrPut(Reflection.f24268a.b(NativeBarcode.class), null, newlyRecognizedBarcode, new b(newlyRecognizedBarcode));
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSessionProxy
    @NotNull
    public List<Barcode> getNewlyRecognizedBarcodes() {
        ArrayList<NativeBarcode> _0 = this.f18087a.getNewlyRecognizedBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convertNativeBarcodeList(_0);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSessionProxy
    public void reset() {
        this.f18087a.clear();
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSessionProxy
    @NotNull
    public String toJson() {
        String _0 = this.f18087a.toJson();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ SparkScanSessionProxyAdapter(NativeSparkScanSession nativeSparkScanSession, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeSparkScanSession, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
