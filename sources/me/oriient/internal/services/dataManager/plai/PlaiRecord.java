package me.oriient.internal.services.dataManager.plai;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003Jo\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006-"}, d2 = {"Lme/oriient/internal/services/dataManager/plai/PlaiRecord;", "", "buildingId", "", "floorId", "customerTagId", "x", "", "y", "confidence", "lastUsedScanTime", "", "regionIds", "", "regionNames", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDJLjava/util/List;Ljava/util/List;)V", "getBuildingId", "()Ljava/lang/String;", "getConfidence", "()D", "getCustomerTagId", "getFloorId", "getLastUsedScanTime", "()J", "getRegionIds", "()Ljava/util/List;", "getRegionNames", "getX", "getY", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PlaiRecord {

    @NotNull
    private final String buildingId;
    private final double confidence;

    @NotNull
    private final String customerTagId;

    @NotNull
    private final String floorId;
    private final long lastUsedScanTime;

    @NotNull
    private final List<String> regionIds;

    @NotNull
    private final List<String> regionNames;
    private final double x;
    private final double y;

    public PlaiRecord(@NotNull String buildingId, @NotNull String floorId, @NotNull String customerTagId, double d, double d2, double d3, long j, @NotNull List<String> regionIds, @NotNull List<String> regionNames) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(customerTagId, "customerTagId");
        Intrinsics.h(regionIds, "regionIds");
        Intrinsics.h(regionNames, "regionNames");
        this.buildingId = buildingId;
        this.floorId = floorId;
        this.customerTagId = customerTagId;
        this.x = d;
        this.y = d2;
        this.confidence = d3;
        this.lastUsedScanTime = j;
        this.regionIds = regionIds;
        this.regionNames = regionNames;
    }

    public static /* synthetic */ PlaiRecord copy$default(PlaiRecord plaiRecord, String str, String str2, String str3, double d, double d2, double d3, long j, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plaiRecord.buildingId;
        }
        return plaiRecord.copy(str, (i & 2) != 0 ? plaiRecord.floorId : str2, (i & 4) != 0 ? plaiRecord.customerTagId : str3, (i & 8) != 0 ? plaiRecord.x : d, (i & 16) != 0 ? plaiRecord.y : d2, (i & 32) != 0 ? plaiRecord.confidence : d3, (i & 64) != 0 ? plaiRecord.lastUsedScanTime : j, (i & 128) != 0 ? plaiRecord.regionIds : list, (i & 256) != 0 ? plaiRecord.regionNames : list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFloorId() {
        return this.floorId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCustomerTagId() {
        return this.customerTagId;
    }

    /* renamed from: component4, reason: from getter */
    public final double getX() {
        return this.x;
    }

    /* renamed from: component5, reason: from getter */
    public final double getY() {
        return this.y;
    }

    /* renamed from: component6, reason: from getter */
    public final double getConfidence() {
        return this.confidence;
    }

    /* renamed from: component7, reason: from getter */
    public final long getLastUsedScanTime() {
        return this.lastUsedScanTime;
    }

    @NotNull
    public final List<String> component8() {
        return this.regionIds;
    }

    @NotNull
    public final List<String> component9() {
        return this.regionNames;
    }

    @NotNull
    public final PlaiRecord copy(@NotNull String buildingId, @NotNull String floorId, @NotNull String customerTagId, double x, double y, double confidence, long lastUsedScanTime, @NotNull List<String> regionIds, @NotNull List<String> regionNames) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(customerTagId, "customerTagId");
        Intrinsics.h(regionIds, "regionIds");
        Intrinsics.h(regionNames, "regionNames");
        return new PlaiRecord(buildingId, floorId, customerTagId, x, y, confidence, lastUsedScanTime, regionIds, regionNames);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaiRecord)) {
            return false;
        }
        PlaiRecord plaiRecord = (PlaiRecord) other;
        return Intrinsics.c(this.buildingId, plaiRecord.buildingId) && Intrinsics.c(this.floorId, plaiRecord.floorId) && Intrinsics.c(this.customerTagId, plaiRecord.customerTagId) && Double.compare(this.x, plaiRecord.x) == 0 && Double.compare(this.y, plaiRecord.y) == 0 && Double.compare(this.confidence, plaiRecord.confidence) == 0 && this.lastUsedScanTime == plaiRecord.lastUsedScanTime && Intrinsics.c(this.regionIds, plaiRecord.regionIds) && Intrinsics.c(this.regionNames, plaiRecord.regionNames);
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    public final double getConfidence() {
        return this.confidence;
    }

    @NotNull
    public final String getCustomerTagId() {
        return this.customerTagId;
    }

    @NotNull
    public final String getFloorId() {
        return this.floorId;
    }

    public final long getLastUsedScanTime() {
        return this.lastUsedScanTime;
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

    public int hashCode() {
        return this.regionNames.hashCode() + androidx.camera.core.impl.b.d(me.oriient.internal.infra.locationManager.K.a(this.lastUsedScanTime, me.oriient.internal.infra.locationManager.J.a(this.confidence, me.oriient.internal.infra.locationManager.J.a(this.y, me.oriient.internal.infra.locationManager.J.a(this.x, me.oriient.internal.infra.rest.a.a(this.customerTagId, me.oriient.internal.infra.rest.a.a(this.floorId, this.buildingId.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31, this.regionIds);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PlaiRecord(buildingId=");
        sb.append(this.buildingId);
        sb.append(", floorId=");
        sb.append(this.floorId);
        sb.append(", customerTagId=");
        sb.append(this.customerTagId);
        sb.append(", x=");
        sb.append(this.x);
        sb.append(", y=");
        sb.append(this.y);
        sb.append(", confidence=");
        sb.append(this.confidence);
        sb.append(", lastUsedScanTime=");
        sb.append(this.lastUsedScanTime);
        sb.append(", regionIds=");
        sb.append(this.regionIds);
        sb.append(", regionNames=");
        return me.oriient.internal.services.auth.rest.m.a(sb, this.regionNames, ')');
    }
}
