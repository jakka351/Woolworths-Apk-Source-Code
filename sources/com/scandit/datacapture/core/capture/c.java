package com.scandit.datacapture.core.capture;

import com.scandit.datacapture.core.imu.ImuDataCollector;
import com.scandit.datacapture.core.imu.ImuMeasurement;
import com.scandit.datacapture.core.imu.ImuRotationMeasurement;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class c implements ImuDataCollector.Listener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f18434a;

    public c(DataCaptureContext owner) {
        Intrinsics.h(owner, "owner");
        this.f18434a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.core.imu.ImuDataCollector.Listener
    public final void onMeasurement(ImuMeasurement measurement) {
        NativeDataCaptureContext f18429a;
        Intrinsics.h(measurement, "measurement");
        DataCaptureContext dataCaptureContext = (DataCaptureContext) this.f18434a.get();
        if (dataCaptureContext == null || (f18429a = dataCaptureContext.getF18429a()) == null) {
            return;
        }
        f18429a.addInertialMeasurementAsyncAndroid(measurement.toNativeMeasurement(), measurement.getType());
    }

    @Override // com.scandit.datacapture.core.imu.ImuDataCollector.Listener
    public final void onRotationMeasurement(ImuRotationMeasurement measurement) {
        NativeDataCaptureContext f18429a;
        Intrinsics.h(measurement, "measurement");
        DataCaptureContext dataCaptureContext = (DataCaptureContext) this.f18434a.get();
        if (dataCaptureContext == null || (f18429a = dataCaptureContext.getF18429a()) == null) {
            return;
        }
        f18429a.addRotationVectorAsyncAndroid(measurement.toNativeRotationMeasurement());
    }
}
