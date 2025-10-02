package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureListener;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSession;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureListenerReversedAdapter;", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureListener;", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCapture;", "mode", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureSession;", "session", "Lcom/scandit/datacapture/core/internal/sdk/data/NativeFrameData;", "data", "", "onScan", "onSessionUpdated", "onObservationStarted", "onObservationStopped", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureListener;", "_BarcodeCaptureListener", "Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;", "_BarcodeCapture", "<init>", "(Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureListener;Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCaptureListenerReversedAdapter extends NativeBarcodeCaptureListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeCaptureListener f17412a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final WeakReference c;

    public /* synthetic */ BarcodeCaptureListenerReversedAdapter(BarcodeCaptureListener barcodeCaptureListener, BarcodeCapture barcodeCapture, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeCaptureListener, barcodeCapture, (i & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureListener
    public void onObservationStarted(@NotNull NativeBarcodeCapture mode) {
        Intrinsics.h(mode, "mode");
        BarcodeCapture barcodeCapture = (BarcodeCapture) this.c.get();
        if (barcodeCapture != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeBarcodeCapture.class), null, mode, new J(barcodeCapture));
            Intrinsics.g(orPut, "{\n            val _0 = p…tionStarted(_0)\n        }");
            this.f17412a.onObservationStarted((BarcodeCapture) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureListener
    public void onObservationStopped(@NotNull NativeBarcodeCapture mode) {
        Intrinsics.h(mode, "mode");
        BarcodeCapture barcodeCapture = (BarcodeCapture) this.c.get();
        if (barcodeCapture != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeBarcodeCapture.class), null, mode, new K(barcodeCapture));
            Intrinsics.g(orPut, "{\n            val _0 = p…tionStopped(_0)\n        }");
            this.f17412a.onObservationStopped((BarcodeCapture) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureListener
    public void onScan(@NotNull NativeBarcodeCapture mode, @NotNull NativeBarcodeCaptureSession session, @NotNull NativeFrameData data) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(session, "session");
        Intrinsics.h(data, "data");
        BarcodeCapture barcodeCapture = (BarcodeCapture) this.c.get();
        if (barcodeCapture != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCapture.class), null, mode, new L(barcodeCapture));
            Intrinsics.g(orPut, "{\n            val _0 = p…ned(_0, _1, _2)\n        }");
            BarcodeCaptureSession barcodeCaptureSession = (BarcodeCaptureSession) this.proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCaptureSession.class), null, session, new M(barcodeCapture));
            FrameData frameData = (FrameData) this.proxyCache.getOrPut(reflectionFactory.b(NativeFrameData.class), null, data, new N(data));
            this.f17412a.onBarcodeScanned((BarcodeCapture) orPut, barcodeCaptureSession, frameData);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureListener
    public void onSessionUpdated(@NotNull NativeBarcodeCapture mode, @NotNull NativeBarcodeCaptureSession session, @NotNull NativeFrameData data) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(session, "session");
        Intrinsics.h(data, "data");
        BarcodeCapture barcodeCapture = (BarcodeCapture) this.c.get();
        if (barcodeCapture != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCapture.class), null, mode, new O(barcodeCapture));
            Intrinsics.g(orPut, "{\n            val _0 = p…ted(_0, _1, _2)\n        }");
            BarcodeCaptureSession barcodeCaptureSession = (BarcodeCaptureSession) this.proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCaptureSession.class), null, session, new P(barcodeCapture));
            FrameData frameData = (FrameData) this.proxyCache.getOrPut(reflectionFactory.b(NativeFrameData.class), null, data, new Q(data));
            this.f17412a.onSessionUpdated((BarcodeCapture) orPut, barcodeCaptureSession, frameData);
        }
    }

    public BarcodeCaptureListenerReversedAdapter(@NotNull BarcodeCaptureListener _BarcodeCaptureListener, @NotNull BarcodeCapture _BarcodeCapture, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_BarcodeCaptureListener, "_BarcodeCaptureListener");
        Intrinsics.h(_BarcodeCapture, "_BarcodeCapture");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17412a = _BarcodeCaptureListener;
        this.proxyCache = proxyCache;
        this.c = new WeakReference(_BarcodeCapture);
    }
}
