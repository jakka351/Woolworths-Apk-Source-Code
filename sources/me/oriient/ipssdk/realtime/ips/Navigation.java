package me.oriient.ipssdk.realtime.ips;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.internal.ContextScope;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.ipssdk.api.listeners.IPSLiveNavigationListener;
import me.oriient.ipssdk.api.listeners.IPSRouteListener;
import me.oriient.ipssdk.api.models.IPSCancelable;
import me.oriient.ipssdk.api.models.IPSCoordinate;
import me.oriient.ipssdk.api.models.IPSWaypoint;
import me.oriient.ipssdk.api.utils.IPSNavigationOptions;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import me.oriient.ipssdk.common.utils.CancellableProcess;
import me.oriient.ipssdk.common.utils.models.Error;
import me.oriient.ipssdk.common.utils.runtimedata.CommonRuntimeDataProvider;
import me.oriient.ipssdk.realtime.ofs.D2;
import me.oriient.ipssdk.realtime.ofs.F2;
import me.oriient.ipssdk.realtime.ofs.H2;
import me.oriient.ipssdk.realtime.ofs.J2;
import me.oriient.ipssdk.realtime.ofs.L2;
import me.oriient.ipssdk.realtime.ofs.M2;
import me.oriient.ipssdk.realtime.ofs.N2;
import me.oriient.ipssdk.realtime.utils.models.Position;
import me.oriient.navigation.common.NavigationManager;
import me.oriient.navigation.turnByTurn.TurnByTurnNavigationManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001JE\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aR:\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u001b2\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R.\u0010*\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u00101\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00107\u001a\u0002028\u0006X\u0086D¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R$\u00108\u001a\u0002022\u0006\u0010\u001c\u001a\u0002028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00106\"\u0004\b9\u0010:R$\u0010;\u001a\u0002022\u0006\u0010\u001c\u001a\u0002028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u00106\"\u0004\b<\u0010:¨\u0006="}, d2 = {"Lme/oriient/ipssdk/realtime/ips/Navigation;", "", "", "buildingId", "Lme/oriient/ipssdk/api/utils/IPSNavigationOptions;", "options", "", "Lme/oriient/ipssdk/api/models/IPSWaypoint;", "waypoints", "finalWaypoint", "Lme/oriient/ipssdk/api/listeners/IPSRouteListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lme/oriient/ipssdk/api/models/IPSCancelable;", "findRouteInBuilding", "(Ljava/lang/String;Lme/oriient/ipssdk/api/utils/IPSNavigationOptions;Ljava/util/List;Lme/oriient/ipssdk/api/models/IPSWaypoint;Lme/oriient/ipssdk/api/listeners/IPSRouteListener;)Lme/oriient/ipssdk/api/models/IPSCancelable;", "Lme/oriient/ipssdk/api/listeners/IPSLiveNavigationListener;", "", "addLiveNavigationListener", "(Lme/oriient/ipssdk/api/listeners/IPSLiveNavigationListener;)V", "removeLiveNavigationListener", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "coordinate", "", "getAngleFromUserHeading", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;)D", "onUserLogout", "()V", "", "value", "a", "Ljava/util/List;", "getLiveNavigationWaypoints", "()Ljava/util/List;", "setLiveNavigationWaypoints", "(Ljava/util/List;)V", "liveNavigationWaypoints", "b", "Lme/oriient/ipssdk/api/models/IPSWaypoint;", "getLiveNavigationFinalWaypoint", "()Lme/oriient/ipssdk/api/models/IPSWaypoint;", "setLiveNavigationFinalWaypoint", "(Lme/oriient/ipssdk/api/models/IPSWaypoint;)V", "liveNavigationFinalWaypoint", "c", "Lme/oriient/ipssdk/api/utils/IPSNavigationOptions;", "getLiveNavigationOptions", "()Lme/oriient/ipssdk/api/utils/IPSNavigationOptions;", "setLiveNavigationOptions", "(Lme/oriient/ipssdk/api/utils/IPSNavigationOptions;)V", "liveNavigationOptions", "", "d", "Z", "getLimitedConnectionSupported", "()Z", "limitedConnectionSupported", "isLiveNavigationEnabled", "setLiveNavigationEnabled", "(Z)V", "isTurnByTurnNavigationEnabled", "setTurnByTurnNavigationEnabled", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class Navigation {

    /* renamed from: b, reason: from kotlin metadata */
    private static IPSWaypoint liveNavigationFinalWaypoint;

    /* renamed from: c, reason: from kotlin metadata */
    private static IPSNavigationOptions liveNavigationOptions;
    private static final Lazy e;
    private static final Lazy f;
    private static final Lazy g;
    private static final ArrayList h;
    private static final CoroutineScope i;

    @NotNull
    public static final Navigation INSTANCE = new Navigation();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static List liveNavigationWaypoints = new ArrayList();

    /* renamed from: d, reason: from kotlin metadata */
    private static final boolean limitedConnectionSupported = true;

    static {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        e = di.inject(reflectionFactory.b(RemoteConfigManager.class));
        f = DependencyInjectionKt.getDi().inject(reflectionFactory.b(NavigationManager.class));
        g = DependencyInjectionKt.getDi().inject(reflectionFactory.b(TurnByTurnNavigationManager.class));
        Lazy lazyInject = DependencyInjectionKt.getDi().inject(reflectionFactory.b(CoroutineContextProvider.class));
        h = new ArrayList();
        ContextScope contextScopeA = CoroutineScopeKt.a(((CoroutineContextProvider) lazyInject.getD()).getDefault());
        i = contextScopeA;
        BuildersKt.c(contextScopeA, null, null, new D2(null), 3);
        BuildersKt.c(contextScopeA, null, null, new F2(null), 3);
        BuildersKt.c(contextScopeA, null, null, new H2(null), 3);
        BuildersKt.c(contextScopeA, null, null, new J2(null), 3);
        BuildersKt.c(contextScopeA, null, null, new L2(null), 3);
    }

    private Navigation() {
    }

    public static final RemoteConfigManager access$getConfigManager(Navigation navigation) {
        navigation.getClass();
        return (RemoteConfigManager) e.getD();
    }

    public static final NavigationManager access$getNavigationManager(Navigation navigation) {
        navigation.getClass();
        return (NavigationManager) f.getD();
    }

    public static final TurnByTurnNavigationManager access$getTurnByTurnNavigationManager(Navigation navigation) {
        navigation.getClass();
        return (TurnByTurnNavigationManager) g.getD();
    }

    public static /* synthetic */ IPSCancelable findRouteInBuilding$default(Navigation navigation, String str, IPSNavigationOptions iPSNavigationOptions, List list, IPSWaypoint iPSWaypoint, IPSRouteListener iPSRouteListener, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            iPSWaypoint = null;
        }
        return navigation.findRouteInBuilding(str, iPSNavigationOptions, list, iPSWaypoint, iPSRouteListener);
    }

    public final void addLiveNavigationListener(@NotNull IPSLiveNavigationListener listener) {
        Intrinsics.h(listener, "listener");
        h.add(listener);
    }

    @Nullable
    public final IPSCancelable findRouteInBuilding(@NotNull String buildingId, @Nullable IPSNavigationOptions options, @NotNull List<? extends IPSWaypoint> waypoints, @Nullable IPSWaypoint finalWaypoint, @Nullable IPSRouteListener listener) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(waypoints, "waypoints");
        if (((CommonRuntimeDataProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(CommonRuntimeDataProvider.class))).getF25787a() != null) {
            return new CancellableProcess(BuildersKt.c(i, null, null, new M2(buildingId, waypoints, finalWaypoint, listener, null), 3));
        }
        if (listener != null) {
            listener.onError(new Error("Not logged in", 3, 0));
        }
        return null;
    }

    public final double getAngleFromUserHeading(@Nullable IPSCoordinate coordinate) {
        Position lastKnownLockedPosition = Positioning.INSTANCE.getLastKnownLockedPosition();
        if (coordinate == null || lastKnownLockedPosition == null) {
            return 0.0d;
        }
        double f26195a = lastKnownLockedPosition.getD().getF26195a() + lastKnownLockedPosition.getD();
        return Math.toDegrees(Math.atan2((lastKnownLockedPosition.getD().getB() + lastKnownLockedPosition.getE()) - lastKnownLockedPosition.getE(), f26195a - lastKnownLockedPosition.getD())) - Math.toDegrees(Math.atan2(coordinate.getE() - lastKnownLockedPosition.getE(), coordinate.getD() - lastKnownLockedPosition.getD()));
    }

    public final boolean getLimitedConnectionSupported() {
        return limitedConnectionSupported;
    }

    @Nullable
    public final IPSWaypoint getLiveNavigationFinalWaypoint() {
        return liveNavigationFinalWaypoint;
    }

    @Nullable
    public final IPSNavigationOptions getLiveNavigationOptions() {
        return liveNavigationOptions;
    }

    @NotNull
    public final List<? extends IPSWaypoint> getLiveNavigationWaypoints() {
        return liveNavigationWaypoints;
    }

    public final boolean isLiveNavigationEnabled() {
        return ((NavigationManager) f.getD()).get_isLiveNavigationEnabled();
    }

    public final boolean isTurnByTurnNavigationEnabled() {
        return ((TurnByTurnNavigationManager) g.getD()).get_isEnabled();
    }

    public final void onUserLogout() {
        BuildersKt.c(i, null, null, new N2(null), 3);
    }

    public final void removeLiveNavigationListener(@NotNull IPSLiveNavigationListener listener) {
        Intrinsics.h(listener, "listener");
        h.remove(listener);
    }

    public final void setLiveNavigationEnabled(boolean z) {
        ((NavigationManager) f.getD()).setLiveNavigationEnabled(z);
    }

    public final void setLiveNavigationFinalWaypoint(@Nullable IPSWaypoint iPSWaypoint) {
        liveNavigationFinalWaypoint = iPSWaypoint;
        ((NavigationManager) f.getD()).setLiveFinalWaypoint(iPSWaypoint != null ? NavigationExtKt.toNavigationWaypoint(iPSWaypoint) : null);
    }

    public final void setLiveNavigationOptions(@Nullable IPSNavigationOptions iPSNavigationOptions) {
        liveNavigationOptions = iPSNavigationOptions;
    }

    public final void setLiveNavigationWaypoints(@NotNull List<? extends IPSWaypoint> value) {
        Intrinsics.h(value, "value");
        liveNavigationWaypoints = value;
        NavigationManager navigationManager = (NavigationManager) f.getD();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(value, 10));
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            arrayList.add(NavigationExtKt.toNavigationWaypoint((IPSWaypoint) it.next()));
        }
        navigationManager.setLiveNavigationWaypoints(arrayList);
    }

    public final void setTurnByTurnNavigationEnabled(boolean z) {
        ((TurnByTurnNavigationManager) g.getD()).setEnabled(z);
    }
}
