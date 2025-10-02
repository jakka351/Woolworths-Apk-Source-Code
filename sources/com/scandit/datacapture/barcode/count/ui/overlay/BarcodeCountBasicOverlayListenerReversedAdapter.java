package com.scandit.datacapture.barcode.count.ui.overlay;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayListener;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode;
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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayListenerReversedAdapter;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayListener;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlay;", "overlay", "Lcom/scandit/datacapture/barcode/tracking/internal/module/data/NativeTrackedBarcode;", "trackedBarcode", "Lcom/scandit/datacapture/core/internal/sdk/ui/style/NativeBrush;", "brushForTrackedBarcode", "brushForUntrackedBarcode", "brushForTrackedBarcodeNotInList", "", "onTrackedBarcodeTapped", "onUnTrackedBarcodeTapped", "onFilteredBarcodeTapped", "onTrackedBarcodeNotInListTapped", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayListener;", "_BarcodeCountBasicOverlayListener", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "_BarcodeCountBasicOverlay", "<init>", "(Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayListener;Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCountBasicOverlayListenerReversedAdapter extends NativeBarcodeCountBasicOverlayListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeCountBasicOverlayListener f17546a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final WeakReference c;

    public /* synthetic */ BarcodeCountBasicOverlayListenerReversedAdapter(BarcodeCountBasicOverlayListener barcodeCountBasicOverlayListener, BarcodeCountBasicOverlay barcodeCountBasicOverlay, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeCountBasicOverlayListener, barcodeCountBasicOverlay, (i & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayListener
    @Nullable
    public NativeBrush brushForTrackedBarcode(@NotNull NativeBarcodeCountBasicOverlay overlay, @NotNull NativeTrackedBarcode trackedBarcode) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.c.get();
        if (barcodeCountBasicOverlay != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCountBasicOverlay.class), null, overlay, new e(barcodeCountBasicOverlay));
            Intrinsics.g(orPut, "{\n            val _0 = p…      return _3\n        }");
            TrackedBarcode trackedBarcode2 = (TrackedBarcode) this.proxyCache.getOrPut(reflectionFactory.b(NativeTrackedBarcode.class), null, trackedBarcode, new f(trackedBarcode));
            Brush brushBrushForRecognizedBarcode = this.f17546a.brushForRecognizedBarcode((BarcodeCountBasicOverlay) orPut, trackedBarcode2);
            if (brushBrushForRecognizedBarcode != null) {
                return CoreNativeTypeFactory.INSTANCE.convert(brushBrushForRecognizedBarcode);
            }
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayListener
    @Nullable
    public NativeBrush brushForTrackedBarcodeNotInList(@NotNull NativeBarcodeCountBasicOverlay overlay, @NotNull NativeTrackedBarcode trackedBarcode) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.c.get();
        if (barcodeCountBasicOverlay != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCountBasicOverlay.class), null, overlay, new g(barcodeCountBasicOverlay));
            Intrinsics.g(orPut, "{\n            val _0 = p…      return _3\n        }");
            TrackedBarcode trackedBarcode2 = (TrackedBarcode) this.proxyCache.getOrPut(reflectionFactory.b(NativeTrackedBarcode.class), null, trackedBarcode, new h(trackedBarcode));
            Brush brushBrushForRecognizedBarcodeNotInList = this.f17546a.brushForRecognizedBarcodeNotInList((BarcodeCountBasicOverlay) orPut, trackedBarcode2);
            if (brushBrushForRecognizedBarcodeNotInList != null) {
                return CoreNativeTypeFactory.INSTANCE.convert(brushBrushForRecognizedBarcodeNotInList);
            }
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayListener
    @Nullable
    public NativeBrush brushForUntrackedBarcode(@NotNull NativeBarcodeCountBasicOverlay overlay, @NotNull NativeTrackedBarcode trackedBarcode) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.c.get();
        if (barcodeCountBasicOverlay != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCountBasicOverlay.class), null, overlay, new i(barcodeCountBasicOverlay));
            Intrinsics.g(orPut, "{\n            val _0 = p…      return _3\n        }");
            TrackedBarcode trackedBarcode2 = (TrackedBarcode) this.proxyCache.getOrPut(reflectionFactory.b(NativeTrackedBarcode.class), null, trackedBarcode, new j(trackedBarcode));
            Brush brushBrushForUnrecognizedBarcode = this.f17546a.brushForUnrecognizedBarcode((BarcodeCountBasicOverlay) orPut, trackedBarcode2);
            if (brushBrushForUnrecognizedBarcode != null) {
                return CoreNativeTypeFactory.INSTANCE.convert(brushBrushForUnrecognizedBarcode);
            }
        }
        return null;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayListener
    public void onFilteredBarcodeTapped(@NotNull NativeBarcodeCountBasicOverlay overlay, @NotNull NativeTrackedBarcode trackedBarcode) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.c.get();
        if (barcodeCountBasicOverlay != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCountBasicOverlay.class), null, overlay, new k(barcodeCountBasicOverlay));
            Intrinsics.g(orPut, "{\n            val _0 = p…eTapped(_0, _1)\n        }");
            TrackedBarcode trackedBarcode2 = (TrackedBarcode) this.proxyCache.getOrPut(reflectionFactory.b(NativeTrackedBarcode.class), null, trackedBarcode, new l(trackedBarcode));
            this.f17546a.onFilteredBarcodeTapped((BarcodeCountBasicOverlay) orPut, trackedBarcode2);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayListener
    public void onTrackedBarcodeNotInListTapped(@NotNull NativeBarcodeCountBasicOverlay overlay, @NotNull NativeTrackedBarcode trackedBarcode) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.c.get();
        if (barcodeCountBasicOverlay != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCountBasicOverlay.class), null, overlay, new m(barcodeCountBasicOverlay));
            Intrinsics.g(orPut, "{\n            val _0 = p…tTapped(_0, _1)\n        }");
            TrackedBarcode trackedBarcode2 = (TrackedBarcode) this.proxyCache.getOrPut(reflectionFactory.b(NativeTrackedBarcode.class), null, trackedBarcode, new n(trackedBarcode));
            this.f17546a.onRecognizedBarcodeNotInListTapped((BarcodeCountBasicOverlay) orPut, trackedBarcode2);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayListener
    public void onTrackedBarcodeTapped(@NotNull NativeBarcodeCountBasicOverlay overlay, @NotNull NativeTrackedBarcode trackedBarcode) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.c.get();
        if (barcodeCountBasicOverlay != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCountBasicOverlay.class), null, overlay, new o(barcodeCountBasicOverlay));
            Intrinsics.g(orPut, "{\n            val _0 = p…eTapped(_0, _1)\n        }");
            TrackedBarcode trackedBarcode2 = (TrackedBarcode) this.proxyCache.getOrPut(reflectionFactory.b(NativeTrackedBarcode.class), null, trackedBarcode, new p(trackedBarcode));
            this.f17546a.onRecognizedBarcodeTapped((BarcodeCountBasicOverlay) orPut, trackedBarcode2);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayListener
    public void onUnTrackedBarcodeTapped(@NotNull NativeBarcodeCountBasicOverlay overlay, @NotNull NativeTrackedBarcode trackedBarcode) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.c.get();
        if (barcodeCountBasicOverlay != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCountBasicOverlay.class), null, overlay, new q(barcodeCountBasicOverlay));
            Intrinsics.g(orPut, "{\n            val _0 = p…eTapped(_0, _1)\n        }");
            TrackedBarcode trackedBarcode2 = (TrackedBarcode) this.proxyCache.getOrPut(reflectionFactory.b(NativeTrackedBarcode.class), null, trackedBarcode, new r(trackedBarcode));
            this.f17546a.onUnrecognizedBarcodeTapped((BarcodeCountBasicOverlay) orPut, trackedBarcode2);
        }
    }

    public BarcodeCountBasicOverlayListenerReversedAdapter(@NotNull BarcodeCountBasicOverlayListener _BarcodeCountBasicOverlayListener, @NotNull BarcodeCountBasicOverlay _BarcodeCountBasicOverlay, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_BarcodeCountBasicOverlayListener, "_BarcodeCountBasicOverlayListener");
        Intrinsics.h(_BarcodeCountBasicOverlay, "_BarcodeCountBasicOverlay");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17546a = _BarcodeCountBasicOverlayListener;
        this.proxyCache = proxyCache;
        this.c = new WeakReference(_BarcodeCountBasicOverlay);
    }
}
