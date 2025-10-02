package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes2.dex */
public interface IPSFloorCoordinatesConverter {
    @NonNull
    IPSCoordinate convertFromOriient(@NonNull IPSCoordinate iPSCoordinate);

    @NonNull
    IPSHeading convertFromOriient(@NonNull IPSHeading iPSHeading);

    @NonNull
    IPSCoordinate convertToOriient(@NonNull IPSCoordinate iPSCoordinate);

    @NonNull
    IPSCoordinate convertToOriient(@NonNull IPSCoordinate iPSCoordinate, boolean z);

    @NonNull
    IPSHeading convertToOriient(@NonNull IPSHeading iPSHeading);

    @NonNull
    String getFloorId();
}
