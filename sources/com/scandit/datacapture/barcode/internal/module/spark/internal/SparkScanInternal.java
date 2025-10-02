package com.scandit.datacapture.barcode.internal.module.spark.internal;

import com.scandit.datacapture.barcode.Da;
import com.scandit.datacapture.barcode.Ea;
import com.scandit.datacapture.barcode.spark.capture.SparkScan$sparkScanListenerInternal$1;
import com.scandit.datacapture.barcode.spark.capture.SparkScanLicenseInfo;
import com.scandit.datacapture.barcode.spark.capture.SparkScanSession;
import com.scandit.datacapture.barcode.spark.capture.SparkScanSettings;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanLicenseInfo;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeExtensionsKt;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SparkScanInternal implements DataCaptureMode {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Ea f17775a;
    private DataCaptureContext b;
    private final CopyOnWriteArraySet c;
    private final SparkScanSession d;

    public /* synthetic */ SparkScanInternal(SparkScanSettings sparkScanSettings, int i) {
        this(sparkScanSettings);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    public final NativeDataCaptureMode _dataCaptureModeImpl() {
        return this.f17775a.a();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    public final void _setDataCaptureContext(DataCaptureContext dataCaptureContext) {
        this.b = dataCaptureContext;
    }

    public final NativeSparkScan a() {
        return this.f17775a.b();
    }

    public final SparkScanSession b() {
        return this.d;
    }

    public final SparkScanLicenseInfo c() {
        NativeSparkScanLicenseInfo sparkScanLicenseInfo = this.f17775a.b().getSparkScanLicenseInfo();
        if (sparkScanLicenseInfo != null) {
            return new SparkScanLicenseInfo(sparkScanLicenseInfo);
        }
        return null;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    /* renamed from: getDataCaptureContext */
    public final DataCaptureContext getC() {
        return this.b;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    public final boolean isEnabled() {
        return this.f17775a.c();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    public final void setEnabled(boolean z) {
        this.f17775a.a(z);
    }

    public SparkScanInternal(NativeSparkScan impl) {
        Intrinsics.h(impl, "impl");
        this.f17775a = new Ea(impl);
        this.c = new CopyOnWriteArraySet();
        this.d = new SparkScanSession(new b(impl));
        a().addListenerAsync(new Da(new a(this), this));
    }

    public final void a(boolean z) {
        this.f17775a.b(z);
    }

    public final void a(SparkScan$sparkScanListenerInternal$1 listener) {
        Intrinsics.h(listener, "listener");
        if (this.c.add(listener)) {
            listener.onObservationStarted(this);
        }
    }

    public static void a(SparkScanInternal sparkScanInternal, SparkScanSettings settings) {
        sparkScanInternal.getClass();
        Intrinsics.h(settings, "settings");
        NativeWrappedFuture nativeWrappedFutureApplySettingsWrapped = sparkScanInternal.f17775a.b().applySettingsWrapped(settings._impl());
        Intrinsics.g(nativeWrappedFutureApplySettingsWrapped, "_impl().applySettingsWrapped(settings._impl())");
        NativeExtensionsKt.andThen(nativeWrappedFutureApplySettingsWrapped, (Runnable) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private SparkScanInternal(SparkScanSettings sparkScanSettings) {
        NativeSparkScan nativeSparkScanCreate = NativeSparkScan.create(null, sparkScanSettings._impl());
        Intrinsics.g(nativeSparkScanCreate, "create(dataCaptureContex…impl(), settings._impl())");
        this(nativeSparkScanCreate);
    }
}
