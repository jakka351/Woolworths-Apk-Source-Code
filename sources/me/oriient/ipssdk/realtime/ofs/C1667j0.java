package me.oriient.ipssdk.realtime.ofs;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfig;
import me.oriient.ipssdk.realtime.ips.CoreLogic;

/* renamed from: me.oriient.ipssdk.realtime.ofs.j0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1667j0 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public static final C1667j0 f26091a = new C1667j0();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        RemoteConfig remoteConfig = (RemoteConfig) obj;
        CoreLogic coreLogic = CoreLogic.INSTANCE;
        Logger loggerAccess$getLogger = CoreLogic.access$getLogger(coreLogic);
        String strAccess$getTAG$p = CoreLogic.access$getTAG$p();
        Intrinsics.g(strAccess$getTAG$p, "access$getTAG$p(...)");
        loggerAccess$getLogger.d(strAccess$getTAG$p, "On new config");
        CoreLogic.access$getEngineManager(coreLogic).configure(remoteConfig.getRealTime().getMisc().getDeviceDataFetchTimeoutSeconds(), null);
        CoreLogic.access$getSensorsDataProvider(coreLogic).onNewConfig(remoteConfig.getCommon().getSensorManager());
        CoreLogic.access$getSensorIssuesELogSender(coreLogic).setELogIntervalMillis((long) (remoteConfig.getCommon().getSensorManager().getSensorIssuesELogIntervalSec() * TimeUnit.SECONDS.toMillis(1L)));
        CoreLogic.access$setupAutomaticCacheRefreshment(coreLogic);
        return Unit.f24250a;
    }
}
