package me.oriient.ipssdk.common.services.database;

import androidx.camera.core.impl.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.oriient.ipssdk.common.ofs.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u0015Jx\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0007HÖ\u0001J\b\u0010.\u001a\u00020\u0003H\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011¨\u0006/"}, d2 = {"Lme/oriient/ipssdk/common/services/database/DBFloor;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "shortName", "floorOrder", "", "buildingId", "mapId", "mapName", "mapUsage", "height", "", "rotation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "getBuildingId", "()Ljava/lang/String;", "getFloorOrder", "()I", "getHeight", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getId", "getMapId", "getMapName", "getMapUsage", "getName", "getRotation", "getShortName", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lme/oriient/ipssdk/common/services/database/DBFloor;", "equals", "", "other", "hashCode", "toString", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DBFloor {

    @NotNull
    private final String buildingId;
    private final int floorOrder;

    @Nullable
    private final Double height;

    @NotNull
    private final String id;

    @NotNull
    private final String mapId;

    @NotNull
    private final String mapName;

    @NotNull
    private final String mapUsage;

    @NotNull
    private final String name;

    @Nullable
    private final Double rotation;

    @Nullable
    private final String shortName;

    public DBFloor(@NotNull String id, @NotNull String name, @Nullable String str, int i, @NotNull String buildingId, @NotNull String mapId, @NotNull String mapName, @NotNull String mapUsage, @Nullable Double d, @Nullable Double d2) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(mapId, "mapId");
        Intrinsics.h(mapName, "mapName");
        Intrinsics.h(mapUsage, "mapUsage");
        this.id = id;
        this.name = name;
        this.shortName = str;
        this.floorOrder = i;
        this.buildingId = buildingId;
        this.mapId = mapId;
        this.mapName = mapName;
        this.mapUsage = mapUsage;
        this.height = d;
        this.rotation = d2;
    }

    public static /* synthetic */ DBFloor copy$default(DBFloor dBFloor, String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, Double d, Double d2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dBFloor.id;
        }
        if ((i2 & 2) != 0) {
            str2 = dBFloor.name;
        }
        if ((i2 & 4) != 0) {
            str3 = dBFloor.shortName;
        }
        if ((i2 & 8) != 0) {
            i = dBFloor.floorOrder;
        }
        if ((i2 & 16) != 0) {
            str4 = dBFloor.buildingId;
        }
        if ((i2 & 32) != 0) {
            str5 = dBFloor.mapId;
        }
        if ((i2 & 64) != 0) {
            str6 = dBFloor.mapName;
        }
        if ((i2 & 128) != 0) {
            str7 = dBFloor.mapUsage;
        }
        if ((i2 & 256) != 0) {
            d = dBFloor.height;
        }
        if ((i2 & 512) != 0) {
            d2 = dBFloor.rotation;
        }
        Double d3 = d;
        Double d4 = d2;
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return dBFloor.copy(str, str2, str3, i, str10, str11, str8, str9, d3, d4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Double getRotation() {
        return this.rotation;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getShortName() {
        return this.shortName;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFloorOrder() {
        return this.floorOrder;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getMapId() {
        return this.mapId;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getMapName() {
        return this.mapName;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getMapUsage() {
        return this.mapUsage;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Double getHeight() {
        return this.height;
    }

    @NotNull
    public final DBFloor copy(@NotNull String id, @NotNull String name, @Nullable String shortName, int floorOrder, @NotNull String buildingId, @NotNull String mapId, @NotNull String mapName, @NotNull String mapUsage, @Nullable Double height, @Nullable Double rotation) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(mapId, "mapId");
        Intrinsics.h(mapName, "mapName");
        Intrinsics.h(mapUsage, "mapUsage");
        return new DBFloor(id, name, shortName, floorOrder, buildingId, mapId, mapName, mapUsage, height, rotation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DBFloor)) {
            return false;
        }
        DBFloor dBFloor = (DBFloor) other;
        return Intrinsics.c(this.id, dBFloor.id) && Intrinsics.c(this.name, dBFloor.name) && Intrinsics.c(this.shortName, dBFloor.shortName) && this.floorOrder == dBFloor.floorOrder && Intrinsics.c(this.buildingId, dBFloor.buildingId) && Intrinsics.c(this.mapId, dBFloor.mapId) && Intrinsics.c(this.mapName, dBFloor.mapName) && Intrinsics.c(this.mapUsage, dBFloor.mapUsage) && Intrinsics.c(this.height, dBFloor.height) && Intrinsics.c(this.rotation, dBFloor.rotation);
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    public final int getFloorOrder() {
        return this.floorOrder;
    }

    @Nullable
    public final Double getHeight() {
        return this.height;
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
    public final String getMapName() {
        return this.mapName;
    }

    @NotNull
    public final String getMapUsage() {
        return this.mapUsage;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Double getRotation() {
        return this.rotation;
    }

    @Nullable
    public final String getShortName() {
        return this.shortName;
    }

    public int hashCode() {
        int iA = L.a(this.name, this.id.hashCode() * 31, 31);
        String str = this.shortName;
        int iA2 = L.a(this.mapUsage, L.a(this.mapName, L.a(this.mapId, L.a(this.buildingId, b.a(this.floorOrder, (iA + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31);
        Double d = this.height;
        int iHashCode = (iA2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.rotation;
        return iHashCode + (d2 != null ? d2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return StringsKt.n0("\n  |DBFloor [\n  |  id: " + this.id + "\n  |  name: " + this.name + "\n  |  shortName: " + this.shortName + "\n  |  floorOrder: " + this.floorOrder + "\n  |  buildingId: " + this.buildingId + "\n  |  mapId: " + this.mapId + "\n  |  mapName: " + this.mapName + "\n  |  mapUsage: " + this.mapUsage + "\n  |  height: " + this.height + "\n  |  rotation: " + this.rotation + "\n  |]\n  ");
    }
}
