package me.oriient.ipssdk.ips;

import kotlin.Metadata;
import me.oriient.ipssdk.api.models.IPSError;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lme/oriient/ipssdk/ips/ICalibrationListener;", "", "onCalibrationError", "", "error", "Lme/oriient/ipssdk/api/models/IPSError;", "onCalibrationProgress", "percent", "", "onCalibrationStateChanged", "newState", "", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ICalibrationListener {
    void onCalibrationError(@NotNull IPSError error);

    void onCalibrationProgress(float percent);

    void onCalibrationStateChanged(int newState);
}
