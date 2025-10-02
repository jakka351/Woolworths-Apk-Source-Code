package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.spark.internal.SparkScanInternal;
import com.scandit.datacapture.barcode.spark.capture.SparkScanSession;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanListener;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSession;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;

/* loaded from: classes6.dex */
public final class Da extends NativeSparkScanListener {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0874ua f17137a;
    private final ProxyCache b;
    private final WeakReference c;

    public /* synthetic */ Da(InterfaceC0874ua interfaceC0874ua, SparkScanInternal sparkScanInternal) {
        this(interfaceC0874ua, sparkScanInternal, ProxyCacheKt.getGlobalProxyCache());
    }

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanListener
    public final void onObservationStarted(NativeSparkScan sparkScan) {
        Intrinsics.h(sparkScan, "sparkScan");
        SparkScanInternal sparkScanInternal = (SparkScanInternal) this.c.get();
        if (sparkScanInternal != null) {
            Object orPut = this.b.getOrPut(Reflection.f24268a.b(NativeSparkScan.class), null, sparkScan, new C0889va(sparkScanInternal));
            Intrinsics.g(orPut, "{\n            val _0 = p…tionStarted(_0)\n        }");
            this.f17137a.onObservationStarted((SparkScanInternal) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanListener
    public final void onObservationStopped(NativeSparkScan sparkScan) {
        Intrinsics.h(sparkScan, "sparkScan");
        SparkScanInternal sparkScanInternal = (SparkScanInternal) this.c.get();
        if (sparkScanInternal != null) {
            Object orPut = this.b.getOrPut(Reflection.f24268a.b(NativeSparkScan.class), null, sparkScan, new C0904wa(sparkScanInternal));
            Intrinsics.g(orPut, "{\n            val _0 = p…tionStopped(_0)\n        }");
            this.f17137a.onObservationStopped((SparkScanInternal) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanListener
    public final void onScan(NativeSparkScan sparkScan, NativeSparkScanSession session, NativeFrameData data) {
        Intrinsics.h(sparkScan, "sparkScan");
        Intrinsics.h(session, "session");
        Intrinsics.h(data, "data");
        SparkScanInternal sparkScanInternal = (SparkScanInternal) this.c.get();
        if (sparkScanInternal != null) {
            ProxyCache proxyCache = this.b;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeSparkScan.class), null, sparkScan, new C0919xa(sparkScanInternal));
            Intrinsics.g(orPut, "{\n            val _0 = p…ned(_0, _1, _2)\n        }");
            SparkScanSession sparkScanSession = (SparkScanSession) this.b.getOrPut(reflectionFactory.b(NativeSparkScanSession.class), null, session, new C0934ya(sparkScanInternal));
            FrameData frameData = (FrameData) this.b.getOrPut(reflectionFactory.b(NativeFrameData.class), null, data, new C0949za(data));
            this.f17137a.onBarcodeScanned((SparkScanInternal) orPut, sparkScanSession, frameData);
        }
    }

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanListener
    public final void onSessionUpdated(NativeSparkScan sparkScan, NativeSparkScanSession session, NativeFrameData data) {
        Intrinsics.h(sparkScan, "sparkScan");
        Intrinsics.h(session, "session");
        Intrinsics.h(data, "data");
        SparkScanInternal sparkScanInternal = (SparkScanInternal) this.c.get();
        if (sparkScanInternal != null) {
            ProxyCache proxyCache = this.b;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeSparkScan.class), null, sparkScan, new Aa(sparkScanInternal));
            Intrinsics.g(orPut, "{\n            val _0 = p…ted(_0, _1, _2)\n        }");
            SparkScanSession sparkScanSession = (SparkScanSession) this.b.getOrPut(reflectionFactory.b(NativeSparkScanSession.class), null, session, new Ba(sparkScanInternal));
            FrameData frameData = (FrameData) this.b.getOrPut(reflectionFactory.b(NativeFrameData.class), null, data, new Ca(data));
            this.f17137a.onSessionUpdated((SparkScanInternal) orPut, sparkScanSession, frameData);
        }
    }

    public Da(InterfaceC0874ua _SparkScanInternalListener, SparkScanInternal _SparkScanInternal, ProxyCache proxyCache) {
        Intrinsics.h(_SparkScanInternalListener, "_SparkScanInternalListener");
        Intrinsics.h(_SparkScanInternal, "_SparkScanInternal");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17137a = _SparkScanInternalListener;
        this.b = proxyCache;
        this.c = new WeakReference(_SparkScanInternal);
    }
}
