package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSession;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSessionProxyAdapter;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSessionProxy;", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelectionSession;", "_impl", "", "selectUnselectedBarcodes", "reset", "Lcom/scandit/datacapture/barcode/data/Barcode;", "barcode", "", "getCount", "", "toJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "getNewlySelectedBarcodes", "()Ljava/util/List;", "newlySelectedBarcodes", "getNewlyUnselectedBarcodes", "newlyUnselectedBarcodes", "getSelectedBarcodes", "selectedBarcodes", "", "getFrameSequenceId", "()J", "frameSequenceId", "getLastProcessedFrameId", "()I", "lastProcessedFrameId", "_NativeBarcodeSelectionSession", "<init>", "(Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelectionSession;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeSelectionSessionProxyAdapter implements BarcodeSelectionSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeSelectionSession f18030a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeSelectionSessionProxyAdapter(@NotNull NativeBarcodeSelectionSession _NativeBarcodeSelectionSession, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeSelectionSession, "_NativeBarcodeSelectionSession");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18030a = _NativeBarcodeSelectionSession;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeSelectionSession getF18030a() {
        return this.f18030a;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    public int getCount(@NotNull Barcode barcode) {
        Intrinsics.h(barcode, "barcode");
        NativeBarcode f17604a = barcode.getF17604a();
        this.proxyCache.put(Reflection.f24268a.b(NativeBarcode.class), null, f17604a, barcode);
        return this.f18030a.getCount(f17604a);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    public long getFrameSequenceId() {
        return this.f18030a.getFrameSeqIdAndroid();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    public int getLastProcessedFrameId() {
        return this.f18030a.getLastProcessedFrameId();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    @NotNull
    public List<Barcode> getNewlySelectedBarcodes() {
        ArrayList<NativeBarcode> _0 = this.f18030a.getNewlySelectedBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convertNativeBarcodeList(_0);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    @NotNull
    public List<Barcode> getNewlyUnselectedBarcodes() {
        ArrayList<NativeBarcode> _0 = this.f18030a.getNewlyUnselectedBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convertNativeBarcodeList(_0);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    @NotNull
    public List<Barcode> getSelectedBarcodes() {
        ArrayList<NativeBarcode> _0 = this.f18030a.getSelectedBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convertNativeBarcodeList(_0);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    public void reset() {
        this.f18030a.reset();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    public void selectUnselectedBarcodes() {
        this.f18030a.selectAllUnselectedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    @NotNull
    public String toJson() {
        String _0 = this.f18030a.toJson();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ BarcodeSelectionSessionProxyAdapter(NativeBarcodeSelectionSession nativeBarcodeSelectionSession, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeSelectionSession, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
