package me.oriient.internal.services.sensorsManager.support;

import kotlinx.coroutines.BuildersKt;
import me.oriient.internal.services.sensorsManager.SensorFreezeMonitor;
import me.oriient.internal.services.sensorsManager.SensorManagerError;
import me.oriient.internal.services.sensorsManager.support.SupportSensorsManager;
import me.oriient.internal.services.sensorsManager.support.SupportSensorsManagerImpl;

/* loaded from: classes7.dex */
public final class e implements SensorFreezeMonitor.Delegate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SensorIssuesMonitorImpl f25593a;

    public e(SensorIssuesMonitorImpl sensorIssuesMonitorImpl) {
        this.f25593a = sensorIssuesMonitorImpl;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorFreezeMonitor.Delegate
    public final void onFreezeDetected(int i, boolean z) {
        this.f25593a.eLogSender.sendFreezeDetected(i, z);
        h hVar = (h) this.f25593a.sensorIssuesTrackers.get(Integer.valueOf(i));
        if (hVar != null) {
            hVar.b++;
        }
        if (z && this.f25593a.stopSessionIfSensorDataOutdated) {
            this.f25593a.setAreSensorsFrozen(true);
        }
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorFreezeMonitor.Delegate
    public final void onRestartFailed() {
        c delegate;
        this.f25593a.eLogSender.sendRestartFailed();
        if (this.f25593a.stopSessionIfSensorDataOutdated && (delegate = this.f25593a.getDelegate()) != null) {
            new SensorManagerError.SensorsFailedToRestart();
            n nVar = (n) delegate;
            SupportSensorsManager.SupportSensorsManagerDelegate delegate2 = nVar.f25601a.getDelegate();
            if (delegate2 == null) {
                return;
            }
            BuildersKt.c(nVar.f25601a.coroutineScope, null, null, new m(delegate2, nVar.f25601a, null), 3);
        }
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorFreezeMonitor.Delegate
    public final void onRestartNeeded() {
        this.f25593a.eLogSender.sendRestartNeeded();
        if (this.f25593a.stopSessionIfSensorDataOutdated) {
            this.f25593a.sensorsRestartCount++;
            c delegate = this.f25593a.getDelegate();
            if (delegate != null) {
                n nVar = (n) delegate;
                SupportSensorsManager.SupportSensorsManagerDelegate delegate2 = nVar.f25601a.getDelegate();
                if (delegate2 == null) {
                    return;
                }
                boolean zCalcIsMultiFloorRequest = delegate2.calcIsMultiFloorRequest();
                SupportSensorsManagerImpl supportSensorsManagerImpl = nVar.f25601a;
                supportSensorsManagerImpl.restartSensors(zCalcIsMultiFloorRequest, true, new l(supportSensorsManagerImpl));
            }
        }
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorFreezeMonitor.Delegate
    public final void onSuccessfulRecovery(boolean z) {
        this.f25593a.eLogSender.sendRecoverySuccessful(z);
        if (z && this.f25593a.stopSessionIfSensorDataOutdated) {
            this.f25593a.setAreSensorsFrozen(false);
        }
        c delegate = this.f25593a.getDelegate();
        if (delegate != null) {
            n nVar = (n) delegate;
            nVar.f25601a.getLogger().d("SupportSensorsManager", "onSuccessfulRecovery() called with: isCritical = " + z);
            nVar.f25601a.getSensorsDataProvider().addMarker(SupportSensorsManagerImpl.a.RECOVERY.getCode());
        }
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorFreezeMonitor.Delegate
    public final void onSuccessfulRestart() {
        this.f25593a.eLogSender.sendRestartSuccessful();
        if (this.f25593a.stopSessionIfSensorDataOutdated) {
            this.f25593a.setAreSensorsFrozen(false);
            c delegate = this.f25593a.getDelegate();
            if (delegate != null) {
                n nVar = (n) delegate;
                nVar.f25601a.getLogger().d("SupportSensorsManager", "onSuccessfulRestart() called");
                nVar.f25601a.getSensorsDataProvider().addMarker(SupportSensorsManagerImpl.a.RESTART.getCode());
            }
        }
    }
}
