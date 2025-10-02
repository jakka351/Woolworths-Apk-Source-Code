package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\tHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lme/oriient/ipssdk/api/models/IPSSnapToRegionResult;", "", "snappedCoordinate", "Lme/oriient/ipssdk/api/models/IPSCoordinateInBuilding;", "region", "Lme/oriient/ipssdk/api/models/IPSRegion;", "regionPlacement", "Lme/oriient/ipssdk/api/models/IPSRegionPlacement;", "indexInInputList", "", "distance", "", "(Lme/oriient/ipssdk/api/models/IPSCoordinateInBuilding;Lme/oriient/ipssdk/api/models/IPSRegion;Lme/oriient/ipssdk/api/models/IPSRegionPlacement;ID)V", "getDistance", "()D", "getIndexInInputList", "()I", "getRegion", "()Lme/oriient/ipssdk/api/models/IPSRegion;", "getRegionPlacement", "()Lme/oriient/ipssdk/api/models/IPSRegionPlacement;", "getSnappedCoordinate", "()Lme/oriient/ipssdk/api/models/IPSCoordinateInBuilding;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class IPSSnapToRegionResult {
    private final double distance;
    private final int indexInInputList;

    @NotNull
    private final IPSRegion region;

    @NotNull
    private final IPSRegionPlacement regionPlacement;

    @NotNull
    private final IPSCoordinateInBuilding snappedCoordinate;

    public IPSSnapToRegionResult(@NotNull IPSCoordinateInBuilding snappedCoordinate, @NotNull IPSRegion region, @NotNull IPSRegionPlacement regionPlacement, int i, double d) {
        Intrinsics.h(snappedCoordinate, "snappedCoordinate");
        Intrinsics.h(region, "region");
        Intrinsics.h(regionPlacement, "regionPlacement");
        this.snappedCoordinate = snappedCoordinate;
        this.region = region;
        this.regionPlacement = regionPlacement;
        this.indexInInputList = i;
        this.distance = d;
    }

    public static /* synthetic */ IPSSnapToRegionResult copy$default(IPSSnapToRegionResult iPSSnapToRegionResult, IPSCoordinateInBuilding iPSCoordinateInBuilding, IPSRegion iPSRegion, IPSRegionPlacement iPSRegionPlacement, int i, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            iPSCoordinateInBuilding = iPSSnapToRegionResult.snappedCoordinate;
        }
        if ((i2 & 2) != 0) {
            iPSRegion = iPSSnapToRegionResult.region;
        }
        if ((i2 & 4) != 0) {
            iPSRegionPlacement = iPSSnapToRegionResult.regionPlacement;
        }
        if ((i2 & 8) != 0) {
            i = iPSSnapToRegionResult.indexInInputList;
        }
        if ((i2 & 16) != 0) {
            d = iPSSnapToRegionResult.distance;
        }
        double d2 = d;
        return iPSSnapToRegionResult.copy(iPSCoordinateInBuilding, iPSRegion, iPSRegionPlacement, i, d2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IPSCoordinateInBuilding getSnappedCoordinate() {
        return this.snappedCoordinate;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final IPSRegion getRegion() {
        return this.region;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final IPSRegionPlacement getRegionPlacement() {
        return this.regionPlacement;
    }

    /* renamed from: component4, reason: from getter */
    public final int getIndexInInputList() {
        return this.indexInInputList;
    }

    /* renamed from: component5, reason: from getter */
    public final double getDistance() {
        return this.distance;
    }

    @NotNull
    public final IPSSnapToRegionResult copy(@NotNull IPSCoordinateInBuilding snappedCoordinate, @NotNull IPSRegion region, @NotNull IPSRegionPlacement regionPlacement, int indexInInputList, double distance) {
        Intrinsics.h(snappedCoordinate, "snappedCoordinate");
        Intrinsics.h(region, "region");
        Intrinsics.h(regionPlacement, "regionPlacement");
        return new IPSSnapToRegionResult(snappedCoordinate, region, regionPlacement, indexInInputList, distance);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IPSSnapToRegionResult)) {
            return false;
        }
        IPSSnapToRegionResult iPSSnapToRegionResult = (IPSSnapToRegionResult) other;
        return Intrinsics.c(this.snappedCoordinate, iPSSnapToRegionResult.snappedCoordinate) && Intrinsics.c(this.region, iPSSnapToRegionResult.region) && Intrinsics.c(this.regionPlacement, iPSSnapToRegionResult.regionPlacement) && this.indexInInputList == iPSSnapToRegionResult.indexInInputList && Double.compare(this.distance, iPSSnapToRegionResult.distance) == 0;
    }

    public final double getDistance() {
        return this.distance;
    }

    public final int getIndexInInputList() {
        return this.indexInInputList;
    }

    @NotNull
    public final IPSRegion getRegion() {
        return this.region;
    }

    @NotNull
    public final IPSRegionPlacement getRegionPlacement() {
        return this.regionPlacement;
    }

    @NotNull
    public final IPSCoordinateInBuilding getSnappedCoordinate() {
        return this.snappedCoordinate;
    }

    public int hashCode() {
        return Double.hashCode(this.distance) + b.a(this.indexInInputList, (this.regionPlacement.hashCode() + ((this.region.hashCode() + (this.snappedCoordinate.hashCode() * 31)) * 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("IPSSnapToRegionResult(snappedCoordinate=");
        sb.append(this.snappedCoordinate);
        sb.append(", region=");
        sb.append(this.region);
        sb.append(", regionPlacement=");
        sb.append(this.regionPlacement);
        sb.append(", indexInInputList=");
        sb.append(this.indexInInputList);
        sb.append(", distance=");
        return b.p(sb, this.distance, ')');
    }
}
