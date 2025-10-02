package me.oriient.ipssdk.realtime.ips.proximity.local;

import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityLocationDefinition;
import me.oriient.ipssdk.realtime.ofs.P4;
import me.oriient.navigation.common.NavigationManager;
import me.oriient.navigation.common.models.NavigationCoordinateInBuilding;
import me.oriient.navigation.common.models.NavigationWaypoint;
import me.oriient.navigation.common.models.Route;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/local/WalkingDistanceLocalProximityLocationResolver;", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationResolver;", "", "buildingId", "", "floorOrder", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition$WalkingDistance;", "locationDefinition", "<init>", "(Ljava/lang/String;ILme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition$WalkingDistance;)V", "Lme/oriient/positioningengine/common/PositioningUpdate;", "position", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Lme/oriient/ipssdk/base/utils/SdkError;", "isPositionInside", "(Lme/oriient/positioningengine/common/PositioningUpdate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "me/oriient/ipssdk/realtime/ofs/P4", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class WalkingDistanceLocalProximityLocationResolver implements LocalProximityLocationResolver {

    @NotNull
    private static final P4 Companion = new P4();

    /* renamed from: a, reason: collision with root package name */
    private final String f25903a;
    private final int b;
    private final LocalProximityLocationDefinition.WalkingDistance c;
    private final Lazy d;
    private final Lazy e;
    private final Lazy f;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointProximityEventAreaRadius.values().length];
            try {
                iArr[PointProximityEventAreaRadius.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointProximityEventAreaRadius.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointProximityEventAreaRadius.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public WalkingDistanceLocalProximityLocationResolver(@NotNull String buildingId, int i, @NotNull LocalProximityLocationDefinition.WalkingDistance locationDefinition) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(locationDefinition, "locationDefinition");
        this.f25903a = buildingId;
        this.b = i;
        this.c = locationDefinition;
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.d = di.inject(reflectionFactory.b(Logger.class));
        this.e = DependencyInjectionKt.getDi().inject(reflectionFactory.b(NavigationManager.class));
        this.f = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RemoteConfigManager.class));
    }

    private final double a() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.c.getDistanceLimit().ordinal()];
        if (i == 1) {
            return ((RemoteConfigManager) this.f.getD()).getRealTimeConfig().getProximityConfig().getCloseWalkingDistanceMeters();
        }
        if (i == 2) {
            return ((RemoteConfigManager) this.f.getD()).getRealTimeConfig().getProximityConfig().getMediumWalkingDistanceMeters();
        }
        if (i == 3) {
            return ((RemoteConfigManager) this.f.getD()).getRealTimeConfig().getProximityConfig().getLongWalkingDistanceMeters();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Logger access$getLogger(WalkingDistanceLocalProximityLocationResolver walkingDistanceLocalProximityLocationResolver) {
        return (Logger) walkingDistanceLocalProximityLocationResolver.d.getD();
    }

    public static final boolean access$onRouteReceived(WalkingDistanceLocalProximityLocationResolver walkingDistanceLocalProximityLocationResolver, Route route, String str) {
        ((Logger) walkingDistanceLocalProximityLocationResolver.d.getD()).d("WalkingDistanceLocalPro", "onRouteReceived() called with: route = " + route + ", toId = " + str);
        Iterator<NavigationWaypoint> it = route.getWaypoints().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.c(it.next().getId(), str)) {
                break;
            }
            i++;
        }
        if (i < 0) {
            ((Logger) walkingDistanceLocalProximityLocationResolver.d.getD()).w("WalkingDistanceLocalPro", "onRouteReceived: couldn't find index for the center of the event");
            return false;
        }
        double dDoubleValue = route.getDistancesFromStartToWaypoints().get(i).doubleValue();
        if (route.getCoordinatesToFirstWaypoint().size() >= 3) {
            double dPlainDistanceTo = ((NavigationCoordinateInBuilding) CollectionsKt.O(route.getCoordinatesToFirstWaypoint())).getCoordinate().plainDistanceTo(route.getCoordinatesToFirstWaypoint().get(route.getCoordinatesToFirstWaypoint().size() - 2).getCoordinate());
            if (dPlainDistanceTo <= ((RemoteConfigManager) walkingDistanceLocalProximityLocationResolver.f.getD()).getRealTimeConfig().getTurnByTurnConfig().getLastUnnecessaryDistanceTurnInMeters()) {
                ((Logger) walkingDistanceLocalProximityLocationResolver.d.getD()).d("WalkingDistanceLocalPro", "onRouteReceived: cutting last distance");
                dDoubleValue -= dPlainDistanceTo;
            }
        }
        Logger logger = (Logger) walkingDistanceLocalProximityLocationResolver.d.getD();
        StringBuilder sbN = androidx.constraintlayout.core.state.a.n(dDoubleValue, "distance - ", ", distanceLimit - ");
        sbN.append(walkingDistanceLocalProximityLocationResolver.a());
        logger.d("WalkingDistanceLocalPro", sbN.toString());
        return dDoubleValue <= walkingDistanceLocalProximityLocationResolver.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityLocationResolver
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object isPositionInside(@org.jetbrains.annotations.NotNull me.oriient.positioningengine.common.PositioningUpdate r25, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<java.lang.Boolean, me.oriient.ipssdk.base.utils.SdkError>> r26) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ips.proximity.local.WalkingDistanceLocalProximityLocationResolver.isPositionInside(me.oriient.positioningengine.common.PositioningUpdate, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
