package me.oriient.internal.services.sensorsManager.support;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.dataModel.sensors.SensorManagerConfig;
import me.oriient.internal.services.sensorsManager.SensorFreezeMonitor;
import me.oriient.internal.services.sensorsManager.SensorManagerError;
import me.oriient.internal.services.sensorsManager.sensors.SystemSensor;
import me.oriient.internal.services.sensorsManager.support.SupportSensorsManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 82\u00020\u0001:\u00059:;<5B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\fJ\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\"\u0010$\u001a\u00020#8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010+\u001a\u0004\u0018\u00010*8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u00101\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010%R\u0016\u00102\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006="}, d2 = {"Lme/oriient/internal/services/sensorsManager/support/SensorIssuesMonitorImpl;", "Lme/oriient/internal/services/sensorsManager/support/SensorIssuesMonitor;", "Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Lme/oriient/internal/services/sensorsManager/support/SensorIssuesELogSender;", "eLogSender", "Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitor;", "freezeMonitor", "<init>", "(Lme/oriient/internal/infra/utils/core/Logger;Lme/oriient/internal/services/sensorsManager/support/SensorIssuesELogSender;Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitor;)V", "", "reset", "()V", "Lme/oriient/internal/services/sensorsManager/support/SupportSensorsManager$SensorIssuesReport;", "getIssuesSnapshot", "()Lme/oriient/internal/services/sensorsManager/support/SupportSensorsManager$SensorIssuesReport;", "Lme/oriient/internal/services/dataModel/sensors/SensorManagerConfig;", "sensorManagerConfig", "onNewConfig", "(Lme/oriient/internal/services/dataModel/sensors/SensorManagerConfig;)V", "start", "stop", "", "sensorType", "onSensorClockCorrection", "(I)V", "", "Lme/oriient/internal/services/sensorsManager/SensorManagerError;", "errors", "Lme/oriient/internal/services/sensorsManager/support/b;", "processSampleErrors", "(Ljava/util/List;)Lme/oriient/internal/services/sensorsManager/support/b;", "Lme/oriient/internal/infra/utils/core/Logger;", "Lme/oriient/internal/services/sensorsManager/support/SensorIssuesELogSender;", "Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitor;", "", "areSensorsFrozen", "Z", "getAreSensorsFrozen", "()Z", "setAreSensorsFrozen", "(Z)V", "Lme/oriient/internal/services/sensorsManager/support/c;", "delegate", "Lme/oriient/internal/services/sensorsManager/support/c;", "getDelegate", "()Lme/oriient/internal/services/sensorsManager/support/c;", "setDelegate", "(Lme/oriient/internal/services/sensorsManager/support/c;)V", "stopSessionIfSensorDataOutdated", "sensorsRestartCount", "I", "", "Lme/oriient/internal/services/sensorsManager/support/h;", "sensorIssuesTrackers", "Ljava/util/Map;", "Companion", "me/oriient/internal/services/sensorsManager/support/d", "me/oriient/internal/services/sensorsManager/support/e", "me/oriient/internal/services/sensorsManager/support/f", "me/oriient/internal/services/sensorsManager/support/g", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SensorIssuesMonitorImpl implements SensorIssuesMonitor {

    @NotNull
    private static final d Companion = new d();

    @NotNull
    private static final String TAG = "SensorManagerDelegate";
    private boolean areSensorsFrozen;

    @Nullable
    private c delegate;

    @NotNull
    private final SensorIssuesELogSender eLogSender;

    @NotNull
    private final SensorFreezeMonitor freezeMonitor;

    @NotNull
    private final Logger logger;

    @NotNull
    private final Map<Integer, h> sensorIssuesTrackers;
    private int sensorsRestartCount;
    private boolean stopSessionIfSensorDataOutdated;

    public SensorIssuesMonitorImpl(@NotNull Logger logger, @NotNull SensorIssuesELogSender eLogSender, @NotNull SensorFreezeMonitor freezeMonitor) {
        Intrinsics.h(logger, "logger");
        Intrinsics.h(eLogSender, "eLogSender");
        Intrinsics.h(freezeMonitor, "freezeMonitor");
        this.logger = logger;
        this.eLogSender = eLogSender;
        this.freezeMonitor = freezeMonitor;
        SystemSensor[] systemSensorArrValues = SystemSensor.values();
        int iH = MapsKt.h(systemSensorArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
        for (SystemSensor systemSensor : systemSensorArrValues) {
            linkedHashMap.put(Integer.valueOf(systemSensor.getOsSensorType()), new h(systemSensor));
        }
        this.sensorIssuesTrackers = linkedHashMap;
        this.freezeMonitor.setDelegate(new e(this));
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SensorIssuesMonitor
    public boolean getAreSensorsFrozen() {
        return this.areSensorsFrozen;
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SensorIssuesMonitor
    @Nullable
    public c getDelegate() {
        return this.delegate;
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SensorIssuesMonitor
    @NotNull
    public SupportSensorsManager.SensorIssuesReport getIssuesSnapshot() {
        Collection<h> collectionValues = this.sensorIssuesTrackers.values();
        int iH = MapsKt.h(CollectionsKt.s(collectionValues, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        for (h hVar : collectionValues) {
            SystemSensor systemSensor = hVar.f25596a;
            linkedHashMap.put(systemSensor, new f(systemSensor, hVar.b, hVar.c, hVar.d, hVar.e, hVar.f));
        }
        return new g(linkedHashMap, this.sensorsRestartCount);
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SensorIssuesMonitor
    public void onNewConfig(@NotNull SensorManagerConfig sensorManagerConfig) {
        Intrinsics.h(sensorManagerConfig, "sensorManagerConfig");
        this.stopSessionIfSensorDataOutdated = sensorManagerConfig.getStopSessionIfSensorDataOutdated();
        long millis = TimeUnit.SECONDS.toMillis(1L);
        SensorFreezeMonitor sensorFreezeMonitor = this.freezeMonitor;
        sensorFreezeMonitor.setEnabled(sensorManagerConfig.getMonitorFreezes());
        double d = millis;
        sensorFreezeMonitor.setMonitoringIntervalMillis((long) (sensorManagerConfig.getMonitoringIntervalSec() * d));
        sensorFreezeMonitor.setSensorsDataRelevanceLimitMillis((long) (sensorManagerConfig.getSensorsDataRelevanceLimitSec() * d));
        sensorFreezeMonitor.setSensorsDataRelevanceLimitPressureMillis((long) (sensorManagerConfig.getSensorsDataRelevanceLimitPressureSec() * d));
        sensorFreezeMonitor.setRecoveryWaitingDurationMillis((long) (sensorManagerConfig.getRecoveryWaitingDurationSec() * d));
        sensorFreezeMonitor.setRestartWaitingDurationMillis((long) (sensorManagerConfig.getRestartWaitingDurationSec() * d));
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SensorIssuesMonitor
    public void onSensorClockCorrection(int sensorType) {
        h hVar = this.sensorIssuesTrackers.get(Integer.valueOf(sensorType));
        if (hVar != null) {
            hVar.f++;
        }
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SensorIssuesMonitor
    @NotNull
    public b processSampleErrors(@NotNull List<? extends SensorManagerError> errors) {
        Intrinsics.h(errors, "errors");
        SensorManagerError sensorManagerError = null;
        if (errors.isEmpty()) {
            return new b(null, true);
        }
        boolean z = true;
        for (SensorManagerError sensorManagerError2 : errors) {
            if (sensorManagerError2 instanceof SensorManagerError.EmptySensorFrame) {
                SensorManagerError.EmptySensorFrame emptySensorFrame = (SensorManagerError.EmptySensorFrame) sensorManagerError2;
                ArrayList arrayListC0 = CollectionsKt.c0(emptySensorFrame.getNonCriticalSensorTypes(), emptySensorFrame.getCriticalSensorTypes());
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListC0.iterator();
                while (it.hasNext()) {
                    h hVar = this.sensorIssuesTrackers.get(Integer.valueOf(((Number) it.next()).intValue()));
                    if (hVar != null) {
                        arrayList.add(hVar);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((h) it2.next()).c++;
                }
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (!((h) it3.next()).h) {
                            if (!emptySensorFrame.getCriticalSensorTypes().isEmpty()) {
                                sensorManagerError = sensorManagerError2;
                            }
                            this.eLogSender.sendEmptySensorFrame(arrayListC0);
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                ((h) it4.next()).h = true;
                            }
                        }
                    }
                }
            } else if (sensorManagerError2 instanceof SensorManagerError.NaNSensorFrame) {
                SensorManagerError.NaNSensorFrame naNSensorFrame = (SensorManagerError.NaNSensorFrame) sensorManagerError2;
                ArrayList arrayListC02 = CollectionsKt.c0(naNSensorFrame.getNonCriticalSensorTypes(), naNSensorFrame.getCriticalSensorTypes());
                ArrayList arrayList2 = new ArrayList();
                Iterator it5 = arrayListC02.iterator();
                while (it5.hasNext()) {
                    h hVar2 = this.sensorIssuesTrackers.get(Integer.valueOf(((Number) it5.next()).intValue()));
                    if (hVar2 != null) {
                        arrayList2.add(hVar2);
                    }
                }
                Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    ((h) it6.next()).d++;
                }
                if (!arrayList2.isEmpty()) {
                    Iterator it7 = arrayList2.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            break;
                        }
                        if (!((h) it7.next()).i) {
                            if (!naNSensorFrame.getCriticalSensorTypes().isEmpty()) {
                                sensorManagerError = sensorManagerError2;
                            }
                            this.eLogSender.sendNaNSensorFrame(arrayListC02);
                            Iterator it8 = arrayList2.iterator();
                            while (it8.hasNext()) {
                                ((h) it8.next()).i = true;
                            }
                        }
                    }
                }
                z = false;
            } else if (sensorManagerError2 instanceof SensorManagerError.SensorsStuck) {
                SensorManagerError.SensorsStuck sensorsStuck = (SensorManagerError.SensorsStuck) sensorManagerError2;
                ArrayList arrayListC03 = CollectionsKt.c0(sensorsStuck.getNonCriticalSensorTypes(), sensorsStuck.getCriticalSensorTypes());
                ArrayList arrayList3 = new ArrayList();
                Iterator it9 = arrayListC03.iterator();
                while (it9.hasNext()) {
                    h hVar3 = this.sensorIssuesTrackers.get(Integer.valueOf(((Number) it9.next()).intValue()));
                    if (hVar3 != null) {
                        arrayList3.add(hVar3);
                    }
                }
                Iterator it10 = arrayList3.iterator();
                while (it10.hasNext()) {
                    ((h) it10.next()).e++;
                }
                if (!arrayList3.isEmpty()) {
                    Iterator it11 = arrayList3.iterator();
                    while (true) {
                        if (!it11.hasNext()) {
                            break;
                        }
                        if (!((h) it11.next()).g) {
                            if (!sensorsStuck.getCriticalSensorTypes().isEmpty()) {
                                sensorManagerError = sensorManagerError2;
                            }
                            this.eLogSender.sendStuckSensorFrame(arrayListC03);
                            Iterator it12 = arrayList3.iterator();
                            while (it12.hasNext()) {
                                ((h) it12.next()).g = true;
                            }
                        }
                    }
                }
            } else {
                this.logger.e(TAG, "onError: unknown error during runtime");
            }
        }
        return new b(sensorManagerError, z);
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SensorIssuesMonitor
    public void reset() {
        setAreSensorsFrozen(false);
        this.sensorsRestartCount = 0;
        this.eLogSender.reset();
        for (h hVar : this.sensorIssuesTrackers.values()) {
            hVar.b = 0;
            hVar.c = 0;
            hVar.d = 0;
            hVar.e = 0;
            hVar.f = 0;
            hVar.h = false;
            hVar.g = false;
            hVar.i = false;
        }
    }

    public void setAreSensorsFrozen(boolean z) {
        this.areSensorsFrozen = z;
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SensorIssuesMonitor
    public void setDelegate(@Nullable c cVar) {
        this.delegate = cVar;
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SensorIssuesMonitor
    public void start() {
        this.freezeMonitor.start();
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SensorIssuesMonitor
    public void stop() {
        this.freezeMonitor.stop();
    }
}
