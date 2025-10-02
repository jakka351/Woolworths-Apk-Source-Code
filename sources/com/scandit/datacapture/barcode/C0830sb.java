package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewPresenter;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanToastPresenterDelegate;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanToastType;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.TorchState;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.sb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0830sb extends NativeSparkScanToastPresenterDelegate {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0815rb f18005a;

    public /* synthetic */ C0830sb(InterfaceC0815rb interfaceC0815rb) {
        this(interfaceC0815rb, ProxyCacheKt.getGlobalProxyCache());
    }

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanToastPresenterDelegate
    public final CameraPosition getCameraPosition() {
        return ((SparkScanViewPresenter) this.f18005a).b();
    }

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanToastPresenterDelegate
    public final TorchState getTorchState() {
        return ((SparkScanViewPresenter) this.f18005a).d();
    }

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanToastPresenterDelegate
    public final boolean isCameraZoomedIn() {
        return ((SparkScanViewPresenter) this.f18005a).t();
    }

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanToastPresenterDelegate
    public final boolean isLongPressing() {
        return ((SparkScanViewPresenter) this.f18005a).u();
    }

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanToastPresenterDelegate
    public final boolean isPersistentPreview() {
        return ((SparkScanViewPresenter) this.f18005a).v();
    }

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanToastPresenterDelegate
    public final void showToast(NativeSparkScanToastType toast) {
        Intrinsics.h(toast, "toast");
        ((SparkScanViewPresenter) this.f18005a).a(toast);
    }

    public C0830sb(InterfaceC0815rb _SparkScanToastPresenterDelegate, ProxyCache proxyCache) {
        Intrinsics.h(_SparkScanToastPresenterDelegate, "_SparkScanToastPresenterDelegate");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18005a = _SparkScanToastPresenterDelegate;
    }
}
