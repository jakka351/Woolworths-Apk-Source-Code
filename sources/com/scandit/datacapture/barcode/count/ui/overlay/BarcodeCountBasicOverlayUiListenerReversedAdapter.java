package com.scandit.datacapture.barcode.count.ui.overlay;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayUiListener;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\f\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayUiListenerReversedAdapter;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayUiListener;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlay;", "overlay", "", "onListButtonTapped", "onExitButtonTapped", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayUiListener;", "_BarcodeCountBasicOverlayUiListener", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "_BarcodeCountBasicOverlay", "<init>", "(Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayUiListener;Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCountBasicOverlayUiListenerReversedAdapter extends NativeBarcodeCountBasicOverlayUiListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeCountBasicOverlayUiListener f17547a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final WeakReference c;

    public /* synthetic */ BarcodeCountBasicOverlayUiListenerReversedAdapter(BarcodeCountBasicOverlayUiListener barcodeCountBasicOverlayUiListener, BarcodeCountBasicOverlay barcodeCountBasicOverlay, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeCountBasicOverlayUiListener, barcodeCountBasicOverlay, (i & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayUiListener
    public void onExitButtonTapped(@NotNull NativeBarcodeCountBasicOverlay overlay) {
        Intrinsics.h(overlay, "overlay");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.c.get();
        if (barcodeCountBasicOverlay != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeBarcodeCountBasicOverlay.class), null, overlay, new t(barcodeCountBasicOverlay));
            Intrinsics.g(orPut, "{\n            val _0 = p…uttonTapped(_0)\n        }");
            this.f17547a.onExitButtonTapped((BarcodeCountBasicOverlay) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayUiListener
    public void onListButtonTapped(@NotNull NativeBarcodeCountBasicOverlay overlay) {
        Intrinsics.h(overlay, "overlay");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.c.get();
        if (barcodeCountBasicOverlay != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeBarcodeCountBasicOverlay.class), null, overlay, new u(barcodeCountBasicOverlay));
            Intrinsics.g(orPut, "{\n            val _0 = p…uttonTapped(_0)\n        }");
            this.f17547a.onListButtonTapped((BarcodeCountBasicOverlay) orPut);
        }
    }

    public BarcodeCountBasicOverlayUiListenerReversedAdapter(@NotNull BarcodeCountBasicOverlayUiListener _BarcodeCountBasicOverlayUiListener, @NotNull BarcodeCountBasicOverlay _BarcodeCountBasicOverlay, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_BarcodeCountBasicOverlayUiListener, "_BarcodeCountBasicOverlayUiListener");
        Intrinsics.h(_BarcodeCountBasicOverlay, "_BarcodeCountBasicOverlay");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17547a = _BarcodeCountBasicOverlayUiListener;
        this.proxyCache = proxyCache;
        this.c = new WeakReference(_BarcodeCountBasicOverlay);
    }
}
