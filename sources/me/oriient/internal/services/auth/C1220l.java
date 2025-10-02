package me.oriient.internal.services.auth;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.SingleInstanceExecutor;

/* renamed from: me.oriient.internal.services.auth.l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1220l extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f25033a;
    public final /* synthetic */ D b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1220l(D d, String str, Continuation continuation) {
        super(1, continuation);
        this.b = d;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C1220l(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C1220l(this.b, this.c, (Continuation) obj).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25033a;
        if (i == 0) {
            ResultKt.b(obj);
            if (D.b(this.b).getCurrentParams() != null && !Intrinsics.c(this.c, D.b(this.b).getCurrentParams())) {
                me.oriient.internal.services.uploadingManager.temp.a.a("Trying to login with different credentials.");
                D.b(this.b).cancel();
            }
            SingleInstanceExecutor singleInstanceExecutorB = D.b(this.b);
            String str = this.c;
            this.f25033a = 1;
            obj = singleInstanceExecutorB.run(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return ((Outcome) obj).map(C1219k.f25032a);
    }
}
