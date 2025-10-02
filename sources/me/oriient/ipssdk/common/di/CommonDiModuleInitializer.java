package me.oriient.ipssdk.common.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.networkManager.NetworkManager;
import me.oriient.internal.infra.rest.RestRequestsReporter;
import me.oriient.internal.infra.rest.RestService;
import me.oriient.internal.infra.utils.android.HandlerFactory;
import me.oriient.internal.infra.utils.android.WakeLockFactory;
import me.oriient.internal.infra.utils.android.appState.AppStateProvider;
import me.oriient.internal.infra.utils.core.BuildData;
import me.oriient.internal.infra.utils.core.DeviceIdProvider;
import me.oriient.internal.infra.utils.core.OsData;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.auth.UnauthenticatedRestService;
import me.oriient.internal.services.cachedDataProvider.CachedDataProviderFactory;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.elog.Metric;
import me.oriient.internal.services.geofence.GeneralGeofenceStatusProvider;
import me.oriient.internal.services.runtimeDataProvider.RuntimeDataManager;
import me.oriient.internal.services.runtimeDataProvider.RuntimeDataProvider;
import me.oriient.internal.services.sensorsManager.SystemSensorManager;
import me.oriient.internal.services.sensorsManager.TimeJumpReporter;
import me.oriient.internal.services.sensorsManager.support.SensorsDataProviderFactory;
import me.oriient.internal.services.sensorsManager.support.SensorsManagerMetadataProvider;
import me.oriient.internal.services.sensorsManager.support.SupportSensorsManager;
import me.oriient.ipssdk.base.di.BaseDiKt;
import me.oriient.ipssdk.base.di.DiModuleInitializer;
import me.oriient.ipssdk.common.ips.EmptyTimeJumpReporter;
import me.oriient.ipssdk.common.ofs.A;
import me.oriient.ipssdk.common.ofs.B;
import me.oriient.ipssdk.common.ofs.C;
import me.oriient.ipssdk.common.ofs.C1546d;
import me.oriient.ipssdk.common.ofs.C1547e;
import me.oriient.ipssdk.common.ofs.C1548f;
import me.oriient.ipssdk.common.ofs.C1549g;
import me.oriient.ipssdk.common.ofs.C1550h;
import me.oriient.ipssdk.common.ofs.C1551i;
import me.oriient.ipssdk.common.ofs.C1552j;
import me.oriient.ipssdk.common.ofs.C1553k;
import me.oriient.ipssdk.common.ofs.C1554l;
import me.oriient.ipssdk.common.ofs.C1555m;
import me.oriient.ipssdk.common.ofs.C1556n;
import me.oriient.ipssdk.common.ofs.C1557o;
import me.oriient.ipssdk.common.ofs.C1558p;
import me.oriient.ipssdk.common.ofs.C1559q;
import me.oriient.ipssdk.common.ofs.C1560s;
import me.oriient.ipssdk.common.ofs.C1561t;
import me.oriient.ipssdk.common.ofs.C1562u;
import me.oriient.ipssdk.common.ofs.C1563v;
import me.oriient.ipssdk.common.ofs.C1564w;
import me.oriient.ipssdk.common.ofs.C1565x;
import me.oriient.ipssdk.common.ofs.C1566y;
import me.oriient.ipssdk.common.ofs.C1567z;
import me.oriient.ipssdk.common.ofs.D;
import me.oriient.ipssdk.common.ofs.E;
import me.oriient.ipssdk.common.ofs.F;
import me.oriient.ipssdk.common.ofs.G;
import me.oriient.ipssdk.common.ofs.H;
import me.oriient.ipssdk.common.ofs.I;
import me.oriient.ipssdk.common.ofs.J;
import me.oriient.ipssdk.common.ofs.K;
import me.oriient.ipssdk.common.ofs.r;
import me.oriient.ipssdk.common.services.buildings.BuildingsManager;
import me.oriient.ipssdk.common.services.database.DatabaseDriverProvider;
import me.oriient.ipssdk.common.services.elog.ELogIOManager;
import me.oriient.ipssdk.common.services.geofencing.LiveGeofenceManager;
import me.oriient.ipssdk.common.services.rest.services.BuildingsRestService;
import me.oriient.ipssdk.common.utils.SdkBuildData;
import me.oriient.ipssdk.common.utils.Utils;
import me.oriient.ipssdk.common.utils.runtimedata.CommonRuntimeDataProvider;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lme/oriient/ipssdk/common/di/CommonDiModuleInitializer;", "Lme/oriient/ipssdk/base/di/DiModuleInitializer;", "<init>", "()V", "Lme/oriient/internal/infra/di/DependencyInjection;", "di", "", "initialize", "(Lme/oriient/internal/infra/di/DependencyInjection;)V", "Companion", "me/oriient/ipssdk/common/ofs/d", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CommonDiModuleInitializer extends DiModuleInitializer {

    @NotNull
    private static final C1546d Companion = new C1546d();

    public CommonDiModuleInitializer() {
        super("CommonDiModuleInitializer");
    }

    @Override // me.oriient.ipssdk.base.di.DiModuleInitializer
    public void initialize(@NotNull DependencyInjection di) {
        Intrinsics.h(di, "di");
        BaseDiKt.initializeSdkBaseDi(di);
        LoggerDiKt.initializeLogger(di);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(OsData.class), null, new C1557o(di), 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(CoroutineContextProvider.class), null, C1567z.f25773a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(DeviceIdProvider.class), null, E.f25719a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(BuildData.class), null, new F(di), 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(SdkBuildData.class), null, G.f25721a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(BuildingsManager.class), null, H.f25722a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(Utils.class), null, I.f25723a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(CommonRuntimeDataProvider.class), null, J.f25724a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(RestRequestsReporter.class), null, K.f25725a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(UnauthenticatedRestService.class), null, C1547e.f25745a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(RestService.class), null, C1548f.f25747a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(NetworkManager.class), null, C1549g.f25749a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(CachedDataProviderFactory.class), null, C1550h.f25751a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(NetworkManager.class), null, C1551i.f25753a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(BuildingsRestService.class), null, C1552j.f25755a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(LiveGeofenceManager.class), null, C1553k.f25756a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(DatabaseDriverProvider.class), null, C1554l.f25758a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(ELog.class), null, C1555m.f25760a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(Metric.class), null, C1556n.f25761a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(ELogIOManager.class), null, C1558p.f25763a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(EmptyTimeJumpReporter.class), null, C1559q.f25764a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(TimeJumpReporter.class), null, r.f25765a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(AppStateProvider.class), null, C1560s.f25766a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(RuntimeDataProvider.class), null, C1561t.f25767a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(RuntimeDataManager.class), null, C1562u.f25768a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(SupportSensorsManager.class), null, C1563v.f25769a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(SensorsManagerMetadataProvider.class), null, C1564w.f25770a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(TimeProvider.class), null, C1565x.f25771a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(GeneralGeofenceStatusProvider.class), null, C1566y.f25772a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(HandlerFactory.class), null, A.f25715a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(WakeLockFactory.class), null, B.f25716a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(SensorsDataProviderFactory.class), null, C.f25717a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(SystemSensorManager.class), null, D.f25718a, 2, null);
        super.initialize(di);
    }
}
