package me.oriient.ipssdk.ips;

import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.realtime.ips.Positioning;

/* loaded from: classes4.dex */
public final class s implements ICalibrationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IPSCalibrationDialogViewModel f25806a;

    public s(IPSCalibrationDialogViewModel iPSCalibrationDialogViewModel) {
        this.f25806a = iPSCalibrationDialogViewModel;
    }

    @Override // me.oriient.ipssdk.ips.ICalibrationListener
    public final void onCalibrationError(IPSError iPSError) {
    }

    @Override // me.oriient.ipssdk.ips.ICalibrationListener
    public final void onCalibrationProgress(float f) {
    }

    @Override // me.oriient.ipssdk.ips.ICalibrationListener
    public final void onCalibrationStateChanged(int i) {
        ((Logger) this.f25806a.logger.getValue()).d(IPSCalibrationDialogViewModel.TAG, "onCalibrationStateChanged() called with: newState = [" + i + "]");
        if (i == 2 || i == 1 || Positioning.INSTANCE.getShouldBeCalibrating()) {
            return;
        }
        this.f25806a.dismissWithDelay();
    }
}
