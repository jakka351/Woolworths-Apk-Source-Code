package me.oriient.ipssdk.realtime.ips.positioning;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.geofence.BuildingGeofenceManager;
import me.oriient.internal.services.geofence.GeofenceIntersectionCalculator;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/positioning/ManualPositioningGeofenceCheckerImpl;", "Lme/oriient/ipssdk/realtime/ips/positioning/ManualPositioningGeofenceChecker;", "<init>", "()V", "Lme/oriient/internal/services/dataManager/building/Building;", "building", "Lme/oriient/internal/infra/locationManager/SystemLocation;", "location", "", "canStartPositioning", "(Lme/oriient/internal/services/dataManager/building/Building;Lme/oriient/internal/infra/locationManager/SystemLocation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ManualPositioningGeofenceCheckerImpl implements ManualPositioningGeofenceChecker {

    @NotNull
    public static final String TAG = "ManualPositioningGeofenceChecker";

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f25886a;
    private final Lazy b;
    private final Lazy c;
    private final Lazy d;

    public ManualPositioningGeofenceCheckerImpl() {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f25886a = di.inject(reflectionFactory.b(BuildingGeofenceManager.class));
        this.b = DependencyInjectionKt.getDi().inject(reflectionFactory.b(GeofenceIntersectionCalculator.class));
        this.c = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RemoteConfigManager.class));
        this.d = DependencyInjectionKt.getDi().inject(reflectionFactory.b(Logger.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // me.oriient.ipssdk.realtime.ips.positioning.ManualPositioningGeofenceChecker
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object canStartPositioning(@org.jetbrains.annotations.NotNull me.oriient.internal.services.dataManager.building.Building r20, @org.jetbrains.annotations.Nullable me.oriient.internal.infra.locationManager.SystemLocation r21, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ips.positioning.ManualPositioningGeofenceCheckerImpl.canStartPositioning(me.oriient.internal.services.dataManager.building.Building, me.oriient.internal.infra.locationManager.SystemLocation, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
