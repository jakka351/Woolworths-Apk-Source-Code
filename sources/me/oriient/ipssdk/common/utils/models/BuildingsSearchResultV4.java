package me.oriient.ipssdk.common.utils.models;

import android.support.v4.media.session.a;
import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.common.ofs.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003Je\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006."}, d2 = {"Lme/oriient/ipssdk/common/utils/models/BuildingsSearchResultV4;", "Lme/oriient/ipssdk/common/utils/models/PostProcessable;", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "rotation", "", "buildingOrigin", "Lme/oriient/ipssdk/common/utils/models/WorldCoordinate;", "geofenceOrigin", "geofenceRadius", "", "primaryFloorId", "clientBuildingId", "displayName", "(Ljava/lang/String;Ljava/lang/String;DLme/oriient/ipssdk/common/utils/models/WorldCoordinate;Lme/oriient/ipssdk/common/utils/models/WorldCoordinate;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBuildingOrigin", "()Lme/oriient/ipssdk/common/utils/models/WorldCoordinate;", "getClientBuildingId", "()Ljava/lang/String;", "getDisplayName", "getGeofenceOrigin", "getGeofenceRadius", "()F", "getId", "getName", "getPrimaryFloorId", "getRotation", "()D", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BuildingsSearchResultV4 implements PostProcessable {

    @NotNull
    private final WorldCoordinate buildingOrigin;

    @Nullable
    private final String clientBuildingId;

    @NotNull
    private final String displayName;

    @NotNull
    private final WorldCoordinate geofenceOrigin;
    private final float geofenceRadius;

    @NotNull
    private final String id;

    @NotNull
    private final String name;

    @NotNull
    private final String primaryFloorId;
    private final double rotation;

    public BuildingsSearchResultV4(@NotNull String id, @NotNull String name, double d, @NotNull WorldCoordinate buildingOrigin, @NotNull WorldCoordinate geofenceOrigin, float f, @NotNull String primaryFloorId, @Nullable String str, @NotNull String displayName) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(buildingOrigin, "buildingOrigin");
        Intrinsics.h(geofenceOrigin, "geofenceOrigin");
        Intrinsics.h(primaryFloorId, "primaryFloorId");
        Intrinsics.h(displayName, "displayName");
        this.id = id;
        this.name = name;
        this.rotation = d;
        this.buildingOrigin = buildingOrigin;
        this.geofenceOrigin = geofenceOrigin;
        this.geofenceRadius = f;
        this.primaryFloorId = primaryFloorId;
        this.clientBuildingId = str;
        this.displayName = displayName;
    }

    public static /* synthetic */ BuildingsSearchResultV4 copy$default(BuildingsSearchResultV4 buildingsSearchResultV4, String str, String str2, double d, WorldCoordinate worldCoordinate, WorldCoordinate worldCoordinate2, float f, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buildingsSearchResultV4.id;
        }
        if ((i & 2) != 0) {
            str2 = buildingsSearchResultV4.name;
        }
        if ((i & 4) != 0) {
            d = buildingsSearchResultV4.rotation;
        }
        if ((i & 8) != 0) {
            worldCoordinate = buildingsSearchResultV4.buildingOrigin;
        }
        if ((i & 16) != 0) {
            worldCoordinate2 = buildingsSearchResultV4.geofenceOrigin;
        }
        if ((i & 32) != 0) {
            f = buildingsSearchResultV4.geofenceRadius;
        }
        if ((i & 64) != 0) {
            str3 = buildingsSearchResultV4.primaryFloorId;
        }
        if ((i & 128) != 0) {
            str4 = buildingsSearchResultV4.clientBuildingId;
        }
        if ((i & 256) != 0) {
            str5 = buildingsSearchResultV4.displayName;
        }
        String str6 = str4;
        String str7 = str5;
        double d2 = d;
        return buildingsSearchResultV4.copy(str, str2, d2, worldCoordinate, worldCoordinate2, f, str3, str6, str7);
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

    /* renamed from: component3, reason: from getter */
    public final double getRotation() {
        return this.rotation;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final WorldCoordinate getBuildingOrigin() {
        return this.buildingOrigin;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final WorldCoordinate getGeofenceOrigin() {
        return this.geofenceOrigin;
    }

    /* renamed from: component6, reason: from getter */
    public final float getGeofenceRadius() {
        return this.geofenceRadius;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getPrimaryFloorId() {
        return this.primaryFloorId;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getClientBuildingId() {
        return this.clientBuildingId;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final BuildingsSearchResultV4 copy(@NotNull String id, @NotNull String name, double rotation, @NotNull WorldCoordinate buildingOrigin, @NotNull WorldCoordinate geofenceOrigin, float geofenceRadius, @NotNull String primaryFloorId, @Nullable String clientBuildingId, @NotNull String displayName) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(buildingOrigin, "buildingOrigin");
        Intrinsics.h(geofenceOrigin, "geofenceOrigin");
        Intrinsics.h(primaryFloorId, "primaryFloorId");
        Intrinsics.h(displayName, "displayName");
        return new BuildingsSearchResultV4(id, name, rotation, buildingOrigin, geofenceOrigin, geofenceRadius, primaryFloorId, clientBuildingId, displayName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuildingsSearchResultV4)) {
            return false;
        }
        BuildingsSearchResultV4 buildingsSearchResultV4 = (BuildingsSearchResultV4) other;
        return Intrinsics.c(this.id, buildingsSearchResultV4.id) && Intrinsics.c(this.name, buildingsSearchResultV4.name) && Double.compare(this.rotation, buildingsSearchResultV4.rotation) == 0 && Intrinsics.c(this.buildingOrigin, buildingsSearchResultV4.buildingOrigin) && Intrinsics.c(this.geofenceOrigin, buildingsSearchResultV4.geofenceOrigin) && Float.compare(this.geofenceRadius, buildingsSearchResultV4.geofenceRadius) == 0 && Intrinsics.c(this.primaryFloorId, buildingsSearchResultV4.primaryFloorId) && Intrinsics.c(this.clientBuildingId, buildingsSearchResultV4.clientBuildingId) && Intrinsics.c(this.displayName, buildingsSearchResultV4.displayName);
    }

    @NotNull
    public final WorldCoordinate getBuildingOrigin() {
        return this.buildingOrigin;
    }

    @Nullable
    public final String getClientBuildingId() {
        return this.clientBuildingId;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final WorldCoordinate getGeofenceOrigin() {
        return this.geofenceOrigin;
    }

    public final float getGeofenceRadius() {
        return this.geofenceRadius;
    }

    @NotNull
    public final String getId() {
        return this.id;
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

    public int hashCode() {
        int iA = L.a(this.primaryFloorId, a.b(this.geofenceRadius, (this.geofenceOrigin.hashCode() + ((this.buildingOrigin.hashCode() + a.a(this.rotation, L.a(this.name, this.id.hashCode() * 31, 31), 31)) * 31)) * 31, 31), 31);
        String str = this.clientBuildingId;
        return this.displayName.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BuildingsSearchResultV4(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", rotation=");
        sb.append(this.rotation);
        sb.append(", buildingOrigin=");
        sb.append(this.buildingOrigin);
        sb.append(", geofenceOrigin=");
        sb.append(this.geofenceOrigin);
        sb.append(", geofenceRadius=");
        sb.append(this.geofenceRadius);
        sb.append(", primaryFloorId=");
        sb.append(this.primaryFloorId);
        sb.append(", clientBuildingId=");
        sb.append(this.clientBuildingId);
        sb.append(", displayName=");
        return b.r(sb, this.displayName, ')');
    }
}
