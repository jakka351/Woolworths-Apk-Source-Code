package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@Keep
/* loaded from: classes2.dex */
public interface IPSPosition extends IPSStartingPosition {
    @Override // me.oriient.ipssdk.api.models.IPSStartingPosition
    double getAccuracy();

    double getAzimuth();

    @NonNull
    String getFloorId();

    @Override // me.oriient.ipssdk.api.models.IPSStartingPosition
    @NonNull
    IPSHeading getHeading();

    double getLockProgress();

    @NonNull
    IPSHeading getMainOrientation();

    @Nullable
    String getServerTimeUtcIso8601();

    double getTimeBetweenUpdatesMilli();

    @Override // me.oriient.ipssdk.api.models.IPSStartingPosition
    long getTimeDeterminedMilli();

    double getTravelDistance();
}
