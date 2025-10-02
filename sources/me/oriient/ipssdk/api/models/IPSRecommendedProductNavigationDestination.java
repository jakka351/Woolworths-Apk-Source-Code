package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, d2 = {"Lme/oriient/ipssdk/api/models/IPSRecommendedProductNavigationDestination;", "", "buildingId", "", "floorId", "coordinate", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "categoryLocation", "Lme/oriient/ipssdk/api/models/IPSCategoryLocation;", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/ipssdk/api/models/IPSCoordinate;Lme/oriient/ipssdk/api/models/IPSCategoryLocation;)V", "getBuildingId", "()Ljava/lang/String;", "getCategoryLocation", "()Lme/oriient/ipssdk/api/models/IPSCategoryLocation;", "getCoordinate", "()Lme/oriient/ipssdk/api/models/IPSCoordinate;", "getFloorId", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IPSRecommendedProductNavigationDestination {

    @NotNull
    private final String buildingId;

    @Nullable
    private final IPSCategoryLocation categoryLocation;

    @NotNull
    private final IPSCoordinate coordinate;

    @NotNull
    private final String floorId;

    public IPSRecommendedProductNavigationDestination(@NotNull String buildingId, @NotNull String floorId, @NotNull IPSCoordinate coordinate, @Nullable IPSCategoryLocation iPSCategoryLocation) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(coordinate, "coordinate");
        this.buildingId = buildingId;
        this.floorId = floorId;
        this.coordinate = coordinate;
        this.categoryLocation = iPSCategoryLocation;
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @Nullable
    public final IPSCategoryLocation getCategoryLocation() {
        return this.categoryLocation;
    }

    @NotNull
    public final IPSCoordinate getCoordinate() {
        return this.coordinate;
    }

    @NotNull
    public final String getFloorId() {
        return this.floorId;
    }
}
