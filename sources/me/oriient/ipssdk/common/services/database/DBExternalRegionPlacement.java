package me.oriient.ipssdk.common.services.database;

import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.oriient.ipssdk.common.ofs.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\tHÖ\u0001J\b\u0010!\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, d2 = {"Lme/oriient/ipssdk/common/services/database/DBExternalRegionPlacement;", "", "id", "", "features", "vertices", "buildingId", "regionId", "shapeType", "", "entrancesIds", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getBuildingId", "()Ljava/lang/String;", "getEntrancesIds", "getFeatures", "getId", "getRegionId", "getShapeType", "()I", "getVertices", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DBExternalRegionPlacement {

    @NotNull
    private final String buildingId;

    @NotNull
    private final String entrancesIds;

    @NotNull
    private final String features;

    @NotNull
    private final String id;

    @NotNull
    private final String regionId;
    private final int shapeType;

    @NotNull
    private final String vertices;

    public DBExternalRegionPlacement(@NotNull String id, @NotNull String features, @NotNull String vertices, @NotNull String buildingId, @NotNull String regionId, int i, @NotNull String entrancesIds) {
        Intrinsics.h(id, "id");
        Intrinsics.h(features, "features");
        Intrinsics.h(vertices, "vertices");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(regionId, "regionId");
        Intrinsics.h(entrancesIds, "entrancesIds");
        this.id = id;
        this.features = features;
        this.vertices = vertices;
        this.buildingId = buildingId;
        this.regionId = regionId;
        this.shapeType = i;
        this.entrancesIds = entrancesIds;
    }

    public static /* synthetic */ DBExternalRegionPlacement copy$default(DBExternalRegionPlacement dBExternalRegionPlacement, String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dBExternalRegionPlacement.id;
        }
        if ((i2 & 2) != 0) {
            str2 = dBExternalRegionPlacement.features;
        }
        if ((i2 & 4) != 0) {
            str3 = dBExternalRegionPlacement.vertices;
        }
        if ((i2 & 8) != 0) {
            str4 = dBExternalRegionPlacement.buildingId;
        }
        if ((i2 & 16) != 0) {
            str5 = dBExternalRegionPlacement.regionId;
        }
        if ((i2 & 32) != 0) {
            i = dBExternalRegionPlacement.shapeType;
        }
        if ((i2 & 64) != 0) {
            str6 = dBExternalRegionPlacement.entrancesIds;
        }
        int i3 = i;
        String str7 = str6;
        String str8 = str5;
        String str9 = str3;
        return dBExternalRegionPlacement.copy(str, str2, str9, str4, str8, i3, str7);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFeatures() {
        return this.features;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getVertices() {
        return this.vertices;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getRegionId() {
        return this.regionId;
    }

    /* renamed from: component6, reason: from getter */
    public final int getShapeType() {
        return this.shapeType;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getEntrancesIds() {
        return this.entrancesIds;
    }

    @NotNull
    public final DBExternalRegionPlacement copy(@NotNull String id, @NotNull String features, @NotNull String vertices, @NotNull String buildingId, @NotNull String regionId, int shapeType, @NotNull String entrancesIds) {
        Intrinsics.h(id, "id");
        Intrinsics.h(features, "features");
        Intrinsics.h(vertices, "vertices");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(regionId, "regionId");
        Intrinsics.h(entrancesIds, "entrancesIds");
        return new DBExternalRegionPlacement(id, features, vertices, buildingId, regionId, shapeType, entrancesIds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DBExternalRegionPlacement)) {
            return false;
        }
        DBExternalRegionPlacement dBExternalRegionPlacement = (DBExternalRegionPlacement) other;
        return Intrinsics.c(this.id, dBExternalRegionPlacement.id) && Intrinsics.c(this.features, dBExternalRegionPlacement.features) && Intrinsics.c(this.vertices, dBExternalRegionPlacement.vertices) && Intrinsics.c(this.buildingId, dBExternalRegionPlacement.buildingId) && Intrinsics.c(this.regionId, dBExternalRegionPlacement.regionId) && this.shapeType == dBExternalRegionPlacement.shapeType && Intrinsics.c(this.entrancesIds, dBExternalRegionPlacement.entrancesIds);
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final String getEntrancesIds() {
        return this.entrancesIds;
    }

    @NotNull
    public final String getFeatures() {
        return this.features;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getRegionId() {
        return this.regionId;
    }

    public final int getShapeType() {
        return this.shapeType;
    }

    @NotNull
    public final String getVertices() {
        return this.vertices;
    }

    public int hashCode() {
        return this.entrancesIds.hashCode() + b.a(this.shapeType, L.a(this.regionId, L.a(this.buildingId, L.a(this.vertices, L.a(this.features, this.id.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        return StringsKt.n0("\n  |DBExternalRegionPlacement [\n  |  id: " + this.id + "\n  |  features: " + this.features + "\n  |  vertices: " + this.vertices + "\n  |  buildingId: " + this.buildingId + "\n  |  regionId: " + this.regionId + "\n  |  shapeType: " + this.shapeType + "\n  |  entrancesIds: " + this.entrancesIds + "\n  |]\n  ");
    }
}
