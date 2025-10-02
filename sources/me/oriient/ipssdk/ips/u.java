package me.oriient.ipssdk.ips;

import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.api.models.IPSError;

/* loaded from: classes4.dex */
public final class u implements IPSCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IPSCalibrationDialogViewModel f25808a;

    public u(IPSCalibrationDialogViewModel iPSCalibrationDialogViewModel) {
        this.f25808a = iPSCalibrationDialogViewModel;
    }

    @Override // me.oriient.ipssdk.api.listeners.IPSCompletionListener
    public final void onCompleted() {
        ((Logger) this.f25808a.logger.getValue()).d(IPSCalibrationDialogViewModel.TAG, "stopCalibration onCompleted() called");
    }

    @Override // me.oriient.ipssdk.api.listeners.IPSFailable
    public final void onError(IPSError iPSError) {
        ((Logger) this.f25808a.logger.getValue()).e(IPSCalibrationDialogViewModel.TAG, "stopCalibration onError() called with: error = [" + iPSError.getMessage() + "]");
    }
}
