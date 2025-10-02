package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BK\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0002\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lme/oriient/ipssdk/api/models/IPSProductLocation;", "", "buildingId", "", "floorId", "productId", "x", "", "y", "regionIds", "", "regionNames", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/util/List;Ljava/util/List;)V", "getBuildingId", "()Ljava/lang/String;", "getFloorId", "getProductId", "getRegionIds", "()Ljava/util/List;", "getRegionNames", "getX", "()D", "getY", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IPSProductLocation {

    @NotNull
    private final String buildingId;

    @NotNull
    private final String floorId;

    @NotNull
    private final String productId;

    @NotNull
    private final List<String> regionIds;

    @NotNull
    private final List<String> regionNames;
    private final double x;
    private final double y;

    public IPSProductLocation(@NotNull String buildingId, @NotNull String floorId, @NotNull String productId, double d, double d2, @NotNull List<String> regionIds, @NotNull List<String> regionNames) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(productId, "productId");
        Intrinsics.h(regionIds, "regionIds");
        Intrinsics.h(regionNames, "regionNames");
        this.buildingId = buildingId;
        this.floorId = floorId;
        this.productId = productId;
        this.x = d;
        this.y = d2;
        this.regionIds = regionIds;
        this.regionNames = regionNames;
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final String getFloorId() {
        return this.floorId;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    public final List<String> getRegionIds() {
        return this.regionIds;
    }

    @NotNull
    public final List<String> getRegionNames() {
        return this.regionNames;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }
}
