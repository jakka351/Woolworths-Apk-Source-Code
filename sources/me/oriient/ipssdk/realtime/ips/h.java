package me.oriient.ipssdk.realtime.ips;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.common.utils.models.Error;
import me.oriient.ipssdk.realtime.ips.CoreLogic;
import me.oriient.positioningengine.common.EngineStopReason;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager;

/* loaded from: classes8.dex */
public final class h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25882a;
    public /* synthetic */ Object b;
    public final /* synthetic */ IPSCompletionListener c;
    public final /* synthetic */ EngineStopReason d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(IPSCompletionListener iPSCompletionListener, EngineStopReason engineStopReason, Continuation continuation) {
        super(2, continuation);
        this.c = iPSCompletionListener;
        this.d = engineStopReason;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        h hVar = new h(this.c, this.d, continuation);
        hVar.b = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PositioningEngine positioningEngine;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25882a;
        Unit unit = Unit.f24250a;
        if (i == 0) {
            ResultKt.b(obj);
            CoreLogic coreLogic = CoreLogic.INSTANCE;
            positioningEngine = (PositioningEngine) CoreLogic.access$getEngineManager(coreLogic).getEngine().getValue();
            if (positioningEngine == null) {
                IPSCompletionListener iPSCompletionListener = this.c;
                Logger loggerAccess$getLogger = CoreLogic.access$getLogger(coreLogic);
                String strAccess$getTAG$p = CoreLogic.access$getTAG$p();
                Intrinsics.g(strAccess$getTAG$p, "access$getTAG$p(...)");
                loggerAccess$getLogger.e(strAccess$getTAG$p, "stopPositioning: unable to complete operation. no open session");
                iPSCompletionListener.onError(new Error("unable to complete operation. no open session", 3, 2));
                return unit;
            }
            CoreLogic.access$turnOffSensors(coreLogic);
            CoreLogic.access$addOperationListener(coreLogic, this.c, CoreLogic.OperationListener.StopPositioning);
            SupportEngineUploadManager supportEngineUploadManagerAccess$getSupportEngineUploadManager = CoreLogic.access$getSupportEngineUploadManager(coreLogic);
            EngineStopReason engineStopReason = this.d;
            this.b = positioningEngine;
            this.f25882a = 1;
            if (supportEngineUploadManagerAccess$getSupportEngineUploadManager.stopUploading(engineStopReason, this) != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                ResultKt.b(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        positioningEngine = (PositioningEngine) this.b;
        ResultKt.b(obj);
        EngineStopReason engineStopReason2 = this.d;
        this.b = null;
        this.f25882a = 2;
        return positioningEngine.stop(engineStopReason2, this) == coroutineSingletons ? coroutineSingletons : unit;
    }
}
