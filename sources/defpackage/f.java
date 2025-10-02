package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.services.remoteLog.database.DatabaseService;

/* loaded from: classes4.dex */
public final class f extends SuspendLambda implements Function2 {
    public int p;
    public final /* synthetic */ RemoteLogImpl q;
    public final /* synthetic */ double r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(RemoteLogImpl remoteLogImpl, double d, Continuation continuation) {
        super(2, continuation);
        this.q = remoteLogImpl;
        this.r = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new f(this.q, this.r, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            DatabaseService databaseService = this.q.getDatabaseService();
            this.p = 1;
            if (databaseService.clearDb(this.r, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
