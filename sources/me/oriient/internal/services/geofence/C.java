package me.oriient.internal.services.geofence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.locationManager.SystemLocation;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.dataManager.building.BuildingRepository;
import me.oriient.internal.services.dataManager.building.ExternalRegion;
import me.oriient.internal.services.dataManager.building.ExternalRegionPlacement;
import me.oriient.internal.services.dataManager.building.PolygonalExternalRegionPlacement;
import me.oriient.internal.services.dataManager.common.WorldCoordinateKt;
import me.oriient.internal.services.geofence.models.BuildingGeofenceStatus;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;

/* loaded from: classes7.dex */
public final class C implements y {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f25476a;
    public final Lazy b;

    public C() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f25476a = di.inject(reflectionFactory.b(BuildingRepository.class));
        this.b = InternalDiKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, me.oriient.internal.infra.locationManager.SystemLocation r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof me.oriient.internal.services.geofence.z
            if (r0 == 0) goto L13
            r0 = r7
            me.oriient.internal.services.geofence.z r0 = (me.oriient.internal.services.geofence.z) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            me.oriient.internal.services.geofence.z r0 = new me.oriient.internal.services.geofence.z
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            me.oriient.internal.infra.locationManager.SystemLocation r6 = r0.b
            me.oriient.internal.services.geofence.C r5 = r0.f25523a
            kotlin.ResultKt.b(r7)
            goto L4c
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.b(r7)
            kotlin.Lazy r7 = r4.f25476a
            java.lang.Object r7 = r7.getD()
            me.oriient.internal.services.dataManager.building.BuildingRepository r7 = (me.oriient.internal.services.dataManager.building.BuildingRepository) r7
            r0.f25523a = r4
            r0.b = r6
            r0.e = r3
            java.lang.Object r7 = r7.fetchBuilding(r5, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r5 = r4
        L4c:
            me.oriient.internal.infra.utils.core.Outcome r7 = (me.oriient.internal.infra.utils.core.Outcome) r7
            me.oriient.internal.services.geofence.A r0 = me.oriient.internal.services.geofence.A.f25474a
            me.oriient.internal.infra.utils.core.Outcome r7 = r7.map(r0)
            me.oriient.internal.services.geofence.B r0 = new me.oriient.internal.services.geofence.B
            r0.<init>(r5, r6)
            me.oriient.internal.infra.utils.core.Outcome r5 = r7.map(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.geofence.C.a(java.lang.String, me.oriient.internal.infra.locationManager.SystemLocation, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    public final BuildingGeofenceStatus a(GeofenceBuilding building, SystemLocation location) {
        PolygonalExternalRegionPlacement polygonalExternalRegionPlacement;
        PolygonalExternalRegionPlacement next;
        Intrinsics.h(building, "building");
        Intrinsics.h(location, "location");
        List<ExternalRegion> externalRegions = building.getExternalRegions();
        if (externalRegions != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = externalRegions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Iterator it2 = ((ExternalRegion) it.next()).getPlacements().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = 0;
                        break;
                    }
                    next = it2.next();
                    if (((ExternalRegionPlacement) next) instanceof PolygonalExternalRegionPlacement) {
                        break;
                    }
                }
                polygonalExternalRegionPlacement = next instanceof PolygonalExternalRegionPlacement ? next : null;
                if (polygonalExternalRegionPlacement != null) {
                    arrayList.add(polygonalExternalRegionPlacement);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                ?? next2 = it3.next();
                if (((PolygonalExternalRegionPlacement) next2).getPlacementFeatures().getCanStartPositioning()) {
                    polygonalExternalRegionPlacement = next2;
                    break;
                }
            }
            PolygonalExternalRegionPlacement polygonalExternalRegionPlacement2 = polygonalExternalRegionPlacement;
            if (polygonalExternalRegionPlacement2 != null) {
                if (WorldCoordinateKt.toWorldCoordinate(location).doesIntersectWithPolygon(polygonalExternalRegionPlacement2.getPlacementVertices(), location.getHorizontalAccuracy())) {
                    return new BuildingGeofenceStatus.Inside(((TimeProvider) this.b.getD()).getCurrentTimeMillis(), location);
                }
                return new BuildingGeofenceStatus.Outside(((TimeProvider) this.b.getD()).getCurrentTimeMillis(), location);
            }
        }
        return new BuildingGeofenceStatus.Undefined(((TimeProvider) this.b.getD()).getCurrentTimeMillis());
    }
}
