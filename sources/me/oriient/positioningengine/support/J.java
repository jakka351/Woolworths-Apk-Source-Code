package me.oriient.positioningengine.support;

import java.util.concurrent.TimeUnit;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample;
import me.oriient.internal.services.uploadingManager.models.UploadableSample;

/* loaded from: classes8.dex */
public final class J implements UploadableSample {

    /* renamed from: a, reason: collision with root package name */
    public final long f26504a;
    public final byte[] b;
    public final long c;

    public J(SensorsDataSample sensorsDataSample) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.f26504a = timeUnit.toMillis(sensorsDataSample.getEndTimeNanos());
        this.b = sensorsDataSample.getRsmpData();
        this.c = timeUnit.toMillis(sensorsDataSample.getStartTimeNanos());
    }

    @Override // me.oriient.internal.services.uploadingManager.models.UploadableSample
    public final long getEndTimeMillis() {
        return this.f26504a;
    }

    @Override // me.oriient.internal.services.uploadingManager.models.UploadableSample
    public final byte[] getPayload() {
        return this.b;
    }

    @Override // me.oriient.internal.services.uploadingManager.models.UploadableSample
    public final long getStartTimeMillis() {
        return this.c;
    }
}
