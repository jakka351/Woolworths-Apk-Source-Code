package me.oriient.ipssdk.realtime.ips.positioning;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.dataManager.building.BuildingRepository;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.geofence.BuildingGeofenceManager;
import me.oriient.ipssdk.api.listeners.IPSPositioningListener;
import me.oriient.ipssdk.api.models.IPSBuilding;
import me.oriient.ipssdk.api.models.IPSFloor;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.realtime.ofs.AbstractC1685m0;
import me.oriient.ipssdk.realtime.ofs.C1650g1;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;
import me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\r8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u0019"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/positioning/CurrentBuildingAndFloor;", "", "", "Lme/oriient/ipssdk/api/listeners/IPSPositioningListener;", "listeners", "Lkotlinx/coroutines/CoroutineScope;", "scope", "<init>", "(Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "newListenerAdded", "(Lme/oriient/ipssdk/api/listeners/IPSPositioningListener;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lme/oriient/ipssdk/api/models/IPSBuilding;", "g", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getCurrentBuilding", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "currentBuilding", "Lme/oriient/ipssdk/api/models/IPSFloor;", "h", "getCurrentFloor", "currentFloor", "Companion", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CurrentBuildingAndFloor {
    private static final String i = "CurrentBuildingAndFloor";

    /* renamed from: a, reason: collision with root package name */
    private final List f25885a;
    private final Lazy b;
    private final Lazy c;
    private final Lazy d;
    private final Lazy e;
    private final Lazy f;

    /* renamed from: g, reason: from kotlin metadata */
    private final MutableStateFlow currentBuilding;

    /* renamed from: h, reason: from kotlin metadata */
    private final MutableStateFlow currentFloor;

    public CurrentBuildingAndFloor(@NotNull List<? extends IPSPositioningListener> listeners, @NotNull CoroutineScope scope) {
        Intrinsics.h(listeners, "listeners");
        Intrinsics.h(scope, "scope");
        this.f25885a = listeners;
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.b = di.inject(reflectionFactory.b(BuildingGeofenceManager.class));
        this.c = DependencyInjectionKt.getDi().inject(reflectionFactory.b(SupportPositioningEngineManager.class));
        this.d = DependencyInjectionKt.getDi().inject(reflectionFactory.b(BuildingRepository.class));
        this.e = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.f = DependencyInjectionKt.getDi().inject(reflectionFactory.b(Logger.class));
        this.currentBuilding = StateFlowKt.a(null);
        this.currentFloor = StateFlowKt.a(null);
        BuildersKt.c(scope, null, null, new C1650g1(this, null), 3);
    }

    public static final SupportPositioningEngineManager access$getEngineManager(CurrentBuildingAndFloor currentBuildingAndFloor) {
        return (SupportPositioningEngineManager) currentBuildingAndFloor.c.getD();
    }

    public static final BuildingGeofenceManager access$getGeofenceManager(CurrentBuildingAndFloor currentBuildingAndFloor) {
        return (BuildingGeofenceManager) currentBuildingAndFloor.b.getD();
    }

    public static final void access$handleFloorChange(CurrentBuildingAndFloor currentBuildingAndFloor, MappingData.Building.BuildingInfo.FloorMetadata floorMetadata) {
        MutableStateFlow mutableStateFlow = currentBuildingAndFloor.currentFloor;
        IPSBuilding iPSBuilding = (IPSBuilding) currentBuildingAndFloor.currentBuilding.getValue();
        mutableStateFlow.setValue(iPSBuilding != null ? iPSBuilding.getFloorById(floorMetadata.getFloorId()) : null);
        Logger logger = (Logger) currentBuildingAndFloor.f.getD();
        String str = i;
        StringBuilder sbA = AbstractC1685m0.a(str, "TAG", "New floor detected id = ");
        sbA.append(currentBuildingAndFloor.currentFloor.getValue());
        logger.e(str, sbA.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$handleGeofenceInside(me.oriient.ipssdk.realtime.ips.positioning.CurrentBuildingAndFloor r6, me.oriient.positioningengine.common.PositioningEngineState r7, java.util.Map r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ips.positioning.CurrentBuildingAndFloor.access$handleGeofenceInside(me.oriient.ipssdk.realtime.ips.positioning.CurrentBuildingAndFloor, me.oriient.positioningengine.common.PositioningEngineState, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final MutableStateFlow<IPSBuilding> getCurrentBuilding() {
        return this.currentBuilding;
    }

    @NotNull
    public final MutableStateFlow<IPSFloor> getCurrentFloor() {
        return this.currentFloor;
    }

    public final void newListenerAdded(@NotNull IPSPositioningListener listener) {
        Intrinsics.h(listener, "listener");
        IPSBuilding iPSBuilding = (IPSBuilding) this.currentBuilding.getValue();
        if (iPSBuilding != null) {
            listener.onBuildingChanged(iPSBuilding);
        }
        IPSFloor iPSFloor = (IPSFloor) this.currentFloor.getValue();
        if (iPSFloor != null) {
            listener.onFloorChanged(iPSFloor);
        }
    }
}
