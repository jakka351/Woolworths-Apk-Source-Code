package me.oriient.ipssdk.common.ofs;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.geofence.models.BuildingGeofenceStatus;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfig;
import me.oriient.ipssdk.common.services.geofencing.LiveGeofenceManagerImpl;

/* loaded from: classes2.dex */
public final class U extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GeofenceBuilding f25732a;
    public final /* synthetic */ LiveGeofenceManagerImpl b;
    public final /* synthetic */ BuildingGeofenceStatus c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(GeofenceBuilding geofenceBuilding, LiveGeofenceManagerImpl liveGeofenceManagerImpl, BuildingGeofenceStatus buildingGeofenceStatus) {
        super(0);
        this.f25732a = geofenceBuilding;
        this.b = liveGeofenceManagerImpl;
        this.c = buildingGeofenceStatus;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("buildingId", this.f25732a.getId()), new Pair("usePolygonalGeofence", Boolean.valueOf(((RemoteConfig) LiveGeofenceManagerImpl.access$getConfigManager(this.b).getConfig().getValue()).getRealTime().getGeofence().getUsePolygonalGeofence())), new Pair("state", this.c.toShortDescription()));
    }
}
