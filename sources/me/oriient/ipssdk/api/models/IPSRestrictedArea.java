package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lme/oriient/ipssdk/api/models/IPSRestrictedArea;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "points", "", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "buildingId", "floorId", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getBuildingId", "()Ljava/lang/String;", "getFloorId", "getId", "mapId", "getMapId$annotations", "()V", "getMapId", "getName", "getPoints", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class IPSRestrictedArea {

    @NotNull
    private final String buildingId;

    @NotNull
    private final String floorId;

    @NotNull
    private final String id;

    @NotNull
    private final String mapId;

    @NotNull
    private final String name;

    @NotNull
    private final List<IPSCoordinate> points;

    /* JADX WARN: Multi-variable type inference failed */
    public IPSRestrictedArea(@NotNull String id, @NotNull String name, @NotNull List<? extends IPSCoordinate> points, @NotNull String buildingId, @NotNull String floorId) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(points, "points");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        this.id = id;
        this.name = name;
        this.points = points;
        this.buildingId = buildingId;
        this.floorId = floorId;
        this.mapId = floorId;
    }

    public static /* synthetic */ IPSRestrictedArea copy$default(IPSRestrictedArea iPSRestrictedArea, String str, String str2, List list, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iPSRestrictedArea.id;
        }
        if ((i & 2) != 0) {
            str2 = iPSRestrictedArea.name;
        }
        if ((i & 4) != 0) {
            list = iPSRestrictedArea.points;
        }
        if ((i & 8) != 0) {
            str3 = iPSRestrictedArea.buildingId;
        }
        if ((i & 16) != 0) {
            str4 = iPSRestrictedArea.floorId;
        }
        String str5 = str4;
        List list2 = list;
        return iPSRestrictedArea.copy(str, str2, list2, str3, str5);
    }

    @Deprecated
    public static /* synthetic */ void getMapId$annotations() {
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<IPSCoordinate> component3() {
        return this.points;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getFloorId() {
        return this.floorId;
    }

    @NotNull
    public final IPSRestrictedArea copy(@NotNull String id, @NotNull String name, @NotNull List<? extends IPSCoordinate> points, @NotNull String buildingId, @NotNull String floorId) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(points, "points");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        return new IPSRestrictedArea(id, name, points, buildingId, floorId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IPSRestrictedArea)) {
            return false;
        }
        IPSRestrictedArea iPSRestrictedArea = (IPSRestrictedArea) other;
        return Intrinsics.c(this.id, iPSRestrictedArea.id) && Intrinsics.c(this.name, iPSRestrictedArea.name) && Intrinsics.c(this.points, iPSRestrictedArea.points) && Intrinsics.c(this.buildingId, iPSRestrictedArea.buildingId) && Intrinsics.c(this.floorId, iPSRestrictedArea.floorId);
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
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getMapId() {
        return this.mapId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<IPSCoordinate> getPoints() {
        return this.points;
    }

    public int hashCode() {
        return this.floorId.hashCode() + b.c(b.d(b.c(this.id.hashCode() * 31, 31, this.name), 31, this.points), 31, this.buildingId);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("IPSRestrictedArea(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", points=");
        sb.append(this.points);
        sb.append(", buildingId=");
        sb.append(this.buildingId);
        sb.append(", floorId=");
        return b.r(sb, this.floorId, ')');
    }
}
