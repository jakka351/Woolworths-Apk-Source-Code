package me.oriient.ipssdk.ips;

import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.ipssdk.api.listeners.IPSCalibrationFinishedListener;
import me.oriient.ipssdk.api.listeners.IPSPositioningListener;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.api.models.IPSFloor;
import me.oriient.ipssdk.api.models.IPSPosition;
import me.oriient.ipssdk.realtime.ips.Positioning;

/* loaded from: classes4.dex */
public final class r implements IPSPositioningListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IPSCalibrationDialogViewModel f25805a;

    public r(IPSCalibrationDialogViewModel iPSCalibrationDialogViewModel) {
        this.f25805a = iPSCalibrationDialogViewModel;
    }

    @Override // me.oriient.ipssdk.api.listeners.IPSPositioningListener
    public final void onCalibrationGestureNeeded(boolean z) {
    }

    @Override // me.oriient.ipssdk.api.listeners.IPSPositioningListener
    public final void onCalibrationProgress(double d) {
        Logger logger = (Logger) this.f25805a.logger.getValue();
        String str = IPSCalibrationDialogViewModel.TAG;
        logger.d(str, "onCalibrationProgress() called with: percent = [" + d + "]");
        IPSCalibrationDialogViewModel iPSCalibrationDialogViewModel = this.f25805a;
        if (iPSCalibrationDialogViewModel.didFinishCalibration) {
            ((Logger) iPSCalibrationDialogViewModel.logger.getValue()).d(str, "onCalibrationProgress: calibration finished");
            return;
        }
        Boolean bool = (Boolean) iPSCalibrationDialogViewModel.didReceiveUpdate.e();
        if (bool == null || !bool.booleanValue()) {
            this.f25805a.didReceiveUpdate.j(Boolean.TRUE);
        }
        IPSCalibrationDialogViewModel iPSCalibrationDialogViewModel2 = this.f25805a;
        IPSCalibrationFinishedListener iPSCalibrationFinishedListener = iPSCalibrationDialogViewModel2.calibrationFinishedListener;
        if (iPSCalibrationFinishedListener != null && d >= 100.0d && !iPSCalibrationDialogViewModel2.didFinishCalibration) {
            iPSCalibrationDialogViewModel2.didFinishCalibration = true;
            iPSCalibrationFinishedListener.onCalibrationFinished();
        }
        this.f25805a.calibrationProgress.j(Double.valueOf(d));
        this.f25805a.showCalibrationProgressMessage(d);
    }

    @Override // me.oriient.ipssdk.api.listeners.IPSFailable
    public final void onError(IPSError iPSError) {
        ((Logger) this.f25805a.logger.getValue()).d(IPSCalibrationDialogViewModel.TAG, "onCalibrationError() called with: error = [" + iPSError.getMessage() + "]");
        this.f25805a.dismissWithError(iPSError);
    }

    @Override // me.oriient.ipssdk.api.listeners.IPSPositioningListener
    public final void onFloorChanged(IPSFloor iPSFloor) {
    }

    @Override // me.oriient.ipssdk.api.listeners.IPSPositioningListener
    public final void onPositionUpdate(IPSPosition iPSPosition) {
    }

    @Override // me.oriient.ipssdk.api.listeners.IPSPositioningListener
    public final void onPositioningEngineStateChanged(int i) {
    }

    @Override // me.oriient.ipssdk.api.listeners.IPSPositioningListener
    public final void onCalibrationGestureNeeded(boolean z, Integer num) {
        ((Logger) this.f25805a.logger.getValue()).d(IPSCalibrationDialogViewModel.TAG, "onCalibrationGestureNeeded() called with: isNeeded = [" + z + "]");
        if (z) {
            return;
        }
        IPSPositioning.removePositioningListener(this.f25805a.positioningListener);
        Positioning.INSTANCE.removeCalibrationListener(this.f25805a.calibrationListener);
        IPSCore.removeConnectionStateListener(this.f25805a.connectionStateListener);
        this.f25805a.dismissWithDelay();
    }
}
