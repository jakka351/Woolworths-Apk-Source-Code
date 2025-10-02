package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBrushProvider;
import com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlay;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionBrushProviderReversedAdapter;", "Lcom/scandit/datacapture/barcode/selection/internal/module/ui/overlay/NativeBarcodeSelectionBrushProvider;", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeBarcode;", "barcode", "Lcom/scandit/datacapture/core/internal/sdk/ui/style/NativeBrush;", "brushForBarcode", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionBrushProvider;", "_BarcodeSelectionBrushProvider", "Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlay;", "_BarcodeSelectionBasicOverlay", "<init>", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionBrushProvider;Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlay;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeSelectionBrushProviderReversedAdapter extends NativeBarcodeSelectionBrushProvider {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeSelectionBrushProvider f18018a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final WeakReference c;

    public /* synthetic */ BarcodeSelectionBrushProviderReversedAdapter(BarcodeSelectionBrushProvider barcodeSelectionBrushProvider, BarcodeSelectionBasicOverlay barcodeSelectionBasicOverlay, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeSelectionBrushProvider, barcodeSelectionBasicOverlay, (i & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBrushProvider
    @Nullable
    public NativeBrush brushForBarcode(@NotNull NativeBarcode barcode) {
        Intrinsics.h(barcode, "barcode");
        if (((BarcodeSelectionBasicOverlay) this.c.get()) != null) {
            Brush brushBrushForBarcode = this.f18018a.brushForBarcode((Barcode) this.proxyCache.getOrPut(Reflection.f24268a.b(NativeBarcode.class), null, barcode, new C0836d(barcode)));
            if (brushBrushForBarcode != null) {
                return CoreNativeTypeFactory.INSTANCE.convert(brushBrushForBarcode);
            }
        }
        return null;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    public BarcodeSelectionBrushProviderReversedAdapter(@NotNull BarcodeSelectionBrushProvider _BarcodeSelectionBrushProvider, @NotNull BarcodeSelectionBasicOverlay _BarcodeSelectionBasicOverlay, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_BarcodeSelectionBrushProvider, "_BarcodeSelectionBrushProvider");
        Intrinsics.h(_BarcodeSelectionBasicOverlay, "_BarcodeSelectionBasicOverlay");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18018a = _BarcodeSelectionBrushProvider;
        this.proxyCache = proxyCache;
        this.c = new WeakReference(_BarcodeSelectionBasicOverlay);
    }
}
