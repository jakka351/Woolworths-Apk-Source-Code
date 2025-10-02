package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.jetbrains.annotations.NotNull;

@Keep
/* loaded from: classes2.dex */
public interface IPSBuildingsSearchResult {
    @Nullable
    String getClientBuildingId();

    @NotNull
    String getDisplayName();

    @NonNull
    IPSGlobalCoordinate getGeofenceOrigin();

    double getGeofenceRadius();

    @NonNull
    String getId();

    double getLatitude();

    double getLongitude();

    @NonNull
    String getName();
}
