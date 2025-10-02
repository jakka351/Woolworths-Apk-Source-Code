package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@Keep
/* loaded from: classes2.dex */
public interface IPSBuildingCoordinatesConverter {
    @Nullable
    IPSCoordinate convertFromOriient(@NonNull IPSCoordinate iPSCoordinate, @NonNull String str);

    @Nullable
    IPSHeading convertFromOriient(@NonNull IPSHeading iPSHeading, @NonNull String str);

    @Nullable
    IPSCoordinate convertToOriient(@NonNull IPSCoordinate iPSCoordinate, @NonNull String str);

    @Nullable
    IPSCoordinate convertToOriient(@NonNull IPSCoordinate iPSCoordinate, @NonNull String str, boolean z);

    @Nullable
    IPSHeading convertToOriient(@NonNull IPSHeading iPSHeading, @NonNull String str);

    @NonNull
    String getBuildingId();

    @Nullable
    IPSFloorCoordinatesConverter getFloorCoordinatesConverter(@NonNull String str);
}
