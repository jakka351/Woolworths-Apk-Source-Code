package me.oriient.internal.services.sensorsManager;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import androidx.annotation.Keep;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.utils.android.ContextProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J0\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u000fH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lme/oriient/internal/services/sensorsManager/SystemSensorManagerImpl;", "Lme/oriient/internal/services/sensorsManager/SystemSensorManager;", "()V", "contextProvider", "Lme/oriient/internal/infra/utils/android/ContextProvider;", "getContextProvider", "()Lme/oriient/internal/infra/utils/android/ContextProvider;", "contextProvider$delegate", "Lkotlin/Lazy;", "isOk", "", "()Z", "sensorManager", "Landroid/hardware/SensorManager;", "getDefaultSensor", "Landroid/hardware/Sensor;", "type", "", "registerListener", "systemSensorListener", "Landroid/hardware/SensorEventListener;", "sensor", "samplingPeriodMicroSec", "maxReportLatencyMicroSec", "handler", "Landroid/os/Handler;", "unregisterListener", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SystemSensorManagerImpl implements SystemSensorManager {

    /* renamed from: contextProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy contextProvider = InternalDiKt.getDi().inject(Reflection.f24268a.b(ContextProvider.class));
    private final boolean isOk;

    @Nullable
    private final SensorManager sensorManager;

    public SystemSensorManagerImpl() {
        Object systemService = getContextProvider().getContext().getSystemService("sensor");
        SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
        this.sensorManager = sensorManager;
        this.isOk = sensorManager != null;
    }

    private final ContextProvider getContextProvider() {
        return (ContextProvider) this.contextProvider.getD();
    }

    @Override // me.oriient.internal.services.sensorsManager.SystemSensorManager
    @Nullable
    public Sensor getDefaultSensor(int type) {
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            return sensorManager.getDefaultSensor(type);
        }
        return null;
    }

    @Override // me.oriient.internal.services.sensorsManager.SystemSensorManager
    /* renamed from: isOk, reason: from getter */
    public boolean getIsOk() {
        return this.isOk;
    }

    @Override // me.oriient.internal.services.sensorsManager.SystemSensorManager
    public boolean registerListener(@NotNull SensorEventListener systemSensorListener, @NotNull Sensor sensor, int samplingPeriodMicroSec, int maxReportLatencyMicroSec, @NotNull Handler handler) {
        Intrinsics.h(systemSensorListener, "systemSensorListener");
        Intrinsics.h(sensor, "sensor");
        Intrinsics.h(handler, "handler");
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            return sensorManager.registerListener(systemSensorListener, sensor, samplingPeriodMicroSec, maxReportLatencyMicroSec, handler);
        }
        return false;
    }

    @Override // me.oriient.internal.services.sensorsManager.SystemSensorManager
    public void unregisterListener(@NotNull SensorEventListener systemSensorListener, @Nullable Sensor sensor) {
        Intrinsics.h(systemSensorListener, "systemSensorListener");
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(systemSensorListener, sensor);
        }
    }
}
