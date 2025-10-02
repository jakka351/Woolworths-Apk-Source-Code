package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningMode;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningModeHandlerListener;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ga extends NativeSparkScanScanningModeHandlerListener {

    /* renamed from: a, reason: collision with root package name */
    private final Fa f17172a;
    private final WeakReference b;

    public /* synthetic */ Ga(Fa fa, SparkScanStateManager sparkScanStateManager) {
        this(fa, sparkScanStateManager, ProxyCacheKt.getGlobalProxyCache());
    }

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningModeHandlerListener
    public final void onScanningModeChanged(NativeSparkScanScanningMode previousScanningMode, NativeSparkScanScanningMode newScanningMode) {
        Intrinsics.h(previousScanningMode, "previousScanningMode");
        Intrinsics.h(newScanningMode, "newScanningMode");
        if (((SparkScanStateManager) this.b.get()) != null) {
            BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
            this.f17172a.a(barcodeNativeTypeFactory.convert(previousScanningMode), barcodeNativeTypeFactory.convert(newScanningMode));
        }
    }

    public Ga(Fa _SparkScanInternalScanningModeListener, SparkScanStateManager _SparkScanStateManager, ProxyCache proxyCache) {
        Intrinsics.h(_SparkScanInternalScanningModeListener, "_SparkScanInternalScanningModeListener");
        Intrinsics.h(_SparkScanStateManager, "_SparkScanStateManager");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17172a = _SparkScanInternalScanningModeListener;
        this.b = new WeakReference(_SparkScanStateManager);
    }
}
