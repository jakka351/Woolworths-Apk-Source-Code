package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.ipssdk.api.listeners.IPSListener;
import me.oriient.ipssdk.realtime.ips.CoreLogic;
import me.oriient.ipssdk.realtime.utils.ExtensionsKt;

/* renamed from: me.oriient.ipssdk.realtime.ofs.p0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1703p0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26125a;
    public final /* synthetic */ String b;
    public final /* synthetic */ IPSListener c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703p0(String str, IPSListener iPSListener, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = iPSListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1703p0(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1703p0(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26125a;
        if (i == 0) {
            ResultKt.b(obj);
            CoreLogic coreLogic = CoreLogic.INSTANCE;
            String str = this.b;
            this.f26125a = 1;
            obj = coreLogic.getBuildingLayout(str, this);
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
        if (outcome instanceof Outcome.Failure) {
            this.c.onError(ExtensionsKt.toIpsError((OriientError) ((Outcome.Failure) outcome).getValue()));
        } else if (outcome instanceof Outcome.Success) {
            this.c.onSuccess(((Outcome.Success) outcome).getValue());
        }
        return Unit.f24250a;
    }
}
