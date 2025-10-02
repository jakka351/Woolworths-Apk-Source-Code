package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes2.dex */
public interface IPSRouteFloorTransition extends IPSCoordinateInBuilding {
    int getDestinationFloorOrder();

    @NonNull
    String getId();

    int getIndexOnRoute();

    int getType();
}
