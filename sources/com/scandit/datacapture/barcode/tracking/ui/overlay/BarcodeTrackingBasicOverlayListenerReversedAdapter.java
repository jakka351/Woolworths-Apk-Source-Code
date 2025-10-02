package com.scandit.datacapture.barcode.tracking.ui.overlay;

import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlay;
import com.scandit.datacapture.barcode.tracking.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlayListener;
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
import kotlin.jvm.internal.ReflectionFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlayListenerReversedAdapter;", "Lcom/scandit/datacapture/barcode/tracking/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlayListener;", "Lcom/scandit/datacapture/barcode/tracking/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlay;", "overlay", "Lcom/scandit/datacapture/barcode/tracking/internal/module/data/NativeTrackedBarcode;", "trackedBarcode", "Lcom/scandit/datacapture/core/internal/sdk/ui/style/NativeBrush;", "brushForTrackedBarcode", "", "onTrackedBarcodeTapped", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlayListener;", "_BarcodeTrackingBasicOverlayListener", "Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlay;", "_BarcodeTrackingBasicOverlay", "<init>", "(Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlayListener;Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlay;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeTrackingBasicOverlayListenerReversedAdapter extends NativeBarcodeTrackingBasicOverlayListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeTrackingBasicOverlayListener f18205a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final WeakReference c;

    public /* synthetic */ BarcodeTrackingBasicOverlayListenerReversedAdapter(BarcodeTrackingBasicOverlayListener barcodeTrackingBasicOverlayListener, BarcodeTrackingBasicOverlay barcodeTrackingBasicOverlay, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeTrackingBasicOverlayListener, barcodeTrackingBasicOverlay, (i & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @Override // com.scandit.datacapture.barcode.tracking.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlayListener
    @Nullable
    public NativeBrush brushForTrackedBarcode(@NotNull NativeBarcodeTrackingBasicOverlay overlay, @NotNull NativeTrackedBarcode trackedBarcode) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        BarcodeTrackingBasicOverlay barcodeTrackingBasicOverlay = (BarcodeTrackingBasicOverlay) this.c.get();
        if (barcodeTrackingBasicOverlay != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeTrackingBasicOverlay.class), null, overlay, new d(barcodeTrackingBasicOverlay));
            Intrinsics.g(orPut, "{\n            val _0 = p…      return _3\n        }");
            TrackedBarcode trackedBarcode2 = (TrackedBarcode) this.proxyCache.getOrPut(reflectionFactory.b(NativeTrackedBarcode.class), null, trackedBarcode, new e(trackedBarcode));
            Brush brushBrushForTrackedBarcode = this.f18205a.brushForTrackedBarcode((BarcodeTrackingBasicOverlay) orPut, trackedBarcode2);
            if (brushBrushForTrackedBarcode != null) {
                return CoreNativeTypeFactory.INSTANCE.convert(brushBrushForTrackedBarcode);
            }
        }
        return null;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.tracking.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlayListener
    public void onTrackedBarcodeTapped(@NotNull NativeBarcodeTrackingBasicOverlay overlay, @NotNull NativeTrackedBarcode trackedBarcode) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        BarcodeTrackingBasicOverlay barcodeTrackingBasicOverlay = (BarcodeTrackingBasicOverlay) this.c.get();
        if (barcodeTrackingBasicOverlay != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeTrackingBasicOverlay.class), null, overlay, new f(barcodeTrackingBasicOverlay));
            Intrinsics.g(orPut, "{\n            val _0 = p…eTapped(_0, _1)\n        }");
            TrackedBarcode trackedBarcode2 = (TrackedBarcode) this.proxyCache.getOrPut(reflectionFactory.b(NativeTrackedBarcode.class), null, trackedBarcode, new g(trackedBarcode));
            this.f18205a.onTrackedBarcodeTapped((BarcodeTrackingBasicOverlay) orPut, trackedBarcode2);
        }
    }

    public BarcodeTrackingBasicOverlayListenerReversedAdapter(@NotNull BarcodeTrackingBasicOverlayListener _BarcodeTrackingBasicOverlayListener, @NotNull BarcodeTrackingBasicOverlay _BarcodeTrackingBasicOverlay, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_BarcodeTrackingBasicOverlayListener, "_BarcodeTrackingBasicOverlayListener");
        Intrinsics.h(_BarcodeTrackingBasicOverlay, "_BarcodeTrackingBasicOverlay");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18205a = _BarcodeTrackingBasicOverlayListener;
        this.proxyCache = proxyCache;
        this.c = new WeakReference(_BarcodeTrackingBasicOverlay);
    }
}
