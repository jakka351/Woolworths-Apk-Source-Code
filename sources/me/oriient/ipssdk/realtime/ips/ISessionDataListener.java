package me.oriient.ipssdk.realtime.ips;

import kotlin.Metadata;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.realtime.utils.models.Position;
import me.oriient.positioningengine.common.PositioningUpdate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&¨\u0006\u0013"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/ISessionDataListener;", "", "onCalibrationNeeded", "", "reason", "Lme/oriient/ipssdk/realtime/ips/CalibrationReason;", "info", "", "onCalibrationUpdate", "percent", "", "onPositioningUpdate", "newPosition", "Lme/oriient/ipssdk/realtime/utils/models/Position;", "rawUpdate", "Lme/oriient/positioningengine/common/PositioningUpdate;", "onSessionError", "error", "Lme/oriient/ipssdk/api/models/IPSError;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ISessionDataListener {
    void onCalibrationNeeded(@Nullable CalibrationReason reason, @Nullable String info);

    void onCalibrationUpdate(float percent);

    void onPositioningUpdate(@NotNull Position newPosition, @NotNull PositioningUpdate rawUpdate);

    void onSessionError(@NotNull IPSError error);
}
