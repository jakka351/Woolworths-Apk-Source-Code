package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public interface IPSBuilding {
    @Nullable
    String getClientBuildingId();

    @NonNull
    String getDisplayName();

    @NonNull
    List<IPSExternalRegion> getExternalRegions();

    @Nullable
    IPSFloor getFloorById(@NonNull String str);

    @Nullable
    IPSFloor getFloorByOrder(int i);

    @NonNull
    List<IPSFloor> getFloors();

    double getGeofenceRadius();

    @NonNull
    String getId();

    double getLatitude();

    double getLongitude();

    @Nullable
    String getMetadata();

    @NonNull
    String getName();

    @Nullable
    IPSGlobalCoordinate getOrigin();

    @NonNull
    IPSFloor getPrimaryFloor();

    @NonNull
    String getPrimaryFloorId();

    double getRotationToENU();

    boolean isInitialFloorDetectionSupported();
}
