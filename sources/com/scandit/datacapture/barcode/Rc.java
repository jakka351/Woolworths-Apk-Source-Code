package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewPresenter;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewHandlerDelegate;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewState;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Rc extends NativeSparkScanViewHandlerDelegate {

    /* renamed from: a, reason: collision with root package name */
    private final Qc f17291a;

    public /* synthetic */ Rc(Qc qc) {
        this(qc, ProxyCacheKt.getGlobalProxyCache());
    }

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewHandlerDelegate
    public final void onStateTransition(NativeSparkScanViewState state) {
        Intrinsics.h(state, "state");
        ((SparkScanViewPresenter) this.f17291a).c(state);
    }

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewHandlerDelegate
    public final void resetAllTimers() {
        ((SparkScanViewPresenter) this.f17291a).R();
    }

    public Rc(Qc _SparkScanViewHandlerDelegate, ProxyCache proxyCache) {
        Intrinsics.h(_SparkScanViewHandlerDelegate, "_SparkScanViewHandlerDelegate");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17291a = _SparkScanViewHandlerDelegate;
    }
}
