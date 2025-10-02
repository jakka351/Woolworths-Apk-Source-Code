package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes2.dex */
public interface IPSRectangularShape extends IPSShape {
    @NonNull
    IPSCoordinate getBottomLeft();

    @NonNull
    IPSCoordinate getTopRight();
}
