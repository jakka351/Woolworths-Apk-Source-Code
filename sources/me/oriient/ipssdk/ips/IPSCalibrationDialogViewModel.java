package me.oriient.ipssdk.ips;

import androidx.annotation.ColorInt;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.MutableLiveData;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import me.oriient.internal.infra.utils.android.ContextProvider;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.ipssdk.api.listeners.IPSCalibrationDialogDismissListener;
import me.oriient.ipssdk.api.listeners.IPSCalibrationDialogShowListener;
import me.oriient.ipssdk.api.listeners.IPSCalibrationFinishedListener;
import me.oriient.ipssdk.api.listeners.IPSConnectionStateListener;
import me.oriient.ipssdk.api.listeners.IPSPositioningListener;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.base.di.java.JavaDi;
import me.oriient.ipssdk.base.di.java.Lazy;
import me.oriient.ipssdk.common.utils.SdkExecutors;
import me.oriient.ipssdk.common.utils.models.Error;
import me.oriient.ipssdk.realtime.R;
import me.oriient.ipssdk.realtime.ips.Positioning;

@Keep
/* loaded from: classes4.dex */
public class IPSCalibrationDialogViewModel {
    private static final long CALIB_DIALOG_DISMISS_DELAY_MS = 1000;
    private static final String TAG = "IPSCalibrationDialogViewModel";

    @ColorInt
    Integer accentColor;

    @Nullable
    IPSCalibrationFinishedListener calibrationFinishedListener;

    @NonNull
    public final MutableLiveData<String> calibrationInstructions;

    @NonNull
    String calibrationInstructionsText;

    @NonNull
    private final ICalibrationListener calibrationListener;

    @NonNull
    public final MutableLiveData<Double> calibrationProgress;

    @NonNull
    public final MutableLiveData<String> calibrationProgressMessage;

    @NonNull
    String calibrationProgressText;

    @NonNull
    public final MutableLiveData<String> calibrationSuccessMessage;

    @NonNull
    String calibrationSuccessText;

    @NonNull
    public final MutableLiveData<String> calibrationTitle;

    @NonNull
    Map<Integer, String> calibrationTitleTextByReason;

    @NonNull
    public final MutableLiveData<String> calibrationTopInfo;

    @NonNull
    String calibrationTopInfoText;

    @NonNull
    public final MutableLiveData<Boolean> calibrationTopInfoVisible;

    @NonNull
    private final IPSConnectionStateListener connectionStateListener;

    @NonNull
    private final Lazy<ContextProvider> context;
    private boolean didFinishCalibration;

    @NonNull
    public final MutableLiveData<Boolean> didReceiveUpdate;
    long dismissDelay;

    @Nullable
    IPSCalibrationDialogDismissListener dismissListener;

    @NonNull
    private final Lazy<Logger> logger;

    @NonNull
    private final IPSPositioningListener positioningListener;

    @NonNull
    public final MutableLiveData<Boolean> show;

    @Nullable
    IPSCalibrationDialogShowListener showListener;

    @NonNull
    String waitingToStartText;

