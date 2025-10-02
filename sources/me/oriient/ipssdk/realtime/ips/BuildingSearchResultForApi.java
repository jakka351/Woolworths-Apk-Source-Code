package me.oriient.ipssdk.realtime.ips;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.api.models.IPSBuildingsSearchResult;
import me.oriient.ipssdk.api.models.IPSGlobalCoordinate;
import me.oriient.ipssdk.common.utils.models.BuildingsSearchResultV4;
import me.oriient.ipssdk.common.utils.models.WorldCoordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005BS\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u0018J\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u0015J\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\u0015J\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\u0015¨\u0006!"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/BuildingSearchResultForApi;", "Lme/oriient/ipssdk/api/models/IPSBuildingsSearchResult;", "Lme/oriient/ipssdk/common/utils/models/BuildingsSearchResultV4;", "buildingsSearchResult", "<init>", "(Lme/oriient/ipssdk/common/utils/models/BuildingsSearchResultV4;)V", "", "id", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "rotation", "Lme/oriient/ipssdk/common/utils/models/WorldCoordinate;", "buildingOrigin", "geofenceOrigin", "", "geofenceRadius", "primaryFloorId", "clientBuildingId", "displayName", "(Ljava/lang/String;Ljava/lang/String;DLme/oriient/ipssdk/common/utils/models/WorldCoordinate;Lme/oriient/ipssdk/common/utils/models/WorldCoordinate;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getLatitude", "()D", "getLongitude", "Lme/oriient/ipssdk/api/models/IPSGlobalCoordinate;", "getGeofenceOrigin", "()Lme/oriient/ipssdk/api/models/IPSGlobalCoordinate;", "getGeofenceRadius", "getClientBuildingId", "getDisplayName", "toString", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BuildingSearchResultForApi implements IPSBuildingsSearchResult {

    /* renamed from: a, reason: collision with root package name */
    private final BuildingsSearchResultV4 f25812a;
    private final String b;
    private final String c;
    private final double d;
    private final double e;
    private final double f;
    private final WorldCoordinate g;

    public BuildingSearchResultForApi(@NotNull BuildingsSearchResultV4 buildingsSearchResult) {
        Intrinsics.h(buildingsSearchResult, "buildingsSearchResult");
        this.f25812a = buildingsSearchResult;
        this.b = buildingsSearchResult.getId();
        this.c = buildingsSearchResult.getName();
        this.d = buildingsSearchResult.getBuildingOrigin().getLatitude();
        this.e = buildingsSearchResult.getBuildingOrigin().getLongitude();
        this.f = buildingsSearchResult.getGeofenceRadius();
        this.g = buildingsSearchResult.getGeofenceOrigin();
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuildingsSearchResult
    @Nullable
    public String getClientBuildingId() {
        return this.f25812a.getClientBuildingId();
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuildingsSearchResult
    @NotNull
    public String getDisplayName() {
        return this.f25812a.getDisplayName();
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuildingsSearchResult
    @NotNull
    public IPSGlobalCoordinate getGeofenceOrigin() {
        return this.g;
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuildingsSearchResult
    /* renamed from: getGeofenceRadius, reason: from getter */
    public double getF() {
        return this.f;
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuildingsSearchResult
    @NotNull
    /* renamed from: getId, reason: from getter */
    public String getB() {
        return this.b;
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuildingsSearchResult
    /* renamed from: getLatitude, reason: from getter */
    public double getD() {
        return this.d;
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuildingsSearchResult
    /* renamed from: getLongitude, reason: from getter */
    public double getE() {
        return this.e;
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuildingsSearchResult
    @NotNull
    /* renamed from: getName, reason: from getter */
    public String getC() {
        return this.c;
    }

    @NotNull
    public String toString() {
        return "BuildingSearchResultForApi(id='" + this.b + "', name='" + this.c + "', latitude=" + this.d + ", longitude=" + this.e + ", geofenceRadius=" + this.f + ", geofenceOrigin=" + this.g + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuildingSearchResultForApi(@NotNull String id, @NotNull String name, double d, @NotNull WorldCoordinate buildingOrigin, @NotNull WorldCoordinate geofenceOrigin, float f, @NotNull String primaryFloorId, @Nullable String str, @NotNull String displayName) {
        this(new BuildingsSearchResultV4(id, name, d, buildingOrigin, geofenceOrigin, f, primaryFloorId, str, displayName));
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(buildingOrigin, "buildingOrigin");
        Intrinsics.h(geofenceOrigin, "geofenceOrigin");
        Intrinsics.h(primaryFloorId, "primaryFloorId");
        Intrinsics.h(displayName, "displayName");
    }
}
