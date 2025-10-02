package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public interface IPSExternalRegionPlacement {
    public static final int TYPE_POLYGONAL = 2;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ShapeType {
    }

    @NonNull
    String getBuildingId();

    @NonNull
    List<IPSEntrance> getEntrances();

    @NonNull
    IPSRegionPlacementFeatures getFeatures();

    @NonNull
    String getId();

    int getShapeType();

    Boolean isCoordinateInside(@NonNull IPSGlobalCoordinate iPSGlobalCoordinate);
}