    public IPSCalibrationDialogViewModel() {
        MutableLiveData<Double> mutableLiveData = new MutableLiveData<>();
        this.calibrationProgress = mutableLiveData;
        this.calibrationProgressMessage = new MutableLiveData<>();
        this.calibrationTitle = new MutableLiveData<>();
        this.calibrationTopInfo = new MutableLiveData<>();
        this.calibrationTopInfoVisible = new MutableLiveData<>(Boolean.FALSE);
        this.calibrationInstructions = new MutableLiveData<>();
        this.calibrationSuccessMessage = new MutableLiveData<>();
        this.show = new MutableLiveData<>();
        this.didReceiveUpdate = new MutableLiveData<>();
        this.calibrationTitleTextByReason = new HashMap();
        this.dismissDelay = 1000L;
        this.didFinishCalibration = false;
        Lazy<ContextProvider> lazyInject = JavaDi.inject(ContextProvider.class);
        this.context = lazyInject;
        this.logger = JavaDi.inject(Logger.class);
        mutableLiveData.j(Double.valueOf(0.0d));
        this.accentColor = Integer.valueOf(lazyInject.getValue().getContext().getColor(R.color.oriientOrange));
        this.calibrationProgressText = "Progress %d";
        this.calibrationTitleTextByReason.put(0, "Once in a while calibration is needed to ensure accuracy");
        this.calibrationTitleTextByReason.put(1, "The phone has been in contact with metallic objects or other devices");
        this.calibrationInstructionsText = "Please twist and rotate your phone";
        this.calibrationSuccessText = "DONE";
        this.waitingToStartText = "Starting";
        this.calibrationTopInfoText = "ⓘ Re-calibration is needed";
        this.positioningListener = new r(this);
        this.calibrationListener = new s(this);
        this.connectionStateListener = new IPSConnectionStateListener() { // from class: me.oriient.ipssdk.ips.x
            @Override // me.oriient.ipssdk.api.listeners.IPSConnectionStateListener
            public final void onConnectionStateChanged(int i) {
                this.f25810a.lambda$new$0(i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissSuccess() {
        Boolean bool = (Boolean) this.show.e();
        if (bool == null || !bool.booleanValue()) {
            this.logger.getValue().w(TAG, "dismissSuccess: not showing");
            return;
        }
        this.show.j(Boolean.FALSE);
        IPSCore.registerApplicationEvent(1);
        IPSCalibrationDialogDismissListener iPSCalibrationDialogDismissListener = this.dismissListener;
        if (iPSCalibrationDialogDismissListener != null) {
            iPSCalibrationDialogDismissListener.onDismissWithSuccess();
        }
        this.didFinishCalibration = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissWithDelay() {
        this.logger.getValue().d(TAG, "dismissWithDelay() called");
        SdkExecutors.schedule(new t(this), 1000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissWithError(@NonNull IPSError iPSError) {
        Boolean bool = (Boolean) this.show.e();
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        this.show.j(Boolean.FALSE);
        IPSCore.registerApplicationEvent(1);
        IPSCalibrationDialogDismissListener iPSCalibrationDialogDismissListener = this.dismissListener;
        if (iPSCalibrationDialogDismissListener != null) {
            iPSCalibrationDialogDismissListener.onDismissWithError(iPSError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(int i) {
        Boolean bool = (Boolean) this.show.e();
        if (i == 0 && bool != null && bool.booleanValue()) {
            this.logger.getValue().e(TAG, "onConnectionStateChanged: disconnected");
            dismissWithError(new Error("Disconnected", 1, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCalibrationProgressMessage(double d) {
        String strF;
        try {
            strF = String.format(Locale.US, this.calibrationProgressText, Integer.valueOf((int) d));
        } catch (Exception e) {
            this.logger.getValue().e(TAG, "String format error " + e.getMessage() + ". Please see documentation of setProgressTextFormatted() for correct formatting");
            strF = YU.a.f(e, new StringBuilder("String format exception: "));
        }
        this.calibrationProgressMessage.j(strF);
    }

    public void onDismissCalled(boolean z) {
        this.logger.getValue().d(TAG, "onDismissCalled() called with: stopCalibrationIfNeeded = [" + z + "]");
        IPSPositioning.removePositioningListener(this.positioningListener);
        Positioning.INSTANCE.removeCalibrationListener(this.calibrationListener);
        IPSCore.removeConnectionStateListener(this.connectionStateListener);
        if (z) {
            IPSPositioning.stopCalibration(new u(this));
        }
        dismissSuccess();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onShowCalled() {
        /*
            r5 = this;
            me.oriient.ipssdk.base.di.java.Lazy<me.oriient.internal.infra.utils.core.Logger> r0 = r5.logger
            java.lang.Object r0 = r0.getValue()
            me.oriient.internal.infra.utils.core.Logger r0 = (me.oriient.internal.infra.utils.core.Logger) r0
            java.lang.String r1 = me.oriient.ipssdk.ips.IPSCalibrationDialogViewModel.TAG
            java.lang.String r2 = "onShowCalled() called"
            r0.d(r1, r2)
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r5.didReceiveUpdate
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.j(r1)
            androidx.lifecycle.MutableLiveData<java.lang.Double> r0 = r5.calibrationProgress
            double r1 = me.oriient.ipssdk.ips.IPSPositioning.getCalibrationProgress()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.j(r1)
            androidx.lifecycle.MutableLiveData<java.lang.String> r0 = r5.calibrationInstructions
            java.lang.String r1 = r5.calibrationInstructionsText
            r0.j(r1)
            me.oriient.ipssdk.realtime.ips.Positioning r0 = me.oriient.ipssdk.realtime.ips.Positioning.INSTANCE
            java.lang.Integer r1 = r0.getCalibrationNeededReason()
            java.util.Map<java.lang.Integer, java.lang.String> r2 = r5.calibrationTitleTextByReason
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            if (r2 != 0) goto L47
            java.util.Map<java.lang.Integer, java.lang.String> r2 = r5.calibrationTitleTextByReason
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r2 = (java.lang.String) r2
        L47:
            androidx.lifecycle.MutableLiveData<java.lang.String> r4 = r5.calibrationTitle
            r4.j(r2)
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r2 = r5.calibrationTopInfoVisible
            if (r1 == 0) goto L58
            int r1 = r1.intValue()
            r4 = 1
            if (r1 != r4) goto L58
            goto L59
        L58:
            r4 = r3
        L59:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r2.j(r1)
            androidx.lifecycle.MutableLiveData<java.lang.String> r1 = r5.calibrationTopInfo
            java.lang.String r2 = r5.calibrationTopInfoText
            r1.j(r2)
            androidx.lifecycle.MutableLiveData<java.lang.String> r1 = r5.calibrationSuccessMessage
            java.lang.String r2 = r5.calibrationSuccessText
            r1.j(r2)
            androidx.lifecycle.MutableLiveData<java.lang.String> r1 = r5.calibrationProgressMessage
            java.lang.String r2 = r5.waitingToStartText
            r1.j(r2)
            me.oriient.ipssdk.api.listeners.IPSPositioningListener r1 = r5.positioningListener
            me.oriient.ipssdk.ips.IPSPositioning.addPositioningListener(r1)
            me.oriient.ipssdk.ips.ICalibrationListener r1 = r5.calibrationListener
            r0.addCalibrationListener(r1)
            me.oriient.ipssdk.api.listeners.IPSConnectionStateListener r0 = r5.connectionStateListener
            me.oriient.ipssdk.ips.IPSCore.addConnectionStateListener(r0)
            me.oriient.ipssdk.ips.IPSCore.registerApplicationEvent(r3)
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r5.show
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.j(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.ips.IPSCalibrationDialogViewModel.onShowCalled():void");
    }
}
