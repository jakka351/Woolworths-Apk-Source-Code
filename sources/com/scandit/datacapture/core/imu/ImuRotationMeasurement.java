package com.scandit.datacapture.core.imu;

import com.scandit.datacapture.core.internal.sdk.capture.NativeImuDataRotationVectorAndroid;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/scandit/datacapture/core/imu/ImuRotationMeasurement;", "", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeImuDataRotationVectorAndroid;", "toNativeRotationMeasurement", "", "a", "[F", "getValue", "()[F", "value", "", "b", "J", "getTimestamp", "()J", "timestamp", "<init>", "([FJ)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class ImuRotationMeasurement {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float[] value;

    /* renamed from: b, reason: from kotlin metadata */
    private final long timestamp;

    public ImuRotationMeasurement(@NotNull float[] value, long j) {
        Intrinsics.h(value, "value");
        this.value = value;
        this.timestamp = j;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final float[] getValue() {
        return this.value;
    }

    @NotNull
    public final NativeImuDataRotationVectorAndroid toNativeRotationMeasurement() {
        float[] fArr = this.value;
        return new NativeImuDataRotationVectorAndroid(fArr[0], fArr[1], fArr[2], fArr[3], this.timestamp);
    }
}
