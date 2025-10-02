package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes2.dex */
public interface IPSRegionPlacementFeatures {
    @NonNull
    Boolean getCanStartPositioning();

    @NonNull
    Boolean getCanStopPositioning();
}
