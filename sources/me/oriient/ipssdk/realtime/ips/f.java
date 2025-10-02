package me.oriient.ipssdk.realtime.ips;

import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfig;
import me.oriient.positioningengine.common.EngineStopReason;
import me.oriient.positioningengine.common.PositioningEngineState;
import me.oriient.positioningengine.common.PositioningUpdate;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class f extends SuspendLambda implements Function4 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ PositioningUpdate f25880a;
    public /* synthetic */ PositioningEngineState b;
    public /* synthetic */ RemoteConfig c;

    public f(Continuation continuation) {
        super(4, continuation);
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        f fVar = new f((Continuation) obj4);
        fVar.f25880a = (PositioningUpdate) obj;
        fVar.b = (PositioningEngineState) obj2;
        fVar.c = (RemoteConfig) obj3;
        return fVar.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        PositioningUpdate positioningUpdate = this.f25880a;
        PositioningEngineState positioningEngineState = this.b;
        RemoteConfig remoteConfig = this.c;
        if (positioningEngineState instanceof PositioningEngineState.Positioning) {
            long positioningSessionTimeoutMillis = remoteConfig.getRealTime().getPositioning().getPositioningSessionTimeoutMillis();
            if (positioningUpdate.getTimeDeterminedMillis() - ((PositioningEngineState.Positioning) positioningEngineState).getContext().getStartTimeMillis() > positioningSessionTimeoutMillis) {
                CoreLogic.INSTANCE.stopPositioning(new EngineStopReason.Custom("Timeout " + (positioningSessionTimeoutMillis / TimeUnit.MINUTES.toMillis(1L))), new IPSCompletionListener() { // from class: me.oriient.ipssdk.realtime.ips.CoreLogic$setupMaxSessionLimit$1$1$1
                    @Override // me.oriient.ipssdk.api.listeners.IPSCompletionListener
                    public void onCompleted() {
                        Logger loggerAccess$getLogger = CoreLogic.access$getLogger(CoreLogic.INSTANCE);
                        String strAccess$getTAG$p = CoreLogic.access$getTAG$p();
                        Intrinsics.g(strAccess$getTAG$p, "access$getTAG$p(...)");
                        loggerAccess$getLogger.d(strAccess$getTAG$p, "Stopped positioning due to timeout");
                    }

                    @Override // me.oriient.ipssdk.api.listeners.IPSFailable
                    public void onError(@NotNull IPSError error) {
                        Intrinsics.h(error, "error");
                        Logger loggerAccess$getLogger = CoreLogic.access$getLogger(CoreLogic.INSTANCE);
                        String strAccess$getTAG$p = CoreLogic.access$getTAG$p();
                        Intrinsics.g(strAccess$getTAG$p, "access$getTAG$p(...)");
                        loggerAccess$getLogger.e(strAccess$getTAG$p, "Failed to stop positioning " + error);
                    }
                });
            }
        }
        return Unit.f24250a;
    }
}
