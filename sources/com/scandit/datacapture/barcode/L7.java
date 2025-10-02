package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountListener;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession;
import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener;
import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountSession;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;

/* loaded from: classes6.dex */
public final class L7 extends NativeBarcodeCountListener {

    /* renamed from: a, reason: collision with root package name */
    private final InternalBarcodeCountListener f17227a;
    private final ProxyCache b;
    private final WeakReference c;

    public /* synthetic */ L7(InternalBarcodeCountListener internalBarcodeCountListener, BarcodeCount barcodeCount) {
        this(internalBarcodeCountListener, barcodeCount, ProxyCacheKt.getGlobalProxyCache());
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountListener
    public final void onObservationStarted(NativeBarcodeCount mode) {
        Intrinsics.h(mode, "mode");
        BarcodeCount barcodeCount = (BarcodeCount) this.c.get();
        if (barcodeCount != null) {
            Object orPut = this.b.getOrPut(Reflection.f24268a.b(NativeBarcodeCount.class), null, mode, new B7(barcodeCount));
            Intrinsics.g(orPut, "{\n            val _0 = p…tionStarted(_0)\n        }");
            this.f17227a.onObservationStarted((BarcodeCount) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountListener
    public final void onObservationStopped(NativeBarcodeCount mode) {
        Intrinsics.h(mode, "mode");
        BarcodeCount barcodeCount = (BarcodeCount) this.c.get();
        if (barcodeCount != null) {
            Object orPut = this.b.getOrPut(Reflection.f24268a.b(NativeBarcodeCount.class), null, mode, new C7(barcodeCount));
            Intrinsics.g(orPut, "{\n            val _0 = p…tionStopped(_0)\n        }");
            this.f17227a.onObservationStopped((BarcodeCount) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountListener
    public final void onScan(NativeBarcodeCount mode, NativeBarcodeCountSession session, NativeFrameData data) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(session, "session");
        Intrinsics.h(data, "data");
        BarcodeCount barcodeCount = (BarcodeCount) this.c.get();
        if (barcodeCount != null) {
            ProxyCache proxyCache = this.b;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCount.class), null, mode, new D7(barcodeCount));
            Intrinsics.g(orPut, "{\n            val _0 = p…can(_0, _1, _2)\n        }");
            InternalBarcodeCountSession internalBarcodeCountSession = (InternalBarcodeCountSession) this.b.getOrPut(reflectionFactory.b(NativeBarcodeCountSession.class), null, session, new E7(barcodeCount));
            FrameData frameData = (FrameData) this.b.getOrPut(reflectionFactory.b(NativeFrameData.class), null, data, new F7(data));
            this.f17227a.b((BarcodeCount) orPut, internalBarcodeCountSession, frameData);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountListener
    public final void onSessionUpdated(NativeBarcodeCount mode, NativeBarcodeCountSession session, NativeFrameData data) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(session, "session");
        Intrinsics.h(data, "data");
        BarcodeCount barcodeCount = (BarcodeCount) this.c.get();
        if (barcodeCount != null) {
            ProxyCache proxyCache = this.b;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCount.class), null, mode, new G7(barcodeCount));
            Intrinsics.g(orPut, "{\n            val _0 = p…ted(_0, _1, _2)\n        }");
            InternalBarcodeCountSession internalBarcodeCountSession = (InternalBarcodeCountSession) this.b.getOrPut(reflectionFactory.b(NativeBarcodeCountSession.class), null, session, new H7(barcodeCount));
            FrameData frameData = (FrameData) this.b.getOrPut(reflectionFactory.b(NativeFrameData.class), null, data, new I7(data));
            this.f17227a.a((BarcodeCount) orPut, internalBarcodeCountSession, frameData);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountListener
    public final void onTrackedBarcodeUncounted(NativeBarcodeCountSession session, NativeTrackedBarcode trackedBarcode) {
        Intrinsics.h(session, "session");
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        BarcodeCount barcodeCount = (BarcodeCount) this.c.get();
        if (barcodeCount != null) {
            ProxyCache proxyCache = this.b;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            this.f17227a.a((InternalBarcodeCountSession) proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCountSession.class), null, session, new J7(barcodeCount)), (TrackedBarcode) this.b.getOrPut(reflectionFactory.b(NativeTrackedBarcode.class), null, trackedBarcode, new K7(trackedBarcode)));
        }
    }

    public L7(InternalBarcodeCountListener _InternalBarcodeCountListener, BarcodeCount _BarcodeCount, ProxyCache proxyCache) {
        Intrinsics.h(_InternalBarcodeCountListener, "_InternalBarcodeCountListener");
        Intrinsics.h(_BarcodeCount, "_BarcodeCount");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17227a = _InternalBarcodeCountListener;
        this.b = proxyCache;
        this.c = new WeakReference(_BarcodeCount);
    }
}
