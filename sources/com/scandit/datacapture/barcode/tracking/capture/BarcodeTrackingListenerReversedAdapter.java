package com.scandit.datacapture.barcode.tracking.capture;

import com.scandit.datacapture.barcode.tracking.internal.module.capture.NativeBarcodeTracking;
import com.scandit.datacapture.barcode.tracking.internal.module.capture.NativeBarcodeTrackingListener;
import com.scandit.datacapture.barcode.tracking.internal.module.capture.NativeBarcodeTrackingSession;
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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016R\u001a\u0010\u0011\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingListenerReversedAdapter;", "Lcom/scandit/datacapture/barcode/tracking/internal/module/capture/NativeBarcodeTrackingListener;", "Lcom/scandit/datacapture/barcode/tracking/internal/module/capture/NativeBarcodeTracking;", "mode", "", "onObservationStarted", "onObservationStopped", "Lcom/scandit/datacapture/barcode/tracking/internal/module/capture/NativeBarcodeTrackingSession;", "session", "Lcom/scandit/datacapture/core/internal/sdk/data/NativeFrameData;", "data", "onSessionUpdated", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingListener;", "_BarcodeTrackingListener", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTracking;", "_BarcodeTracking", "<init>", "(Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingListener;Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTracking;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeTrackingListenerReversedAdapter extends NativeBarcodeTrackingListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeTrackingListener f18152a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final WeakReference c;

    public /* synthetic */ BarcodeTrackingListenerReversedAdapter(BarcodeTrackingListener barcodeTrackingListener, BarcodeTracking barcodeTracking, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeTrackingListener, barcodeTracking, (i & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.tracking.internal.module.capture.NativeBarcodeTrackingListener
    public void onObservationStarted(@NotNull NativeBarcodeTracking mode) {
        Intrinsics.h(mode, "mode");
        BarcodeTracking barcodeTracking = (BarcodeTracking) this.c.get();
        if (barcodeTracking != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeBarcodeTracking.class), null, mode, new B(barcodeTracking));
            Intrinsics.g(orPut, "{\n            val _0 = p…tionStarted(_0)\n        }");
            this.f18152a.onObservationStarted((BarcodeTracking) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.tracking.internal.module.capture.NativeBarcodeTrackingListener
    public void onObservationStopped(@NotNull NativeBarcodeTracking mode) {
        Intrinsics.h(mode, "mode");
        BarcodeTracking barcodeTracking = (BarcodeTracking) this.c.get();
        if (barcodeTracking != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeBarcodeTracking.class), null, mode, new C(barcodeTracking));
            Intrinsics.g(orPut, "{\n            val _0 = p…tionStopped(_0)\n        }");
            this.f18152a.onObservationStopped((BarcodeTracking) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.tracking.internal.module.capture.NativeBarcodeTrackingListener
    public void onSessionUpdated(@NotNull NativeBarcodeTracking mode, @NotNull NativeBarcodeTrackingSession session, @NotNull NativeFrameData data) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(session, "session");
        Intrinsics.h(data, "data");
        BarcodeTracking barcodeTracking = (BarcodeTracking) this.c.get();
        if (barcodeTracking != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeTracking.class), null, mode, new D(barcodeTracking));
            Intrinsics.g(orPut, "{\n            val _0 = p…ted(_0, _1, _2)\n        }");
            BarcodeTrackingSession barcodeTrackingSession = (BarcodeTrackingSession) this.proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeTrackingSession.class), null, session, new E(barcodeTracking));
            FrameData frameData = (FrameData) this.proxyCache.getOrPut(reflectionFactory.b(NativeFrameData.class), null, data, new F(data));
            this.f18152a.onSessionUpdated((BarcodeTracking) orPut, barcodeTrackingSession, frameData);
        }
    }

    public BarcodeTrackingListenerReversedAdapter(@NotNull BarcodeTrackingListener _BarcodeTrackingListener, @NotNull BarcodeTracking _BarcodeTracking, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_BarcodeTrackingListener, "_BarcodeTrackingListener");
        Intrinsics.h(_BarcodeTracking, "_BarcodeTracking");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18152a = _BarcodeTrackingListener;
        this.proxyCache = proxyCache;
        this.c = new WeakReference(_BarcodeTracking);
    }
}
