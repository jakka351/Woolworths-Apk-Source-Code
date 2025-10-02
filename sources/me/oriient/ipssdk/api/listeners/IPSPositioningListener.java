package me.oriient.ipssdk.api.listeners;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import me.oriient.ipssdk.api.models.IPSBuilding;
import me.oriient.ipssdk.api.models.IPSFloor;
import me.oriient.ipssdk.api.models.IPSPosition;

@Keep
/* loaded from: classes2.dex */
public interface IPSPositioningListener extends IPSFailable {
    default void onBuildingChanged(@NonNull IPSBuilding iPSBuilding) {
    }

    @Deprecated
    void onCalibrationGestureNeeded(boolean z);

    void onCalibrationGestureNeeded(boolean z, @Nullable Integer num);

    void onCalibrationProgress(double d);

    void onFloorChanged(@NonNull IPSFloor iPSFloor);

    void onPositionUpdate(@NonNull IPSPosition iPSPosition);

    void onPositioningEngineStateChanged(int i);
}
