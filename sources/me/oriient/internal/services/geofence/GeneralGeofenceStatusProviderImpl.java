package me.oriient.internal.services.geofence;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.locationManager.SystemLocation;
import me.oriient.internal.infra.utils.android.AndroidPermissionManager;
import me.oriient.internal.services.geofence.GeneralGeofenceStatus;
import me.oriient.internal.services.geofence.models.BuildingGeofenceStatus;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0015\u001a\u00020\u00072\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lme/oriient/internal/services/geofence/GeneralGeofenceStatusProviderImpl;", "Lme/oriient/internal/services/geofence/GeneralGeofenceStatusProvider;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "currentStatus", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lme/oriient/internal/services/geofence/GeneralGeofenceStatus;", "getCurrentStatus", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "geofenceManager", "Lme/oriient/internal/services/geofence/BuildingGeofenceManager;", "getGeofenceManager", "()Lme/oriient/internal/services/geofence/BuildingGeofenceManager;", "geofenceManager$delegate", "Lkotlin/Lazy;", "permissionManager", "Lme/oriient/internal/infra/utils/android/AndroidPermissionManager;", "getPermissionManager", "()Lme/oriient/internal/infra/utils/android/AndroidPermissionManager;", "permissionManager$delegate", "convertBuildingStatusToGeneralStatus", "status", "", "Lme/oriient/internal/services/geofence/models/GeofenceBuilding;", "Lme/oriient/internal/services/geofence/models/BuildingGeofenceStatus;", "isPolygonal", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class GeneralGeofenceStatusProviderImpl implements GeneralGeofenceStatusProvider {

    @NotNull
    private final MutableStateFlow<GeneralGeofenceStatus> currentStatus;

    /* renamed from: geofenceManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy geofenceManager;

    /* renamed from: permissionManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy permissionManager;

    public GeneralGeofenceStatusProviderImpl(@NotNull CoroutineScope scope) {
        Intrinsics.h(scope, "scope");
        this.currentStatus = StateFlowKt.a(GeneralGeofenceStatus.Undefined.INSTANCE);
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.geofenceManager = di.inject(reflectionFactory.b(BuildingGeofenceManager.class));
        this.permissionManager = InternalDiKt.getDi().inject(reflectionFactory.b(AndroidPermissionManager.class));
        BuildersKt.c(scope, null, null, new w(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9 */
    public final GeneralGeofenceStatus convertBuildingStatusToGeneralStatus(Map<GeofenceBuilding, ? extends BuildingGeofenceStatus> status, boolean isPolygonal) {
        Pair pair;
        GeofenceBuilding key;
        Pair pair2;
        Iterator<Map.Entry<GeofenceBuilding, ? extends BuildingGeofenceStatus>> it = status.entrySet().iterator();
        while (true) {
            pair = null;
            if (!it.hasNext()) {
                key = null;
                break;
            }
            Map.Entry<GeofenceBuilding, ? extends BuildingGeofenceStatus> next = it.next();
            BuildingGeofenceStatus value = next.getValue();
            if (value instanceof BuildingGeofenceStatus.Inside) {
                key = next.getKey();
            } else {
                if (!(value instanceof BuildingGeofenceStatus.Outside) && !(value instanceof BuildingGeofenceStatus.Undefined)) {
                    throw new NoWhenBranchMatchedException();
                }
                key = null;
            }
            if (key != null) {
                break;
            }
        }
        if (key != null) {
            return isPolygonal ? new GeneralGeofenceStatus.InsidePolygon(key) : new GeneralGeofenceStatus.InsideCircle(key);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<GeofenceBuilding, ? extends BuildingGeofenceStatus> entry : status.entrySet()) {
            BuildingGeofenceStatus value2 = entry.getValue();
            if (!(value2 instanceof BuildingGeofenceStatus.Inside)) {
                if (value2 instanceof BuildingGeofenceStatus.Outside) {
                    SystemLocation location = ((BuildingGeofenceStatus.Outside) value2).getLocation();
                    pair2 = location != null ? new Pair(entry.getKey(), Double.valueOf(location.distanceTo(entry.getKey().getGeofenceOrigin().getLatitude(), entry.getKey().getGeofenceOrigin().getLongitude()))) : null;
                } else if (!(value2 instanceof BuildingGeofenceStatus.Undefined)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (pair2 != null) {
                arrayList.add(pair2);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            ?? next2 = it2.next();
            if (it2.hasNext()) {
                double dDoubleValue = ((Number) ((Pair) next2).e).doubleValue();
                do {
                    Object next3 = it2.next();
                    double dDoubleValue2 = ((Number) ((Pair) next3).e).doubleValue();
                    next2 = next2;
                    if (Double.compare(dDoubleValue, dDoubleValue2) > 0) {
                        next2 = next3;
                        dDoubleValue = dDoubleValue2;
                    }
                } while (it2.hasNext());
            }
            pair = next2;
        }
        Pair pair3 = pair;
        if (pair3 == null) {
            return GeneralGeofenceStatus.FarAway.INSTANCE;
        }
        Object obj = pair3.d;
        Object obj2 = pair3.e;
        return ((Number) obj2).doubleValue() < 1000.0d ? new GeneralGeofenceStatus.HundredMetersAway((GeofenceBuilding) obj) : ((Number) obj2).doubleValue() < 10000.0d ? new GeneralGeofenceStatus.KilometersAway((GeofenceBuilding) obj) : GeneralGeofenceStatus.FarAway.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BuildingGeofenceManager getGeofenceManager() {
        return (BuildingGeofenceManager) this.geofenceManager.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AndroidPermissionManager getPermissionManager() {
        return (AndroidPermissionManager) this.permissionManager.getD();
    }

    @Override // me.oriient.internal.services.geofence.GeneralGeofenceStatusProvider
    @NotNull
    public MutableStateFlow<GeneralGeofenceStatus> getCurrentStatus() {
        return this.currentStatus;
    }
}
