package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataModel.engine.EngineConfig;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.common.utils.models.Error;
import me.oriient.ipssdk.realtime.ips.CoreLogic;
import me.oriient.positioningengine.common.util.PositioningEngineError;
import me.oriient.positioningengine.support.engineManager.PositioningEngineCredentials;
import me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager;

/* renamed from: me.oriient.ipssdk.realtime.ofs.x0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1746x0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26171a;
    public final /* synthetic */ User b;
    public final /* synthetic */ EngineConfig c;
    public final /* synthetic */ IPSCompletionListener d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1746x0(User user, EngineConfig engineConfig, IPSCompletionListener iPSCompletionListener, Continuation continuation) {
        super(2, continuation);
        this.b = user;
        this.c = engineConfig;
        this.d = iPSCompletionListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1746x0(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1746x0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26171a;
        if (i == 0) {
            ResultKt.b(obj);
            SupportPositioningEngineManager supportPositioningEngineManagerAccess$getEngineManager = CoreLogic.access$getEngineManager(CoreLogic.INSTANCE);
            PositioningEngineCredentials positioningEngineCredentials = new PositioningEngineCredentials(this.b.getApiKey(), this.b.getDomain(), this.b.getSpace().getId(), this.b.getSessionId(), this.b.getUserName());
            EngineConfig engineConfig = this.c;
            this.f26171a = 1;
            obj = supportPositioningEngineManagerAccess$getEngineManager.prepareEngine(positioningEngineCredentials, engineConfig, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        Outcome outcome = (Outcome) obj;
        IPSCompletionListener iPSCompletionListener = this.d;
        boolean z = outcome instanceof Outcome.Failure;
        Unit unit = Unit.f24250a;
        if (z) {
            iPSCompletionListener.onError(new Error(((PositioningEngineError) ((Outcome.Failure) outcome).getValue()).getMessage(), 7, 1));
            return unit;
        }
        CoreLogic.INSTANCE.setNewActiveBuilding(null);
        this.d.onCompleted();
        return unit;
    }
}
