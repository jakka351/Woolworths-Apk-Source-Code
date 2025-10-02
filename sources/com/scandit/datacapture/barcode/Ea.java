package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ea {

    /* renamed from: a, reason: collision with root package name */
    private final NativeSparkScan f17150a;
    private final NativeDataCaptureMode b;

    public Ea(NativeSparkScan _NativeSparkScan, ProxyCache proxyCache) {
        Intrinsics.h(_NativeSparkScan, "_NativeSparkScan");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17150a = _NativeSparkScan;
        NativeDataCaptureMode nativeDataCaptureModeAsDataCaptureMode = _NativeSparkScan.asDataCaptureMode();
        Intrinsics.g(nativeDataCaptureModeAsDataCaptureMode, "_NativeSparkScan.asDataCaptureMode()");
        this.b = nativeDataCaptureModeAsDataCaptureMode;
    }

    public final void a(boolean z) {
        this.f17150a.setEnabled(z);
    }

    public final NativeSparkScan b() {
        return this.f17150a;
    }

    public final boolean c() {
        return this.f17150a.isEnabled();
    }

    public final NativeDataCaptureMode a() {
        return this.b;
    }

    public final void b(boolean z) {
        this.f17150a.enableSingleScanMode(z);
    }

    public /* synthetic */ Ea(NativeSparkScan nativeSparkScan) {
        this(nativeSparkScan, ProxyCacheKt.getGlobalProxyCache());
    }
}
