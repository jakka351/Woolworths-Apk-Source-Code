package me.oriient.ipssdk.common.services.database;

import android.support.v4.media.session.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.storage.db.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.oriient.ipssdk.common.ofs.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\u0097\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\b\u00107\u001a\u00020\u0003H\u0016R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016¨\u00068"}, d2 = {"Lme/oriient/ipssdk/common/services/database/DBBuilding;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "rotation", "", h.a.b, h.a.c, "altitude", "geofence_latitude", "geofence_longitude", "geofence_altitude", "geofenceRadius", "primaryFloorId", "spaceId", "clientBuildingId", "displayName", "(Ljava/lang/String;Ljava/lang/String;DDDDDDDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAltitude", "()D", "getClientBuildingId", "()Ljava/lang/String;", "getDisplayName", "getGeofenceRadius", "getGeofence_altitude", "getGeofence_latitude", "getGeofence_longitude", "getId", "getLatitude", "getLongitude", "getName", "getPrimaryFloorId", "getRotation", "getSpaceId", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DBBuilding {
    private final double altitude;

    @Nullable
    private final String clientBuildingId;

    @NotNull
    private final String displayName;
    private final double geofenceRadius;
    private final double geofence_altitude;
    private final double geofence_latitude;
    private final double geofence_longitude;

    @NotNull
    private final String id;
    private final double latitude;
    private final double longitude;

    @NotNull
    private final String name;

    @NotNull
    private final String primaryFloorId;
    private final double rotation;

    @NotNull
    private final String spaceId;

    public DBBuilding(@NotNull String id, @NotNull String name, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, @NotNull String primaryFloorId, @NotNull String spaceId, @Nullable String str, @NotNull String displayName) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(primaryFloorId, "primaryFloorId");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(displayName, "displayName");
        this.id = id;
        this.name = name;
        this.rotation = d;
        this.latitude = d2;
        this.longitude = d3;
        this.altitude = d4;
        this.geofence_latitude = d5;
        this.geofence_longitude = d6;
        this.geofence_altitude = d7;
        this.geofenceRadius = d8;
        this.primaryFloorId = primaryFloorId;
        this.spaceId = spaceId;
        this.clientBuildingId = str;
        this.displayName = displayName;
    }

    public static /* synthetic */ DBBuilding copy$default(DBBuilding dBBuilding, String str, String str2, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7 = (i & 1) != 0 ? dBBuilding.id : str;
        String str8 = (i & 2) != 0 ? dBBuilding.name : str2;
        return dBBuilding.copy(str7, str8, (i & 4) != 0 ? dBBuilding.rotation : d, (i & 8) != 0 ? dBBuilding.latitude : d2, (i & 16) != 0 ? dBBuilding.longitude : d3, (i & 32) != 0 ? dBBuilding.altitude : d4, (i & 64) != 0 ? dBBuilding.geofence_latitude : d5, (i & 128) != 0 ? dBBuilding.geofence_longitude : d6, (i & 256) != 0 ? dBBuilding.geofence_altitude : d7, (i & 512) != 0 ? dBBuilding.geofenceRadius : d8, (i & 1024) != 0 ? dBBuilding.primaryFloorId : str3, (i & 2048) != 0 ? dBBuilding.spaceId : str4, (i & 4096) != 0 ? dBBuilding.clientBuildingId : str5, (i & 8192) != 0 ? dBBuilding.displayName : str6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final double getGeofenceRadius() {
        return this.geofenceRadius;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getPrimaryFloorId() {
        return this.primaryFloorId;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getSpaceId() {
        return this.spaceId;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getClientBuildingId() {
        return this.clientBuildingId;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final double getRotation() {
        return this.rotation;
    }

    /* renamed from: component4, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component5, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component6, reason: from getter */
    public final double getAltitude() {
        return this.altitude;
    }

    /* renamed from: component7, reason: from getter */
    public final double getGeofence_latitude() {
        return this.geofence_latitude;
    }

    /* renamed from: component8, reason: from getter */
    public final double getGeofence_longitude() {
        return this.geofence_longitude;
    }

    /* renamed from: component9, reason: from getter */
    public final double getGeofence_altitude() {
        return this.geofence_altitude;
    }

    @NotNull
    public final DBBuilding copy(@NotNull String id, @NotNull String name, double rotation, double latitude, double longitude, double altitude, double geofence_latitude, double geofence_longitude, double geofence_altitude, double geofenceRadius, @NotNull String primaryFloorId, @NotNull String spaceId, @Nullable String clientBuildingId, @NotNull String displayName) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(primaryFloorId, "primaryFloorId");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(displayName, "displayName");
        return new DBBuilding(id, name, rotation, latitude, longitude, altitude, geofence_latitude, geofence_longitude, geofence_altitude, geofenceRadius, primaryFloorId, spaceId, clientBuildingId, displayName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DBBuilding)) {
            return false;
        }
        DBBuilding dBBuilding = (DBBuilding) other;
        return Intrinsics.c(this.id, dBBuilding.id) && Intrinsics.c(this.name, dBBuilding.name) && Double.compare(this.rotation, dBBuilding.rotation) == 0 && Double.compare(this.latitude, dBBuilding.latitude) == 0 && Double.compare(this.longitude, dBBuilding.longitude) == 0 && Double.compare(this.altitude, dBBuilding.altitude) == 0 && Double.compare(this.geofence_latitude, dBBuilding.geofence_latitude) == 0 && Double.compare(this.geofence_longitude, dBBuilding.geofence_longitude) == 0 && Double.compare(this.geofence_altitude, dBBuilding.geofence_altitude) == 0 && Double.compare(this.geofenceRadius, dBBuilding.geofenceRadius) == 0 && Intrinsics.c(this.primaryFloorId, dBBuilding.primaryFloorId) && Intrinsics.c(this.spaceId, dBBuilding.spaceId) && Intrinsics.c(this.clientBuildingId, dBBuilding.clientBuildingId) && Intrinsics.c(this.displayName, dBBuilding.displayName);
    }

    public final double getAltitude() {
        return this.altitude;
    }

    @Nullable
    public final String getClientBuildingId() {
        return this.clientBuildingId;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    public final double getGeofenceRadius() {
        return this.geofenceRadius;
    }

    public final double getGeofence_altitude() {
        return this.geofence_altitude;
    }

    public final double getGeofence_latitude() {
        return this.geofence_latitude;
    }

    public final double getGeofence_longitude() {
        return this.geofence_longitude;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPrimaryFloorId() {
        return this.primaryFloorId;
    }

    public final double getRotation() {
        return this.rotation;
    }

    @NotNull
    public final String getSpaceId() {
        return this.spaceId;
    }

    public int hashCode() {
        int iA = L.a(this.spaceId, L.a(this.primaryFloorId, a.a(this.geofenceRadius, a.a(this.geofence_altitude, a.a(this.geofence_longitude, a.a(this.geofence_latitude, a.a(this.altitude, a.a(this.longitude, a.a(this.latitude, a.a(this.rotation, L.a(this.name, this.id.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        String str = this.clientBuildingId;
        return this.displayName.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return StringsKt.n0("\n  |DBBuilding [\n  |  id: " + this.id + "\n  |  name: " + this.name + "\n  |  rotation: " + this.rotation + "\n  |  latitude: " + this.latitude + "\n  |  longitude: " + this.longitude + "\n  |  altitude: " + this.altitude + "\n  |  geofence_latitude: " + this.geofence_latitude + "\n  |  geofence_longitude: " + this.geofence_longitude + "\n  |  geofence_altitude: " + this.geofence_altitude + "\n  |  geofenceRadius: " + this.geofenceRadius + "\n  |  primaryFloorId: " + this.primaryFloorId + "\n  |  spaceId: " + this.spaceId + "\n  |  clientBuildingId: " + this.clientBuildingId + "\n  |  displayName: " + this.displayName + "\n  |]\n  ");
    }
}
