package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

@Keep
/* loaded from: classes2.dex */
public interface IPSStartingPosition extends IPSCoordinateInBuilding, IPSGlobalCoordinate {
    double getAccuracy();

    @Nullable
    IPSHeading getHeading();

    long getTimeDeterminedMilli();
}
