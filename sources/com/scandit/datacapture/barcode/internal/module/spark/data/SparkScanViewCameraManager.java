package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import com.scandit.datacapture.barcode.spark.ui.SparkScanView$sparkScanCameraStartListener$1;
import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.source.BatterySavingMode;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.TorchState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public interface SparkScanViewCameraManager {
    Camera a();

    void a(SparkScanScanningMode sparkScanScanningMode);

    void a(SparkScanView$sparkScanCameraStartListener$1 sparkScanView$sparkScanCameraStartListener$1);

    void a(Callback callback);

    void a(TorchState torchState, Function0 function0);

    void a(Function0 function0);

    void b();

    void b(Callback callback);

    void b(Function0 function0);

    void c(Function0 function0);

    boolean isTorchAvailable();

    void release();

    void setBatterySavingMode(BatterySavingMode batterySavingMode);
}
