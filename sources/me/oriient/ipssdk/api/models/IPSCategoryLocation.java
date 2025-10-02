package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B7\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lme/oriient/ipssdk/api/models/IPSCategoryLocation;", "", "buildingId", "", "floorId", "categoryId", "categoryName", "bottomLeft", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "topRight", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/oriient/ipssdk/api/models/IPSCoordinate;Lme/oriient/ipssdk/api/models/IPSCoordinate;)V", "getBottomLeft", "()Lme/oriient/ipssdk/api/models/IPSCoordinate;", "getBuildingId", "()Ljava/lang/String;", "getCategoryId", "getCategoryName", "getFloorId", "getTopRight", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IPSCategoryLocation {

    @NotNull
    private final IPSCoordinate bottomLeft;

    @NotNull
    private final String buildingId;

    @NotNull
    private final String categoryId;

    @NotNull
    private final String categoryName;

    @NotNull
    private final String floorId;

    @NotNull
    private final IPSCoordinate topRight;

    public IPSCategoryLocation(@NotNull String buildingId, @NotNull String floorId, @NotNull String categoryId, @NotNull String categoryName, @NotNull IPSCoordinate bottomLeft, @NotNull IPSCoordinate topRight) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(categoryId, "categoryId");
        Intrinsics.h(categoryName, "categoryName");
        Intrinsics.h(bottomLeft, "bottomLeft");
        Intrinsics.h(topRight, "topRight");
        this.buildingId = buildingId;
        this.floorId = floorId;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    @NotNull
    public final IPSCoordinate getBottomLeft() {
        return this.bottomLeft;
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final String getCategoryId() {
        return this.categoryId;
    }

    @NotNull
    public final String getCategoryName() {
        return this.categoryName;
    }

    @NotNull
    public final String getFloorId() {
        return this.floorId;
    }

    @NotNull
    public final IPSCoordinate getTopRight() {
        return this.topRight;
    }
}
